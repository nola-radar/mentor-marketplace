package org.ideavillage.mentormarketplace.web.controllers;

import javax.validation.Valid;
import org.ideavillage.mentormarketplace.persistence.domain.MMUser;
import org.ideavillage.mentormarketplace.persistence.repositories.MMUserRepository;
import org.ideavillage.mentormarketplace.web.forms.RegistrationForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.social.connect.Connection;
import org.springframework.social.connect.ConnectionRepository;
import org.springframework.social.connect.web.ProviderSignInUtils;
import org.springframework.social.linkedin.api.LinkedIn;
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
    private MMUserRepository repository;

    @Autowired
    ConnectionRepository connectionRepository;

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String signupForm(WebRequest request,
            @ModelAttribute("registrationForm") RegistrationForm registrationForm) {
        Connection<?> connection = ProviderSignInUtils.getConnection(request);
        if (connection != null) {
            registrationForm.setEmail(connection.fetchUserProfile().getEmail());
            registrationForm.setLinkedInId(connection.createData().getProviderUserId());
        }
        return "user/register";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String processForm(WebRequest request,
            @Valid @ModelAttribute("registrationForm") RegistrationForm registrationForm,
            BindingResult result) {
        if (result.hasErrors()) {
            return "user/register";
        }
        MMUser user = new MMUser(registrationForm.getEmail(), registrationForm.getLinkedInId());
        MMUser savedUser = repository.save(user);
        Connection<?> connection = ProviderSignInUtils.getConnection(request);
        ProviderSignInUtils.handlePostSignUp(savedUser.getEmail(), request);
        return "redirect:/user/profile";
    }

    @RequestMapping(value = "/profile", method = RequestMethod.GET)
    public String viewProfile(WebRequest request, Model model) {
        Connection<LinkedIn> connection = connectionRepository.findPrimaryConnection(LinkedIn.class);
        if (null == connection) {
            return "redirect:/entrepreneurs/";
        }
        model.addAttribute("profile", connection.getApi().profileOperations().getUserProfileFull());
        return "user/profile";
    }

    @RequestMapping(value = "/profile/{id}", method = RequestMethod.GET)
    public String viewProfileForId(WebRequest request, Model model, @PathVariable("id") String id) {
        Connection<LinkedIn> connection = connectionRepository.findPrimaryConnection(LinkedIn.class);
        if (null == connection) {
            return "redirect:/entrepreneurs/";
        }
        model.addAttribute("profile", connection.getApi().profileOperations().getProfileFullByPublicUrl(id));
        return "user/profile";
    }
}
