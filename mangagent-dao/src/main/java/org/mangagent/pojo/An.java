package org.mangagent.pojo;

import java.io.Serializable;

/**
 * 个户类
 * @author zhubo
 *
 */
public class An implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 个户编号
	 */
	private Integer anId;
	/**
	 * 所属小区
	 */
    private Residence residence;
    /**
     * 所属栋
     */
    private Single single;
    /**
     * 所属单元
     */
    private Unit unit;
    /**
     * 业主
     */
    private User user;
    
    /**
     * 个户面积
     */
    private Double unitArea;
    /**
     * 户型编号
     */
    private Dictionaries layout;
    /**
     * 朝向
     */
    private Dictionaries orientation;
    /**
     * 装修
     */
    private Dictionaries renovation;
    /**
     * 本层楼层
     */
    private Integer floors;
    /**
     * 建筑面积
     */
    private Double builtupArea;
    /**
     * 使用面积
     */
    private Double useArea;
    /**
     * 阁楼面积
     */
    private Double atticArea;
    /**
     * 储藏室面积
     */
    private Double storageRoomArea;
    /**
     * 房间类型
     */
    private Dictionaries roomType;
    /**
     * 房间状态
     */
    private Integer roomState;
    /**
     * 备注
     */
    private String remarks;

    public Integer getAnId() {
        return anId;
    }

    public void setAnId(Integer anId) {
        this.anId = anId;
    }

    public Double getUnitArea() {
        return unitArea;
    }

    public void setUnitArea(Double unitArea) {
        this.unitArea = unitArea;
    }

    public Integer getFloors() {
        return floors;
    }

    public void setFloors(Integer floors) {
        this.floors = floors;
    }

    public Double getBuiltupArea() {
        return builtupArea;
    }

    public void setBuiltupArea(Double builtupArea) {
        this.builtupArea = builtupArea;
    }

    public Double getUseArea() {
        return useArea;
    }

    public void setUseArea(Double useArea) {
        this.useArea = useArea;
    }

    public Double getAtticArea() {
        return atticArea;
    }

    public void setAtticArea(Double atticArea) {
        this.atticArea = atticArea;
    }

    public Double getStorageRoomArea() {
        return storageRoomArea;
    }

    public void setStorageRoomArea(Double storageRoomArea) {
        this.storageRoomArea = storageRoomArea;
    }

    public Integer getRoomState() {
        return roomState;
    }

    public void setRoomState(Integer roomState) {
        this.roomState = roomState;
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

	public Single getSingle() {
		return single;
	}

	public void setSingle(Single single) {
		this.single = single;
	}

	public Unit getUnit() {
		return unit;
	}

	public void setUnit(Unit unit) {
		this.unit = unit;
	}

	public Dictionaries getLayout() {
		return layout;
	}

	public void setLayout(Dictionaries layout) {
		this.layout = layout;
	}

	public Dictionaries getOrientation() {
		return orientation;
	}

	public void setOrientation(Dictionaries orientation) {
		this.orientation = orientation;
	}

	public Dictionaries getRenovation() {
		return renovation;
	}

	public void setRenovation(Dictionaries renovation) {
		this.renovation = renovation;
	}

	public Dictionaries getRoomType() {
		return roomType;
	}

	public void setRoomType(Dictionaries roomType) {
		this.roomType = roomType;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "An [anId=" + anId + ", residence=" + residence + ", single=" + single + ", unit=" + unit + ", user="
				+ user + ", unitArea=" + unitArea + ", layout=" + layout + ", orientation=" + orientation
				+ ", renovation=" + renovation + ", floors=" + floors + ", builtupArea=" + builtupArea + ", useArea="
				+ useArea + ", atticArea=" + atticArea + ", storageRoomArea=" + storageRoomArea + ", roomType="
				+ roomType + ", roomState=" + roomState + ", remarks=" + remarks + "]";
	}
    
    
}