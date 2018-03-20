package org.mangagent.pojo;

import java.util.Date;

public class Option {
    private Integer optionId;

    private Integer residenceId;

    private Integer singleId;

    private Integer unitId;

    private Integer anId;

    private Integer userId;

    private Date proposalTime;

    private String phone;

    private Integer optionType;

    private String optionContent;

    private Integer adminId;

    private Date admissibilityTime;

    private String result;

    private Integer state;

    public Integer getOptionId() {
        return optionId;
    }

    public void setOptionId(Integer optionId) {
        this.optionId = optionId;
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

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getProposalTime() {
        return proposalTime;
    }

    public void setProposalTime(Date proposalTime) {
        this.proposalTime = proposalTime;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getOptionType() {
        return optionType;
    }

    public void setOptionType(Integer optionType) {
        this.optionType = optionType;
    }

    public String getOptionContent() {
        return optionContent;
    }

    public void setOptionContent(String optionContent) {
        this.optionContent = optionContent;
    }

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public Date getAdmissibilityTime() {
        return admissibilityTime;
    }

    public void setAdmissibilityTime(Date admissibilityTime) {
        this.admissibilityTime = admissibilityTime;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}