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
@Table(name = "industry")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Industry.findAll", query = "SELECT i FROM Industry i"),
    @NamedQuery(name = "Industry.findById", query = "SELECT i FROM Industry i WHERE i.id = :id"),
    @NamedQuery(name = "Industry.findByIndustry", query = "SELECT i FROM Industry i WHERE i.industry = :industry")})
public class Industry implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 255)
    @Column(name = "industry")
    private String industry;
    @OneToMany(mappedBy = "industryId")
    private Collection<MentorIndustry> mentorIndustryCollection;
    @OneToMany(mappedBy = "industryId")
    private Collection<FounderIndustry> founderIndustryCollection;

    public Industry() {
    }

    public Industry(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    @XmlTransient
    public Collection<MentorIndustry> getMentorIndustryCollection() {
        return mentorIndustryCollection;
    }

    public void setMentorIndustryCollection(Collection<MentorIndustry> mentorIndustryCollection) {
        this.mentorIndustryCollection = mentorIndustryCollection;
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
        if (!(object instanceof Industry)) {
            return false;
        }
        Industry other = (Industry) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.ideavillage.mentormarketplace.persistence.domain.Industry[ id=" + id + " ]";
    }
    
}
