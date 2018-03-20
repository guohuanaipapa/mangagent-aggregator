package org.mangagent.service;

import java.util.List;

import org.mangagent.pojo.SubcompanyArchives;

/**
 * 子公司的业务类
 * @author zhubo
 *
 */
public interface SubcompanyArchivesService {
	
	/**
	 * 根据条件获得分页数据
	 * @param last
	 * @param fast
	 * @param sub
	 * @param columnName
	 * @param order
	 * @return
	 */
	List<SubcompanyArchives> getByContion(int last,int fast,SubcompanyArchives sub,String columnName,String order);
	
	/**
	 * 根据条件获得总条数
	 * @param sub
	 * @return
	 */
	Integer getCountByContion(SubcompanyArchives sub);

}
