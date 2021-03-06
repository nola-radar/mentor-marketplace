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
import org.ideavillage.mentormarketplace.web.forms.FounderUpdateForm;
import org.ideavillage.mentormarketplace.web.forms.MentorUpdateForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
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
 * Controller for viewing and editing profiles.
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

    @RequestMapping(value = "/profile", method = RequestMethod.GET)
    public String viewProfile(WebRequest request, Model model, Authentication authentication) {
        Mmuser loggedInUser = mmUserRepository.findByEmail(authentication.getName());
        if (loggedInUser == null) {
            // TODO: Need an error page
            return "redirect:/";
        }
        return "redirect:/user/profile/" + loggedInUser.getId() + "/";
    }

    @RequestMapping(value = "/profile/{id}/", method = RequestMethod.GET)
    public String viewProfileForId(WebRequest request, Model model, @PathVariable("id") Long id, Authentication authentication) {
        Mmuser user = mmUserRepository.findOne(id);
        Mmuser loggedInUser = mmUserRepository.findByEmail(authentication.getName());
        if (null == user) {
            // TODO: Need an error page
            return "redirect:/";
        }
        Boolean canEditProfile = user.equals(loggedInUser);
        model.addAttribute("canEditProfile", canEditProfile);
        String utype = user.getUserType();
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

    // Edit page for founder and mentor
    @RequestMapping(value = "/profile/{id}/edit", method = RequestMethod.GET)
    public String viewEditProfile(WebRequest request, Model model, @PathVariable("id") Long id, Authentication authentication) {
        Mmuser loggedInUser = mmUserRepository.findByEmail(authentication.getName());
        if (null == loggedInUser | loggedInUser.getId() != id) {
            // TODO: Need an error page
            return "redirect:/";
        }
        Iterable<Industry> industryList = industryRepository.findAll();
        model.addAttribute("industryList", industryList);
        Iterable<Expertise> expertiseList = expertiseRepository.findAll();
        model.addAttribute("expertiseList", expertiseList);
        String utype = loggedInUser.getUserType();
        if (utype.contains("founder")) {
            Founder founder = founderRepository.findByMmuser(loggedInUser);
            founder.setIndustryList(industryRepository.findByFounderIndustryList(founder));
            founder.setExpertiseList(expertiseRepository.findByFounderExpertiseList(founder));
            FounderUpdateForm founderEditForm = new FounderUpdateForm();
            founderEditForm.pullFounder(founder);
            model.addAttribute("founderUpdateForm", founderEditForm);
            return "user/editFounder";
        } else {
            Mentor mentor = mentorRepository.findByMmuser(loggedInUser);
            mentor.setIndustryList(industryRepository.findByMentorIndustryList(mentor));
            mentor.setExpertiseList(expertiseRepository.findByMentorExpertiseList(mentor));
            MentorUpdateForm mentorEditForm = new MentorUpdateForm();
            mentorEditForm.pullMentor(mentor);
            model.addAttribute("mentorUpdateForm", mentorEditForm);
            return "user/editMentor";
        }
    }

    //Merges the edited user form with the user in the database and saves the result
    @RequestMapping(value = "/profile/{id}/editFounder", method = RequestMethod.POST)
    public String processFounderEdit(@PathVariable("id") Long id,
            @Valid @ModelAttribute("founderUpdateForm") FounderUpdateForm founderUpdateForm, BindingResult result) {
        if (result.hasErrors()) {
            return "user/editFounder";
        }
        Founder mergeFounder = founderRepository.findByMmuserId(id);
        if (null == mergeFounder) {
            return "redirect:/";
        }
        Founder editedFounder = founderUpdateForm.populateForm(mergeFounder);
        founderRepository.save(editedFounder);
        return "redirect:/user/profile/" + id + "/";
    }

    @RequestMapping(value = "/profile/{id}/editMentor", method = RequestMethod.POST)
    public String processMentorEdit(@PathVariable("id") Long id,
            @Valid @ModelAttribute("mentorUpdateForm") MentorUpdateForm mentorUpdateForm, BindingResult result) {
        if (result.hasErrors()) {
            return "user/editMentor";
        }
        Mentor mentorProfile = mentorRepository.findByMmuserId(id);
        if (null == mentorProfile) {
            return "redirect:/";
        }
        Mentor editedMentor = mentorUpdateForm.populateForm(mentorProfile);
        mentorRepository.save(editedMentor);
        return "redirect:/user/profile/" + id + "/";
    }

}
