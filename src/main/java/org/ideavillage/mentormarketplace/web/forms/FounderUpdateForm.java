package org.ideavillage.mentormarketplace.web.forms;

import java.util.List;
import javax.validation.constraints.Size;
import org.ideavillage.mentormarketplace.persistence.domain.Expertise;
import org.ideavillage.mentormarketplace.persistence.domain.Founder;
import org.ideavillage.mentormarketplace.persistence.domain.Industry;

/**
 *
 * @author 212412062
 */
public class FounderUpdateForm {


    @Size(max = 255)
    private String firstName;

    @Size(max = 255)
    private String lastName;

    private List<Industry> industryList;

    private List<Expertise> expertiseList;

    @Size(max = 255)
    private String website;

    @Size(max = 255)
    private String facebook;

    @Size(max = 255)
    private String twitter;

    @Size(max = 255)
    private String otherSocialMedia;

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


    public Founder getFounder() {
        Founder founder = new Founder();
        founder.setFirstName(this.firstName);
        founder.setLastName(this.lastName);
        founder.setIndustryList(this.industryList);
        founder.setExpertiseList(this.expertiseList);
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
        return founder;
    }

    public Founder mergeFounderFormWithFounder(Founder founder) {
        founder.setFirstName(this.firstName);
        founder.setLastName(this.lastName);
        founder.setIndustryList(this.industryList);
        founder.setExpertiseList(this.expertiseList);
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
        return founder;
    }
    
    public void pullFounder(Founder founder){
        setFirstName(founder.getFirstName());
        setLastName(founder.getLastName());
        setIndustryList(founder.getIndustryList());
        setExpertiseList(founder.getExpertiseList());
        setWebsite(founder.getWebsite());
        setFacebook(founder.getFacebook());
        setTwitter(founder.getTwitter());
        setOtherSocialMedia(founder.getOtherSocialMedia());
        setLogo(founder.getLogo());
        setTagline(founder.getTagline());
        setElevatorPitch(founder.getElevatorPitch());
        setImmediateNeeds(founder.getImmediateNeeds());
        setCompanyDetails(founder.getCompanyDetails());
        setInspiration(founder.getInspiration());
        setStatus(founder.getStatus());
        setVision(founder.getVision());
        setNewOrleans(founder.getNewOrleans());
        setProgramPlan(founder.getProgramPlan());
        setWeeklyReports(founder.getWeeklyReports());    
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
}
