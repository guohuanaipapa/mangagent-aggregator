package org.mangagent.pojo;

import java.io.Serializable;

/**
 * 权限类
 * @author zhubo
 *
 */
public class Permission implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * 权限编号
	 */
	private Integer permissionId;
	/**
	 * 权限名称
	 */
    private String permissionName;
    /**
     * 权限类型
     */
    private String permissionType;
    /**
     * url
     */
    private String url;
    /**
     * 权限代码字段
     */
    private String percode;
    /**
     * 父权限编号
     */
    private Integer parentId;
    /**
     * 父权限列表
     */
    private String parentIds;
    /**
     * 排序号
     */
    private Integer sort;
    /**
     * 状态
     */
    private Integer state;

    public Integer getPermissionId() {
        return permissionId;
    }

    public void setPermissionId(Integer permissionId) {
        this.permissionId = permissionId;
    }

    public String getPermissionName() {
        return permissionName;
    }

    public void setPermissionName(String permissionName) {
        this.permissionName = permissionName;
    }

    public String getPermissionType() {
        return permissionType;
    }

    public void setPermissionType(String permissionType) {
        this.permissionType = permissionType;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPercode() {
        return percode;
    }

    public void setPercode(String percode) {
        this.percode = percode;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getParentIds() {
        return parentIds;
    }

    public void setParentIds(String parentIds) {
        this.parentIds = parentIds;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

	@Override
	public String toString() {
		return "Permission [permissionId=" + permissionId + ", permissionName=" + permissionName + ", permissionType="
				+ permissionType + ", url=" + url + ", percode=" + percode + ", parentId=" + parentId + ", parentIds="
				+ parentIds + ", sort=" + sort + ", state=" + state + "]";
	}
    
}