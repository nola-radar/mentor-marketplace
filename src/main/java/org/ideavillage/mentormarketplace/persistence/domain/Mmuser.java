package org.ideavillage.mentormarketplace.persistence.domain;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
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
public class Mmuser implements Serializable {

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

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "mmuser")
    private Mentor mentor;

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "mmuser", fetch = FetchType.EAGER)
    private Founder founder;

    public Mmuser() {
    }

    public Mmuser(Long id) {
        this.id = id;
    }

    public Mmuser(Long id, String email, String linkedInId, boolean isAdmin) {
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
    public Mentor getMentor() {
        return mentor;
    }

    public void setMentor(Mentor mentor) {
        this.mentor = mentor;
    }

    @XmlTransient
    public Founder getFounder() {
        return founder;
    }

    public void setFounder(Founder founder) {
        this.founder = founder;
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
