package org.mangagement.text;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mangagent.dao.EnterpriseArchivesDao;
import org.mangagent.service.EnterpriseArchivesService;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:supermarket-service.xml","classpath:applicationContext-mybatis.xml"})
public class test {
	@Resource
	private EnterpriseArchivesService enterpriseArchivesService;
									   
	public void setEnterpriseArchivesService(EnterpriseArchivesService enterpriseArchivesService) {
		this.enterpriseArchivesService = enterpriseArchivesService;
	}
	@Test
	public void test() {
		 System.out.println(enterpriseArchivesService.getById(1));
	}

}
