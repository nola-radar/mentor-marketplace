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
 * @author 212412062
 */
@Entity
@Table(name = "industry")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Industry.findAll", query = "SELECT i FROM Industry i"),
    @NamedQuery(name = "Industry.findByKeyColumn", query = "SELECT i FROM Industry i WHERE i.keyColumn = :keyColumn"),
    @NamedQuery(name = "Industry.findByIndustry", query = "SELECT i FROM Industry i WHERE i.industry = :industry")})
public class Industry implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "key_column")
    private Long keyColumn;
    @Size(max = 255)
    @Column(name = "industry")
    private String industry;
    @OneToMany(mappedBy = "industry")
    private Collection<Mentor> mentorCollection;

    public Industry() {
    }

    public Industry(Long keyColumn) {
        this.keyColumn = keyColumn;
    }

    public Long getKeyColumn() {
        return keyColumn;
    }

    public void setKeyColumn(Long keyColumn) {
        this.keyColumn = keyColumn;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
    }

    @XmlTransient
    public Collection<Mentor> getMentorCollection() {
        return mentorCollection;
    }

    public void setMentorCollection(Collection<Mentor> mentorCollection) {
        this.mentorCollection = mentorCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (keyColumn != null ? keyColumn.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Industry)) {
            return false;
        }
        Industry other = (Industry) object;
        if ((this.keyColumn == null && other.keyColumn != null) || (this.keyColumn != null && !this.keyColumn.equals(other.keyColumn))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.ideavillage.mentormarketplace.persistence.domain.Industry[ keyColumn=" + keyColumn + " ]";
    }
    
}
