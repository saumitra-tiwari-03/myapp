/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.saumitra.adcc.datamanager.entity;

import java.io.Serializable;
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

/**
 *
 * @author saumitrat
 */
@Entity
@Table(name = "LUCKNOW")
public class Lucknow implements Serializable {

    private static final long serialVersionUID = 1L;
    @Basic(optional = false)
    @Column(name = "CENSIUS_CODE")
    private String censiusCode;
    @Column(name = "VIL_CODE")
    private String vilCode;
    @Id
    @Basic(optional = false)
    @Column(name = "SOURCE_CODE")
    private String sourceCode;
    @Basic(optional = false)
    @Column(name = "DISTRICT")
    private String district;
    @Basic(optional = false)
    @Column(name = "BLOCK")
    private String block;
    @Basic(optional = false)
    @Column(name = "PANCHAYAT")
    private String panchayat;
    @Basic(optional = false)
    @Column(name = "VILLAGE")
    private String village;
    @Column(name = "HABITATION_TOLA")
    private String habitationTola;
    @Column(name = "HABITATION_ID")
    private String habitationId;
    @Column(name = "LOCATION")
    private String location;
    @Column(name = "SCHEME_ID")
    private String schemeId;
    @Column(name = "SCHEME_SOURCE_ID")
    private String schemeSourceId;
    @Column(name = "GPS_ID")
    private Long gpsId;
    @Basic(optional = false)
    @Column(name = "LATITUDE")
    private double latitude;
    @Basic(optional = false)
    @Column(name = "LONGITUDE")
    private double longitude;
    @Basic(optional = false)
    @Column(name = "RL")
    private double rl;
    @Basic(optional = false)
    @Column(name = "OWNER")
    private String owner;
    @Basic(optional = false)
    @Column(name = "WATER_SOURCE_TYPE")
    private String waterSourceType;
    @Column(name = "AGE_FACTOR")
    private String ageFactor;
    @Basic(optional = false)
    @Column(name = "TURBIDTY")
    private double turbidty;
    @Basic(optional = false)
    @Column(name = "PH")
    private double ph;
    @Basic(optional = false)
    @Column(name = "ARSENIC")
    private double arsenic;
    @Basic(optional = false)
    @Column(name = "CHLORIDE")
    private int chloride;
    @Basic(optional = false)
    @Column(name = "IRON")
    private double iron;
    @Basic(optional = false)
    @Column(name = "FLOURIDE")
    private double flouride;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "NITRATE")
    private Double nitrate;
    @Basic(optional = false)
    @Column(name = "TOTAL_HARDNESS")
    private double totalHardness;
    @Basic(optional = false)
    @Column(name = "RESIDUAL_CHLORIDE")
    private double residualChloride;
    @Basic(optional = false)
    @Column(name = "BACTERIAL_LOGICAL")
    private String bacterialLogical;
    @Basic(optional = false)
    @Column(name = "IMAGE_NAME")
    private String imageName;
    @Basic(optional = false)
    @Column(name = "DATE_OF_ENTRY")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateOfEntry;
    @Basic(optional = false)
    @Column(name = "STATUS")
    private String status;

    public Lucknow() {
    }

    public Lucknow(String sourceCode) {
        this.sourceCode = sourceCode;
    }

    public Lucknow(String sourceCode, String censiusCode, String district, String block, String panchayat, String village, double latitude, double longitude, double rl, String owner, String waterSourceType, double turbidty, double ph, double arsenic, int chloride, double iron, double flouride, double totalHardness, double residualChloride, String bacterialLogical, String imageName, Date dateOfEntry, String status) {
        this.sourceCode = sourceCode;
        this.censiusCode = censiusCode;
        this.district = district;
        this.block = block;
        this.panchayat = panchayat;
        this.village = village;
        this.latitude = latitude;
        this.longitude = longitude;
        this.rl = rl;
        this.owner = owner;
        this.waterSourceType = waterSourceType;
        this.turbidty = turbidty;
        this.ph = ph;
        this.arsenic = arsenic;
        this.chloride = chloride;
        this.iron = iron;
        this.flouride = flouride;
        this.totalHardness = totalHardness;
        this.residualChloride = residualChloride;
        this.bacterialLogical = bacterialLogical;
        this.imageName = imageName;
        this.dateOfEntry = dateOfEntry;
        this.status = status;
    }

    public String getCensiusCode() {
        return censiusCode;
    }

    public void setCensiusCode(String censiusCode) {
        this.censiusCode = censiusCode;
    }

    public String getVilCode() {
        return vilCode;
    }

    public void setVilCode(String vilCode) {
        this.vilCode = vilCode;
    }

    public String getSourceCode() {
        return sourceCode;
    }

    public void setSourceCode(String sourceCode) {
        this.sourceCode = sourceCode;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getBlock() {
        return block;
    }

    public void setBlock(String block) {
        this.block = block;
    }

    public String getPanchayat() {
        return panchayat;
    }

    public void setPanchayat(String panchayat) {
        this.panchayat = panchayat;
    }

    public String getVillage() {
        return village;
    }

    public void setVillage(String village) {
        this.village = village;
    }

    public String getHabitationTola() {
        return habitationTola;
    }

    public void setHabitationTola(String habitationTola) {
        this.habitationTola = habitationTola;
    }

    public String getHabitationId() {
        return habitationId;
    }

    public void setHabitationId(String habitationId) {
        this.habitationId = habitationId;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getSchemeId() {
        return schemeId;
    }

    public void setSchemeId(String schemeId) {
        this.schemeId = schemeId;
    }

    public String getSchemeSourceId() {
        return schemeSourceId;
    }

    public void setSchemeSourceId(String schemeSourceId) {
        this.schemeSourceId = schemeSourceId;
    }

    public Long getGpsId() {
        return gpsId;
    }

    public void setGpsId(Long gpsId) {
        this.gpsId = gpsId;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public double getRl() {
        return rl;
    }

    public void setRl(double rl) {
        this.rl = rl;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getWaterSourceType() {
        return waterSourceType;
    }

    public void setWaterSourceType(String waterSourceType) {
        this.waterSourceType = waterSourceType;
    }

    public String getAgeFactor() {
        return ageFactor;
    }

    public void setAgeFactor(String ageFactor) {
        this.ageFactor = ageFactor;
    }

    public double getTurbidty() {
        return turbidty;
    }

    public void setTurbidty(double turbidty) {
        this.turbidty = turbidty;
    }

    public double getPh() {
        return ph;
    }

    public void setPh(double ph) {
        this.ph = ph;
    }

    public double getArsenic() {
        return arsenic;
    }

    public void setArsenic(double arsenic) {
        this.arsenic = arsenic;
    }

    public int getChloride() {
        return chloride;
    }

    public void setChloride(int chloride) {
        this.chloride = chloride;
    }

    public double getIron() {
        return iron;
    }

    public void setIron(double iron) {
        this.iron = iron;
    }

    public double getFlouride() {
        return flouride;
    }

    public void setFlouride(double flouride) {
        this.flouride = flouride;
    }

    public Double getNitrate() {
        return nitrate;
    }

    public void setNitrate(Double nitrate) {
        this.nitrate = nitrate;
    }

    public double getTotalHardness() {
        return totalHardness;
    }

    public void setTotalHardness(double totalHardness) {
        this.totalHardness = totalHardness;
    }

    public double getResidualChloride() {
        return residualChloride;
    }

    public void setResidualChloride(double residualChloride) {
        this.residualChloride = residualChloride;
    }

    public String getBacterialLogical() {
        return bacterialLogical;
    }

    public void setBacterialLogical(String bacterialLogical) {
        this.bacterialLogical = bacterialLogical;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public Date getDateOfEntry() {
        return dateOfEntry;
    }

    public void setDateOfEntry(Date dateOfEntry) {
        this.dateOfEntry = dateOfEntry;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (sourceCode != null ? sourceCode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Lucknow)) {
            return false;
        }
        Lucknow other = (Lucknow) object;
        if ((this.sourceCode == null && other.sourceCode != null) || (this.sourceCode != null && !this.sourceCode.equals(other.sourceCode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.saumitra.adcc.datamanager.entity.Lucknow[ sourceCode=" + sourceCode + " ]";
    }
    
}
