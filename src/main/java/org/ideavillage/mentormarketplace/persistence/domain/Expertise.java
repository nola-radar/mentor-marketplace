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
@Table(name = "expertise")
@XmlRootElement
public class Expertise implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;

    @Size(max = 255)
    @Column(name = "expertise")
    private String expertise;

    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "expertiseCollection")
    private Collection<Mentor> mentorExpertiseCollection;

    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "expertiseCollection")
    private Collection<Founder> founderExpertiseCollection;

    public Expertise() {
    }

    public Expertise(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getExpertise() {
        return expertise;
    }

    public void setExpertise(String expertise) {
        this.expertise = expertise;
    }

    // New Getters and Setters for Mentor Expertise
    @XmlTransient
    public Collection<Mentor> getMentorExpertiseCollection() {
        return mentorExpertiseCollection;
    }

    public void setMentorExpertiseCollection(Collection<Mentor> mentorExpertiseCollection) {
        this.mentorExpertiseCollection = mentorExpertiseCollection;
    }

    // New Getters and Setters for Founder Expertise
    @XmlTransient
    public Collection<Founder> getFounderExpertiseCollection() {
        return founderExpertiseCollection;
    }

    public void setFounderExpertiseCollection(Collection<Founder> founderExpertiseCollection) {
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
