package org.mangagent.service;

import java.util.List;

import javax.annotation.Resource;

import org.mangagent.dao.SysUserDao;
import org.mangagent.pojo.SysUser;
import org.springframework.stereotype.Service;
@Service("userService")
public class UserServiceimpl implements UserService {
 
	 @Resource
	 private SysUserDao sysUserDao;
	
	public void setSysUserDao(SysUserDao sysUserDao) {
		this.sysUserDao = sysUserDao;
	}

	public List<SysUser> getList(int start, int size, SysUser condition, String column, String orderBy) {
		// TODO Auto-generated method stub
		return sysUserDao.getListByCondition(start, size, condition, column, orderBy);
	}

	public int getCount(SysUser condition) {
		// TODO Auto-generated method stub
		return sysUserDao.getCountByCondition(condition);
	}

}
