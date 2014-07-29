package org.ideavillage.mentormarketplace.web.controllers;

import org.ideavillage.mentormarketplace.core.services.RepositoryUserDetailsService;
import org.ideavillage.mentormarketplace.persistence.domain.MMUser;
import org.ideavillage.mentormarketplace.persistence.repositories.MMUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.social.connect.Connection;
import org.springframework.social.connect.ConnectionRepository;
import org.springframework.social.linkedin.api.LinkedIn;
import org.springframework.social.security.SocialUser;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author 212412062
 */
@Controller
@RequestMapping(value = "/admin")
public class AdminController {

    @Autowired
    private MMUserRepository mmUserRepository;

    @Autowired
    private ConnectionRepository connectionRepository;

    @Autowired
    private RepositoryUserDetailsService repositoryUserDetailsService;

    /**
     * Serve admin dashboard to user
     *
     * @return admin/dashboard
     */
    @RequestMapping(method = RequestMethod.GET)
    public String showDashboard() {
        Connection<LinkedIn> connection = connectionRepository.findPrimaryConnection(LinkedIn.class);
        if (null == connection) {
            return "redirect:/";
        }
        String loggedInUserEmail = connection.getApi().profileOperations().getUserProfileFull().getEmailAddress();
        MMUser currentUser = mmUserRepository.findByEmail(loggedInUserEmail);

        if (currentUser.getIsAdmin()) {
            return "admin/dashboard";
        } else {
            return "/";
        }
    }

    /**
     * Controller method for redirecting HTTP GET requests at
     * "/mentormarketplace/mentors" to "/mentormarketplace/mentors/" so that
     * relative links in the view work the same way.
     *
     * @return String telling the browser to redirect to a different URL
     */
    @RequestMapping(value = "/admin", method = RequestMethod.GET)
    public String redirect() {
        return "redirect:/admin/dashboard";
    }

}
