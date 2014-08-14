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
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author jlbates
 */
@Entity
@Table(name = "mentor_industry")
@XmlRootElement
public class MentorIndustry implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;

    @JoinColumn(name = "mentor_id", referencedColumnName = "id")
    @ManyToOne
    private Mentor mentorId;

    @JoinColumn(name = "industry_id", referencedColumnName = "id")
    @ManyToOne
    private Industry industryId;

    public MentorIndustry() {
    }

    public MentorIndustry(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Mentor getMentorId() {
        return mentorId;
    }

    public void setMentorId(Mentor mentorId) {
        this.mentorId = mentorId;
    }

    public Industry getIndustryId() {
        return industryId;
    }

    public void setIndustryId(Industry industryId) {
        this.industryId = industryId;
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
        if (!(object instanceof MentorIndustry)) {
            return false;
        }
        MentorIndustry other = (MentorIndustry) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.ideavillage.mentormarketplace.persistence.domain.MentorIndustry[ id=" + id + " ]";
    }

}
