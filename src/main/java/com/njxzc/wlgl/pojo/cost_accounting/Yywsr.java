package com.njxzc.wlgl.pojo.cost_accounting;

import java.util.Date;

public class Yywsr {
    private Integer id;

    private String name;

    private Double money;

    private Date incomeMonth;

    private Date writeDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public Date getIncomeMonth() {
        return incomeMonth;
    }

    public void setIncomeMonth(Date incomeMonth) {
        this.incomeMonth = incomeMonth;
    }

    public Date getWriteDate() {
        return writeDate;
    }

    public void setWriteDate(Date writeDate) {
        this.writeDate = writeDate;
    }
}