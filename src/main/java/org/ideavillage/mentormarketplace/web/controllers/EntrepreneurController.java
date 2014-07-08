package org.ideavillage.mentormarketplace.web.controllers;

import javax.validation.Valid;
import org.ideavillage.mentormarketplace.persistence.domain.Entrepreneur;
import org.ideavillage.mentormarketplace.persistence.repositories.EntrepreneurRepository;
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
 * A basic CRUD controller for Entrepreneurs.
 *
 * @author 212395189
 */
// Tells Spring that this class is an MVC Controller
@Controller
// Tells Spring to route all "/mentormarketplace/entrepreneurs/*" requests to this controller.
@RequestMapping(value = "/entrepreneurs")
public class EntrepreneurController {

    // Let Spring automatically inject the dependency.
    @Autowired
    private EntrepreneurRepository entrepreneurRepository;

    /**
     * Controller method for displaying a paginated list of Entrepreneurs.
     *
     * @param model - Variables being passed to the view
     * @param pageable - Pagination parameters from the request
     * @return name of the view to render
     */
    // Tells Spring to route HTTP GET requests at "/mentormarketplace/entrepreneurs/" and
    // "/mentormarketplace/entrepreneurs/list" to this method.
    @RequestMapping(value = {"/", "/list"}, method = RequestMethod.GET)
    public String list(Model model, Pageable pageable) {
        Page page = entrepreneurRepository.findAll(pageable);
        model.addAttribute("entrepreneurs", page.getContent());
        return "entrepreneurs/list";
    }

    /**
     * Controller method for redirecting HTTP GET requests at "/mentormarketplace/entrepreneurs" to
     * "/mentormarketplace/entrepreneurs/" so that relative links in the view work the same way.
     *
     * @return String telling the browser to redirect to a different URL
     */
    @RequestMapping(value = "", method = RequestMethod.GET)
    public String redirect() {
        return "redirect:/entrepreneurs/";
    }

    /**
     * Controller method for viewing a specific Entrepreneur at "/mentormarketplace/entrepreneurs/{id}".
     *
     * @param entrepreneur - The Entrepreneur to view
     * @return name of the view to render along with the instance of Entrepreneur
     */
    // Use curly braces {} to specify the name of a path variable.
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    // Because of configuration in WEB-INF/configs/spring-mvc.xml, Spring will automatically try to find the instance
    // of a class based on the PathVariable.
    public ModelAndView view(@PathVariable("id") Entrepreneur entrepreneur) {
        // Should be a null check here to do something else if an entrepreneur isn't found with the given id.
        return new ModelAndView("entrepreneurs/view", "entrepreneur", entrepreneur);
    }

    /**
     * Controller method for displaying the Create new Entrepreneur page.
     *
     * @return name of the view to render with a new instance of Entrepreneur to pass in to the view
     */
    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public ModelAndView create() {
        return new ModelAndView("entrepreneurs/create", "entrepreneur", new Entrepreneur());
    }

    /**
     * Controller method for handling the submitted create new Entrepreneur form.
     *
     * @param entrepreneur - Entrepreneur trying to be created
     * @param result - Object to find out if there were validation errors in the parameter object
     * @return name of the view to render
     */
    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public String doCreate(@Valid Entrepreneur entrepreneur, BindingResult result) {
        if (result.hasErrors()) {
            return "entrepreneurs/create";
        }
        Entrepreneur saved = entrepreneurRepository.save(entrepreneur);
        return "redirect:/entrepreneurs/" + saved.getId();
    }
}
