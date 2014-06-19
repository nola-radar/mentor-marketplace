/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.ideavillage.mentormarketplace.persistence.domain;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author 212395189
 */
@Entity
@Table(name = "entrepreneur")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Entrepreneur2.findAll", query = "SELECT e FROM Entrepreneur2 e"),
    @NamedQuery(name = "Entrepreneur2.findById", query = "SELECT e FROM Entrepreneur2 e WHERE e.id = :id"),
    @NamedQuery(name = "Entrepreneur2.findByLinkedinid", query = "SELECT e FROM Entrepreneur2 e WHERE e.linkedinid = :linkedinid"),
    @NamedQuery(name = "Entrepreneur2.findByIndustry", query = "SELECT e FROM Entrepreneur2 e WHERE e.industry = :industry")})
public class Entrepreneur2 implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 2147483647)
    @Column(name = "linkedinid")
    private String linkedinid;
    @Size(max = 2147483647)
    @Column(name = "industry")
    private String industry;

    public Entrepreneur2() {
    }

    public Entrepreneur2(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLinkedinid() {
        return linkedinid;
    }

    public void setLinkedinid(String linkedinid) {
        this.linkedinid = linkedinid;
    }

    public String getIndustry() {
        return industry;
    }

    public void setIndustry(String industry) {
        this.industry = industry;
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
        if (!(object instanceof Entrepreneur2)) {
            return false;
        }
        Entrepreneur2 other = (Entrepreneur2) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "org.ideavillage.mentormarketplace.persistence.domain.Entrepreneur2[ id=" + id + " ]";
    }
    
}
