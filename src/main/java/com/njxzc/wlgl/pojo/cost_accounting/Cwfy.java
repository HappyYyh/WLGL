package com.njxzc.wlgl.pojo.cost_accounting;

import java.util.Date;

public class Cwfy {
    private Integer id;

    private Double financeFee;

    private Date payoutMonth;

    private Date writeDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getFinanceFee() {
        return financeFee;
    }

    public void setFinanceFee(Double financeFee) {
        this.financeFee = financeFee;
    }

    public Date getPayoutMonth() {
        return payoutMonth;
    }

    public void setPayoutMonth(Date payoutMonth) {
        this.payoutMonth = payoutMonth;
    }

    public Date getWriteDate() {
        return writeDate;
    }

    public void setWriteDate(Date writeDate) {
        this.writeDate = writeDate;
    }

    @Override
    public String toString() {
        return "Cwfy{" +
                "id=" + id +
                ", financeFee=" + financeFee +
                ", payoutMonth=" + payoutMonth +
                ", writeDate=" + writeDate +
                '}';
    }

    public Cwfy() {
    }

    public Cwfy(Integer id, Double financeFee, Date payoutMonth, Date writeDate) {
        this.id = id;
        this.financeFee = financeFee;
        this.payoutMonth = payoutMonth;
        this.writeDate = writeDate;
    }
}