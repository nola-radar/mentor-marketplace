/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author 212395189
 */
@Entity
@Table(name = "mmuser")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "MMUser.findAll", query = "SELECT m FROM MMUser m")})
public class MMUser implements Serializable {
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "mmuser", fetch = FetchType.EAGER)
    private Collection<Mentor> mentorCollection;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "email")
    private String email;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "linkedinid")
    private String linkedInId;

    public MMUser() {
    }

    public MMUser(Long id) {
        this.id = id;
    }

    public MMUser(String email, String linkedinid) {
        this.email = email;
        this.linkedInId = linkedinid;
    }


    public MMUser(Long id, String email, String linkedinid) {
        this.id = id;
        this.email = email;
        this.linkedInId = linkedinid;
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLinkedInId() {
        return linkedInId;
    }

    public void setLinkedInId(String linkedinid) {
        this.linkedInId = linkedinid;
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
        if (!(object instanceof MMUser)) {
            return false;
        }
        MMUser other = (MMUser) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.ideavillage.mentormarketplace.persistence.domain.MMUser[ id=" + id + " ]";
    }

    @XmlTransient
    public Collection<Mentor> getMentorCollection() {
        return mentorCollection;
    }

    public void setMentorCollection(Collection<Mentor> mentorCollection) {
        this.mentorCollection = mentorCollection;
    }

}
