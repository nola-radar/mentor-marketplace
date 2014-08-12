/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.ideavillage.mentormarketplace.web.controllers;

import javax.validation.Valid;
import org.ideavillage.mentormarketplace.persistence.domain.Mentor;
import org.ideavillage.mentormarketplace.persistence.repositories.MentorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author 212412051
 */
// Tells Spring that this class is an MVC Controller
@Controller
// Tells Spring to route all "/mentormarketplace/mentors/*" requests to this controller.
@RequestMapping(value = "/register")
public class RegisterController {
    
    @Autowired
    private MentorRepository mentorRepository;
     /**
     * Controller method for displaying the Create new Mentor page.
     *
     * @return name of the view to render with a new instance of Mentor to pass in to the view
     */
    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public ModelAndView create() {
        return new ModelAndView("register/create", "mentor", new Mentor());
    }

    /**
     * Controller method for handling the submitted create new Mentor form.
     *
     * @param mentor - Mentor trying to be created
     * @param result - Object to find out if there were validation errors in the parameter object
     * @return name of the view to render
     */
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public String doCreate(@Valid Mentor mentor, BindingResult result) {
        if (result.hasErrors()) {
            return "register/create";
        }
        Mentor saved = mentorRepository.save(mentor);
        return "redirect:/register/" + saved.getId();
    }
}