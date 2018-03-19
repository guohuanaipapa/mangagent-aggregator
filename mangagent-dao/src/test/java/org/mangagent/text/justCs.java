package org.mangagent.text;

import static org.junit.Assert.*;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mangagent.dao.SysUserDao;
import org.mangagent.pojo.SysUser;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext-mybatis.xml")
public class justCs {

	@Resource
	private SysUserDao sysUserDao;
	
	public void setSysUserDao(SysUserDao sysUserDao) {
		this.sysUserDao = sysUserDao;
	}

	@Test
	public void testGetByCondition() {
		
		SysUser condition = new SysUser();
		
	
		
		
		List<SysUser> list = sysUserDao.getListByCondition(0, 5, condition, "id", "asc");
		for (SysUser sysUser : list) {
			System.out.println(sysUser.getUsername());
		}
	}
}
