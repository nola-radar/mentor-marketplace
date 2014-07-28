package org.ideavillage.mentormarketplace.web.controllers;

import javax.validation.Valid;
import org.ideavillage.mentormarketplace.persistence.domain.MMUser;
import org.ideavillage.mentormarketplace.persistence.domain.Mentor;
import org.ideavillage.mentormarketplace.persistence.domain.Founder;
import org.ideavillage.mentormarketplace.persistence.repositories.FounderRepository;
import org.ideavillage.mentormarketplace.persistence.repositories.MentorRepository;
import org.ideavillage.mentormarketplace.persistence.repositories.MMUserRepository;
import org.ideavillage.mentormarketplace.web.forms.RegistrationForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.social.connect.Connection;
import org.springframework.social.connect.ConnectionRepository;
import org.springframework.social.connect.web.ProviderSignInUtils;
import org.springframework.social.linkedin.api.LinkedIn;
import org.springframework.social.security.SocialAuthenticationToken;
import org.springframework.social.security.SocialUserDetails;
import org.springframework.social.security.SocialUserDetailsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.WebRequest;

/**
 *
 * @author 212395189
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private MMUserRepository mmUserRepository;
    
    @Autowired
    private MentorRepository mentorRepository;
    
    @Autowired
    private FounderRepository founderRepository;
    
    @Autowired
    private ConnectionRepository connectionRepository;

    @Autowired
    private SocialUserDetailsService socialUserDetailsService;

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String signupForm(WebRequest request,
            @ModelAttribute("registrationForm") RegistrationForm registrationForm,
            @ModelAttribute("mentor") Mentor mentor,
            @ModelAttribute("founder") Founder founder ) {
        Connection<?> connection = ProviderSignInUtils.getConnection(request);
        if (connection != null) {
            LinkedIn api = (LinkedIn)connection.getApi();
            registrationForm.setEmail(connection.fetchUserProfile().getEmail());
            registrationForm.setLinkedInId(connection.createData().getProviderUserId());
            mentor.setFirstName(connection.fetchUserProfile().getFirstName());
            mentor.setLastName(connection.fetchUserProfile().getLastName());
            mentor.setIndustry(api.profileOperations().getUserProfileFull().getIndustry());
            // Lines below added by Marcus, Review
            mentor.setLinkedInCurrentCompany(api.profileOperations().getUserProfileFull().getThreeCurrentPositions().get(0).getCompany().getName());
            mentor.setLinkedInCurrentJobTitle(api.profileOperations().getUserProfileFull().getThreeCurrentPositions().get(0).getTitle());
            mentor.setBackground(api.profileOperations().getUserProfileFull().getSummary());
            
            founder.setFirstName(connection.fetchUserProfile().getFirstName());
            founder.setLastName(connection.fetchUserProfile().getLastName());
            founder.setIndustry(api.profileOperations().getUserProfileFull().getIndustry());
            founder.setLinkedInCurrentCompany(api.profileOperations().getUserProfileFull().getThreeCurrentPositions().get(0).getCompany().getName());
            founder.setLinkedInCurrentJobTitle(api.profileOperations().getUserProfileFull().getThreeCurrentPositions().get(0).getTitle());
            founder.setBackground(api.profileOperations().getUserProfileFull().getSummary());
        }
        return "mentors/create";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String processForm(WebRequest request,
            @Valid @ModelAttribute("registrationForm") RegistrationForm registrationForm,
            BindingResult result) {
        if (result.hasErrors()) {
            return "user/register";
        }
        System.out.println("hello");
        MMUser user = new MMUser(registrationForm.getEmail(), registrationForm.getLinkedInId(), registrationForm.getUserType());
        MMUser savedUser = mmUserRepository.save(user);
        
        if (registrationForm.getUserType().equals("mentor")) {
            Mentor mentor = registrationForm.getMentor();
            mentor.setMmuser(savedUser);
            mentorRepository.save(mentor);
        } else {
            Founder founder = registrationForm.getFounder();
            founder.setMmuser(savedUser);
            founderRepository.save(founder);
        }
        //mentor.setMmuser(savedUser);
        //founder.setMmuser(savedUser);
        //mentorRepository.save(mentor);
        //founderRepository.save(founder);
         // TODO: Clean up all of this
        Connection<?> connection = ProviderSignInUtils.getConnection(request);
        ProviderSignInUtils.handlePostSignUp(savedUser.getEmail(), request);
        SocialUserDetails details = socialUserDetailsService.loadUserByUserId(savedUser.getEmail());
        SecurityContextHolder.getContext().setAuthentication(
        new SocialAuthenticationToken(connection, details, null, details.getAuthorities()));
        return "redirect:/user/profile";
    }

    @RequestMapping(value = "/profile", method = RequestMethod.GET)
    public String viewProfile(WebRequest request, Model model) {
        Connection<LinkedIn> connection = connectionRepository.findPrimaryConnection(LinkedIn.class);
        if (null == connection) {
            return "redirect:/entrepreneurs/";
        }
        model.addAttribute("profile", connection.getApi().profileOperations().getUserProfileFull());
        String email = connection.getApi().profileOperations().getUserProfileFull().getEmailAddress();
        //below is code determining to send user to founder profile or mentor profile jsp
        MMUser user = mmUserRepository.findByEmail(email);
        String utype = user.getUserType();
        String utypeparsed = utype.substring(0, 7);
        if (utypeparsed.equals("founder")) {
            return "redirect:/user/founder";
        } else {
            return "user/profile";
        }
    }

    @RequestMapping(value = "/profile/{id}", method = RequestMethod.GET)
    public String viewProfileForId(WebRequest request, Model model, @PathVariable("id") Long id) {
        Connection<LinkedIn> connection = connectionRepository.findPrimaryConnection(LinkedIn.class);
        if (null == connection) {
            return "redirect:/entrepreneurs/";
        }
        MMUser user = mmUserRepository.findOne(id);
        if (null == user) {
            return "redirect:/entrepreneurs/";
        }
        // TODO: Fix this. Get insufficient permissions when using the id, but I think it works when using the publicUrl
        model.addAttribute("profile", connection.getApi().profileOperations().getProfileFullById(user.getLinkedInId()));
        return "user/profile";
    }
    
    @RequestMapping(value = "/founder", method = RequestMethod.GET)
    public String viewProfileFounder(WebRequest request, Model model) {
        Connection<LinkedIn> connection = connectionRepository.findPrimaryConnection(LinkedIn.class);
        if (null == connection) {
            return "redirect:/entrepreneurs/";
        }
        model.addAttribute("profile", connection.getApi().profileOperations().getUserProfileFull());
        String email = connection.getApi().profileOperations().getUserProfileFull().getEmailAddress();
        MMUser user = mmUserRepository.findByEmail(email);
        Founder founder = founderRepository.findByLinkedInId(user.getLinkedInId());
        model.addAttribute("founder",founder);
        return "user/founder";
    }
}
