package com.njxzc.wlgl.pojo.cost_accounting;

import java.util.Date;

public class Yggz {
    private Integer id;

    private String employeeCode;

    private Double basicWage;

    private Double stationWage;

    private Double allowance;

    private Date date;

    private String employee;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public void setEmployeeCode(String employeeCode) {
        this.employeeCode = employeeCode == null ? null : employeeCode.trim();
    }

    public Double getBasicWage() {
        return basicWage;
    }

    public void setBasicWage(Double basicWage) {
        this.basicWage = basicWage;
    }

    public Double getStationWage() {
        return stationWage;
    }

    public void setStationWage(Double stationWage) {
        this.stationWage = stationWage;
    }

    public Double getAllowance() {
        return allowance;
    }

    public void setAllowance(Double allowance) {
        this.allowance = allowance;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getEmployee() {
        return employee;
    }

    public void setEmployee(String employee) {
        this.employee = employee == null ? null : employee.trim();
    }
}