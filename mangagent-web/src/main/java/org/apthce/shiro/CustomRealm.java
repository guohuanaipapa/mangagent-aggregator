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
 

public class CustomRealm extends AuthorizingRealm {
   
	/*private SysUserDao sysUserDao;
    private SysPermissionDao sysPermissionDao;
	public void setSysUserDao(SysUserDao sysUserDao) {
		this.sysUserDao = sysUserDao;
	}

	public void setSysPermissionDao(SysPermissionDao sysPermissionDao) {
		this.sysPermissionDao = sysPermissionDao;
	}*/
    /**
     * 授权
     */
	@Override
	protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
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
		/*String principals=(String)token.getPrincipal(); //获取身份
		SysUser sysUser=sysUserDao.getByUsername(principals);
		if(sysUser==null){
			return null;
		}
		return new SimpleAuthenticationInfo(sysUser,sysUser.getPassword(),ByteSource.Util.bytes(sysUser.getSalt()),this.getName());*/
		return null;
	}

}
