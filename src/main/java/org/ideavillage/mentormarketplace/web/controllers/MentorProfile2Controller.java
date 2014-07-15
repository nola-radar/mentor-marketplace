package org.ideavillage.mentormarketplace.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/mentorProfile2")
public class MentorProfile2Controller {
   
    @RequestMapping(method = RequestMethod.GET)
    public String displayExamplePage() {
        return "mentors/mentorProfile2";
    }
}
