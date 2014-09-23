package org.ideavillage.mentormarketplace.web.forms;

import java.util.List;
import javax.validation.constraints.Size;
import org.ideavillage.mentormarketplace.persistence.domain.Expertise;
import org.ideavillage.mentormarketplace.persistence.domain.Industry;
import org.ideavillage.mentormarketplace.persistence.domain.Mentor;

/**
 *
 * @author 212412062
 */
public class MentorUpdateForm {

    @Size(max = 255)
    private String firstName;

    @Size(max = 255)
    private String lastName;

    private List<Industry> industryList;

    private List<Expertise> expertiseList;

    private String background;

    @Size(max = 255)
    private String website;

    @Size(max = 255)
    private String facebook;

    @Size(max = 255)
    private String twitter;

    @Size(max = 255)
    private String otherSocialMedia;
    
    @Size(max=255)
    private String linkedInCurrentCompany;
    
    @Size(max=255)
    private String linkedInCurrentJobTitle;

    public Mentor getMentor() {
        Mentor mentor = new Mentor();
        mentor.setFirstName(this.firstName);
        mentor.setLastName(this.lastName);
        mentor.setIndustryList(this.industryList);
        mentor.setExpertiseList(this.expertiseList);
        mentor.setBackground(this.background);
        mentor.setWebsite(this.website);
        mentor.setFacebook(this.facebook);
        mentor.setTwitter(this.twitter);
        mentor.setOtherSocialMedia(this.otherSocialMedia);
        mentor.setLinkedInCurrentCompany(linkedInCurrentCompany);
        mentor.setLinkedInCurrentJobTitle(linkedInCurrentJobTitle);
        return mentor;
    }

    public void pullMentor(Mentor mentor) {
        setFirstName(mentor.getFirstName());
        setLastName(mentor.getLastName());
        setIndustryList(mentor.getIndustryList());
        setExpertiseList(mentor.getExpertiseList());
        setBackground(mentor.getBackground());
        setWebsite(mentor.getWebsite());
        setFacebook(mentor.getFacebook());
        setTwitter(mentor.getTwitter());
        setOtherSocialMedia(mentor.getOtherSocialMedia());
        setLinkedInCurrentCompany(mentor.getLinkedInCurrentCompany());
        setLinkedInCurrentJobTitle(mentor.getLinkedInCurrentJobTitle());
    }

    public Mentor populateForm(Mentor mentor) {
        mentor.setFirstName(this.firstName);
        mentor.setLastName(this.lastName);
        mentor.setIndustryList(this.industryList);
        mentor.setExpertiseList(this.expertiseList);
        mentor.setBackground(this.background);
        mentor.setWebsite(this.website);
        mentor.setFacebook(this.facebook);
        mentor.setTwitter(this.twitter);
        mentor.setOtherSocialMedia(this.otherSocialMedia);
        mentor.setLinkedInCurrentCompany(this.linkedInCurrentCompany);
        mentor.setLinkedInCurrentJobTitle(this.linkedInCurrentJobTitle);
        return mentor;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<Industry> getIndustryList() {
        return industryList;
    }

    public void setIndustryList(List<Industry> industryList) {
        this.industryList = industryList;
    }

    public List<Expertise> getExpertiseList() {
        return expertiseList;
    }

    public void setExpertiseList(List<Expertise> expertiseList) {
        this.expertiseList = expertiseList;
    }

    public String getBackground() {
        return background;
    }

    public void setBackground(String background) {
        this.background = background;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    public String getTwitter() {
        return twitter;
    }

    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }

    public String getOtherSocialMedia() {
        return otherSocialMedia;
    }

    public void setOtherSocialMedia(String otherSocialMedia) {
        this.otherSocialMedia = otherSocialMedia;
    }

    public String getLinkedInCurrentCompany() {
        return linkedInCurrentCompany;
    }

    public void setLinkedInCurrentCompany(String linkedInCurrentCompany) {
        this.linkedInCurrentCompany = linkedInCurrentCompany;
    }

    public String getLinkedInCurrentJobTitle() {
        return linkedInCurrentJobTitle;
    }

    public void setLinkedInCurrentJobTitle(String linkedInCurrentJobTitle) {
        this.linkedInCurrentJobTitle = linkedInCurrentJobTitle;
    }
}
