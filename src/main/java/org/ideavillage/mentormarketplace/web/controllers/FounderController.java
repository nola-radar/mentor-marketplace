package org.ideavillage.mentormarketplace.web.controllers;

import javax.validation.Valid;
import org.ideavillage.mentormarketplace.persistence.domain.Founder;
import org.ideavillage.mentormarketplace.persistence.repositories.FounderRepository;
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
 * A basic CRUD controller for Founders.
 *
 * @author 212395189
 */
// Tells Spring that this class is an MVC Controller
@Controller
// Tells Spring to route all "/mentormarketplace/founders/*" requests to this controller.
@RequestMapping(value = "/founders")
public class FounderController {

    // Let Spring automatically inject the dependency.
    @Autowired
    private FounderRepository founderRepository;

    /**
     * Controller method for displaying a paginated list of Founders.
     *
     * @param model - Variables being passed to the view
     * @param pageable - Pagination parameters from the request
     * @return name of the view to render
     */
    // Tells Spring to route HTTP GET requests at "/mentormarketplace/founders/" and
    // "/mentormarketplace/founders/list" to this method.
    @RequestMapping(value = {"/", "/list"}, method = RequestMethod.GET)
    public String list(Model model, Pageable pageable) {
        Page page = founderRepository.findAll(pageable);
        model.addAttribute("founders", page.getContent());
        return "founders/list";
    }

    /**
     * Controller method for redirecting HTTP GET requests at "/mentormarketplace/founders" to
     * "/mentormarketplace/founders/" so that relative links in the view work the same way.
     *
     * @return String telling the browser to redirect to a different URL
     */
    @RequestMapping(value = "", method = RequestMethod.GET)
    public String redirect() {
        return "redirect:/founders/";
    }

    /**
     * Controller method for viewing a specific Founder at "/mentormarketplace/founders/{id}".
     *
     * @param founder - The Founder to view
     * @return name of the view to render along with the instance of Founder
     */
    // Use curly braces {} to specify the name of a path variable.
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    // Because of configuration in WEB-INF/configs/spring-mvc.xml, Spring will automatically try to find the instance
    // of a class based on the PathVariable.
    public ModelAndView view(@PathVariable("id") Founder founder) {
        // Should be a null check here to do something else if an founder isn't found with the given id.
        return new ModelAndView("founders/view", "founder", founder);
    }

    /**
     * Controller method for displaying the Create new Founder page.
     *
     * @return name of the view to render with a new instance of Founder to pass in to the view
     */
    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public ModelAndView create() {
        return new ModelAndView("founders/create", "founder", new Founder());
    }

    /**
     * Controller method for handling the submitted create new Founder form.
     *
     * @param founder - Founder trying to be created
     * @param result - Object to find out if there were validation errors in the parameter object
     * @return name of the view to render
     */
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public String doCreate(@Valid Founder founder, BindingResult result) {
        if (result.hasErrors()) {
            return "founders/create";
        }
        Founder saved = founderRepository.save(founder);
        return "redirect:/founders/" + saved.getId();
    }
}
