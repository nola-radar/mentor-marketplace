package org.ideavillage.mentormarketplace.persistence.domain;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
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
public class Industry implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;

    @Size(max = 255)
    @Column(name = "industry")
    private String industry;

    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "industryCollection")
    private Collection<Mentor> mentorIndustryCollection;

    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "industryCollection")
    private Collection<Founder> founderIndustryCollection;

    public Industry() {
    }

    public Industry(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

     // New Getters and Setters for Mentor Industry
    @XmlTransient
    public Collection<Mentor> getMentorIndustryCollection() {
        return mentorIndustryCollection;
    }

    public void setMentorIndustryCollection(Collection<Mentor> mentorIndustryCollection) {
        this.mentorIndustryCollection = mentorIndustryCollection;
    }

    // New Getters and Setters for Founder Industry
    @XmlTransient
    public Collection<Founder> getFounderIndustryCollection() {
        return founderIndustryCollection;
    }

    public void setFounderIndustryCollection(Collection<Founder> founderIndustryCollection) {
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
