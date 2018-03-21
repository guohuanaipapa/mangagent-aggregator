package org.mangagent.dao;

import java.util.List;

import org.mangagent.pojo.Single;
/**
 * 单栋DAO
 * @author zhubo
 *
 */
public interface SingleDao extends CommonDao<Single, Integer> {
	/**
	 * 根据小区编号查询单元楼
	 * @param id
	 * @return
	 */
	public List<Single> getByresidenceId(Integer id);
}
