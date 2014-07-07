package org.ideavillage.mentormarketplace.web.controllers;

import javax.inject.Provider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.social.connect.ConnectionRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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

    private ConnectionRepository getConnectionRepository() {
        return connectionRepositoryProvider.get();
    }
}
