package org.ideavillage.mentormarketplace.web.controllers;

import javax.validation.Valid;
import org.ideavillage.mentormarketplace.persistence.domain.Mentor;
import org.ideavillage.mentormarketplace.persistence.repositories.MentorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * A basic CRUD controller for Mentors.
 *
 * @author 212395189
 */
// Tells Spring that this class is an MVC Controller
@Controller
// Tells Spring to route all "/mentormarketplace/mentors/*" requests to this controller.
@RequestMapping(value = "/mentors")
public class MentorController {

    // Let Spring automatically inject the dependency.
    @Autowired
    private MentorRepository mentorRepository;

    /**
     * Controller method for displaying a paginated list of Mentors.
     *
     * @param model - Variables being passed to the view
     * @param pageable - Pagination parameters from the request
     * @return name of the view to render
     */
    // Tells Spring to route HTTP GET requests at "/mentormarketplace/mentors/" and
    // "/mentormarketplace/mentors/list" to this method.
    /*@RequestMapping(value = {"/", "/list"}, method = RequestMethod.GET)
    public String list(Model model, Pageable pageable) {
        Page page = mentorRepository.findAll(pageable);
        model.addAttribute("mentors", page.getContent());
        return "mentors/list";
    }/*

    /**
     * Controller method for redirecting HTTP GET requests at "/mentormarketplace/mentors" to
     * "/mentormarketplace/mentors/" so that relative links in the view work the same way.
     *
     * @return String telling the browser to redirect to a different URL
     */
    @RequestMapping(value = "", method = RequestMethod.GET)
    public String redirect() {
        return "redirect:/mentors/";
    }

    /**
     * Controller method for viewing a specific Mentor at "/mentormarketplace/mentors/{id}".
     *
     * @param mentor - The Mentor to view
     * @return name of the view to render along with the instance of Mentor
     */
    // Use curly braces {} to specify the name of a path variable.
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    // Because of configuration in WEB-INF/configs/spring-mvc.xml, Spring will automatically try to find the instance
    // of a class based on the PathVariable.
    public ModelAndView view(@PathVariable("id") Mentor mentor) {
        // Should be a null check here to do something else if an mentor isn't found with the given id.
        return new ModelAndView("mentors/view", "mentor", mentor);
    }

    /**
     * Controller method for displaying the Create new Mentor page.
     *
     * @return name of the view to render with a new instance of Mentor to pass in to the view
     */
    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public ModelAndView create() {
        return new ModelAndView("mentors/create", "mentor", new Mentor());
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
            return "mentors/create";
        }
        Mentor saved = mentorRepository.save(mentor);
        return "redirect:/mentors/" + saved.getId();
    }
    
    /* Marcus Bischof added these two similar mappings for /list view,
     * in order to create mentor on /list view as well
    */
    
    @RequestMapping(value = {"/","/list"}, method = RequestMethod.GET)
    public ModelAndView list() {
        return new ModelAndView("mentors/list", "mentor", new Mentor());
    }

    /**
     * Controller method for handling the submitted create new Mentor form.
     *
     * @param mentor - Mentor trying to be created
     * @param result - Object to find out if there were validation errors in the parameter object
     * @return name of the view to render
     */
    @RequestMapping(value = {"/","/list"}, method = RequestMethod.POST)
    public String doList(@Valid Mentor mentor, BindingResult result) {
        if (result.hasErrors()) {
            return "mentors/list";
        }
        Mentor saved = mentorRepository.save(mentor);
        return "redirect:/mentors/" + saved.getId();
    }
    
    
}
