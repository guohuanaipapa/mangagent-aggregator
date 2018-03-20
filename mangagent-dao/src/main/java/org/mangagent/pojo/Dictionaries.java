package org.mangagent.pojo;

import java.io.Serializable;
/**
 * 数据字典类
 * @author zhubo
 *
 */
public class Dictionaries implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * 字典编号
	 */
	private Integer dictionariesId;
	/**
	 * 名称
	 */
    private String dictionariesName;
    
    /**
     * 父级id
     */
    private Integer parentId;
    /**
     * 排序编号
     */
    private Integer order;

    public Integer getDictionariesId() {
        return dictionariesId;
    }

    public void setDictionariesId(Integer dictionariesId) {
        this.dictionariesId = dictionariesId;
    }

    public String getDictionariesName() {
        return dictionariesName;
    }

    public void setDictionariesName(String dictionariesName) {
        this.dictionariesName = dictionariesName;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

	public Integer getOrder() {
		return order;
	}

	public void setOrder(Integer order) {
		this.order = order;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Dictionaries [dictionariesId=" + dictionariesId + ", dictionariesName=" + dictionariesName
				+ ", parentId=" + parentId + ", order=" + order + "]";
	}
    
}