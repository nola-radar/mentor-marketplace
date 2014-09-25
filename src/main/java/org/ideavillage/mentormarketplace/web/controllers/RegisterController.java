package org.ideavillage.mentormarketplace.web.controllers;

import java.util.HashMap;
import javax.validation.Valid;
import org.ideavillage.mentormarketplace.persistence.domain.Expertise;
import org.ideavillage.mentormarketplace.persistence.domain.Founder;
import org.ideavillage.mentormarketplace.persistence.domain.Industry;
import org.ideavillage.mentormarketplace.persistence.domain.Mentor;
import org.ideavillage.mentormarketplace.persistence.domain.Mmuser;
import org.ideavillage.mentormarketplace.persistence.repositories.ExpertiseRepository;
import org.ideavillage.mentormarketplace.persistence.repositories.FounderRepository;
import org.ideavillage.mentormarketplace.persistence.repositories.IndustryRepository;
import org.ideavillage.mentormarketplace.persistence.repositories.MentorRepository;
import org.ideavillage.mentormarketplace.persistence.repositories.MmuserRepository;
import org.ideavillage.mentormarketplace.web.forms.RegistrationForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.social.connect.Connection;
import org.springframework.social.connect.web.ProviderSignInUtils;
import org.springframework.social.linkedin.api.LinkedIn;
import org.springframework.social.security.SocialAuthenticationToken;
import org.springframework.social.security.SocialUserDetails;
import org.springframework.social.security.SocialUserDetailsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.WebRequest;

/**
 *
 * @author 212412051
 */
@Controller
@RequestMapping(value = "/register")
public class RegisterController {

    @Autowired
    private MmuserRepository mmUserRepository;

    @Autowired
    private MentorRepository mentorRepository;

    @Autowired
    private FounderRepository founderRepository;

    @Autowired
    private SocialUserDetailsService socialUserDetailsService;

    @Autowired
    private IndustryRepository industryRepository;

    @Autowired
    private ExpertiseRepository expertiseRepository;

    @RequestMapping(method = RequestMethod.GET)
    public String signupForm(WebRequest request,
            Model model,
            @ModelAttribute("registrationForm") RegistrationForm registrationForm) {
        Connection<?> connection = ProviderSignInUtils.getConnection(request);
        if (connection == null) {
            // TODO: Need an error page
            return "redirect:/";
        }
        Iterable<Industry> industryList = industryRepository.findAll();
        model.addAttribute("industryList", industryList);
        Iterable<Expertise> expertiseList = expertiseRepository.findAll();
        model.addAttribute("expertiseList", expertiseList);
        HashMap<String, String> userTypes = new HashMap<>();
        userTypes.put("founder", "Founder");
        userTypes.put("mentor", "Mentor");
        model.addAttribute("userTypes", userTypes);
        return "register/create";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String processSignupForm(WebRequest request, Model model,
            @Valid @ModelAttribute("registrationForm") RegistrationForm registrationForm,
            BindingResult result) {
        if (result.hasErrors()) {
            HashMap<String, String> userTypes = new HashMap<>();
            userTypes.put("founder", "Founder");
            userTypes.put("mentor", "Mentor");
            model.addAttribute("userTypes", userTypes);
            return "register/create";
        }
        Connection<?> userConnection = ProviderSignInUtils.getConnection(request);
        LinkedIn api = (LinkedIn) userConnection.getApi();
        String email = userConnection.fetchUserProfile().getEmail();
        String linkedInId = userConnection.createData().getProviderUserId();
        String linkedInPictureUrl = userConnection.createData().getImageUrl();
        Boolean isAdmin = false;
        Mmuser user = new Mmuser(email, linkedInId, isAdmin);
        user.setUserType(registrationForm.getUserType());
        Mmuser savedUser = mmUserRepository.save(user);
        //Will save user as founder or mentor depending on user type field
        if (registrationForm.getUserType().equals("mentor")) {
            Mentor mergeMentor = new Mentor(linkedInPictureUrl, linkedInId);
            Mentor mentor = registrationForm.mergeFormWithMentor(mergeMentor);
            mentor.setMmuser(savedUser);
            mentorRepository.save(mentor);
        } else {
            Founder mergeFounder = new Founder(linkedInPictureUrl, linkedInId);
            Founder founder = registrationForm.mergeFormWithFounder(mergeFounder);
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
}
