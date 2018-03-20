package org.mangagent.pojo;

import java.util.Date;

public class Single {
    private Integer singleId;

    private Integer residenceId;

    private Integer singleStoreys;

    private Integer unitNumber;

    private Integer structureType;

    private Integer decorationStandard;

    private Integer lossGrade;

    private Double buitupArea;

    private Double userArea;

    private String buildingPermits;

    private String presalePermits;

    private Date completionDate;

    private Date cappingDate;

    private String remarks;

    public Integer getSingleId() {
        return singleId;
    }

    public void setSingleId(Integer singleId) {
        this.singleId = singleId;
    }

    public Integer getResidenceId() {
        return residenceId;
    }

    public void setResidenceId(Integer residenceId) {
        this.residenceId = residenceId;
    }

    public Integer getSingleStoreys() {
        return singleStoreys;
    }

    public void setSingleStoreys(Integer singleStoreys) {
        this.singleStoreys = singleStoreys;
    }

    public Integer getUnitNumber() {
        return unitNumber;
    }

    public void setUnitNumber(Integer unitNumber) {
        this.unitNumber = unitNumber;
    }

    public Integer getStructureType() {
        return structureType;
    }

    public void setStructureType(Integer structureType) {
        this.structureType = structureType;
    }

    public Integer getDecorationStandard() {
        return decorationStandard;
    }

    public void setDecorationStandard(Integer decorationStandard) {
        this.decorationStandard = decorationStandard;
    }

    public Integer getLossGrade() {
        return lossGrade;
    }

    public void setLossGrade(Integer lossGrade) {
        this.lossGrade = lossGrade;
    }

    public Double getBuitupArea() {
        return buitupArea;
    }

    public void setBuitupArea(Double buitupArea) {
        this.buitupArea = buitupArea;
    }

    public Double getUserArea() {
        return userArea;
    }

    public void setUserArea(Double userArea) {
        this.userArea = userArea;
    }

    public String getBuildingPermits() {
        return buildingPermits;
    }

    public void setBuildingPermits(String buildingPermits) {
        this.buildingPermits = buildingPermits;
    }

    public String getPresalePermits() {
        return presalePermits;
    }

    public void setPresalePermits(String presalePermits) {
        this.presalePermits = presalePermits;
    }

    public Date getCompletionDate() {
        return completionDate;
    }

    public void setCompletionDate(Date completionDate) {
        this.completionDate = completionDate;
    }

    public Date getCappingDate() {
        return cappingDate;
    }

    public void setCappingDate(Date cappingDate) {
        this.cappingDate = cappingDate;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}