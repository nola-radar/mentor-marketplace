package org.ideavillage.mentormarketplace.web.controllers;

import javax.validation.Valid;
import org.ideavillage.mentormarketplace.persistence.domain.Entrepreneur;
import org.ideavillage.mentormarketplace.persistence.repositories.EntrepreneurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author 212391758
 */
@Controller
@RequestMapping(value = "/signupFounder")
public class SignupFounderController {

     // Let Spring automatically inject the dependency.
    @Autowired
    private EntrepreneurRepository entrepreneurRepository;
    
    
    @RequestMapping(method = RequestMethod.GET)
    public String displayHomePage() {
        return "signupFounder";
    }
}

