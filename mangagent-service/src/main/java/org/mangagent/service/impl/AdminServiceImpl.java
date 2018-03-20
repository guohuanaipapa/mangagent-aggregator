package org.mangagent.service.impl;

import javax.annotation.Resource;

import org.mangagent.dao.AdminDao;
import org.mangagent.pojo.Admin;
import org.mangagent.service.AdminService;
import org.springframework.stereotype.Service;

/**
 * 管理员业务实现类
 * @author zhubo
 *
 */
@Service("adminService")
public class AdminServiceImpl implements AdminService {

	@Resource
	private AdminDao adminDao;
	 
	public void setAdminDao(AdminDao adminDao) {
		this.adminDao = adminDao;
	}
 
	/**
	 * 验证登陆
	 */
	public Admin land(String userCode) {
		Admin admin=adminDao.checkLand(userCode);
		return admin;
	}

}
