package com.njxzc.wlgl.pojo.application;

public class Xlxx {
    private Integer id;

    private String startStation;

    private String endStation;

    private Double distance;

    private Double fetchTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStartStation() {
        return startStation;
    }

    public void setStartStation(String startStation) {
        this.startStation = startStation == null ? null : startStation.trim();
    }

    public String getEndStation() {
        return endStation;
    }

    public void setEndStation(String endStation) {
        this.endStation = endStation == null ? null : endStation.trim();
    }

    public Double getDistance() {
        return distance;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }

    public Double getFetchTime() {
        return fetchTime;
    }

    public void setFetchTime(Double fetchTime) {
        this.fetchTime = fetchTime;
    }

    @Override
    public String toString() {
        return "Xlxx{" +
                "id=" + id +
                ", startStation='" + startStation + '\'' +
                ", endStation='" + endStation + '\'' +
                ", distance=" + distance +
                ", fetchTime=" + fetchTime +
                '}';
    }
}