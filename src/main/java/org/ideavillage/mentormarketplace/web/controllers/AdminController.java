package org.ideavillage.mentormarketplace.web.controllers;

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

    /**
     * Controller method for redirecting HTTP GET requests at "/mentormarketplace/mentors" to
     * "/mentormarketplace/mentors/" so that relative links in the view work the same way.
     *
     * @return String telling the browser to redirect to a different URL
     */
    @RequestMapping(value = "", method = RequestMethod.GET)
    public String redirect() {
        return "redirect:/mentors/dashboard";
    }

}
