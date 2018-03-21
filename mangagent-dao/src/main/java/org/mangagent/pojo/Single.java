package org.mangagent.pojo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
/**
 * 单栋类
 * @author zhubo
 *
 */
public class Single implements Serializable {
    
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 单栋编号
	 */
	private Integer singleId;
	/**
	 * 小区编号
	 */
    private Residence residence;
    
    /**
     *单栋层数
     */
    private Integer singleStoreys;
    /**
     * 单元数量
     */
    private Integer unitNumber;
    
    /**
     * 单元集合
     */
    private List<Unit> units;
    
    /**
     * 结构类型
     */
    private Dictionaries structureType;
    /**
     * 装修标准
     */
    private Dictionaries decorationStandard;
    /**
     * 完损等级
     */
    private Dictionaries lossGrade;
    /**
     * 建筑面积
     */
    private Double buitupArea;
    /**
     * 使用面积
     */
    private Double userArea;
    /**
     * 建筑许可证
     */
    private String buildingPermits;
    /**
     * 预售许可证
     */
    private String presalePermits;
    /**
     * 竣工日期
     */
    private Date completionDate;
    /**
     * 封顶日期
     */
    private Date cappingDate;
    /**
     * 备注
     */
    private String remarks;
    /**
     * 单栋名称
     */
    private String residenceName;
 

    public String getResidenceName() {
		return residenceName;
	}

	public void setResidenceName(String residenceName) {
		this.residenceName = residenceName;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Integer getSingleId() {
        return singleId;
    }

    public void setSingleId(Integer singleId) {
        this.singleId = singleId;
    }

    public Integer getSingleStoreys() {
        return singleStoreys;
    }
    
    

    public List<Unit> getUnits() {
		return units;
	}

	public void setUnits(List<Unit> units) {
		this.units = units;
	}

	public void setSingleStoreys(Integer singleStoreys) {
        this.singleStoreys = singleStoreys;
    }

    public Integer getUnitNumber() {
        return unitNumber;
    }

    public void setUnitNumber(Integer unitNumber) {
        this.unitNumber = unitNumber;
    }

    public Double getBuitupArea() {
        return buitupArea;
    }

    public void setBuitupArea(Double buitupArea) {
        this.buitupArea = buitupArea;
    }

    public Double getUserArea() {
        return userArea;
    }

    public void setUserArea(Double userArea) {
        this.userArea = userArea;
    }

    public String getBuildingPermits() {
        return buildingPermits;
    }

    public void setBuildingPermits(String buildingPermits) {
        this.buildingPermits = buildingPermits;
    }

    public String getPresalePermits() {
        return presalePermits;
    }

    public void setPresalePermits(String presalePermits) {
        this.presalePermits = presalePermits;
    }

    public Date getCompletionDate() {
        return completionDate;
    }

    public void setCompletionDate(Date completionDate) {
        this.completionDate = completionDate;
    }

    public Date getCappingDate() {
        return cappingDate;
    }

    public void setCappingDate(Date cappingDate) {
        this.cappingDate = cappingDate;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

	public Residence getResidence() {
		return residence;
	}

	public void setResidence(Residence residence) {
		this.residence = residence;
	}

	public Dictionaries getStructureType() {
		return structureType;
	}

	public void setStructureType(Dictionaries structureType) {
		this.structureType = structureType;
	}

	public Dictionaries getDecorationStandard() {
		return decorationStandard;
	}

	public void setDecorationStandard(Dictionaries decorationStandard) {
		this.decorationStandard = decorationStandard;
	}

	public Dictionaries getLossGrade() {
		return lossGrade;
	}

	public void setLossGrade(Dictionaries lossGrade) {
		this.lossGrade = lossGrade;
	}

	@Override
	public String toString() {
		return "Single [singleId=" + singleId + ", residence=" + residence + ", singleStoreys=" + singleStoreys
				+ ", unitNumber=" + unitNumber + ", units=" + units + ", structureType=" + structureType
				+ ", decorationStandard=" + decorationStandard + ", lossGrade=" + lossGrade + ", buitupArea="
				+ buitupArea + ", userArea=" + userArea + ", buildingPermits=" + buildingPermits + ", presalePermits="
				+ presalePermits + ", completionDate=" + completionDate + ", cappingDate=" + cappingDate + ", remarks="
				+ remarks + ", residenceName=" + residenceName + "]";
	}
    
    
}