package com.njxzc.wlgl.pojo.cost_accounting;

import java.util.Date;

public class Syyb {
    private Integer ID;

    private String category;

    private String midCategory;

    private String subType;

    private Double money;

    private Date statStartDate;

    private Date statEndDate;

    private Date balanceDate;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category == null ? null : category.trim();
    }

    public String getMidCategory() {
        return midCategory;
    }

    public void setMidCategory(String midCategory) {
        this.midCategory = midCategory == null ? null : midCategory.trim();
    }

    public String getSubType() {
        return subType;
    }

    public void setSubType(String subType) {
        this.subType = subType == null ? null : subType.trim();
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public Date getStatStartDate() {
        return statStartDate;
    }

    public void setStatStartDate(Date statStartDate) {
        this.statStartDate = statStartDate;
    }

    public Date getStatEndDate() {
        return statEndDate;
    }

    public void setStatEndDate(Date statEndDate) {
        this.statEndDate = statEndDate;
    }

    public Date getBalanceDate() {
        return balanceDate;
    }

    public void setBalanceDate(Date balanceDate) {
        this.balanceDate = balanceDate;
    }
}