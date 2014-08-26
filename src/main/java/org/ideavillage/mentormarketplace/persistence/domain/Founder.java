package org.ideavillage.mentormarketplace.persistence.domain;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author jlbates
 */
@Entity
@Table(name = "founder")
@XmlRootElement
public class Founder implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;

    @Size(max = 255)
    @Column(name = "first_name")
    private String firstName;

    @Size(max = 255)
    @Column(name = "last_name")
    private String lastName;

    @Size(max = 255)
    @Column(name = "linked_in_picture_url")
    private String linkedInPictureUrl;

    @Size(max = 255)
    @Column(name = "linked_in_current_company")
    private String linkedInCurrentCompany;

    @Size(max = 255)
    @Column(name = "linked_in_current_job_title")
    private String linkedInCurrentJobTitle;

    @Size(max = 255)
    @Column(name = "website")
    private String website;

    @Size(max = 255)
    @Column(name = "facebook")
    private String facebook;

    @Size(max = 255)
    @Column(name = "twitter")
    private String twitter;

    @Size(max = 255)
    @Column(name = "other_social_media")
    private String otherSocialMedia;

    @Size(max = 255)
    @Column(name = "logo")
    private String logo;

    @Size(max = 255)
    @Column(name = "tagline")
    private String tagline;

    @Size(max = 255)
    @Column(name = "linked_in_id")
    private String linkedInId;

    @Size(max = 2147483647)
    @Column(name = "background")
    private String background;

    @Size(max = 2147483647)
    @Column(name = "elevator_pitch")
    private String elevatorPitch;

    @Size(max = 2147483647)
    @Column(name = "immediate_needs")
    private String immediateNeeds;

    @Size(max = 2147483647)
    @Column(name = "company_details")
    private String companyDetails;

    @Size(max = 2147483647)
    @Column(name = "inspiration")
    private String inspiration;

    @Size(max = 2147483647)
    @Column(name = "status")
    private String status;

    @Size(max = 2147483647)
    @Column(name = "vision")
    private String vision;

    @Size(max = 2147483647)
    @Column(name = "new_orleans")
    private String newOrleans;

    @Size(max = 2147483647)
    @Column(name = "program_plan")
    private String programPlan;

    @Size(max = 2147483647)
    @Column(name = "weekly_reports")
    private String weeklyReports;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "founder_expertise", catalog = "mentormarketplace", joinColumns = {
        @JoinColumn(name = "founder_id", nullable = false)},
      inverseJoinColumns = {
          @JoinColumn(name = "expertise_id", nullable = false)})
    private Collection<Expertise> expertiseCollection;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "founder_industry", catalog = "mentormarketplace", joinColumns = {
        @JoinColumn(name = "founder_id", nullable = false)},
      inverseJoinColumns = {
          @JoinColumn(name = "industry_id", nullable = false)})
    private Collection<Industry> industryCollection;

    @OneToOne(optional = false)
    @JoinColumn(name = "mmuser", referencedColumnName = "id")
    private Mmuser mmuser;

    public Founder() {
    }

    public Founder(Long id) {
        this.id = id;
    }

    public Founder(String firstName, String lastName, String linkedInPictureUrl, String linkedInCurrentCompany, String linkedInCurrentJobTitle, String website, String facebook, String twitter, String otherSocialMedia, String logo, String tagline, String linkedInId, String background, String elevatorPitch, String immediateNeeds, String companyDetails, String inspiration, String status, String vision, String newOrleans, String programPlan, String weeklyReports) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.linkedInPictureUrl = linkedInPictureUrl;
        this.linkedInCurrentCompany = linkedInCurrentCompany;
        this.linkedInCurrentJobTitle = linkedInCurrentJobTitle;
        this.website = website;
        this.facebook = facebook;
        this.twitter = twitter;
        this.otherSocialMedia = otherSocialMedia;
        this.logo = logo;
        this.tagline = tagline;
        this.linkedInId = linkedInId;
        this.background = background;
        this.elevatorPitch = elevatorPitch;
        this.immediateNeeds = immediateNeeds;
        this.companyDetails = companyDetails;
        this.inspiration = inspiration;
        this.status = status;
        this.vision = vision;
        this.newOrleans = newOrleans;
        this.programPlan = programPlan;
        this.weeklyReports = weeklyReports;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public String getLinkedInPictureUrl() {
        return linkedInPictureUrl;
    }

    public void setLinkedInPictureUrl(String linkedInPictureUrl) {
        this.linkedInPictureUrl = linkedInPictureUrl;
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

    public String getLinkedInId() {
        return linkedInId;
    }

    public void setLinkedInId(String linkedInId) {
        this.linkedInId = linkedInId;
    }

    public String getBackground() {
        return background;
    }

    public void setBackground(String background) {
        this.background = background;
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

    public Mmuser getMmuser() {
        return mmuser;
    }

    public void setMmuser(Mmuser mmuser) {
        this.mmuser = mmuser;
    }

    // New Getters and Setters for Industry and Expertise
    public Collection<Expertise> getExpertiseCollection() {
        return expertiseCollection;
    }

    public void setExpertiseCollection(Collection<Expertise> expertiseCollection) {
        this.expertiseCollection = expertiseCollection;
    }

    public Collection<Industry> getIndustryCollection() {
        return industryCollection;
    }

    public void setIndustryCollection(Collection<Industry> industryCollection) {
        this.industryCollection = industryCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Founder)) {
            return false;
        }
        Founder other = (Founder) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.ideavillage.mentormarketplace.persistence.domain.Founder[ id=" + id + " ]";
    }

}
