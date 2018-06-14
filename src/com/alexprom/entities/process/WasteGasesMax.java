/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alexprom.entities.process;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Lenovo
 */
@Entity
@Table(name = "wasteGases_Max")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "WasteGasesMax.findAll", query = "SELECT w FROM WasteGasesMax w"),
    @NamedQuery(name = "WasteGasesMax.findByADate", query = "SELECT w FROM WasteGasesMax w WHERE w.aDate = :aDate"),
    @NamedQuery(name = "WasteGasesMax.findByAShift", query = "SELECT w FROM WasteGasesMax w WHERE w.aShift = :aShift"),
    @NamedQuery(name = "WasteGasesMax.findByATag", query = "SELECT w FROM WasteGasesMax w WHERE w.aTag = :aTag"),
    @NamedQuery(name = "WasteGasesMax.findByMaxValue", query = "SELECT w FROM WasteGasesMax w WHERE w.maxValue = :maxValue"),
    @NamedQuery(name = "WasteGasesMax.findById", query = "SELECT w FROM WasteGasesMax w WHERE w.id = :id")})
public class WasteGasesMax implements Serializable {

    private static final long serialVersionUID = 1L;
    @Column(name = "aDate")
    @Temporal(TemporalType.DATE)
    private Date aDate;
    @Column(name = "aShift")
    private Integer aShift;
    @Column(name = "aTag")
    private String aTag;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "maxValue")
    private BigDecimal maxValue;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;

    public WasteGasesMax() {
    }

    public WasteGasesMax(Long id) {
        this.id = id;
    }

    public Date getADate() {
        return aDate;
    }

    public void setADate(Date aDate) {
        this.aDate = aDate;
    }

    public Integer getAShift() {
        return aShift;
    }

    public void setAShift(Integer aShift) {
        this.aShift = aShift;
    }

    public String getATag() {
        return aTag;
    }

    public void setATag(String aTag) {
        this.aTag = aTag;
    }

    public BigDecimal getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(BigDecimal maxValue) {
        this.maxValue = maxValue;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
        if (!(object instanceof WasteGasesMax)) {
            return false;
        }
        WasteGasesMax other = (WasteGasesMax) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.alexprom.entities.process.WasteGasesMax[ id=" + id + " ]";
    }
    
}
