//package org.ideavillage.mentormarketplace.persistence.domain;
//
//import java.io.Serializable;
//import javax.persistence.Basic;
//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.ManyToOne;
//import javax.persistence.Table;
//import javax.xml.bind.annotation.XmlRootElement;
//
///**
// *
// * @author jlbates
// */
//@Entity
//@Table(name = "founder_industry")
//@XmlRootElement
//public class FounderIndustry implements Serializable {
//
//    private static final long serialVersionUID = 1L;
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Basic(optional = false)
//    @Column(name = "id")
//    private Long id;
//
//    @JoinColumn(name = "industry_id", referencedColumnName = "id")
//    @ManyToOne
//    private Industry industryId;
//
//    @JoinColumn(name = "founder_id", referencedColumnName = "id")
//    @ManyToOne
//    private Founder founderId;
//
//    public FounderIndustry() {
//    }
//
//    public FounderIndustry(Long id) {
//        this.id = id;
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public Industry getIndustryId() {
//        return industryId;
//    }
//
//    public void setIndustryId(Industry industryId) {
//        this.industryId = industryId;
//    }
//
//    public Founder getFounderId() {
//        return founderId;
//    }
//
//    public void setFounderId(Founder founderId) {
//        this.founderId = founderId;
//    }
//
//    @Override
//    public int hashCode() {
//        int hash = 0;
//        hash += (id != null ? id.hashCode() : 0);
//        return hash;
//    }
//
//    @Override
//    public boolean equals(Object object) {
//        // TODO: Warning - this method won't work in the case the id fields are not set
//        if (!(object instanceof FounderIndustry)) {
//            return false;
//        }
//        FounderIndustry other = (FounderIndustry) object;
//        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
//            return false;
//        }
//        return true;
//    }
//
//    @Override
//    public String toString() {
//        return "org.ideavillage.mentormarketplace.persistence.domain.FounderIndustry[ id=" + id + " ]";
//    }
//
//}
