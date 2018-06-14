package com.njxzc.wlgl.pojo.cost_accounting;

import java.util.Date;

/**
 * 营业外收入
 * name：事件名称
 * money：金额
 * incomeMonth：收入月份
 * writeDate：填写日期
 */
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

    public Yywsr(Integer id, String name, Double money, Date incomeMonth, Date writeDate) {
        this.id = id;
        this.name = name;
        this.money = money;
        this.incomeMonth = incomeMonth;
        this.writeDate = writeDate;
    }

    public Yywsr() {
    }

    @Override
    public String toString() {
        return "Yywsr{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", money=" + money +
                ", incomeMonth=" + incomeMonth +
                ", writeDate=" + writeDate +
                '}';
    }
}