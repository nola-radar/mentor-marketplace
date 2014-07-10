package org.ideavillage.mentormarketplace.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(value="/exampleCreate")
public class CreateExampleController {
   
    @RequestMapping(method = RequestMethod.GET)
    public String displayExamplePage() {
        return "mentors/exampleCreate";
    }
}
