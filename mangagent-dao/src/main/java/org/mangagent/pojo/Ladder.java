package org.mangagent.pojo;

public class Ladder {
    private Integer ladderId;

    private Integer min;

    private Integer max;

    private Double price;

    private Integer ladderType;

    public Integer getLadderId() {
        return ladderId;
    }

    public void setLadderId(Integer ladderId) {
        this.ladderId = ladderId;
    }

    public Integer getMin() {
        return min;
    }

    public void setMin(Integer min) {
        this.min = min;
    }

    public Integer getMax() {
        return max;
    }

    public void setMax(Integer max) {
        this.max = max;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getLadderType() {
        return ladderType;
    }

    public void setLadderType(Integer ladderType) {
        this.ladderType = ladderType;
    }
}