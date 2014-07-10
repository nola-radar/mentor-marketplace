/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.ideavillage.mentormarketplace.persistence.domain;

import java.io.Serializable;
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
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author 212412062
 */
@Entity
@Table(name = "mentor")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Mentor.findAll", query = "SELECT m FROM Mentor m"),
    @NamedQuery(name = "Mentor.findByKeyColumn", query = "SELECT m FROM Mentor m WHERE m.keyColumn = :keyColumn"),
    @NamedQuery(name = "Mentor.findByFirstName", query = "SELECT m FROM Mentor m WHERE m.firstName = :firstName"),
    @NamedQuery(name = "Mentor.findByLastName", query = "SELECT m FROM Mentor m WHERE m.lastName = :lastName"),
    @NamedQuery(name = "Mentor.findByWebsite", query = "SELECT m FROM Mentor m WHERE m.website = :website"),
    @NamedQuery(name = "Mentor.findByFacebookPage", query = "SELECT m FROM Mentor m WHERE m.facebookPage = :facebookPage"),
    @NamedQuery(name = "Mentor.findByOtherSocialMedia", query = "SELECT m FROM Mentor m WHERE m.otherSocialMedia = :otherSocialMedia"),
    @NamedQuery(name = "Mentor.findByLinkedInPicURL", query = "SELECT m FROM Mentor m WHERE m.linkedInPicURL = :linkedInPicURL"),
    @NamedQuery(name = "Mentor.findByLinkedInCurrentJobTitle", query = "SELECT m FROM Mentor m WHERE m.linkedInCurrentJobTitle = :linkedInCurrentJobTitle"),
    @NamedQuery(name = "Mentor.findByLinkedICurrentCompany", query = "SELECT m FROM Mentor m WHERE m.linkedICurrentCompany = :linkedICurrentCompany"),
    @NamedQuery(name = "Mentor.findByLinkedInBackground", query = "SELECT m FROM Mentor m WHERE m.linkedInBackground = :linkedInBackground"),
    @NamedQuery(name = "Mentor.findByTwitterHandle", query = "SELECT m FROM Mentor m WHERE m.twitterHandle = :twitterHandle")})
public class Mentor implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "key_column")
    private Long keyColumn;
    @Size(max = 255)
    @Column(name = "firstName")
    private String firstName;
    @Size(max = 255)
    @Column(name = "lastName")
    private String lastName;
    @Size(max = 255)
    @Column(name = "website")
    private String website;
    @Size(max = 255)
    @Column(name = "facebookPage")
    private String facebookPage;
    @Size(max = 255)
    @Column(name = "otherSocialMedia")
    private String otherSocialMedia;
    @Size(max = 255)
    @Column(name = "LinkedInPicURL")
    private String linkedInPicURL;
    @Size(max = 255)
    @Column(name = "LinkedInCurrentJobTitle")
    private String linkedInCurrentJobTitle;
    @Size(max = 255)
    @Column(name = "LinkedICurrentCompany")
    private String linkedICurrentCompany;
    @Size(max = 2147483647)
    @Column(name = "LinkedInBackground")
    private String linkedInBackground;
    @Size(max = 255)
    @Column(name = "twitterHandle")
    private String twitterHandle;
    @JoinColumn(name = "AreaOfExpertise", referencedColumnName = "key_column")
    @ManyToOne
    private Expertise areaOfExpertise;
    @JoinColumn(name = "Industry", referencedColumnName = "key_column")
    @ManyToOne
    private Industry industry;

    public Mentor() {
    }

    public Mentor(Long keyColumn) {
        this.keyColumn = keyColumn;
    }

    public Long getKeyColumn() {
        return keyColumn;
    }

    public void setKeyColumn(Long keyColumn) {
        this.keyColumn = keyColumn;
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

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getFacebookPage() {
        return facebookPage;
    }

    public void setFacebookPage(String facebookPage) {
        this.facebookPage = facebookPage;
    }

    public String getOtherSocialMedia() {
        return otherSocialMedia;
    }

    public void setOtherSocialMedia(String otherSocialMedia) {
        this.otherSocialMedia = otherSocialMedia;
    }

    public String getLinkedInPicURL() {
        return linkedInPicURL;
    }

    public void setLinkedInPicURL(String linkedInPicURL) {
        this.linkedInPicURL = linkedInPicURL;
    }

    public String getLinkedInCurrentJobTitle() {
        return linkedInCurrentJobTitle;
    }

    public void setLinkedInCurrentJobTitle(String linkedInCurrentJobTitle) {
        this.linkedInCurrentJobTitle = linkedInCurrentJobTitle;
    }

    public String getLinkedICurrentCompany() {
        return linkedICurrentCompany;
    }

    public void setLinkedICurrentCompany(String linkedICurrentCompany) {
        this.linkedICurrentCompany = linkedICurrentCompany;
    }

    public String getLinkedInBackground() {
        return linkedInBackground;
    }

    public void setLinkedInBackground(String linkedInBackground) {
        this.linkedInBackground = linkedInBackground;
    }

    public String getTwitterHandle() {
        return twitterHandle;
    }

    public void setTwitterHandle(String twitterHandle) {
        this.twitterHandle = twitterHandle;
    }

    public Expertise getAreaOfExpertise() {
        return areaOfExpertise;
    }

    public void setAreaOfExpertise(Expertise areaOfExpertise) {
        this.areaOfExpertise = areaOfExpertise;
    }

    public Industry getIndustry() {
        return industry;
    }

    public void setIndustry(Industry industry) {
        this.industry = industry;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (keyColumn != null ? keyColumn.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Mentor)) {
            return false;
        }
        Mentor other = (Mentor) object;
        if ((this.keyColumn == null && other.keyColumn != null) || (this.keyColumn != null && !this.keyColumn.equals(other.keyColumn))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.ideavillage.mentormarketplace.persistence.domain.Mentor[ keyColumn=" + keyColumn + " ]";
    }
    
}
