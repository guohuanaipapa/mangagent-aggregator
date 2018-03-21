package org.mangagent.dao;

import java.util.List;

import org.mangagent.pojo.SubcompanyArchives;
/**
 * 子公司DAO
 * @author zhubo
 *
 */
public interface SubcompanyArchivesDao extends CommonDao<SubcompanyArchives, Integer> {
	 /**
	  * 查询所属子公司
	  * @param id
	  * @return
	  */
	public List<SubcompanyArchives> getByEnterpriseArchivesId(Integer id);
}
