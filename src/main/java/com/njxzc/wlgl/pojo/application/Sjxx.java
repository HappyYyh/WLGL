package com.njxzc.wlgl.pojo.application;

public class Sjxx {
    private Integer id;

    private String driverName;

    private String IDCard;

    private String phone;

    private String mobile;

    private String gender;

    private String birthday;

    private String state;

    private String carNO;

    private String allowCarryVolume;

    private String allowCarryWeight;

    private String address;

    private String carType;

    private String carLength;

    private String carDept;

    private String carDeptTel;

    private String driveLicence;

    private String runLicence;

    private String bizLicence;

    private String insuranceCard;

    private String carWidth;

    private String goodsHeight;

    private String carFrameNO;

    private String engineNO;

    private String remark;

    private Boolean companyCar;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName == null ? null : driverName.trim();
    }

    public String getIDCard() {
        return IDCard;
    }

    public void setIDCard(String IDCard) {
        this.IDCard = IDCard == null ? null : IDCard.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile == null ? null : mobile.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday == null ? null : birthday.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getCarNO() {
        return carNO;
    }

    public void setCarNO(String carNO) {
        this.carNO = carNO == null ? null : carNO.trim();
    }

    public String getAllowCarryVolume() {
        return allowCarryVolume;
    }

    public void setAllowCarryVolume(String allowCarryVolume) {
        this.allowCarryVolume = allowCarryVolume == null ? null : allowCarryVolume.trim();
    }

    public String getAllowCarryWeight() {
        return allowCarryWeight;
    }

    public void setAllowCarryWeight(String allowCarryWeight) {
        this.allowCarryWeight = allowCarryWeight == null ? null : allowCarryWeight.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType == null ? null : carType.trim();
    }

    public String getCarLength() {
        return carLength;
    }

    public void setCarLength(String carLength) {
        this.carLength = carLength == null ? null : carLength.trim();
    }

    public String getCarDept() {
        return carDept;
    }

    public void setCarDept(String carDept) {
        this.carDept = carDept == null ? null : carDept.trim();
    }

    public String getCarDeptTel() {
        return carDeptTel;
    }

    public void setCarDeptTel(String carDeptTel) {
        this.carDeptTel = carDeptTel == null ? null : carDeptTel.trim();
    }

    public String getDriveLicence() {
        return driveLicence;
    }

    public void setDriveLicence(String driveLicence) {
        this.driveLicence = driveLicence == null ? null : driveLicence.trim();
    }

    public String getRunLicence() {
        return runLicence;
    }

    public void setRunLicence(String runLicence) {
        this.runLicence = runLicence == null ? null : runLicence.trim();
    }

    public String getBizLicence() {
        return bizLicence;
    }

    public void setBizLicence(String bizLicence) {
        this.bizLicence = bizLicence == null ? null : bizLicence.trim();
    }

    public String getInsuranceCard() {
        return insuranceCard;
    }

    public void setInsuranceCard(String insuranceCard) {
        this.insuranceCard = insuranceCard == null ? null : insuranceCard.trim();
    }

    public String getCarWidth() {
        return carWidth;
    }

    public void setCarWidth(String carWidth) {
        this.carWidth = carWidth == null ? null : carWidth.trim();
    }

    public String getGoodsHeight() {
        return goodsHeight;
    }

    public void setGoodsHeight(String goodsHeight) {
        this.goodsHeight = goodsHeight == null ? null : goodsHeight.trim();
    }

    public String getCarFrameNO() {
        return carFrameNO;
    }

    public void setCarFrameNO(String carFrameNO) {
        this.carFrameNO = carFrameNO == null ? null : carFrameNO.trim();
    }

    public String getEngineNO() {
        return engineNO;
    }

    public void setEngineNO(String engineNO) {
        this.engineNO = engineNO == null ? null : engineNO.trim();
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public Boolean getCompanyCar() {
        return companyCar;
    }

    public void setCompanyCar(Boolean companyCar) {
        this.companyCar = companyCar;
    }

    @Override
    public String toString() {
        return "Sjxx{" +
                "id=" + id +
                ", driverName='" + driverName + '\'' +
                ", IDCard='" + IDCard + '\'' +
                ", phone='" + phone + '\'' +
                ", mobile='" + mobile + '\'' +
                ", gender='" + gender + '\'' +
                ", birthday='" + birthday + '\'' +
                ", state='" + state + '\'' +
                ", carNO='" + carNO + '\'' +
                ", allowCarryVolume='" + allowCarryVolume + '\'' +
                ", allowCarryWeight='" + allowCarryWeight + '\'' +
                ", address='" + address + '\'' +
                ", carType='" + carType + '\'' +
                ", carLength='" + carLength + '\'' +
                ", carDept='" + carDept + '\'' +
                ", carDeptTel='" + carDeptTel + '\'' +
                ", driveLicence='" + driveLicence + '\'' +
                ", runLicence='" + runLicence + '\'' +
                ", bizLicence='" + bizLicence + '\'' +
                ", insuranceCard='" + insuranceCard + '\'' +
                ", carWidth='" + carWidth + '\'' +
                ", goodsHeight='" + goodsHeight + '\'' +
                ", carFrameNO='" + carFrameNO + '\'' +
                ", engineNO='" + engineNO + '\'' +
                ", remark='" + remark + '\'' +
                ", companyCar=" + companyCar +
                '}';
    }
}