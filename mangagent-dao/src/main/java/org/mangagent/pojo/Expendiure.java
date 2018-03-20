package org.mangagent.pojo;

public class Expendiure {
    private Integer expId;

    private Integer residenceId;

    private Integer expNo;

    private String expName;

    private Integer chargeMode;

    private Integer chargeInterval;

    private Double price;

    private Double lateFee;

    private Integer overdueDay;

    public Integer getExpId() {
        return expId;
    }

    public void setExpId(Integer expId) {
        this.expId = expId;
    }

    public Integer getResidenceId() {
        return residenceId;
    }

    public void setResidenceId(Integer residenceId) {
        this.residenceId = residenceId;
    }

    public Integer getExpNo() {
        return expNo;
    }

    public void setExpNo(Integer expNo) {
        this.expNo = expNo;
    }

    public String getExpName() {
        return expName;
    }

    public void setExpName(String expName) {
        this.expName = expName;
    }

    public Integer getChargeMode() {
        return chargeMode;
    }

    public void setChargeMode(Integer chargeMode) {
        this.chargeMode = chargeMode;
    }

    public Integer getChargeInterval() {
        return chargeInterval;
    }

    public void setChargeInterval(Integer chargeInterval) {
        this.chargeInterval = chargeInterval;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getLateFee() {
        return lateFee;
    }

    public void setLateFee(Double lateFee) {
        this.lateFee = lateFee;
    }

    public Integer getOverdueDay() {
        return overdueDay;
    }

    public void setOverdueDay(Integer overdueDay) {
        this.overdueDay = overdueDay;
    }
}