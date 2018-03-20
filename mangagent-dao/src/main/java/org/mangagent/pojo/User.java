package org.mangagent.pojo;

import java.io.Serializable;

/**
 * 业主信息类
 * @author zhubo
 *
 */
public class User implements Serializable {
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * 业主编号
	 */
	private Integer userId;
	
	/**
	 * 业主编码
	 */
    private String userCode;
    /**
     * 颜值
     */
    private String salt;
    /**
     * 密码
     */
    private String passWord;
    /**
     * 用户头像
     */
    private String userPhot;
    /**
     * 用户名
     */
    private String userName;
    /**
     * 性别
     */
    private Integer sex;
    /**
     * 民族
     */
    private String nation;
    /**
     * 身份证号
     */
    private String ID;
    /**
     * 联系方式
     */
    private String phone;
    /**
     * 籍贯
     */
    private String origin;
    /**
     * 工作地址
     */
    private String workAddress;
    /**
     * 学历
     */
    private Dictionaries education;
    /**
     * 银行账户
     */
    private String bank;
    /**
     * 开户行
     */
    private String openingBank;
    /**
     * 联系地址
     */
    private String contactAddress;
    /**
     * 邮政编号
     */
    private String postalNumber;
    /**
     * 所在派出所
     */
    private String policeStation;
    /**
     * 紧急联系人
     */
    private String emergencyContact;
    /**
     * 紧急联系地址
     */
    private String emergencyContactAddress;
    /**
     * 紧急联系电话
     */
    private String emergencyContactPhone;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getUserPhot() {
        return userPhot;
    }

    public void setUserPhot(String userPhot) {
        this.userPhot = userPhot;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getNation() {
        return nation;
    }

    public void setNation(String nation) {
        this.nation = nation;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getWorkAddress() {
        return workAddress;
    }

    public void setWorkAddress(String workAddress) {
        this.workAddress = workAddress;
    }

    public String getBank() {
        return bank;
    }

    public void setBank(String bank) {
        this.bank = bank;
    }

    public String getOpeningBank() {
        return openingBank;
    }

    public void setOpeningBank(String openingBank) {
        this.openingBank = openingBank;
    }

    public String getContactAddress() {
        return contactAddress;
    }

    public void setContactAddress(String contactAddress) {
        this.contactAddress = contactAddress;
    }

    public String getPostalNumber() {
        return postalNumber;
    }

    public void setPostalNumber(String postalNumber) {
        this.postalNumber = postalNumber;
    }

    public String getPoliceStation() {
        return policeStation;
    }

    public void setPoliceStation(String policeStation) {
        this.policeStation = policeStation;
    }

    public String getEmergencyContact() {
        return emergencyContact;
    }

    public void setEmergencyContact(String emergencyContact) {
        this.emergencyContact = emergencyContact;
    }

    public String getEmergencyContactAddress() {
        return emergencyContactAddress;
    }

    public void setEmergencyContactAddress(String emergencyContactAddress) {
        this.emergencyContactAddress = emergencyContactAddress;
    }

    public String getEmergencyContactPhone() {
        return emergencyContactPhone;
    }
    
    

    public Dictionaries getEducation() {
		return education;
	}

	public void setEducation(Dictionaries education) {
		this.education = education;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public void setEmergencyContactPhone(String emergencyContactPhone) {
        this.emergencyContactPhone = emergencyContactPhone;
    }

	@Override
	public String toString() {
		return "User [userId=" + userId + ", userCode=" + userCode + ", salt=" + salt + ", passWord=" + passWord
				+ ", userPhot=" + userPhot + ", userName=" + userName + ", sex=" + sex + ", nation=" + nation + ", ID="
				+ ID + ", phone=" + phone + ", origin=" + origin + ", workAddress=" + workAddress + ", education="
				+ education + ", bank=" + bank + ", openingBank=" + openingBank + ", contactAddress=" + contactAddress
				+ ", postalNumber=" + postalNumber + ", policeStation=" + policeStation + ", emergencyContact="
				+ emergencyContact + ", emergencyContactAddress=" + emergencyContactAddress + ", emergencyContactPhone="
				+ emergencyContactPhone + "]";
	}
	
	
}