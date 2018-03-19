package org.mangagement.text;

import static org.junit.Assert.*;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mangagent.pojo.SysUser;
import org.mangagent.service.UserService;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:supermarket-service.xml","classpath:applicationContext-mybatis.xml"})
public class adada {

	 @Resource
	 private UserService UserService;
	 
	public void setUserService(UserService userService) {
		UserService = userService;
	}

	@Test
	public void test() {
		List<SysUser> list=UserService.getList(0, 5, null, "id", "asc");
		
		for (SysUser sysUser : list) {
			System.out.println(sysUser.getUsername());
		}
	}

}
