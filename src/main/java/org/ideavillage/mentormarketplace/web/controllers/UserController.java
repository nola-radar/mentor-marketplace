package org.ideavillage.mentormarketplace.web.controllers;

import org.springframework.social.connect.Connection;
import org.springframework.social.connect.web.ProviderSignInUtils;
import org.springframework.stereotype.Controller;
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

    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String signupForm(WebRequest request) {
        Connection<?> connection = ProviderSignInUtils.getConnection(request);
        if (connection != null) {
            connection.fetchUserProfile();
        }
        return "user/register";
    }
}
