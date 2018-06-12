package com.njxzc.wlgl.pojo.application;

public class Cskc {
    private Integer id;

    private Integer cityID;

    private String rangeCity;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCityID() {
        return cityID;
    }

    public void setCityID(Integer cityID) {
        this.cityID = cityID;
    }

    public String getRangeCity() {
        return rangeCity;
    }

    public void setRangeCity(String rangeCity) {
        this.rangeCity = rangeCity == null ? null : rangeCity.trim();
    }

    public Cskc() {
    }

    public Cskc(Integer cityID) {
        this.cityID = cityID;
    }

    @Override
    public String toString() {
        return "Cskc{" +
                "id=" + id +
                ", cityID=" + cityID +
                ", rangeCity='" + rangeCity + '\'' +
                '}';
    }
}