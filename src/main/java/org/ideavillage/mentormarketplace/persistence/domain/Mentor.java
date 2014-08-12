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
@Table(name = "mentor")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Mentor.findAll", query = "SELECT m FROM Mentor m"),
    @NamedQuery(name = "Mentor.findById", query = "SELECT m FROM Mentor m WHERE m.id = :id"),
    @NamedQuery(name = "Mentor.findByLinkedInId", query = "SELECT m FROM Mentor m WHERE m.linkedInId = :linkedInId"),
    @NamedQuery(name = "Mentor.findByFirstName", query = "SELECT m FROM Mentor m WHERE m.firstName = :firstName"),
    @NamedQuery(name = "Mentor.findByLastName", query = "SELECT m FROM Mentor m WHERE m.lastName = :lastName"),
    @NamedQuery(name = "Mentor.findByIndustry", query = "SELECT m FROM Mentor m WHERE m.industry = :industry"),
    @NamedQuery(name = "Mentor.findByBackground", query = "SELECT m FROM Mentor m WHERE m.background = :background"),
    @NamedQuery(name = "Mentor.findByLinkedInPictureUrl", query = "SELECT m FROM Mentor m WHERE m.linkedInPictureUrl = :linkedInPictureUrl"),
    @NamedQuery(name = "Mentor.findByLinkedInCurrentCompany", query = "SELECT m FROM Mentor m WHERE m.linkedInCurrentCompany = :linkedInCurrentCompany"),
    @NamedQuery(name = "Mentor.findByLinkedInCurrentJobTitle", query = "SELECT m FROM Mentor m WHERE m.linkedInCurrentJobTitle = :linkedInCurrentJobTitle"),
    @NamedQuery(name = "Mentor.findByWebsite", query = "SELECT m FROM Mentor m WHERE m.website = :website"),
    @NamedQuery(name = "Mentor.findByFacebook", query = "SELECT m FROM Mentor m WHERE m.facebook = :facebook"),
    @NamedQuery(name = "Mentor.findByTwitter", query = "SELECT m FROM Mentor m WHERE m.twitter = :twitter"),
    @NamedQuery(name = "Mentor.findByOtherSocialMedia", query = "SELECT m FROM Mentor m WHERE m.otherSocialMedia = :otherSocialMedia")})
public class Mentor implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 255)
    @Column(name = "linked_in_id")
    private String linkedInId;
    @Size(max = 255)
    @Column(name = "first_name")
    private String firstName;
    @Size(max = 255)
    @Column(name = "last_name")
    private String lastName;
    @Size(max = 255)
    @Column(name = "industry")
    private String industry;
    @Size(max = 2147483647)
    @Column(name = "background")
    private String background;
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
    @JoinColumn(name = "mmuser", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Mmuser mmuser;
    @OneToMany(mappedBy = "mentorId")
    private Collection<MentorExpertise> mentorExpertiseCollection;
    @OneToMany(mappedBy = "mentorId")
    private Collection<MentorIndustry> mentorIndustryCollection;

    public Mentor() {
    }

    public Mentor(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    public String getBackground() {
        return background;
    }

    public void setBackground(String background) {
        this.background = background;
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

    public Mmuser getMmuser() {
        return mmuser;
    }

    public void setMmuser(Mmuser mmuser) {
        this.mmuser = mmuser;
    }

    @XmlTransient
    public Collection<MentorExpertise> getMentorExpertiseCollection() {
        return mentorExpertiseCollection;
    }

    public void setMentorExpertiseCollection(Collection<MentorExpertise> mentorExpertiseCollection) {
        this.mentorExpertiseCollection = mentorExpertiseCollection;
    }

    @XmlTransient
    public Collection<MentorIndustry> getMentorIndustryCollection() {
        return mentorIndustryCollection;
    }

    public void setMentorIndustryCollection(Collection<MentorIndustry> mentorIndustryCollection) {
        this.mentorIndustryCollection = mentorIndustryCollection;
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
        if (!(object instanceof Mentor)) {
            return false;
        }
        Mentor other = (Mentor) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.ideavillage.mentormarketplace.persistence.domain.Mentor[ id=" + id + " ]";
    }
    
}
