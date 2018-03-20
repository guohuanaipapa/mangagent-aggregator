package org.mangagent.pojo;

import java.util.Date;

public class Repair {
    private Integer repairId;

    private Integer residenceId;

    private Integer singleId;

    private Integer unitId;

    private Integer anId;

    private Integer user;

    private Integer index;

    private String phone;

    private Date applyTime;

    private String decorationContent;

    private Date examinationTime;

    private String examinationOption;

    private Integer state;

    public Integer getRepairId() {
        return repairId;
    }

    public void setRepairId(Integer repairId) {
        this.repairId = repairId;
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

    public Integer getUser() {
        return user;
    }

    public void setUser(Integer user) {
        this.user = user;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getApplyTime() {
        return applyTime;
    }

    public void setApplyTime(Date applyTime) {
        this.applyTime = applyTime;
    }

    public String getDecorationContent() {
        return decorationContent;
    }

    public void setDecorationContent(String decorationContent) {
        this.decorationContent = decorationContent;
    }

    public Date getExaminationTime() {
        return examinationTime;
    }

    public void setExaminationTime(Date examinationTime) {
        this.examinationTime = examinationTime;
    }

    public String getExaminationOption() {
        return examinationOption;
    }

    public void setExaminationOption(String examinationOption) {
        this.examinationOption = examinationOption;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}