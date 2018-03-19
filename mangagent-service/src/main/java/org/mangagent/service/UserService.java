package org.mangagent.service;

import java.util.List;

import org.mangagent.pojo.SysUser;

public interface UserService {
 
	public List<SysUser> getList(int start, int size, SysUser condition, String column, String orderBy);
	
	public int getCount(SysUser condition);
}
