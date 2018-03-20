package org.mangagent.service;

import org.mangagent.pojo.Admin;

/**
 * 管理员业务类
 */
public interface AdminService {
	
	/**
	 * 管理员登录
	 * @param userCode
	 * @return
	 */
	Admin land(String userCode);
	
	
	
}
