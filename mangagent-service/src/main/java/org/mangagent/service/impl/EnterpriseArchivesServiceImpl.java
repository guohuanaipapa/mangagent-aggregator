package org.mangagent.service.impl;

import javax.annotation.Resource;

import org.mangagent.dao.EnterpriseArchivesDao;
import org.mangagent.pojo.EnterpriseArchives;
import org.mangagent.service.EnterpriseArchivesService;
import org.springframework.stereotype.Service;

/**
 * 企业业务实现类
 * @author zhubo
 *
 */
@Service("enterpriseArchivesService")
public class EnterpriseArchivesServiceImpl implements EnterpriseArchivesService {

	@Resource
	private EnterpriseArchivesDao enterpriseArchivesDao;
	 
	public void setEnterpriseArchivesDao(EnterpriseArchivesDao enterpriseArchivesDao) {
		this.enterpriseArchivesDao = enterpriseArchivesDao;
	}




	public EnterpriseArchives getById(Integer id) {
		EnterpriseArchives enterpriseArchives=enterpriseArchivesDao.getById(id);
		return enterpriseArchives;
	}

	

}
