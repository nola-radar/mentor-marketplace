/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.ideavillage.mentormarketplace.web.forms;

import java.util.List;
import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.ideavillage.mentormarketplace.persistence.domain.Expertise;
import org.ideavillage.mentormarketplace.persistence.domain.Industry;
import org.ideavillage.mentormarketplace.persistence.domain.Mentor;

/**
 *
 * @author 212412062
 */
public class MentorUpdateForm {

    @NotNull
    @NotEmpty
    @Size(min = 1, max = 255)
    @Email
    private String email;

    @NotNull
    @NotEmpty
    @Size(min = 1, max = 255)
    private String linkedInId;

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

    @Size(max = 255)
    private String linkedInPictureURL;

    @Size(max = 255)
    private String linkedInCurrentCompany;

    @Size(max = 255)
    private String linkedInCurrentJobTitle;

    @Size(max = 255)
    private String logo;

    @Size(max = 255)
    private String tagline;

    private String elevatorPitch;

    private String immediateNeeds;

    private String companyDetails;

    private String inspiration;

    private String status;

    private String vision;

    private String newOrleans;

    private String programPlan;

    private String weeklyReports;

    @Size(max = 255)
    private String userType;

    private boolean isAdmin;

    public Mentor getMentor() {
        Mentor mentor = new Mentor();
        mentor.setFirstName(this.firstName);
        mentor.setLastName(this.lastName);
        mentor.setIndustryList(this.industryList);
        mentor.setExpertiseList(this.expertiseList);
        mentor.setBackground(this.background);
        mentor.setLinkedInPictureUrl(this.linkedInPictureURL);
        mentor.setLinkedInCurrentCompany(this.linkedInCurrentCompany);
        mentor.setLinkedInCurrentJobTitle(this.linkedInCurrentJobTitle);
        mentor.setWebsite(this.website);
        mentor.setFacebook(this.facebook);
        mentor.setTwitter(this.twitter);
        mentor.setOtherSocialMedia(this.otherSocialMedia);
        mentor.setLinkedInId(this.linkedInId);
        return mentor;
    }

    public Mentor setMentor(Mentor mentor) {
        mentor.setFirstName(this.firstName);
        mentor.setLastName(this.lastName);
        mentor.setIndustryList(this.industryList);
        mentor.setExpertiseList(this.expertiseList);
        mentor.setBackground(this.background);
        mentor.setLinkedInPictureUrl(this.linkedInPictureURL);
        mentor.setLinkedInCurrentCompany(this.linkedInCurrentCompany);
        mentor.setLinkedInCurrentJobTitle(this.linkedInCurrentJobTitle);
        mentor.setWebsite(this.website);
        mentor.setFacebook(this.facebook);
        mentor.setTwitter(this.twitter);
        mentor.setOtherSocialMedia(this.otherSocialMedia);
        mentor.setLinkedInId(this.linkedInId);
        return mentor;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getLinkedInId() {
        return linkedInId;
    }

    public void setLinkedInId(String linkedInId) {
        this.linkedInId = linkedInId;
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

    public String getLinkedInPictureURL() {
        return linkedInPictureURL;
    }

    public void setLinkedInPictureURL(String linkedInPictureURL) {
        this.linkedInPictureURL = linkedInPictureURL;
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

    public void setIsAdmin(boolean isadmin) {
        this.isAdmin = isadmin;
    }

    public boolean getIsAdmin() {
        return isAdmin;
    }

}
