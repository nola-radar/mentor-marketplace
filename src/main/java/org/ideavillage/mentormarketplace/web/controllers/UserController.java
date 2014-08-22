package org.ideavillage.mentormarketplace.web.controllers;

import javax.validation.Valid;
import org.ideavillage.mentormarketplace.persistence.domain.Mmuser;
import org.ideavillage.mentormarketplace.persistence.domain.Mentor;
import org.ideavillage.mentormarketplace.persistence.domain.Founder;
import org.ideavillage.mentormarketplace.persistence.repositories.FounderRepository;
import org.ideavillage.mentormarketplace.persistence.repositories.MentorRepository;
import org.ideavillage.mentormarketplace.persistence.repositories.MmuserRepository;
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
    
    Connection<LinkedIn> globalConnection;
    Mmuser globalUser;
    Founder globalFounder;
    Mentor globalMentor;
    
    @Autowired
    private MmuserRepository mmUserRepository;
    
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
            @ModelAttribute("founder") Founder founder) {
        Connection<?> connection = ProviderSignInUtils.getConnection(request);
        if (connection != null) {
            LinkedIn api = (LinkedIn) connection.getApi();
            registrationForm.setEmail(connection.fetchUserProfile().getEmail());
            registrationForm.setLinkedInId(connection.createData().getProviderUserId());
        }
        return "register/create";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String processForm(WebRequest request,
            @Valid @ModelAttribute("registrationForm") RegistrationForm registrationForm,
            BindingResult result) {
        if (result.hasErrors()) {
            return "user/register";
        }
        Mmuser user = new Mmuser(registrationForm.getEmail(), registrationForm.getLinkedInId(), registrationForm.getIsAdmin());
        user.setUserType(registrationForm.getUserType());
        Mmuser savedUser = mmUserRepository.save(user);
        
        //Will save user as founder or mentor depending on user type field
        if (registrationForm.getUserType().equals("mentor")) {
            Mentor mentor = registrationForm.getMentor();
            mentor.setMmuser(savedUser);
            mentorRepository.save(mentor);
        } else {
            Founder founder = registrationForm.getFounder();
            founder.setMmuser(savedUser);
            founderRepository.save(founder);
        }
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
        globalConnection = connection;
        if (null == connection) {
            return "redirect:/index/";
        }
        model.addAttribute("profile", connection.getApi().profileOperations().getUserProfileFull());
        String email = connection.getApi().profileOperations().getUserProfileFull().getEmailAddress();
        //below is code determining to send user to founder profile or mentor profile jsp
        Mmuser user = mmUserRepository.findByEmail(email);
        globalUser = user;
        String utype = user.getUserType();
        // redirect to founder.jsp if user type is founder
        if (utype.equals("founder")) {
            return "redirect:/user/founder";
        } else {
            return "redirect:/user/mentor";
        }
    }

    @RequestMapping(value = "/profile/{id}", method = RequestMethod.GET)
    public String viewProfileForId(WebRequest request, Model model, @PathVariable("id") Long id) {
        //Connection<LinkedIn> connection = connectionRepository.findPrimaryConnection(LinkedIn.class);
        if (null == globalConnection) {
            return "redirect:/index/";
        }
        Mmuser user = mmUserRepository.findOne(id);
        if (null == user) {
            return "redirect:/index/";
        }
        // TODO: Fix this. Get insufficient permissions when using the id, but I think it works when using the publicUrl
        model.addAttribute("profile", globalConnection.getApi().profileOperations().getProfileFullById(user.getLinkedInId()));
        return "user/profile";
    }

    @RequestMapping(value = "/founder", method = RequestMethod.GET)
    public String viewProfileFounder(WebRequest request, Model model) {
        if (null == globalConnection) {
            return "redirect:/index/";
        }
        //Mmuser user = mmUserRepository.findByEmail(email);
        Founder founder = founderRepository.findByLinkedInId(globalUser.getLinkedInId());
        globalFounder = founder;
        model.addAttribute("founder",founder);
        return "user/founder";
    }
    
    // page that user is redirected to if they want to edit their profile (founder)
    @RequestMapping(value = "/editFounder", method = RequestMethod.GET)
    public String viewEditFounder(WebRequest request,
            @ModelAttribute("registrationForm") RegistrationForm registrationForm,
            Model model,
            BindingResult result) {
        if (result.hasErrors()) {
            return "user/profile";
        }
        //Connection<LinkedIn> connection = connectionRepository.findPrimaryConnection(LinkedIn.class);
        if (null == globalConnection) {
            return "redirect:/index/";
        }
        registrationForm.setFirstName(globalFounder.getFirstName());
        registrationForm.setLastName(globalFounder.getLastName());
        registrationForm.setWebsite(globalFounder.getWebsite());
        registrationForm.setFacebook(globalFounder.getFacebook());
        registrationForm.setTwitter(globalFounder.getTwitter());
        registrationForm.setOtherSocialMedia(globalFounder.getOtherSocialMedia());
        registrationForm.setCompanyDetails(globalFounder.getCompanyDetails());
        registrationForm.setInspiration(globalFounder.getInspiration());
        registrationForm.setLogo(globalFounder.getLogo());
        registrationForm.setTagline(globalFounder.getTagline());
        registrationForm.setElevatorPitch(globalFounder.getElevatorPitch());
        registrationForm.setProgramPlan(globalFounder.getProgramPlan());
        registrationForm.setWeeklyReports(globalFounder.getWeeklyReports());
        registrationForm.setFounderIndustry(globalFounder.getFounderIndustryCollection());
        registrationForm.setFounderExpertise(globalFounder.getFounderExpertiseCollection());
        registrationForm.setImmediateNeeds(globalFounder.getImmediateNeeds());
        registrationForm.setStatus(globalFounder.getStatus());
        registrationForm.setVision(globalFounder.getVision());
        registrationForm.setNewOrleans(globalFounder.getNewOrleans());
        registrationForm.setUserType(globalUser.getUserType());
        registrationForm.setLinkedInId(globalFounder.getLinkedInId());
        registrationForm.setEmail(globalUser.getEmail());
        return "user/editFounder";
    }
  
    @RequestMapping(value = "/editFounder", method = RequestMethod.POST)
    public String processFounderEdit(WebRequest request,
            Model model,
            @Valid @ModelAttribute("registrationForm") RegistrationForm registrationForm,
            BindingResult result) {
        //Connection<LinkedIn> connection = connectionRepository.findPrimaryConnection(LinkedIn.class);
        if (null == globalConnection) {
            return "redirect:/index/";
        }
        mmUserRepository.save(globalUser);
        registrationForm.editFounder(globalFounder);
        founderRepository.save(globalFounder);
        return "redirect:/user/profile";
    }
    
    @RequestMapping(value = "/mentor", method = RequestMethod.GET)
    public String viewProfileMentor(WebRequest request, Model model) {
        //Connection<LinkedIn> connection = connectionRepository.findPrimaryConnection(LinkedIn.class);
        if (null == globalConnection) {
            return "redirect:/index/";
        }
        Mentor mentor = mentorRepository.findByLinkedInId(globalUser.getLinkedInId());
        globalMentor = mentor;
        model.addAttribute("mentor", mentor);
        return "user/mentor";
    }
    
    // page that user is redirected to if they want to edit their profile (founder)
    @RequestMapping(value = "/editMentor", method = RequestMethod.GET)
    public String viewEditMentor(WebRequest request,
            @ModelAttribute("registrationForm") RegistrationForm registrationForm,
            Model model,
            BindingResult result) {
        if (result.hasErrors()) {
            return "user/profile";
        }
        if (null == globalConnection) {
            return "redirect:/index/";
        }
        registrationForm.setBackground(globalMentor.getBackground());
        registrationForm.setFirstName(globalMentor.getFirstName());
        registrationForm.setLastName(globalMentor.getLastName());
        registrationForm.setWebsite(globalMentor.getWebsite());
        registrationForm.setFacebook(globalMentor.getFacebook());
        registrationForm.setTwitter(globalMentor.getTwitter());
        registrationForm.setOtherSocialMedia(globalMentor.getOtherSocialMedia());
        registrationForm.setMentorExpertise(globalMentor.getMentorExpertiseCollection());
        registrationForm.setMentorIndustry(globalMentor.getMentorIndustryCollection());
        registrationForm.setUserType(globalUser.getUserType());
        registrationForm.setLinkedInId(globalMentor.getLinkedInId());
        registrationForm.setEmail(globalUser.getEmail());
        registrationForm.setLinkedInCurrentCompany(globalMentor.getLinkedInCurrentCompany());
        registrationForm.setLinkedInCurrentJobTitle(globalMentor.getLinkedInCurrentJobTitle());
        return "user/editMentor";
    }
    
    @RequestMapping(value = "/editMentor", method = RequestMethod.POST)
    public String processMentorEdit(WebRequest request,
            Model model,
            @Valid @ModelAttribute("registrationForm") RegistrationForm registrationForm,
            BindingResult result) {
        if (null == globalConnection) {
            return "redirect:/index/";
        }
        mmUserRepository.save(globalUser);
        registrationForm.editMentor(globalMentor);
        mentorRepository.save(globalMentor);
        return "redirect:/user/profile";
    }
}
