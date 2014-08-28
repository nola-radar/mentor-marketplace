package org.ideavillage.mentormarketplace.web.controllers;

import java.util.HashMap;
import javax.validation.Valid;
import org.ideavillage.mentormarketplace.persistence.domain.Founder;
import org.ideavillage.mentormarketplace.persistence.domain.Industry;
import org.ideavillage.mentormarketplace.persistence.domain.Mentor;
import org.ideavillage.mentormarketplace.persistence.domain.Mmuser;
import org.ideavillage.mentormarketplace.persistence.repositories.FounderRepository;
import org.ideavillage.mentormarketplace.persistence.repositories.IndustryRepository;
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
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.context.request.WebRequest;

/**
 *
 * @author 212395189
 */
@Controller
@RequestMapping(value = "/user")
@SessionAttributes({"mmuser"})
public class UserController {

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

    @Autowired
    private IndustryRepository industryRepository;

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String signupForm(WebRequest request,
      Model model,
      @ModelAttribute("registrationForm") RegistrationForm registrationForm) {
        Connection<?> connection = ProviderSignInUtils.getConnection(request);
        if (connection != null) {
            LinkedIn api = (LinkedIn) connection.getApi();
            registrationForm.setEmail(connection.fetchUserProfile().getEmail());
            registrationForm.setLinkedInId(connection.createData().getProviderUserId());
            registrationForm.setIsAdmin(false);
        }
        Iterable<Industry> industryList = industryRepository.findAll();
        HashMap<String, String> userTypes = new HashMap<>();
        userTypes.put("founder", "Founder");
        userTypes.put("mentor", "Mentor");
        model.addAttribute("userTypes", userTypes);
        model.addAttribute("industryList", industryList);
        return "register/create";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String processForm(WebRequest request, Model model,
      @Valid @ModelAttribute("registrationForm") RegistrationForm registrationForm,
      BindingResult result) {
        if (result.hasErrors()) {
            HashMap<String, String> userTypes = new HashMap<>();
            userTypes.put("founder", "Founder");
            userTypes.put("mentor", "Mentor");
            model.addAttribute("userTypes", userTypes);
            return "register/create";
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
        return "redirect:/user/profile/" + savedUser.getId() + "/";
    }

    @RequestMapping(value = "/profile", method = RequestMethod.GET)
    public String viewProfile(WebRequest request, Model model) {
        Connection<LinkedIn> connection = connectionRepository.findPrimaryConnection(LinkedIn.class);
        if (null == connection) {
            // TODO: Need an error page
            return "redirect:/";
        }
        String email = connection.getApi().profileOperations().getUserProfileFull().getEmailAddress();
        Mmuser user = mmUserRepository.findByEmail(email);
        return "redirect:/user/profile/" + user.getId() + "/";
    }

    @RequestMapping(value = "/profile/{id}/", method = RequestMethod.GET)
    public String viewProfileForId(WebRequest request, Model model, @PathVariable("id") Long id) {
        Mmuser user = mmUserRepository.findOne(id);
        if (null == user) {
            // TODO: Need an error page
            return "redirect:/";
        }
        String utype = user.getUserType();
        // redirect to founder.jsp if user type is founder
        if (utype.contains("founder")) {
            model.addAttribute("founder", user.getFounder());
            return "user/founder";
        } else {
            model.addAttribute("mentor", user.getMentor());
            return "user/mentor";
        }
    }

    // page that user is redirected to if they want to edit their profile (founder)
    @RequestMapping(value = "/profile/{id}/edit", method = RequestMethod.GET)
    public String viewEditFounder(WebRequest request, Model model, @PathVariable("id") Long id) {
        Mmuser user = mmUserRepository.findOne(id);
        if (null == user) {
            // TODO: Need an error page
            return "redirect:/";
        }
        String utype = user.getUserType();
        // redirect to founder.jsp if user type is founder
        if (utype.contains("founder")) {
            model.addAttribute("founder", user.getFounder());
            return "user/editFounder";
        } else {
            model.addAttribute("mentor", user.getMentor());
            return "user/editMentor";
        }
    }

    @RequestMapping(value = "/profile/{id}/editFounder", method = RequestMethod.POST)
    public String processFounderEdit(WebRequest request, @PathVariable("id") Long id,
      Model model,
      @Valid @ModelAttribute("founder") Founder founder,
      BindingResult result) {
        if (result.hasErrors()) {
            return "user/editFounder";
        }
        founderRepository.save(founder);
        return "redirect:/user/profile/" + id + "/";
    }

    @RequestMapping(value = "/profile/{id}/editMentor", method = RequestMethod.POST)
    public String processMentorEdit(WebRequest request, @PathVariable("id") Long id,
      Model model,
      @Valid @ModelAttribute("mentor") Mentor mentor,
      BindingResult result) {
        if (result.hasErrors()) {
            return "user/editMentor";
        }
        mentorRepository.save(mentor);
        return "redirect:/user/profile/" + id + "/";
    }
}
