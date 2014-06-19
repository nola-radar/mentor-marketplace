package org.ideavillage.mentormarketplace.web.controllers;

import javax.servlet.http.HttpServletRequest;
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
 *
 * @author 212395189
 */
@Controller
@RequestMapping(value = "/entrepreneurs")
public class EntrepreneurController {

    @Autowired
    private EntrepreneurRepository entrepreneurRepository;

    @RequestMapping(value = {"/", "/list"}, method = RequestMethod.GET)
    public String list(Model model, Pageable pageable) {
        Page page = entrepreneurRepository.findAll(pageable);
        model.addAttribute("entrepreneurs", page.getContent());
        return "entrepreneurs/list";
    }

    @RequestMapping(value = "", method = RequestMethod.GET)
    public String redirect() {
        return "redirect:/entrepreneurs/";
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public String view(@PathVariable("id") Entrepreneur entrepreneur, Model model) {
//        Entrepreneur entrepreneur = entrepreneurRepository.findOne(id);
        model.addAttribute("entrepreneur", entrepreneur);
        return "entrepreneurs/view";
    }

    @RequestMapping(value = "/create", method = RequestMethod.GET)
    public ModelAndView create() {
        return new ModelAndView("entrepreneurs/create", "entrepreneur", new Entrepreneur());
    }

    @RequestMapping(value = "/create", method = RequestMethod.POST)
    public String doCreate(@Valid Entrepreneur entrepreneur, BindingResult result, Model model,
            HttpServletRequest request) {
        if (result.hasErrors()) {
            return "entrepreneurs/create";
        }
        Entrepreneur saved = entrepreneurRepository.save(entrepreneur);
        return "redirect:/entrepreneurs/" + saved.getId();
    }
}
