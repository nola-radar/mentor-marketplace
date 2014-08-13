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
 * @author jlbates
 */
@Entity
@Table(name = "mmuser")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Mmuser.findAll", query = "SELECT m FROM Mmuser m"),
    @NamedQuery(name = "Mmuser.findById", query = "SELECT m FROM Mmuser m WHERE m.id = :id"),
    @NamedQuery(name = "Mmuser.findByEmail", query = "SELECT m FROM Mmuser m WHERE m.email = :email"),
    @NamedQuery(name = "Mmuser.findByUserType", query = "SELECT m FROM Mmuser m WHERE m.userType = :userType"),
    @NamedQuery(name = "Mmuser.findByLinkedInId", query = "SELECT m FROM Mmuser m WHERE m.linkedInId = :linkedInId"),
    @NamedQuery(name = "Mmuser.findByIsAdmin", query = "SELECT m FROM Mmuser m WHERE m.isAdmin = :isAdmin")})
public class Mmuser implements Serializable {

    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "email")
    private String email;
    
    @Size(max = 255)
    @Column(name = "user_type")
    private String userType;
    
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "linked_in_id")
    private String linkedInId;
    
    @Basic(optional = false)
    @NotNull
    @Column(name = "is_admin")
    private boolean isAdmin;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "mmuser")
    private Collection<Mentor> mentorCollection;
    
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "mmuser")
    private Collection<Founder> founderCollection;

    public Mmuser() {
    }

    public Mmuser(Integer id) {
        this.id = id;
    }

    public Mmuser(Integer id, String email, String linkedInId, boolean isAdmin) {
        this.id = id;
        this.email = email;
        this.linkedInId = linkedInId;
        this.isAdmin = isAdmin;
    }

    public Mmuser(String email, String linkedInId, boolean isAdmin) {
        this.email = email;
        this.linkedInId = linkedInId;
        this.isAdmin = isAdmin;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public boolean getIsAdmin() {
        return isAdmin;
    }

    public void setIsAdmin(boolean isAdmin) {
        this.isAdmin = isAdmin;
    }

    @XmlTransient
    public Collection<Mentor> getMentorCollection() {
        return mentorCollection;
    }

    public void setMentorCollection(Collection<Mentor> mentorCollection) {
        this.mentorCollection = mentorCollection;
    }

    @XmlTransient
    public Collection<Founder> getFounderCollection() {
        return founderCollection;
    }

    public void setFounderCollection(Collection<Founder> founderCollection) {
        this.founderCollection = founderCollection;
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
        if (!(object instanceof Mmuser)) {
            return false;
        }
        Mmuser other = (Mmuser) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.ideavillage.mentormarketplace.persistence.domain.Mmuser[ id=" + id + " ]";
    }

}
