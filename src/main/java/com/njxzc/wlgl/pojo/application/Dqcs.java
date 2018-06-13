package com.njxzc.wlgl.pojo.application;

import java.util.List;

public class Dqcs {
    private Integer id;

    private String city;

    private List<Cskc> cskcList;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    public List<Cskc> getCskcList() {
        return cskcList;
    }

    public void setCskcList(List<Cskc> cskcList) {
        this.cskcList = cskcList;
    }

    public Dqcs() {
    }

    public Dqcs(String city) {
        this.city = city;
    }

    public Dqcs(Integer id, String city) {
        this.id = id;
        this.city = city;
    }

    @Override
    public String toString() {
        return "Dqcs{" +
                "id=" + id +
                ", city='" + city + '\'' +
                ", cskcList=" + cskcList +
                '}';
    }
}