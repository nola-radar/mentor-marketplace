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
//@Table(name = "mentor_expertise")
//@XmlRootElement
//public class MentorExpertise implements Serializable {
//
//    private static final long serialVersionUID = 1L;
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Basic(optional = false)
//    @Column(name = "id")
//    private Long id;
//
//    @JoinColumn(name = "mentor_id", referencedColumnName = "id")
//    @ManyToOne
//    private Mentor mentorId;
//
//    @JoinColumn(name = "expertise_id", referencedColumnName = "id")
//    @ManyToOne
//    private Expertise expertiseId;
//
//    public MentorExpertise() {
//    }
//
//    public MentorExpertise(Long id) {
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
//    public Mentor getMentorId() {
//        return mentorId;
//    }
//
//    public void setMentorId(Mentor mentorId) {
//        this.mentorId = mentorId;
//    }
//
//    public Expertise getExpertiseId() {
//        return expertiseId;
//    }
//
//    public void setExpertiseId(Expertise expertiseId) {
//        this.expertiseId = expertiseId;
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
//        if (!(object instanceof MentorExpertise)) {
//            return false;
//        }
//        MentorExpertise other = (MentorExpertise) object;
//        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
//            return false;
//        }
//        return true;
//    }
//
//    @Override
//    public String toString() {
//        return "org.ideavillage.mentormarketplace.persistence.domain.MentorExpertise[ id=" + id + " ]";
//    }
//
//}
