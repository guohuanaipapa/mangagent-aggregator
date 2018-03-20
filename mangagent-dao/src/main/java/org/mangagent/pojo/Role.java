package org.mangagent.pojo;

import java.io.Serializable;
/**
 * 角色编号
 * @author zhubo
 *
 */
public class Role implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * 角色编号
	 */
	private Integer roleId;
	
	/**
	 * 角色名称
	 */
    private String roleName;
    /**
     * 角色状态
     */
    private Integer roleState;

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public Integer getRoleState() {
        return roleState;
    }

    public void setRoleState(Integer roleState) {
        this.roleState = roleState;
    }

	@Override
	public String toString() {
		return "Role [roleId=" + roleId + ", roleName=" + roleName + ", roleState=" + roleState + "]";
	}
    
    
}