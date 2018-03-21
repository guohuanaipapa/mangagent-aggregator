package org.mangagent.service;

import org.mangagent.pojo.EnterpriseArchives;

/**
 * 企业接口
 * @author zhubo
 *
 */
public interface EnterpriseArchivesService {
	
	/**
	 * 根据编号获得企业
	 * @param id
	 * @return
	 */
	EnterpriseArchives getById(Integer id);
	
}
