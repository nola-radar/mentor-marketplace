package org.ideavillage.mentormarketplace.web.forms;

import java.util.List;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.ideavillage.mentormarketplace.persistence.domain.Expertise;
import org.ideavillage.mentormarketplace.persistence.domain.Founder;
import org.ideavillage.mentormarketplace.persistence.domain.Industry;
import org.ideavillage.mentormarketplace.persistence.domain.Mentor;

/**
 *
 * @author 212395189
 */
public class RegistrationForm {

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

    public Mentor editMentor(Mentor mentor) {
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

    public Founder editFounder(Founder founder) {
        founder.setFirstName(this.firstName);
        founder.setLastName(this.lastName);
        founder.setIndustryList(industryList);
        founder.setExpertiseList(expertiseList);
        founder.setBackground(this.background);
        founder.setLinkedInPictureUrl(this.linkedInPictureURL);
        founder.setLinkedInCurrentCompany(this.linkedInCurrentCompany);
        founder.setLinkedInCurrentJobTitle(this.linkedInCurrentJobTitle);
        founder.setWebsite(this.website);
        founder.setFacebook(this.facebook);
        founder.setTwitter(this.twitter);
        founder.setOtherSocialMedia(this.otherSocialMedia);
        founder.setLogo(this.logo);
        founder.setTagline(this.tagline);
        founder.setElevatorPitch(this.elevatorPitch);
        founder.setImmediateNeeds(this.immediateNeeds);
        founder.setCompanyDetails(this.companyDetails);
        founder.setInspiration(this.inspiration);
        founder.setStatus(this.status);
        founder.setVision(this.vision);
        founder.setNewOrleans(this.newOrleans);
        founder.setProgramPlan(this.programPlan);
        founder.setWeeklyReports(this.weeklyReports);
        founder.setLinkedInId(this.linkedInId);
        return founder;
    }

    public Founder getFounder() {
        Founder founder = new Founder();
        founder.setFirstName(this.firstName);
        founder.setLastName(this.lastName);
        founder.setIndustryList(this.industryList);
        founder.setExpertiseList(this.expertiseList);
        founder.setBackground(this.background);
        founder.setLinkedInPictureUrl(this.linkedInPictureURL);
        founder.setLinkedInCurrentCompany(this.linkedInCurrentCompany);
        founder.setLinkedInCurrentJobTitle(this.linkedInCurrentJobTitle);
        founder.setWebsite(this.website);
        founder.setFacebook(this.facebook);
        founder.setTwitter(this.twitter);
        founder.setOtherSocialMedia(this.otherSocialMedia);
        founder.setLogo(this.logo);
        founder.setTagline(this.tagline);
        founder.setElevatorPitch(this.elevatorPitch);
        founder.setImmediateNeeds(this.immediateNeeds);
        founder.setCompanyDetails(this.companyDetails);
        founder.setInspiration(this.inspiration);
        founder.setStatus(this.status);
        founder.setVision(this.vision);
        founder.setNewOrleans(this.newOrleans);
        founder.setProgramPlan(this.programPlan);
        founder.setWeeklyReports(this.weeklyReports);
        founder.setLinkedInId(this.linkedInId);
        return founder;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    /**
     * @return the linkedInId
     */
    public String getLinkedInId() {
        return linkedInId;
    }

    /**
     * @param linkedInId the linkedInId to set
     */
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

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getTagline() {
        return tagline;
    }

    public void setTagline(String tagline) {
        this.tagline = tagline;
    }

    public String getElevatorPitch() {
        return elevatorPitch;
    }

    public void setElevatorPitch(String elevatorPitch) {
        this.elevatorPitch = elevatorPitch;
    }

    public String getImmediateNeeds() {
        return immediateNeeds;
    }

    public void setImmediateNeeds(String immediateNeeds) {
        this.immediateNeeds = immediateNeeds;
    }

    public String getCompanyDetails() {
        return companyDetails;
    }

    public void setCompanyDetails(String companyDetails) {
        this.companyDetails = companyDetails;
    }

    public String getInspiration() {
        return inspiration;
    }

    public void setInspiration(String inspiration) {
        this.inspiration = inspiration;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getVision() {
        return vision;
    }

    public void setVision(String vision) {
        this.vision = vision;
    }

    public String getNewOrleans() {
        return newOrleans;
    }

    public void setNewOrleans(String newOrleans) {
        this.newOrleans = newOrleans;
    }

    public String getProgramPlan() {
        return programPlan;
    }

    public void setProgramPlan(String programPlan) {
        this.programPlan = programPlan;
    }

    public String getWeeklyReports() {
        return weeklyReports;
    }

    public void setWeeklyReports(String weeklyReports) {
        this.weeklyReports = weeklyReports;
    }

    public void setIsAdmin(boolean isadmin) {
        this.isAdmin = isadmin;
    }

    public boolean getIsAdmin() {
        return isAdmin;
    }

}
