/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.ideavillage.mentormarketplace.persistence.domain;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author jlbates
 */
@Entity
@Table(name = "founder")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Founder.findAll", query = "SELECT f FROM Founder f"),
    @NamedQuery(name = "Founder.findById", query = "SELECT f FROM Founder f WHERE f.id = :id"),
    @NamedQuery(name = "Founder.findByFirstname", query = "SELECT f FROM Founder f WHERE f.firstname = :firstname"),
    @NamedQuery(name = "Founder.findByLastname", query = "SELECT f FROM Founder f WHERE f.lastname = :lastname"),
    @NamedQuery(name = "Founder.findByLinkedinpictureurl", query = "SELECT f FROM Founder f WHERE f.linkedinpictureurl = :linkedinpictureurl"),
    @NamedQuery(name = "Founder.findByLinkedincurrentcompany", query = "SELECT f FROM Founder f WHERE f.linkedincurrentcompany = :linkedincurrentcompany"),
    @NamedQuery(name = "Founder.findByLinkedincurrentjobtitle", query = "SELECT f FROM Founder f WHERE f.linkedincurrentjobtitle = :linkedincurrentjobtitle"),
    @NamedQuery(name = "Founder.findByWebsite", query = "SELECT f FROM Founder f WHERE f.website = :website"),
    @NamedQuery(name = "Founder.findByFacebook", query = "SELECT f FROM Founder f WHERE f.facebook = :facebook"),
    @NamedQuery(name = "Founder.findByTwitter", query = "SELECT f FROM Founder f WHERE f.twitter = :twitter"),
    @NamedQuery(name = "Founder.findByOthersocialmedia", query = "SELECT f FROM Founder f WHERE f.othersocialmedia = :othersocialmedia"),
    @NamedQuery(name = "Founder.findByLogo", query = "SELECT f FROM Founder f WHERE f.logo = :logo"),
    @NamedQuery(name = "Founder.findByTagline", query = "SELECT f FROM Founder f WHERE f.tagline = :tagline"),
    @NamedQuery(name = "Founder.findByLinkedinid", query = "SELECT f FROM Founder f WHERE f.linkedinid = :linkedinid"),
    @NamedQuery(name = "Founder.findByBackground", query = "SELECT f FROM Founder f WHERE f.background = :background"),
    @NamedQuery(name = "Founder.findByElevatorpitch", query = "SELECT f FROM Founder f WHERE f.elevatorpitch = :elevatorpitch"),
    @NamedQuery(name = "Founder.findByImmediateneeds", query = "SELECT f FROM Founder f WHERE f.immediateneeds = :immediateneeds"),
    @NamedQuery(name = "Founder.findByCompanydetails", query = "SELECT f FROM Founder f WHERE f.companydetails = :companydetails"),
    @NamedQuery(name = "Founder.findByInspiration", query = "SELECT f FROM Founder f WHERE f.inspiration = :inspiration"),
    @NamedQuery(name = "Founder.findByStatus", query = "SELECT f FROM Founder f WHERE f.status = :status"),
    @NamedQuery(name = "Founder.findByVision", query = "SELECT f FROM Founder f WHERE f.vision = :vision"),
    @NamedQuery(name = "Founder.findByNeworleans", query = "SELECT f FROM Founder f WHERE f.neworleans = :neworleans"),
    @NamedQuery(name = "Founder.findByProgramplan", query = "SELECT f FROM Founder f WHERE f.programplan = :programplan"),
    @NamedQuery(name = "Founder.findByWeeklyreports", query = "SELECT f FROM Founder f WHERE f.weeklyreports = :weeklyreports")})
public class Founder implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 255)
    @Column(name = "firstname")
    private String firstname;
    @Size(max = 255)
    @Column(name = "lastname")
    private String lastname;
    @Size(max = 255)
    @Column(name = "linkedinpictureurl")
    private String linkedinpictureurl;
    @Size(max = 255)
    @Column(name = "linkedincurrentcompany")
    private String linkedincurrentcompany;
    @Size(max = 255)
    @Column(name = "linkedincurrentjobtitle")
    private String linkedincurrentjobtitle;
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
    @Column(name = "othersocialmedia")
    private String othersocialmedia;
    @Size(max = 255)
    @Column(name = "logo")
    private String logo;
    @Size(max = 255)
    @Column(name = "tagline")
    private String tagline;
    @Size(max = 255)
    @Column(name = "linkedinid")
    private String linkedinid;
    @Size(max = 2147483647)
    @Column(name = "background")
    private String background;
    @Size(max = 2147483647)
    @Column(name = "elevatorpitch")
    private String elevatorpitch;
    @Size(max = 2147483647)
    @Column(name = "immediateneeds")
    private String immediateneeds;
    @Size(max = 2147483647)
    @Column(name = "companydetails")
    private String companydetails;
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
    @Column(name = "neworleans")
    private String neworleans;
    @Size(max = 2147483647)
    @Column(name = "programplan")
    private String programplan;
    @Size(max = 2147483647)
    @Column(name = "weeklyreports")
    private String weeklyreports;
    @OneToMany(mappedBy = "founderId")
    private Collection<FounderExpertise> founderExpertiseCollection;
    @JoinColumn(name = "mmuser", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Mmuser mmuser;
    @OneToMany(mappedBy = "founderId")
    private Collection<FounderIndustry> founderIndustryCollection;

    public Founder() {
    }

    public Founder(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getLinkedinpictureurl() {
        return linkedinpictureurl;
    }

    public void setLinkedinpictureurl(String linkedinpictureurl) {
        this.linkedinpictureurl = linkedinpictureurl;
    }

    public String getLinkedincurrentcompany() {
        return linkedincurrentcompany;
    }

    public void setLinkedincurrentcompany(String linkedincurrentcompany) {
        this.linkedincurrentcompany = linkedincurrentcompany;
    }

    public String getLinkedincurrentjobtitle() {
        return linkedincurrentjobtitle;
    }

    public void setLinkedincurrentjobtitle(String linkedincurrentjobtitle) {
        this.linkedincurrentjobtitle = linkedincurrentjobtitle;
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

    public String getOthersocialmedia() {
        return othersocialmedia;
    }

    public void setOthersocialmedia(String othersocialmedia) {
        this.othersocialmedia = othersocialmedia;
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

    public String getLinkedinid() {
        return linkedinid;
    }

    public void setLinkedinid(String linkedinid) {
        this.linkedinid = linkedinid;
    }

    public String getBackground() {
        return background;
    }

    public void setBackground(String background) {
        this.background = background;
    }

    public String getElevatorpitch() {
        return elevatorpitch;
    }

    public void setElevatorpitch(String elevatorpitch) {
        this.elevatorpitch = elevatorpitch;
    }

    public String getImmediateneeds() {
        return immediateneeds;
    }

    public void setImmediateneeds(String immediateneeds) {
        this.immediateneeds = immediateneeds;
    }

    public String getCompanydetails() {
        return companydetails;
    }

    public void setCompanydetails(String companydetails) {
        this.companydetails = companydetails;
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

    public String getNeworleans() {
        return neworleans;
    }

    public void setNeworleans(String neworleans) {
        this.neworleans = neworleans;
    }

    public String getProgramplan() {
        return programplan;
    }

    public void setProgramplan(String programplan) {
        this.programplan = programplan;
    }

    public String getWeeklyreports() {
        return weeklyreports;
    }

    public void setWeeklyreports(String weeklyreports) {
        this.weeklyreports = weeklyreports;
    }

    @XmlTransient
    public Collection<FounderExpertise> getFounderExpertiseCollection() {
        return founderExpertiseCollection;
    }

    public void setFounderExpertiseCollection(Collection<FounderExpertise> founderExpertiseCollection) {
        this.founderExpertiseCollection = founderExpertiseCollection;
    }

    public Mmuser getMmuser() {
        return mmuser;
    }

    public void setMmuser(Mmuser mmuser) {
        this.mmuser = mmuser;
    }

    @XmlTransient
    public Collection<FounderIndustry> getFounderIndustryCollection() {
        return founderIndustryCollection;
    }

    public void setFounderIndustryCollection(Collection<FounderIndustry> founderIndustryCollection) {
        this.founderIndustryCollection = founderIndustryCollection;
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
