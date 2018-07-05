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
 * @author yura_
 */
@Entity
@Table(name = "v_FurnaceOutTemp")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VFurnaceOutTemp.findAll", query = "SELECT v FROM VFurnaceOutTemp v"),
    @NamedQuery(name = "VFurnaceOutTemp.findByADate", query = "SELECT v FROM VFurnaceOutTemp v WHERE v.aDate = :aDate"),
    @NamedQuery(name = "VFurnaceOutTemp.findByAShift", query = "SELECT v FROM VFurnaceOutTemp v WHERE v.aShift = :aShift"),
    @NamedQuery(name = "VFurnaceOutTemp.findByATag", query = "SELECT v FROM VFurnaceOutTemp v WHERE v.aTag = :aTag"),
    @NamedQuery(name = "VFurnaceOutTemp.findByMaxValue", query = "SELECT v FROM VFurnaceOutTemp v WHERE v.maxValue = :maxValue"),
    @NamedQuery(name = "VFurnaceOutTemp.findById", query = "SELECT v FROM VFurnaceOutTemp v WHERE v.id = :id")})
public class VFurnaceOutTemp implements Serializable {

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

    public VFurnaceOutTemp() {
    }

    public VFurnaceOutTemp(Long id) {
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
        if (!(object instanceof VFurnaceOutTemp)) {
            return false;
        }
        VFurnaceOutTemp other = (VFurnaceOutTemp) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.alexprom.entities.process.VFurnaceOutTemp[ id=" + id + " ]";
    }
    
}
