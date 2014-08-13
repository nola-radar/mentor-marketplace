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
@Table(name = "expertise")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Expertise.findAll", query = "SELECT e FROM Expertise e"),
    @NamedQuery(name = "Expertise.findById", query = "SELECT e FROM Expertise e WHERE e.id = :id"),
    @NamedQuery(name = "Expertise.findByExpertise", query = "SELECT e FROM Expertise e WHERE e.expertise = :expertise")})
public class Expertise implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    
    @Size(max = 255)
    @Column(name = "expertise")
    private String expertise;
    
    @OneToMany(mappedBy = "expertiseId")
    private Collection<MentorExpertise> mentorExpertiseCollection;
    
    @OneToMany(mappedBy = "expertiseId")
    private Collection<FounderExpertise> founderExpertiseCollection;

    public Expertise() {
    }

    public Expertise(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getExpertise() {
        return expertise;
    }

    public void setExpertise(String expertise) {
        this.expertise = expertise;
    }

    @XmlTransient
    public Collection<MentorExpertise> getMentorExpertiseCollection() {
        return mentorExpertiseCollection;
    }

    public void setMentorExpertiseCollection(Collection<MentorExpertise> mentorExpertiseCollection) {
        this.mentorExpertiseCollection = mentorExpertiseCollection;
    }

    @XmlTransient
    public Collection<FounderExpertise> getFounderExpertiseCollection() {
        return founderExpertiseCollection;
    }

    public void setFounderExpertiseCollection(Collection<FounderExpertise> founderExpertiseCollection) {
        this.founderExpertiseCollection = founderExpertiseCollection;
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
        if (!(object instanceof Expertise)) {
            return false;
        }
        Expertise other = (Expertise) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.ideavillage.mentormarketplace.persistence.domain.Expertise[ id=" + id + " ]";
    }
    
}
