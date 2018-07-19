package com.pythe.pojo;

public class TblTeacherAccount {
    private Long userId;

    private Double amount;

    private Double inAmount;

    private Double outAmount;

    private Integer level;

    private Double givingAmount;

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Double getInAmount() {
        return inAmount;
    }

    public void setInAmount(Double inAmount) {
        this.inAmount = inAmount;
    }

    public Double getOutAmount() {
        return outAmount;
    }

    public void setOutAmount(Double outAmount) {
        this.outAmount = outAmount;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Double getGivingAmount() {
        return givingAmount;
    }

    public void setGivingAmount(Double givingAmount) {
        this.givingAmount = givingAmount;
    }
}