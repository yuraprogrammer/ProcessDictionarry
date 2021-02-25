/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alexprom.entities.process;

import java.io.Serializable;
import java.math.BigDecimal;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author yura_
 */
@Entity
@Table(name = "Act_Counters")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ActCounters.findAll", query = "SELECT a FROM ActCounters a"),
    @NamedQuery(name = "ActCounters.findById", query = "SELECT a FROM ActCounters a WHERE a.id = :id"),
    @NamedQuery(name = "ActCounters.findByActID", query = "SELECT a FROM ActCounters a WHERE a.actID = :actID"),
    @NamedQuery(name = "ActCounters.findByMassStartS", query = "SELECT a FROM ActCounters a WHERE a.massStartS = :massStartS"),
    @NamedQuery(name = "ActCounters.findByVolumeStartS", query = "SELECT a FROM ActCounters a WHERE a.volumeStartS = :volumeStartS"),
    @NamedQuery(name = "ActCounters.findByTempStartS", query = "SELECT a FROM ActCounters a WHERE a.tempStartS = :tempStartS"),
    @NamedQuery(name = "ActCounters.findByDensityStartS", query = "SELECT a FROM ActCounters a WHERE a.densityStartS = :densityStartS"),
    @NamedQuery(name = "ActCounters.findByMassStartB", query = "SELECT a FROM ActCounters a WHERE a.massStartB = :massStartB"),
    @NamedQuery(name = "ActCounters.findByVolumeStartB", query = "SELECT a FROM ActCounters a WHERE a.volumeStartB = :volumeStartB"),
    @NamedQuery(name = "ActCounters.findByTempStartB", query = "SELECT a FROM ActCounters a WHERE a.tempStartB = :tempStartB"),
    @NamedQuery(name = "ActCounters.findByDensityStartB", query = "SELECT a FROM ActCounters a WHERE a.densityStartB = :densityStartB"),
    @NamedQuery(name = "ActCounters.findByMassStartA", query = "SELECT a FROM ActCounters a WHERE a.massStartA = :massStartA"),
    @NamedQuery(name = "ActCounters.findByVolumeStartA", query = "SELECT a FROM ActCounters a WHERE a.volumeStartA = :volumeStartA"),
    @NamedQuery(name = "ActCounters.findByTempStartA", query = "SELECT a FROM ActCounters a WHERE a.tempStartA = :tempStartA"),
    @NamedQuery(name = "ActCounters.findByDensityStartA", query = "SELECT a FROM ActCounters a WHERE a.densityStartA = :densityStartA"),
    @NamedQuery(name = "ActCounters.findByMassEndS", query = "SELECT a FROM ActCounters a WHERE a.massEndS = :massEndS"),
    @NamedQuery(name = "ActCounters.findByVolumeEndS", query = "SELECT a FROM ActCounters a WHERE a.volumeEndS = :volumeEndS"),
    @NamedQuery(name = "ActCounters.findByTempEndS", query = "SELECT a FROM ActCounters a WHERE a.tempEndS = :tempEndS"),
    @NamedQuery(name = "ActCounters.findByDensityEndS", query = "SELECT a FROM ActCounters a WHERE a.densityEndS = :densityEndS"),
    @NamedQuery(name = "ActCounters.findByMassEndB", query = "SELECT a FROM ActCounters a WHERE a.massEndB = :massEndB"),
    @NamedQuery(name = "ActCounters.findByVolumeEndB", query = "SELECT a FROM ActCounters a WHERE a.volumeEndB = :volumeEndB"),
    @NamedQuery(name = "ActCounters.findByTempEndB", query = "SELECT a FROM ActCounters a WHERE a.tempEndB = :tempEndB"),
    @NamedQuery(name = "ActCounters.findByDensityEndB", query = "SELECT a FROM ActCounters a WHERE a.densityEndB = :densityEndB"),
    @NamedQuery(name = "ActCounters.findByMassEndA", query = "SELECT a FROM ActCounters a WHERE a.massEndA = :massEndA"),
    @NamedQuery(name = "ActCounters.findByVolumeEndA", query = "SELECT a FROM ActCounters a WHERE a.volumeEndA = :volumeEndA"),
    @NamedQuery(name = "ActCounters.findByTempEndA", query = "SELECT a FROM ActCounters a WHERE a.tempEndA = :tempEndA"),
    @NamedQuery(name = "ActCounters.findByDensityEndA", query = "SELECT a FROM ActCounters a WHERE a.densityEndA = :densityEndA"),
    @NamedQuery(name = "ActCounters.findByProcessingMass", query = "SELECT a FROM ActCounters a WHERE a.processingMass = :processingMass"),
    @NamedQuery(name = "ActCounters.findByProcessingVolume", query = "SELECT a FROM ActCounters a WHERE a.processingVolume = :processingVolume"),
    @NamedQuery(name = "ActCounters.findByBLFMass", query = "SELECT a FROM ActCounters a WHERE a.bLFMass = :bLFMass"),
    @NamedQuery(name = "ActCounters.findByBLFVolume", query = "SELECT a FROM ActCounters a WHERE a.bLFVolume = :bLFVolume"),
    @NamedQuery(name = "ActCounters.findByAKDGMass", query = "SELECT a FROM ActCounters a WHERE a.aKDGMass = :aKDGMass"),
    @NamedQuery(name = "ActCounters.findByAKDFVolume", query = "SELECT a FROM ActCounters a WHERE a.aKDFVolume = :aKDFVolume"),
    @NamedQuery(name = "ActCounters.findByBLFPercent", query = "SELECT a FROM ActCounters a WHERE a.bLFPercent = :bLFPercent"),
    @NamedQuery(name = "ActCounters.findByAKDGPercent", query = "SELECT a FROM ActCounters a WHERE a.aKDGPercent = :aKDGPercent"),
    @NamedQuery(name = "ActCounters.findByOTGPercent", query = "SELECT a FROM ActCounters a WHERE a.oTGPercent = :oTGPercent"),
    @NamedQuery(name = "ActCounters.findByBLFAKDGPercent", query = "SELECT a FROM ActCounters a WHERE a.bLFAKDGPercent = :bLFAKDGPercent"),
    @NamedQuery(name = "ActCounters.findByBLFAKDGOTGPercent", query = "SELECT a FROM ActCounters a WHERE a.bLFAKDGOTGPercent = :bLFAKDGOTGPercent"),
    @NamedQuery(name = "ActCounters.findByProcessingDinsity", query = "SELECT a FROM ActCounters a WHERE a.processingDinsity = :processingDinsity"),
    @NamedQuery(name = "ActCounters.findByBLFDensity", query = "SELECT a FROM ActCounters a WHERE a.bLFDensity = :bLFDensity"),
    @NamedQuery(name = "ActCounters.findByAKDGDensity", query = "SELECT a FROM ActCounters a WHERE a.aKDGDensity = :aKDGDensity"),
    @NamedQuery(name = "ActCounters.findByOTGDensity", query = "SELECT a FROM ActCounters a WHERE a.oTGDensity = :oTGDensity"),
    @NamedQuery(name = "ActCounters.findByE9Gravity", query = "SELECT a FROM ActCounters a WHERE a.e9Gravity = :e9Gravity"),
    @NamedQuery(name = "ActCounters.findByMassStartR", query = "SELECT a FROM ActCounters a WHERE a.massStartR = :massStartR"),
    @NamedQuery(name = "ActCounters.findByVolumeStartR", query = "SELECT a FROM ActCounters a WHERE a.volumeStartR = :volumeStartR"),
    @NamedQuery(name = "ActCounters.findByDensityStartR", query = "SELECT a FROM ActCounters a WHERE a.densityStartR = :densityStartR"),
    @NamedQuery(name = "ActCounters.findByMassEndR", query = "SELECT a FROM ActCounters a WHERE a.massEndR = :massEndR"),
    @NamedQuery(name = "ActCounters.findByVolumeEndR", query = "SELECT a FROM ActCounters a WHERE a.volumeEndR = :volumeEndR"),
    @NamedQuery(name = "ActCounters.findByRVOPercent", query = "SELECT a FROM ActCounters a WHERE a.rVOPercent = :rVOPercent"),
    @NamedQuery(name = "ActCounters.findByRVOMass", query = "SELECT a FROM ActCounters a WHERE a.rVOMass = :rVOMass"),
    @NamedQuery(name = "ActCounters.findByRVOVolume", query = "SELECT a FROM ActCounters a WHERE a.rVOVolume = :rVOVolume"),
    @NamedQuery(name = "ActCounters.findByRVODensity", query = "SELECT a FROM ActCounters a WHERE a.rVODensity = :rVODensity"),
    @NamedQuery(name = "ActCounters.findByTempStartR", query = "SELECT a FROM ActCounters a WHERE a.tempStartR = :tempStartR"),
    @NamedQuery(name = "ActCounters.findByTempEndR", query = "SELECT a FROM ActCounters a WHERE a.tempEndR = :tempEndR"),
    @NamedQuery(name = "ActCounters.findByDensityEndR", query = "SELECT a FROM ActCounters a WHERE a.densityEndR = :densityEndR")})
public class ActCounters implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "id")
    private Long id;
    @Basic(optional = false)
    @Column(name = "actID")
    private long actID;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Basic(optional = false)
    @Column(name = "MassStart_S")
    private BigDecimal massStartS;
    @Basic(optional = false)
    @Column(name = "VolumeStart_S")
    private BigDecimal volumeStartS;
    @Basic(optional = false)
    @Column(name = "TempStart_S")
    private BigDecimal tempStartS;
    @Basic(optional = false)
    @Column(name = "DensityStart_S")
    private BigDecimal densityStartS;
    @Basic(optional = false)
    @Column(name = "MassStart_B")
    private BigDecimal massStartB;
    @Basic(optional = false)
    @Column(name = "VolumeStart_B")
    private BigDecimal volumeStartB;
    @Basic(optional = false)
    @Column(name = "TempStart_B")
    private BigDecimal tempStartB;
    @Basic(optional = false)
    @Column(name = "DensityStart_B")
    private BigDecimal densityStartB;
    @Basic(optional = false)
    @Column(name = "MassStart_A")
    private BigDecimal massStartA;
    @Basic(optional = false)
    @Column(name = "VolumeStart_A")
    private BigDecimal volumeStartA;
    @Basic(optional = false)
    @Column(name = "TempStart_A")
    private BigDecimal tempStartA;
    @Basic(optional = false)
    @Column(name = "DensityStart_A")
    private BigDecimal densityStartA;
    @Basic(optional = false)
    @Column(name = "MassEnd_S")
    private BigDecimal massEndS;
    @Basic(optional = false)
    @Column(name = "VolumeEnd_S")
    private BigDecimal volumeEndS;
    @Basic(optional = false)
    @Column(name = "TempEnd_S")
    private BigDecimal tempEndS;
    @Basic(optional = false)
    @Column(name = "DensityEnd_S")
    private BigDecimal densityEndS;
    @Basic(optional = false)
    @Column(name = "MassEnd_B")
    private BigDecimal massEndB;
    @Basic(optional = false)
    @Column(name = "VolumeEnd_B")
    private BigDecimal volumeEndB;
    @Basic(optional = false)
    @Column(name = "TempEnd_B")
    private BigDecimal tempEndB;
    @Basic(optional = false)
    @Column(name = "DensityEnd_B")
    private BigDecimal densityEndB;
    @Basic(optional = false)
    @Column(name = "MassEnd_A")
    private BigDecimal massEndA;
    @Basic(optional = false)
    @Column(name = "VolumeEnd_A")
    private BigDecimal volumeEndA;
    @Basic(optional = false)
    @Column(name = "TempEnd_A")
    private BigDecimal tempEndA;
    @Basic(optional = false)
    @Column(name = "DensityEnd_A")
    private BigDecimal densityEndA;
    @Column(name = "Processing_Mass")
    private BigDecimal processingMass;
    @Column(name = "Processing_Volume")
    private BigDecimal processingVolume;
    @Column(name = "BLF_Mass")
    private BigDecimal bLFMass;
    @Column(name = "BLF_Volume")
    private BigDecimal bLFVolume;
    @Column(name = "AKDG_Mass")
    private BigDecimal aKDGMass;
    @Column(name = "AKDF_Volume")
    private BigDecimal aKDFVolume;
    @Basic(optional = false)
    @Column(name = "BLF_Percent")
    private BigDecimal bLFPercent;
    @Basic(optional = false)
    @Column(name = "AKDG_Percent")
    private BigDecimal aKDGPercent;
    @Basic(optional = false)
    @Column(name = "OTG_Percent")
    private BigDecimal oTGPercent;
    @Column(name = "BLF_AKDG_Percent")
    private BigDecimal bLFAKDGPercent;
    @Column(name = "BLF_AKDG_OTG_Percent")
    private BigDecimal bLFAKDGOTGPercent;
    @Basic(optional = false)
    @Column(name = "Processing_Dinsity")
    private BigDecimal processingDinsity;
    @Basic(optional = false)
    @Column(name = "BLF_Density")
    private BigDecimal bLFDensity;
    @Basic(optional = false)
    @Column(name = "AKDG_Density")
    private BigDecimal aKDGDensity;
    @Basic(optional = false)
    @Column(name = "OTG_Density")
    private BigDecimal oTGDensity;
    @Basic(optional = false)
    @Column(name = "E9_Gravity")
    private BigDecimal e9Gravity;
    @Column(name = "MassStart_R")
    private BigDecimal massStartR;
    @Column(name = "VolumeStart_R")
    private BigDecimal volumeStartR;
    @Column(name = "DensityStart_R")
    private BigDecimal densityStartR;
    @Column(name = "MassEnd_R")
    private BigDecimal massEndR;
    @Column(name = "VolumeEnd_R")
    private BigDecimal volumeEndR;
    @Column(name = "RVO_Percent")
    private BigDecimal rVOPercent;
    @Column(name = "RVO_Mass")
    private BigDecimal rVOMass;
    @Column(name = "RVO_Volume")
    private BigDecimal rVOVolume;
    @Column(name = "RVO_Density")
    private BigDecimal rVODensity;
    @Column(name = "TempStart_R")
    private BigDecimal tempStartR;
    @Column(name = "TempEnd_R")
    private BigDecimal tempEndR;
    @Column(name = "DensityEnd_R")
    private BigDecimal densityEndR;

    public ActCounters() {
    }

    public ActCounters(Long id) {
        this.id = id;
    }

    public ActCounters(Long id, long actID, BigDecimal massStartS, BigDecimal volumeStartS, BigDecimal tempStartS, BigDecimal densityStartS, BigDecimal massStartB, BigDecimal volumeStartB, BigDecimal tempStartB, BigDecimal densityStartB, BigDecimal massStartA, BigDecimal volumeStartA, BigDecimal tempStartA, BigDecimal densityStartA, BigDecimal massEndS, BigDecimal volumeEndS, BigDecimal tempEndS, BigDecimal densityEndS, BigDecimal massEndB, BigDecimal volumeEndB, BigDecimal tempEndB, BigDecimal densityEndB, BigDecimal massEndA, BigDecimal volumeEndA, BigDecimal tempEndA, BigDecimal densityEndA, BigDecimal bLFPercent, BigDecimal aKDGPercent, BigDecimal oTGPercent, BigDecimal processingDinsity, BigDecimal bLFDensity, BigDecimal aKDGDensity, BigDecimal oTGDensity, BigDecimal e9Gravity) {
        this.id = id;
        this.actID = actID;
        this.massStartS = massStartS;
        this.volumeStartS = volumeStartS;
        this.tempStartS = tempStartS;
        this.densityStartS = densityStartS;
        this.massStartB = massStartB;
        this.volumeStartB = volumeStartB;
        this.tempStartB = tempStartB;
        this.densityStartB = densityStartB;
        this.massStartA = massStartA;
        this.volumeStartA = volumeStartA;
        this.tempStartA = tempStartA;
        this.densityStartA = densityStartA;
        this.massEndS = massEndS;
        this.volumeEndS = volumeEndS;
        this.tempEndS = tempEndS;
        this.densityEndS = densityEndS;
        this.massEndB = massEndB;
        this.volumeEndB = volumeEndB;
        this.tempEndB = tempEndB;
        this.densityEndB = densityEndB;
        this.massEndA = massEndA;
        this.volumeEndA = volumeEndA;
        this.tempEndA = tempEndA;
        this.densityEndA = densityEndA;
        this.bLFPercent = bLFPercent;
        this.aKDGPercent = aKDGPercent;
        this.oTGPercent = oTGPercent;
        this.processingDinsity = processingDinsity;
        this.bLFDensity = bLFDensity;
        this.aKDGDensity = aKDGDensity;
        this.oTGDensity = oTGDensity;
        this.e9Gravity = e9Gravity;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public long getActID() {
        return actID;
    }

    public void setActID(long actID) {
        this.actID = actID;
    }

    public BigDecimal getMassStartS() {
        return massStartS;
    }

    public void setMassStartS(BigDecimal massStartS) {
        this.massStartS = massStartS;
    }

    public BigDecimal getVolumeStartS() {
        return volumeStartS;
    }

    public void setVolumeStartS(BigDecimal volumeStartS) {
        this.volumeStartS = volumeStartS;
    }

    public BigDecimal getTempStartS() {
        return tempStartS;
    }

    public void setTempStartS(BigDecimal tempStartS) {
        this.tempStartS = tempStartS;
    }

    public BigDecimal getDensityStartS() {
        return densityStartS;
    }

    public void setDensityStartS(BigDecimal densityStartS) {
        this.densityStartS = densityStartS;
    }

    public BigDecimal getMassStartB() {
        return massStartB;
    }

    public void setMassStartB(BigDecimal massStartB) {
        this.massStartB = massStartB;
    }

    public BigDecimal getVolumeStartB() {
        return volumeStartB;
    }

    public void setVolumeStartB(BigDecimal volumeStartB) {
        this.volumeStartB = volumeStartB;
    }

    public BigDecimal getTempStartB() {
        return tempStartB;
    }

    public void setTempStartB(BigDecimal tempStartB) {
        this.tempStartB = tempStartB;
    }

    public BigDecimal getDensityStartB() {
        return densityStartB;
    }

    public void setDensityStartB(BigDecimal densityStartB) {
        this.densityStartB = densityStartB;
    }

    public BigDecimal getMassStartA() {
        return massStartA;
    }

    public void setMassStartA(BigDecimal massStartA) {
        this.massStartA = massStartA;
    }

    public BigDecimal getVolumeStartA() {
        return volumeStartA;
    }

    public void setVolumeStartA(BigDecimal volumeStartA) {
        this.volumeStartA = volumeStartA;
    }

    public BigDecimal getTempStartA() {
        return tempStartA;
    }

    public void setTempStartA(BigDecimal tempStartA) {
        this.tempStartA = tempStartA;
    }

    public BigDecimal getDensityStartA() {
        return densityStartA;
    }

    public void setDensityStartA(BigDecimal densityStartA) {
        this.densityStartA = densityStartA;
    }

    public BigDecimal getMassEndS() {
        return massEndS;
    }

    public void setMassEndS(BigDecimal massEndS) {
        this.massEndS = massEndS;
    }

    public BigDecimal getVolumeEndS() {
        return volumeEndS;
    }

    public void setVolumeEndS(BigDecimal volumeEndS) {
        this.volumeEndS = volumeEndS;
    }

    public BigDecimal getTempEndS() {
        return tempEndS;
    }

    public void setTempEndS(BigDecimal tempEndS) {
        this.tempEndS = tempEndS;
    }

    public BigDecimal getDensityEndS() {
        return densityEndS;
    }

    public void setDensityEndS(BigDecimal densityEndS) {
        this.densityEndS = densityEndS;
    }

    public BigDecimal getMassEndB() {
        return massEndB;
    }

    public void setMassEndB(BigDecimal massEndB) {
        this.massEndB = massEndB;
    }

    public BigDecimal getVolumeEndB() {
        return volumeEndB;
    }

    public void setVolumeEndB(BigDecimal volumeEndB) {
        this.volumeEndB = volumeEndB;
    }

    public BigDecimal getTempEndB() {
        return tempEndB;
    }

    public void setTempEndB(BigDecimal tempEndB) {
        this.tempEndB = tempEndB;
    }

    public BigDecimal getDensityEndB() {
        return densityEndB;
    }

    public void setDensityEndB(BigDecimal densityEndB) {
        this.densityEndB = densityEndB;
    }

    public BigDecimal getMassEndA() {
        return massEndA;
    }

    public void setMassEndA(BigDecimal massEndA) {
        this.massEndA = massEndA;
    }

    public BigDecimal getVolumeEndA() {
        return volumeEndA;
    }

    public void setVolumeEndA(BigDecimal volumeEndA) {
        this.volumeEndA = volumeEndA;
    }

    public BigDecimal getTempEndA() {
        return tempEndA;
    }

    public void setTempEndA(BigDecimal tempEndA) {
        this.tempEndA = tempEndA;
    }

    public BigDecimal getDensityEndA() {
        return densityEndA;
    }

    public void setDensityEndA(BigDecimal densityEndA) {
        this.densityEndA = densityEndA;
    }

    public BigDecimal getProcessingMass() {
        return processingMass;
    }

    public void setProcessingMass(BigDecimal processingMass) {
        this.processingMass = processingMass;
    }

    public BigDecimal getProcessingVolume() {
        return processingVolume;
    }

    public void setProcessingVolume(BigDecimal processingVolume) {
        this.processingVolume = processingVolume;
    }

    public BigDecimal getBLFMass() {
        return bLFMass;
    }

    public void setBLFMass(BigDecimal bLFMass) {
        this.bLFMass = bLFMass;
    }

    public BigDecimal getBLFVolume() {
        return bLFVolume;
    }

    public void setBLFVolume(BigDecimal bLFVolume) {
        this.bLFVolume = bLFVolume;
    }

    public BigDecimal getAKDGMass() {
        return aKDGMass;
    }

    public void setAKDGMass(BigDecimal aKDGMass) {
        this.aKDGMass = aKDGMass;
    }

    public BigDecimal getAKDFVolume() {
        return aKDFVolume;
    }

    public void setAKDFVolume(BigDecimal aKDFVolume) {
        this.aKDFVolume = aKDFVolume;
    }

    public BigDecimal getBLFPercent() {
        return bLFPercent;
    }

    public void setBLFPercent(BigDecimal bLFPercent) {
        this.bLFPercent = bLFPercent;
    }

    public BigDecimal getAKDGPercent() {
        return aKDGPercent;
    }

    public void setAKDGPercent(BigDecimal aKDGPercent) {
        this.aKDGPercent = aKDGPercent;
    }

    public BigDecimal getOTGPercent() {
        return oTGPercent;
    }

    public void setOTGPercent(BigDecimal oTGPercent) {
        this.oTGPercent = oTGPercent;
    }

    public BigDecimal getBLFAKDGPercent() {
        return bLFAKDGPercent;
    }

    public void setBLFAKDGPercent(BigDecimal bLFAKDGPercent) {
        this.bLFAKDGPercent = bLFAKDGPercent;
    }

    public BigDecimal getBLFAKDGOTGPercent() {
        return bLFAKDGOTGPercent;
    }

    public void setBLFAKDGOTGPercent(BigDecimal bLFAKDGOTGPercent) {
        this.bLFAKDGOTGPercent = bLFAKDGOTGPercent;
    }

    public BigDecimal getProcessingDinsity() {
        return processingDinsity;
    }

    public void setProcessingDinsity(BigDecimal processingDinsity) {
        this.processingDinsity = processingDinsity;
    }

    public BigDecimal getBLFDensity() {
        return bLFDensity;
    }

    public void setBLFDensity(BigDecimal bLFDensity) {
        this.bLFDensity = bLFDensity;
    }

    public BigDecimal getAKDGDensity() {
        return aKDGDensity;
    }

    public void setAKDGDensity(BigDecimal aKDGDensity) {
        this.aKDGDensity = aKDGDensity;
    }

    public BigDecimal getOTGDensity() {
        return oTGDensity;
    }

    public void setOTGDensity(BigDecimal oTGDensity) {
        this.oTGDensity = oTGDensity;
    }

    public BigDecimal getE9Gravity() {
        return e9Gravity;
    }

    public void setE9Gravity(BigDecimal e9Gravity) {
        this.e9Gravity = e9Gravity;
    }

    public BigDecimal getMassStartR() {
        return massStartR;
    }

    public void setMassStartR(BigDecimal massStartR) {
        this.massStartR = massStartR;
    }

    public BigDecimal getVolumeStartR() {
        return volumeStartR;
    }

    public void setVolumeStartR(BigDecimal volumeStartR) {
        this.volumeStartR = volumeStartR;
    }

    public BigDecimal getDensityStartR() {
        return densityStartR;
    }

    public void setDensityStartR(BigDecimal densityStartR) {
        this.densityStartR = densityStartR;
    }

    public BigDecimal getMassEndR() {
        return massEndR;
    }

    public void setMassEndR(BigDecimal massEndR) {
        this.massEndR = massEndR;
    }

    public BigDecimal getVolumeEndR() {
        return volumeEndR;
    }

    public void setVolumeEndR(BigDecimal volumeEndR) {
        this.volumeEndR = volumeEndR;
    }

    public BigDecimal getRVOPercent() {
        return rVOPercent;
    }

    public void setRVOPercent(BigDecimal rVOPercent) {
        this.rVOPercent = rVOPercent;
    }

    public BigDecimal getRVOMass() {
        return rVOMass;
    }

    public void setRVOMass(BigDecimal rVOMass) {
        this.rVOMass = rVOMass;
    }

    public BigDecimal getRVOVolume() {
        return rVOVolume;
    }

    public void setRVOVolume(BigDecimal rVOVolume) {
        this.rVOVolume = rVOVolume;
    }

    public BigDecimal getRVODensity() {
        return rVODensity;
    }

    public void setRVODensity(BigDecimal rVODensity) {
        this.rVODensity = rVODensity;
    }

    public BigDecimal getTempStartR() {
        return tempStartR;
    }

    public void setTempStartR(BigDecimal tempStartR) {
        this.tempStartR = tempStartR;
    }

    public BigDecimal getTempEndR() {
        return tempEndR;
    }

    public void setTempEndR(BigDecimal tempEndR) {
        this.tempEndR = tempEndR;
    }

    public BigDecimal getDensityEndR() {
        return densityEndR;
    }

    public void setDensityEndR(BigDecimal densityEndR) {
        this.densityEndR = densityEndR;
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
        if (!(object instanceof ActCounters)) {
            return false;
        }
        ActCounters other = (ActCounters) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.alexprom.entities.process.ActCounters[ id=" + id + " ]";
    }
    
}
