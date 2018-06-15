package com.njxzc.wlgl.pojo.cost_accounting;

import java.util.Date;

/**
 * 赔偿信息
 * amends:赔偿费
 * customer:客户名称------>t_25khjbxx客户信息表
 * amendsTime:赔偿时间
 * remark:备注
 * receiveStationID:收货点ID
 * badDestroyGoods:货差货损,（价格）
 * receiveStationName：收货点名
 * writeDate：填写日期
 */
public class Pcxx {
    private Integer id;

    private Double amends;

    private String customer;

    private Date amendsTime;

    private String remark;

    private Integer receiveStationID;

    private Double badDestroyGoods;

    private String receiveStationName;

    private Date writeDate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getAmends() {
        return amends;
    }

    public void setAmends(Double amends) {
        this.amends = amends;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer == null ? null : customer.trim();
    }

    public Date getAmendsTime() {
        return amendsTime;
    }

    public void setAmendsTime(Date amendsTime) {
        this.amendsTime = amendsTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Integer getReceiveStationID() {
        return receiveStationID;
    }

    public void setReceiveStationID(Integer receiveStationID) {
        this.receiveStationID = receiveStationID;
    }

    public Double getBadDestroyGoods() {
        return badDestroyGoods;
    }

    public void setBadDestroyGoods(Double badDestroyGoods) {
        this.badDestroyGoods = badDestroyGoods;
    }

    public String getReceiveStationName() {
        return receiveStationName;
    }

    public void setReceiveStationName(String receiveStationName) {
        this.receiveStationName = receiveStationName == null ? null : receiveStationName.trim();
    }

    public Date getWriteDate() {
        return writeDate;
    }

    public void setWriteDate(Date writeDate) {
        this.writeDate = writeDate;
    }

    @Override
    public String toString() {
        return "Pcxx{" +
                "id=" + id +
                ", amends=" + amends +
                ", customer='" + customer + '\'' +
                ", amendsTime=" + amendsTime +
                ", remark='" + remark + '\'' +
                ", receiveStationID=" + receiveStationID +
                ", badDestroyGoods=" + badDestroyGoods +
                ", receiveStationName='" + receiveStationName + '\'' +
                ", writeDate=" + writeDate +
                '}';
    }
}