package org.ideavillage.mentormarketplace.web.controllers;

import javax.validation.Valid;
import org.ideavillage.mentormarketplace.persistence.domain.Expertise;
import org.ideavillage.mentormarketplace.persistence.domain.Founder;
import org.ideavillage.mentormarketplace.persistence.domain.Industry;
import org.ideavillage.mentormarketplace.persistence.domain.Mentor;
import org.ideavillage.mentormarketplace.persistence.domain.Mmuser;
import org.ideavillage.mentormarketplace.persistence.repositories.ExpertiseRepository;
import org.ideavillage.mentormarketplace.persistence.repositories.FounderRepository;
import org.ideavillage.mentormarketplace.persistence.repositories.IndustryRepository;
import org.ideavillage.mentormarketplace.persistence.repositories.MentorRepository;
import org.ideavillage.mentormarketplace.persistence.repositories.MmuserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.social.connect.Connection;
import org.springframework.social.connect.ConnectionRepository;
import org.springframework.social.linkedin.api.LinkedIn;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.context.request.WebRequest;

/**
 *
 * @author 212395189
 */
@Controller
@RequestMapping(value = "/user")
@SessionAttributes({"mmuser"})
public class UserController {

    @Autowired
    private MmuserRepository mmUserRepository;

    @Autowired
    private MentorRepository mentorRepository;

    @Autowired
    private FounderRepository founderRepository;

    @Autowired
    private IndustryRepository industryRepository;

    @Autowired
    private ExpertiseRepository expertiseRepository;

    @Autowired
    private ConnectionRepository connectionRepository;

    @RequestMapping(value = "/profile", method = RequestMethod.GET)
    public String viewProfile(WebRequest request, Model model) {
        Connection<LinkedIn> connection = connectionRepository.findPrimaryConnection(LinkedIn.class);
        if (null == connection) {
            // TODO: Need an error page
            return "redirect:/";
        }
        String email = connection.fetchUserProfile().getEmail();
        Mmuser user = mmUserRepository.findByEmail(email);
        return "redirect:/user/profile/" + user.getId() + "/";
    }

    @RequestMapping(value = "/profile/{id}/", method = RequestMethod.GET)
    public String viewProfileForId(WebRequest request, Model model, @PathVariable("id") Long id) {
        Mmuser user = mmUserRepository.findOne(id);
        if (null == user) {
            // TODO: Need an error page
            return "redirect:/";
        }
        String utype = user.getUserType();
        // redirect to founder.jsp if user type is founder
        if (utype.contains("founder")) {
            Founder founder = founderRepository.findByMmuser(user);
            founder.setIndustryList(industryRepository.findByFounderIndustryList(founder));
            founder.setExpertiseList(expertiseRepository.findByFounderExpertiseList(founder));
            model.addAttribute("founder", founder);
            return "user/founder";
        } else {
            Mentor mentor = mentorRepository.findByMmuser(user);
            mentor.setIndustryList(industryRepository.findByMentorIndustryList(mentor));
            mentor.setExpertiseList(expertiseRepository.findByMentorExpertiseList(mentor));
            model.addAttribute("mentor", mentor);
            return "user/mentor";
        }
    }

    // page that user is redirected to if they want to edit their profile (founder)
    @RequestMapping(value = "/profile/{id}/edit", method = RequestMethod.GET)
    public String viewEditFounder(WebRequest request, Model model, @PathVariable("id") Long id) {
        Mmuser user = mmUserRepository.findOne(id);
        if (null == user) {
            // TODO: Need an error page
            return "redirect:/";
        }
        Iterable<Industry> industryList = industryRepository.findAll();
        model.addAttribute("industryList", industryList);
        Iterable<Expertise> expertiseList = expertiseRepository.findAll();
        model.addAttribute("expertiseList", expertiseList);
        String utype = user.getUserType();
        // redirect to founder.jsp if user type is founder
        if (utype.contains("founder")) {
            Founder founder = founderRepository.findByMmuser(user);
            founder.setIndustryList(industryRepository.findByFounderIndustryList(founder));
            founder.setExpertiseList(expertiseRepository.findByFounderExpertiseList(founder));
            model.addAttribute("founder", founder);
            return "user/editFounder";
        } else {
            Mentor mentor = mentorRepository.findByMmuser(user);
            mentor.setIndustryList(industryRepository.findByMentorIndustryList(mentor));
            mentor.setExpertiseList(expertiseRepository.findByMentorExpertiseList(mentor));
            model.addAttribute("mentor", mentor);
            return "user/editMentor";
        }
    }

    @RequestMapping(value = "/profile/{id}/editFounder", method = RequestMethod.POST)
    public String processFounderEdit(BindingResult result, @PathVariable("id") Long id,
      @Valid @ModelAttribute("founder") Founder founder) {
        if (result.hasErrors()) {
            return "user/editFounder";
        }
        founderRepository.save(founder);
        return "redirect:/user/profile/" + id + "/";
    }

    @RequestMapping(value = "/profile/{id}/editMentor", method = RequestMethod.POST)
    public String processMentorEdit(BindingResult result, @PathVariable("id") Long id,
      @Valid @ModelAttribute("mentor") Mentor mentor) {
        if (result.hasErrors()) {
            return "user/editMentor";
        }
        mentorRepository.save(mentor);
        return "redirect:/user/profile/" + id + "/";
    }
}
