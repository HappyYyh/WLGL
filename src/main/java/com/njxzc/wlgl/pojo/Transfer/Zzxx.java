package com.njxzc.wlgl.pojo.Transfer;

import java.util.Date;

public class Zzxx {
    private Integer id;

    private String goodsBillCode;

    private String transferStation;

    private String transferCheck;

    private Date checkTime;

    private String description;

    private String transferCompany;

    private String transferAddr;

    private String transferStationTel;

    private String transferFee;

    private String afterTransferBill;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGoodsBillCode() {
        return goodsBillCode;
    }

    public void setGoodsBillCode(String goodsBillCode) {
        this.goodsBillCode = goodsBillCode == null ? null : goodsBillCode.trim();
    }

    public String getTransferStation() {
        return transferStation;
    }

    public void setTransferStation(String transferStation) {
        this.transferStation = transferStation == null ? null : transferStation.trim();
    }

    public String getTransferCheck() {
        return transferCheck;
    }

    public void setTransferCheck(String transferCheck) {
        this.transferCheck = transferCheck == null ? null : transferCheck.trim();
    }

    public Date getCheckTime() {
        return checkTime;
    }

    public void setCheckTime(Date checkTime) {
        this.checkTime = checkTime;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public String getTransferCompany() {
        return transferCompany;
    }

    public void setTransferCompany(String transferCompany) {
        this.transferCompany = transferCompany == null ? null : transferCompany.trim();
    }

    public String getTransferAddr() {
        return transferAddr;
    }

    public void setTransferAddr(String transferAddr) {
        this.transferAddr = transferAddr == null ? null : transferAddr.trim();
    }

    public String getTransferStationTel() {
        return transferStationTel;
    }

    public void setTransferStationTel(String transferStationTel) {
        this.transferStationTel = transferStationTel == null ? null : transferStationTel.trim();
    }

    public String getTransferFee() {
        return transferFee;
    }

    public void setTransferFee(String transferFee) {
        this.transferFee = transferFee == null ? null : transferFee.trim();
    }

    public String getAfterTransferBill() {
        return afterTransferBill;
    }

    public void setAfterTransferBill(String afterTransferBill) {
        this.afterTransferBill = afterTransferBill == null ? null : afterTransferBill.trim();
    }

    @Override
    public String toString() {
        return "Zzxx{" +
                "id=" + id +
                ", goodsBillCode='" + goodsBillCode + '\'' +
                ", transferStation='" + transferStation + '\'' +
                ", transferCheck='" + transferCheck + '\'' +
                ", checkTime=" + checkTime +
                ", description='" + description + '\'' +
                ", transferCompany='" + transferCompany + '\'' +
                ", transferAddr='" + transferAddr + '\'' +
                ", transferStationTel='" + transferStationTel + '\'' +
                ", transferFee='" + transferFee + '\'' +
                ", afterTransferBill='" + afterTransferBill + '\'' +
                '}';
    }
}