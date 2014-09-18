package org.ideavillage.mentormarketplace.web.controllers;

import java.util.List;
import org.ideavillage.mentormarketplace.persistence.domain.Expertise;
import org.ideavillage.mentormarketplace.persistence.domain.Founder;
import org.ideavillage.mentormarketplace.persistence.domain.Industry;
import org.ideavillage.mentormarketplace.persistence.domain.Mentor;
import org.ideavillage.mentormarketplace.persistence.repositories.ExpertiseRepository;
import org.ideavillage.mentormarketplace.persistence.repositories.FounderRepository;
import org.ideavillage.mentormarketplace.persistence.repositories.IndustryRepository;
import org.ideavillage.mentormarketplace.persistence.repositories.MentorRepository;
import org.ideavillage.mentormarketplace.web.forms.ExploreForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 */
@Controller
@RequestMapping(value = "/explore")
public class ExploreController {

    @Autowired
    private IndustryRepository industryRepository;

    @Autowired
    private ExpertiseRepository expertiseRepository;

    @Autowired
    private MentorRepository mentorRepository;

    @Autowired
    private FounderRepository founderRepository;

    @RequestMapping(value = "/mentors", method = {RequestMethod.GET, RequestMethod.POST})
    public String exploreMentors(Model model, @ModelAttribute("exploreForm") ExploreForm exploreForm) {
        Iterable<Industry> industryList = industryRepository.findAll();
        model.addAttribute("industryList", industryList);

        Iterable<Expertise> expertiseList = expertiseRepository.findAll();
        model.addAttribute("expertiseList", expertiseList);

        List<Mentor> mentors = null;

        if (null != exploreForm.getIndustryList() && !exploreForm.getIndustryList().isEmpty()
                && null != exploreForm.getExpertiseList() && !exploreForm.getExpertiseList().isEmpty()) {
            mentors = mentorRepository.findDistinctByIndustryListInAndExpertiseListIn(exploreForm.getIndustryList(),
                    exploreForm.getExpertiseList());
        } else if (null != exploreForm.getIndustryList() && !exploreForm.getIndustryList().isEmpty()) {
            mentors = mentorRepository.findDistinctByIndustryListIn(exploreForm.getIndustryList());
        } else if (null != exploreForm.getExpertiseList() && !exploreForm.getExpertiseList().isEmpty()) {
            mentors = mentorRepository.findDistinctByExpertiseListIn(exploreForm.getExpertiseList());
        } else {
            mentors = mentorRepository.findAll();
        }

        model.addAttribute("mentors", mentors);
        return "explore/mentors";
    }

    @RequestMapping(value = "/founders", method = {RequestMethod.GET, RequestMethod.POST})
    public String exploreFounders(Model model, @ModelAttribute("exploreForm") ExploreForm exploreForm) {
        Iterable<Industry> industryList = industryRepository.findAll();
        model.addAttribute("industryList", industryList);

        Iterable<Expertise> expertiseList = expertiseRepository.findAll();
        model.addAttribute("expertiseList", expertiseList);

        List<Founder> founders = null;

        if (null != exploreForm.getIndustryList() && !exploreForm.getIndustryList().isEmpty()
                && null != exploreForm.getExpertiseList() && !exploreForm.getExpertiseList().isEmpty()) {
            founders = founderRepository.findDistinctByIndustryListInAndExpertiseListIn(exploreForm.getIndustryList(),
                    exploreForm.getExpertiseList());
        } else if (null != exploreForm.getIndustryList() && !exploreForm.getIndustryList().isEmpty()) {
            founders = founderRepository.findDistinctByIndustryListIn(exploreForm.getIndustryList());
        } else if (null != exploreForm.getExpertiseList() && !exploreForm.getExpertiseList().isEmpty()) {
            founders = founderRepository.findDistinctByExpertiseListIn(exploreForm.getExpertiseList());
        } else {
            founders = founderRepository.findAll();
        }

        model.addAttribute("founders", founders);
        return "explore/founders";
    }
}
