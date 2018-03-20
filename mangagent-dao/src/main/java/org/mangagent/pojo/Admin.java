package org.mangagent.pojo;

import java.io.Serializable;

/**
 * 管理员
 * @author zhubo
 *
 */
public class Admin implements Serializable {
	
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 管理编号
	 */
	private Integer adminId;
	/**
	 * 管理员名字
	 */
    private String adminName;
    /**
     * 管理员账号
     */
    private String userName;
    /**
     * 密码
     */
    private String passWord;
    /**
     * 颜值
     */
    private String salt;
    /**
     * 账号状态
     */
    private Integer state;

    public Integer getAdminId() {
        return adminId;
    }

    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    public String getAdminName() {
        return adminName;
    }

    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

	@Override
	public String toString() {
		return "Admin [adminId=" + adminId + ", adminName=" + adminName + ", userName=" + userName + ", passWord="
				+ passWord + ", salt=" + salt + ", state=" + state + "]";
	} 
    
}