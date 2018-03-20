package org.mangagent.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * 企业表
 * @author zhubo
 *
 */
public class EnterpriseArchives implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 企业编号
	 */
	private Integer coId;
	/**
	 * 企业全称
	 */
    private String coName;
    /**
     * 企业品牌
     */
    private String coBrand;
    /**
     * 企业简介
     */
    private String coIntroduction;
    /**
     * 企业类型
     */
    private String coType;
    /**
     * 英文名称
     */
    private String englistName;
    /**
     * 公司地址
     */
    private String coAddress;
    /**
     * 公司电话
     */
    private String coPhone;
    /**
     * 邮政编号
     */
    private String postalNumber;
    /**
     * 传真号码
     */
    private String faxNumber;
    /**
     * 公司网站
     */
    private String coWebsite;
    /**
     * email
     */
    private String email;
    /**
     * 法人代表
     */
    private String leganPerson;
    /**
     * 注册时间
     */
    private Date registrationTime;
    /**
     * 注册资金
     */
    private Integer registrationMoney;
    /**
     * 公司人数
     */
    private Integer number;
    /**
     * 国税号
     */
    private String taxNumber;
    /**
     * 开户行
     */
    private String openingBank;
    /**
     * 银行账号
     */
    private String bankNumber;

    public Integer getCoId() {
        return coId;
    }

    public void setCoId(Integer coId) {
        this.coId = coId;
    }

    public String getCoName() {
        return coName;
    }

    public void setCoName(String coName) {
        this.coName = coName;
    }

    public String getCoBrand() {
        return coBrand;
    }

    public void setCoBrand(String coBrand) {
        this.coBrand = coBrand;
    }

    public String getCoIntroduction() {
        return coIntroduction;
    }

    public void setCoIntroduction(String coIntroduction) {
        this.coIntroduction = coIntroduction;
    }

    public String getCoType() {
        return coType;
    }

    public void setCoType(String coType) {
        this.coType = coType;
    }

    public String getEnglistName() {
        return englistName;
    }

    public void setEnglistName(String englistName) {
        this.englistName = englistName;
    }

    public String getCoAddress() {
        return coAddress;
    }

    public void setCoAddress(String coAddress) {
        this.coAddress = coAddress;
    }

    public String getCoPhone() {
        return coPhone;
    }

    public void setCoPhone(String coPhone) {
        this.coPhone = coPhone;
    }

    public String getPostalNumber() {
        return postalNumber;
    }

    public void setPostalNumber(String postalNumber) {
        this.postalNumber = postalNumber;
    }

    public String getFaxNumber() {
        return faxNumber;
    }

    public void setFaxNumber(String faxNumber) {
        this.faxNumber = faxNumber;
    }

    public String getCoWebsite() {
        return coWebsite;
    }

    public void setCoWebsite(String coWebsite) {
        this.coWebsite = coWebsite;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLeganPerson() {
        return leganPerson;
    }

    public void setLeganPerson(String leganPerson) {
        this.leganPerson = leganPerson;
    }

    public Date getRegistrationTime() {
        return registrationTime;
    }

    public void setRegistrationTime(Date registrationTime) {
        this.registrationTime = registrationTime;
    }

    public Integer getRegistrationMoney() {
        return registrationMoney;
    }

    public void setRegistrationMoney(Integer registrationMoney) {
        this.registrationMoney = registrationMoney;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getTaxNumber() {
        return taxNumber;
    }

    public void setTaxNumber(String taxNumber) {
        this.taxNumber = taxNumber;
    }

    public String getOpeningBank() {
        return openingBank;
    }

    public void setOpeningBank(String openingBank) {
        this.openingBank = openingBank;
    }

    public String getBankNumber() {
        return bankNumber;
    }

    public void setBankNumber(String bankNumber) {
        this.bankNumber = bankNumber;
    }

	@Override
	public String toString() {
		return "EnterpriseArchives [coId=" + coId + ", coName=" + coName + ", coBrand=" + coBrand + ", coIntroduction="
				+ coIntroduction + ", coType=" + coType + ", englistName=" + englistName + ", coAddress=" + coAddress
				+ ", coPhone=" + coPhone + ", postalNumber=" + postalNumber + ", faxNumber=" + faxNumber
				+ ", coWebsite=" + coWebsite + ", email=" + email + ", leganPerson=" + leganPerson
				+ ", registrationTime=" + registrationTime + ", registrationMoney=" + registrationMoney + ", number="
				+ number + ", taxNumber=" + taxNumber + ", openingBank=" + openingBank + ", bankNumber=" + bankNumber
				+ "]";
	}
    
    
}