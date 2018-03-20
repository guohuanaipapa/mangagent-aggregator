package org.mangagent.pojo;

import java.util.Date;

public class Checkroom {
    private Integer checkRoomId;

    private Integer residenceId;

    private Integer singleId;

    private Integer unitId;

    private Integer anId;

    private Integer housingProject;

    private Date acceptanceDate;

    private Date determination;

    private Integer isQualified;

    private Integer userId;

    private String option;

    private String housingAdvice;

    private String remarks;

    public Integer getCheckRoomId() {
        return checkRoomId;
    }

    public void setCheckRoomId(Integer checkRoomId) {
        this.checkRoomId = checkRoomId;
    }

    public Integer getResidenceId() {
        return residenceId;
    }

    public void setResidenceId(Integer residenceId) {
        this.residenceId = residenceId;
    }

    public Integer getSingleId() {
        return singleId;
    }

    public void setSingleId(Integer singleId) {
        this.singleId = singleId;
    }

    public Integer getUnitId() {
        return unitId;
    }

    public void setUnitId(Integer unitId) {
        this.unitId = unitId;
    }

    public Integer getAnId() {
        return anId;
    }

    public void setAnId(Integer anId) {
        this.anId = anId;
    }

    public Integer getHousingProject() {
        return housingProject;
    }

    public void setHousingProject(Integer housingProject) {
        this.housingProject = housingProject;
    }

    public Date getAcceptanceDate() {
        return acceptanceDate;
    }

    public void setAcceptanceDate(Date acceptanceDate) {
        this.acceptanceDate = acceptanceDate;
    }

    public Date getDetermination() {
        return determination;
    }

    public void setDetermination(Date determination) {
        this.determination = determination;
    }

    public Integer getIsQualified() {
        return isQualified;
    }

    public void setIsQualified(Integer isQualified) {
        this.isQualified = isQualified;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getOption() {
        return option;
    }

    public void setOption(String option) {
        this.option = option;
    }

    public String getHousingAdvice() {
        return housingAdvice;
    }

    public void setHousingAdvice(String housingAdvice) {
        this.housingAdvice = housingAdvice;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }
}