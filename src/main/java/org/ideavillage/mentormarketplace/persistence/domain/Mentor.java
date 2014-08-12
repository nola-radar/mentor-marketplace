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
    @NamedQuery(name = "Mentor.findByLinkedinid", query = "SELECT m FROM Mentor m WHERE m.linkedinid = :linkedinid"),
    @NamedQuery(name = "Mentor.findByFirstname", query = "SELECT m FROM Mentor m WHERE m.firstname = :firstname"),
    @NamedQuery(name = "Mentor.findByLastname", query = "SELECT m FROM Mentor m WHERE m.lastname = :lastname"),
    @NamedQuery(name = "Mentor.findByIndustry", query = "SELECT m FROM Mentor m WHERE m.industry = :industry"),
    @NamedQuery(name = "Mentor.findByBackground", query = "SELECT m FROM Mentor m WHERE m.background = :background"),
    @NamedQuery(name = "Mentor.findByLinkedinpictureurl", query = "SELECT m FROM Mentor m WHERE m.linkedinpictureurl = :linkedinpictureurl"),
    @NamedQuery(name = "Mentor.findByLinkedincurrentcompany", query = "SELECT m FROM Mentor m WHERE m.linkedincurrentcompany = :linkedincurrentcompany"),
    @NamedQuery(name = "Mentor.findByLinkedincurrentjobtitle", query = "SELECT m FROM Mentor m WHERE m.linkedincurrentjobtitle = :linkedincurrentjobtitle"),
    @NamedQuery(name = "Mentor.findByWebsite", query = "SELECT m FROM Mentor m WHERE m.website = :website"),
    @NamedQuery(name = "Mentor.findByFacebook", query = "SELECT m FROM Mentor m WHERE m.facebook = :facebook"),
    @NamedQuery(name = "Mentor.findByTwitter", query = "SELECT m FROM Mentor m WHERE m.twitter = :twitter"),
    @NamedQuery(name = "Mentor.findByOthersocialmedia", query = "SELECT m FROM Mentor m WHERE m.othersocialmedia = :othersocialmedia")})
public class Mentor implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 255)
    @Column(name = "linkedinid")
    private String linkedinid;
    @Size(max = 255)
    @Column(name = "firstname")
    private String firstname;
    @Size(max = 255)
    @Column(name = "lastname")
    private String lastname;
    @Size(max = 255)
    @Column(name = "industry")
    private String industry;
    @Size(max = 2147483647)
    @Column(name = "background")
    private String background;
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

    public String getLinkedinid() {
        return linkedinid;
    }

    public void setLinkedinid(String linkedinid) {
        this.linkedinid = linkedinid;
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
