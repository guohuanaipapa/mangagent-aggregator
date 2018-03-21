package org.apthce.shiro;

import java.util.List;


import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.mangagent.dao.AdminDao;
import org.mangagent.pojo.Admin;
import org.mangagent.service.AdminService;
 

public class CustomRealm extends AuthorizingRealm {
   
	private AdminService adminService;
	public void setAdminService(AdminService adminService) {
		this.adminService = adminService;
	}
	/**
     * 授权
     */
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {

//		SysUser user=(SysUser)principals.getPrimaryPrincipal();
//		List<String>list=sysPermissionDao.getPermissionCodeByUserId(user.getId());
//	    SimpleAuthorizationInfo info=new SimpleAuthorizationInfo();
//	    info.addStringPermissions(list);
//		return info;

		/*SysUser user=(SysUser)principals.getPrimaryPrincipal();
		List<String>list=sysPermissionDao.getPermissionCodeByUserId(user.getId());
	    SimpleAuthorizationInfo info=new SimpleAuthorizationInfo();
	    info.addStringPermissions(list);
		return info;*/
		
		
		return null;
	}
    /**
     * 认证
     */
	@Override
	protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
		String principals=(String)token.getPrincipal(); //获取身份
		Admin admin=adminService.land(principals);
		
		if(admin==null) {
			return null;
		}
		System.out.println(admin.getUserName());
		return new SimpleAuthenticationInfo(admin,admin.getPassWord(),ByteSource.Util.bytes(admin.getSalt()),this.getName());
	}


}
