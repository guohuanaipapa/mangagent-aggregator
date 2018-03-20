package org.mangagent.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.mangagent.dao.SubcompanyArchivesDao;
import org.mangagent.pojo.SubcompanyArchives;
import org.mangagent.service.SubcompanyArchivesService;
import org.springframework.stereotype.Service;

/**
 * 子公司业务实现类
 * @author zhubo
 *
 */
@Service("subcompanyArchivesService")
public class SubcompanyArchivesServiceImpl implements SubcompanyArchivesService {

	@Resource
	private SubcompanyArchivesDao subcompanyArchivesDao;
	 
	public void setSubcompanyArchivesDao(SubcompanyArchivesDao subcompanyArchivesDao) {
		this.subcompanyArchivesDao = subcompanyArchivesDao;
	}
 
	public List<SubcompanyArchives> getByContion(int start, int limit, SubcompanyArchives condition, String column,
			String orderBy) {
		List<SubcompanyArchives> list=subcompanyArchivesDao.getListByCondition(start, limit, condition, column, orderBy);
		return list;
	}

 
	public Integer getCountByContion(SubcompanyArchives sub) {
		Integer count=subcompanyArchivesDao.getCountByCondition(sub);
		return count;
	}

	 
}
