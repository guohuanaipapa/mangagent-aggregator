package org.mangagent.pojo;

import java.io.Serializable;
import java.util.List;

/**
 * 单元表
 * @author zhubo
 *
 */
public class Unit implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 单元编号
	 */
	private Integer unitId;
	/**
	 * 单元名
	 */
    private String unitName;
    /**
     * 单栋
     */
    private Single single;
    /**
     * 个户集合
     */
    private List<An> ans;

    public Integer getUnitId() {
        return unitId;
    }

    public void setUnitId(Integer unitId) {
        this.unitId = unitId;
    }

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

	public Single getSingle() {
		return single;
	}

	public void setSingle(Single single) {
		this.single = single;
	}

	public List<An> getAns() {
		return ans;
	}

	public void setAns(List<An> ans) {
		this.ans = ans;
	}

	@Override
	public String toString() {
		return "Unit [unitId=" + unitId + ", unitName=" + unitName + ", single=" + single + ", ans=" + ans + "]";
	}
    
    
}