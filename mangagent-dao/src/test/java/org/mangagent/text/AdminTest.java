package org.mangagent.text;

import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mangagent.dao.AdminDao;
import org.mangagent.dao.EnterpriseArchivesDao;
import org.mangagent.dao.SubcompanyArchivesDao;
import org.mangagent.pojo.Admin;
import org.mangagent.pojo.EnterpriseArchives;
import org.mangagent.pojo.SubcompanyArchives;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext-mybatis.xml")
public class AdminTest {
	
	@Resource
	private AdminDao adminDao;
	
	@Resource
	private EnterpriseArchivesDao enterpriseArchivesDao;
	 
	@Resource
	private SubcompanyArchivesDao subcompanyArchivesDao;
	
	public void setAdminDao(AdminDao adminDao) {
		this.adminDao = adminDao;
	}

	
	/**
	 * 管理登陆
	 */
	@Test
	public void load() {
		Admin admin= adminDao.checkLand("wuzhubo");
		 System.out.println(admin);
	}
	
	
	/**
	 * 企业列表
	 */
	@Test
	public void getEnter() {
		EnterpriseArchives enterpriseArchives=enterpriseArchivesDao.getById(1);
		System.out.println(enterpriseArchives);
	}
	
	/**
	 * 子公司列表
	 */
	@Test
	public void SubList() {
		List<SubcompanyArchives> list=subcompanyArchivesDao.getListByCondition(0, 5, null, "subName", "asc");
		for (SubcompanyArchives subcompanyArchives : list) {
			System.out.println(subcompanyArchives);
		}
		System.out.println(subcompanyArchivesDao.getCountByCondition(null));
	
	}

}
