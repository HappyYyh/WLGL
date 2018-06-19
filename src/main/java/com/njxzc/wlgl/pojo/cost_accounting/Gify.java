package com.njxzc.wlgl.pojo.cost_accounting;

import java.util.Date;

public class Gify {
    private Integer id;

    private Double officeFee;

    private Double houseRent;

    private Double waterElecFee;

    private Double phoneFee;

    private Double otherPayout;

    private Date payoutMonth;

    private Date writeDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getOfficeFee() {
        return officeFee;
    }

    public void setOfficeFee(Double officeFee) {
        this.officeFee = officeFee;
    }

    public Double getHouseRent() {
        return houseRent;
    }

    public void setHouseRent(Double houseRent) {
        this.houseRent = houseRent;
    }

    public Double getWaterElecFee() {
        return waterElecFee;
    }

    public void setWaterElecFee(Double waterElecFee) {
        this.waterElecFee = waterElecFee;
    }

    public Double getPhoneFee() {
        return phoneFee;
    }

    public void setPhoneFee(Double phoneFee) {
        this.phoneFee = phoneFee;
    }

    public Double getOtherPayout() {
        return otherPayout;
    }

    public void setOtherPayout(Double otherPayout) {
        this.otherPayout = otherPayout;
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
        return "Gify{" +
                "officeFee=" + officeFee +
                ", houseRent=" + houseRent +
                ", waterElecFee=" + waterElecFee +
                ", phoneFee=" + phoneFee +
                ", otherPayout=" + otherPayout +
                ", payoutMonth=" + payoutMonth +
                ", writeDate=" + writeDate +
                '}';
    }
}