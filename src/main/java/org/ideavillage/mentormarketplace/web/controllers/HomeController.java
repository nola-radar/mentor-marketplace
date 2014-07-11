package org.ideavillage.mentormarketplace.web.controllers;

import javax.inject.Provider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.social.connect.Connection;
import org.springframework.social.connect.ConnectionRepository;
import org.springframework.social.connect.web.ProviderSignInUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.WebRequest;

/**
 *
 * @author 212395189
 */
@Controller
@RequestMapping(value = "/")
public class HomeController {

    @Autowired
    private Provider<ConnectionRepository> connectionRepositoryProvider;

    @RequestMapping(method = RequestMethod.GET)
    public String displayHomePage() {
        return "index";
    }

    @RequestMapping(value = "/connect")
    public String linkedin(Model model) {
        model.addAttribute("connectionsToProviders", getConnectionRepository().findAllConnections());
        return "index";
    }
    
    @RequestMapping(value = "/signin", method = RequestMethod.GET)
    public String signupForm(WebRequest request) {
        Connection<?> connection = ProviderSignInUtils.getConnection(request);
        if (connection != null) {
            connection.fetchUserProfile();
        }
        return "user/register";
    }

    private ConnectionRepository getConnectionRepository() {
        return connectionRepositoryProvider.get();
    }
}
