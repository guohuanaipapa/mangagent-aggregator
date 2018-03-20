package org.mangagent.pojo;

import java.io.Serializable;
/**
 * 子公司实体类
 * @author zhubo
 *
 */
public class SubcompanyArchives implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 子公司编号
	 */
	private Integer subId;
	/**
	 * 子公司名字
	 */
    private String subName;
    /**
     * 公司简介
     */
    private String subintroduction;
    /**
     * 公司地址
     */
    private String subAddress;
    /**
     * 邮政编码
     */
    private String postalCode;
    /**
     * 邮箱
     */
    private String email;
    /**
     * 联系方式
     */
    private String phone;
    /**
     * 传真
     */
    private String fax;
    /**
     * 开户行
     */
    private String openingBank;
    /**
     * 银行账户
     */
    private String bankNumber;
    /**
     * 备注
     */
    private String remarks;

    public Integer getSubId() {
        return subId;
    }

    public void setSubId(Integer subId) {
        this.subId = subId;
    }

    public String getSubName() {
        return subName;
    }

    public void setSubName(String subName) {
        this.subName = subName;
    }

    public String getSubintroduction() {
        return subintroduction;
    }

    public void setSubintroduction(String subintroduction) {
        this.subintroduction = subintroduction;
    }

    public String getSubAddress() {
        return subAddress;
    }

    public void setSubAddress(String subAddress) {
        this.subAddress = subAddress;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
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

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

	@Override
	public String toString() {
		return "SubcompanyArchives [subId=" + subId + ", subName=" + subName + ", subintroduction=" + subintroduction
				+ ", subAddress=" + subAddress + ", postalCode=" + postalCode + ", email=" + email + ", phone=" + phone
				+ ", fax=" + fax + ", openingBank=" + openingBank + ", bankNumber=" + bankNumber + ", remarks="
				+ remarks + "]";
	}
    
    
}