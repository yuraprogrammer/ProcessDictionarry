/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.alexprom.entities.process;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
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
 * @author Lenovo
 */
@Entity
@Table(name = "v_actUPPG")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "VactUPPG.findAll", query = "SELECT v FROM VactUPPG v"),
    @NamedQuery(name = "VactUPPG.findById", query = "SELECT v FROM VactUPPG v WHERE v.id = :id"),
    @NamedQuery(name = "VactUPPG.findByADate", query = "SELECT v FROM VactUPPG v WHERE v.aDate = :aDate"),
    @NamedQuery(name = "VactUPPG.findByAShift", query = "SELECT v FROM VactUPPG v WHERE v.aShift = :aShift")})
public class VactUPPG implements Serializable {

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
    @Column(name = "maxValue")
    private BigDecimal maxValue;

    @Basic(optional = false)
    @Column(name = "sirieVolume")
    private BigDecimal sirieVolume;
    @Basic(optional = false)
    @Column(name = "sirieDensity")
    private BigDecimal sirieDensity;
    @Column(name = "sirieMass")
    private BigDecimal sirieMass;

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private long id;
    @Column(name = "aDate")
    private String aDate;
    @Column(name = "aShift")
    private Integer aShift;
    @Column(name = "mainOper")
    private String mainOper;
    @Column(name = "slaveOper")
    private String slaveOper;
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
    @Column(name = "sirieDensity20_Start")
    private BigDecimal sirieDensity20Start;
    @Basic(optional = false)
    @Column(name = "sirieDensity20_End")
    private BigDecimal sirieDensity20End;
    @Basic(optional = false)
    @Column(name = "blfDensity20_Start")
    private BigDecimal blfDensity20Start;
    @Basic(optional = false)
    @Column(name = "blfDensity20_End")
    private BigDecimal blfDensity20End;
    @Basic(optional = false)
    @Column(name = "akdgDensity20_Start")
    private BigDecimal akdgDensity20Start;
    @Basic(optional = false)
    @Column(name = "akdgDensity20_End")
    private BigDecimal akdgDensity20End;
    @Basic(optional = false)
    @Column(name = "drainStartLevel")
    private int drainStartLevel;
    @Basic(optional = false)
    @Column(name = "drainFinishLevel")
    private int drainFinishLevel;
    @Basic(optional = false)
    @Column(name = "drainDensity")
    private BigDecimal drainDensity;
    @Column(name = "drainVolume")
    private Integer drainVolume;
    @Column(name = "drainMass")
    private BigDecimal drainMass;
    @Basic(optional = false)
    @Column(name = "drained")
    private BigDecimal drained;  
    @Column(name = "otg_uppg_Volume")
    private BigInteger otguppgVolume;
    @Column(name = "otg_uppg_Mass")
    private BigInteger otguppgMass;
    @Column(name = "otg_tsp_Volume")
    private BigInteger otgtspVolume;
    @Column(name = "otg_tsp_Mass")
    private BigInteger otgtspMass;
    @Basic(optional = false)
    @Column(name = "feed_startData")
    private int feedstartData;
    @Basic(optional = false)
    @Column(name = "feed_finishData")
    private int feedfinishData;
    @Column(name = "feed_total")
    private Integer feedTotal;
    @Column(name = "Component_1")
    private String component1;
    @Basic(optional = false)
    @Column(name = "Percent_1")
    private double percent1;
    @Column(name = "Component_2")
    private String component2;
    @Basic(optional = false)
    @Column(name = "Percent_2")
    private double percent2;
    @Column(name = "Component_3")
    private String component3;
    @Basic(optional = false)
    @Column(name = "Percent_3")
    private double percent3;
    @Column(name = "Component_4")
    private String component4;
    @Basic(optional = false)
    @Column(name = "Percent_4")
    private double percent4;
    @Column(name = "Component_5")
    private String component5;
    @Basic(optional = false)
    @Column(name = "Percent_5")
    private double percent5;
    @Basic(optional = false)
    @Column(name = "drained_BLF")
    private BigDecimal drainedBLF;
    @Basic(optional = false)
    @Column(name = "Percent_6")
    private double percent6;
    @Column(name = "Component_6")
    private String component6;
    @Basic(optional = false)
    @Column(name = "Tank_Name")
    private String tankName;

    public VactUPPG() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getADate() {
        return aDate;
    }

    public void setADate(String aDate) {
        this.aDate = aDate;
    }

    public Integer getAShift() {
        return aShift;
    }

    public void setAShift(Integer aShift) {
        this.aShift = aShift;
    }

    public String getMainOper() {
        return mainOper;
    }

    public void setMainOper(String mainOper) {
        this.mainOper = mainOper;
    }

    public String getSlaveOper() {
        return slaveOper;
    }

    public void setSlaveOper(String slaveOper) {
        this.slaveOper = slaveOper;
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

    public BigDecimal getSirieDensity20Start() {
        return sirieDensity20Start;
    }

    public void setSirieDensity20Start(BigDecimal sirieDensity20Start) {
        this.sirieDensity20Start = sirieDensity20Start;
    }

    public BigDecimal getSirieDensity20End() {
        return sirieDensity20End;
    }

    public void setSirieDensity20End(BigDecimal sirieDensity20End) {
        this.sirieDensity20End = sirieDensity20End;
    }

    public BigDecimal getBlfDensity20Start() {
        return blfDensity20Start;
    }

    public void setBlfDensity20Start(BigDecimal blfDensity20Start) {
        this.blfDensity20Start = blfDensity20Start;
    }

    public BigDecimal getBlfDensity20End() {
        return blfDensity20End;
    }

    public void setBlfDensity20End(BigDecimal blfDensity20End) {
        this.blfDensity20End = blfDensity20End;
    }

    public BigDecimal getAkdgDensity20Start() {
        return akdgDensity20Start;
    }

    public void setAkdgDensity20Start(BigDecimal akdgDensity20Start) {
        this.akdgDensity20Start = akdgDensity20Start;
    }

    public BigDecimal getAkdgDensity20End() {
        return akdgDensity20End;
    }

    public void setAkdgDensity20End(BigDecimal akdgDensity20End) {
        this.akdgDensity20End = akdgDensity20End;
    }

    public int getDrainStartLevel() {
        return drainStartLevel;
    }

    public void setDrainStartLevel(int drainStartLevel) {
        this.drainStartLevel = drainStartLevel;
    }

    public int getDrainFinishLevel() {
        return drainFinishLevel;
    }

    public void setDrainFinishLevel(int drainFinishLevel) {
        this.drainFinishLevel = drainFinishLevel;
    }

    public BigDecimal getDrainDensity() {
        return drainDensity;
    }

    public void setDrainDensity(BigDecimal drainDensity) {
        this.drainDensity = drainDensity;
    }

    public Integer getDrainVolume() {
        return drainVolume;
    }

    public void setDrainVolume(Integer drainVolume) {
        this.drainVolume = drainVolume;
    }

    public BigDecimal getDrainMass() {
        return drainMass;
    }

    public void setDrainMass(BigDecimal drainMass) {
        this.drainMass = drainMass;
    }

    public BigDecimal getDrained() {
        return drained;
    }

    public void setDrained(BigDecimal drained) {
        this.drained = drained;
    }

    public BigInteger getOtguppgVolume() {
        return otguppgVolume;
    }

    public void setOtguppgVolume(BigInteger otguppgVolume) {
        this.otguppgVolume = otguppgVolume;
    }

    public BigInteger getOtguppgMass() {
        return otguppgMass;
    }

    public void setOtguppgMass(BigInteger otguppgMass) {
        this.otguppgMass = otguppgMass;
    }

    public BigInteger getOtgtspVolume() {
        return otgtspVolume;
    }

    public void setOtgtspVolume(BigInteger otgtspVolume) {
        this.otgtspVolume = otgtspVolume;
    }

    public BigInteger getOtgtspMass() {
        return otgtspMass;
    }

    public void setOtgtspMass(BigInteger otgtspMass) {
        this.otgtspMass = otgtspMass;
    }

    public int getFeedstartData() {
        return feedstartData;
    }

    public void setFeedstartData(int feedstartData) {
        this.feedstartData = feedstartData;
    }

    public int getFeedfinishData() {
        return feedfinishData;
    }

    public void setFeedfinishData(int feedfinishData) {
        this.feedfinishData = feedfinishData;
    }

    public Integer getFeedTotal() {
        return feedTotal;
    }

    public void setFeedTotal(Integer feedTotal) {
        this.feedTotal = feedTotal;
    }

    public String getComponent1() {
        return component1;
    }

    public void setComponent1(String component1) {
        this.component1 = component1;
    }

    public double getPercent1() {
        return percent1;
    }

    public void setPercent1(double percent1) {
        this.percent1 = percent1;
    }

    public String getComponent2() {
        return component2;
    }

    public void setComponent2(String component2) {
        this.component2 = component2;
    }

    public double getPercent2() {
        return percent2;
    }

    public void setPercent2(double percent2) {
        this.percent2 = percent2;
    }

    public String getComponent3() {
        return component3;
    }

    public void setComponent3(String component3) {
        this.component3 = component3;
    }

    public double getPercent3() {
        return percent3;
    }

    public void setPercent3(double percent3) {
        this.percent3 = percent3;
    }

    public String getComponent4() {
        return component4;
    }

    public void setComponent4(String component4) {
        this.component4 = component4;
    }

    public double getPercent4() {
        return percent4;
    }

    public void setPercent4(double percent4) {
        this.percent4 = percent4;
    }

    public String getComponent5() {
        return component5;
    }

    public void setComponent5(String component5) {
        this.component5 = component5;
    }

    public double getPercent5() {
        return percent5;
    }

    public void setPercent5(double percent5) {
        this.percent5 = percent5;
    }

    public BigDecimal getDrainedBLF() {
        return drainedBLF;
    }

    public void setDrainedBLF(BigDecimal drainedBLF) {
        this.drainedBLF = drainedBLF;
    }

    public double getPercent6() {
        return percent6;
    }

    public void setPercent6(double percent6) {
        this.percent6 = percent6;
    }

    public String getComponent6() {
        return component6;
    }

    public void setComponent6(String component6) {
        this.component6 = component6;
    }

    public String getTankName() {
        return tankName;
    }

    public void setTankName(String tankName) {
        this.tankName = tankName;
    }

    public BigDecimal getSirieVolume() {
        return sirieVolume;
    }

    public void setSirieVolume(BigDecimal sirieVolume) {
        this.sirieVolume = sirieVolume;
    }

    public BigDecimal getSirieDensity() {
        return sirieDensity;
    }

    public void setSirieDensity(BigDecimal sirieDensity) {
        this.sirieDensity = sirieDensity;
    }

    public BigDecimal getSirieMass() {
        return sirieMass;
    }

    public void setSirieMass(BigDecimal sirieMass) {
        this.sirieMass = sirieMass;
    }

    public BigDecimal getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(BigDecimal maxValue) {
        this.maxValue = maxValue;
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
    
}
