package org.mangagent.dao;

import org.apache.ibatis.annotations.Param;
import org.mangagent.pojo.Admin;

/**
 * 管理员DAO
 * @author zhubo
 *
 */
public interface AdminDao extends CommonDao<Admin, Integer>{
	
	/**
	 * 验证登陆
	 * @param userName 账号
	 * @return
	 */
	Admin checkLand(@Param("userName")String userName);
}
