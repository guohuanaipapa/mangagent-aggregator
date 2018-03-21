package org.mangagent.pojo;

import java.io.Serializable;
import java.util.List;

/**
 *小区表
 * @author zhubo
 *
 */
public class Residence implements Serializable {
     
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * 小区编号
	 */
	private Integer residenceId;
	/**
	 * 所属子公司
	 */
    private SubcompanyArchives sub;
    /**
     * 小区名字
     */
    private String residenceName;
    /**
     * 占地面积
     */
    private Double areaCovered;
    /**
     * 建筑面积
     */
    private Double builtupArea;
    /**
     * 绿地面积
     */
    private Double greenArea;
    /**
     * 道路面积
     */
    private Double roadArea;
    /**
     * 小区位置
     */
    private String residenceAddress;
    /**
     * 楼宇数量
     */
    private Integer buildings;
    /**
     * 负责人
     */
    private String person;
    /**
     * 练习方式
     */
    private String phone;
    /**
     * 开发商
     */
    private Developers developers;
    
    /**
     * 小区下的所有楼宇集合
     */
    private List<Single> singles;
     
    public List<Single> getSingles() {
		return singles;
	}

	public void setSingles(List<Single> singles) {
		this.singles = singles;
	}

	public Integer getResidenceId() {
        return residenceId;
    }

    public void setResidenceId(Integer residenceId) {
        this.residenceId = residenceId;
    }

    public String getResidenceName() {
        return residenceName;
    }

    public void setResidenceName(String residenceName) {
        this.residenceName = residenceName;
    }

    public Double getAreaCovered() {
        return areaCovered;
    }

    public void setAreaCovered(Double areaCovered) {
        this.areaCovered = areaCovered;
    }

    public Double getBuiltupArea() {
        return builtupArea;
    }

    public void setBuiltupArea(Double builtupArea) {
        this.builtupArea = builtupArea;
    }

    public Double getGreenArea() {
        return greenArea;
    }

    public void setGreenArea(Double greenArea) {
        this.greenArea = greenArea;
    }

    public Double getRoadArea() {
        return roadArea;
    }

    public void setRoadArea(Double roadArea) {
        this.roadArea = roadArea;
    }

    public String getResidenceAddress() {
        return residenceAddress;
    }

    public void setResidenceAddress(String residenceAddress) {
        this.residenceAddress = residenceAddress;
    }

    public Integer getBuildings() {
        return buildings;
    }

    public void setBuildings(Integer buildings) {
        this.buildings = buildings;
    }

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

	public SubcompanyArchives getSub() {
		return sub;
	}

	public void setSub(SubcompanyArchives sub) {
		this.sub = sub;
	}

	public Developers getDevelopers() {
		return developers;
	}

	public void setDevelopers(Developers developers) {
		this.developers = developers;
	}

	@Override
	public String toString() {
		return "Residence [residenceId=" + residenceId + ", sub=" + sub + ", residenceName=" + residenceName
				+ ", areaCovered=" + areaCovered + ", builtupArea=" + builtupArea + ", greenArea=" + greenArea
				+ ", roadArea=" + roadArea + ", residenceAddress=" + residenceAddress + ", buildings=" + buildings
				+ ", person=" + person + ", phone=" + phone + ", developers=" + developers + ", singles=" + singles
				+ "]";
	}
     
    
}