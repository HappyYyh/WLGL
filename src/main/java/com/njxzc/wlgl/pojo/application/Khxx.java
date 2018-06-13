package com.njxzc.wlgl.pojo.application;

public class Khxx {
    private Integer id;

    private Integer customerCode;

    private String customerName;

    private String phone;

    private String fax;

    private String address;

    private String postCode;

    private String linkman;

    private String linkmanMobile;

    private String customerType;

    private String enterpriseProperty;

    private String enterpriseSize;

    private String email;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCustomerCode() {
        return customerCode;
    }

    public void setCustomerCode(Integer customerCode) {
        this.customerCode = customerCode;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName == null ? null : customerName.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax == null ? null : fax.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode == null ? null : postCode.trim();
    }

    public String getLinkman() {
        return linkman;
    }

    public void setLinkman(String linkman) {
        this.linkman = linkman == null ? null : linkman.trim();
    }

    public String getLinkmanMobile() {
        return linkmanMobile;
    }

    public void setLinkmanMobile(String linkmanMobile) {
        this.linkmanMobile = linkmanMobile == null ? null : linkmanMobile.trim();
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType == null ? null : customerType.trim();
    }

    public String getEnterpriseProperty() {
        return enterpriseProperty;
    }

    public void setEnterpriseProperty(String enterpriseProperty) {
        this.enterpriseProperty = enterpriseProperty == null ? null : enterpriseProperty.trim();
    }

    public String getEnterpriseSize() {
        return enterpriseSize;
    }

    public void setEnterpriseSize(String enterpriseSize) {
        this.enterpriseSize = enterpriseSize == null ? null : enterpriseSize.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    @Override
    public String toString() {
        return "Khxx{" +
                "id=" + id +
                ", customerCode=" + customerCode +
                ", customerName='" + customerName + '\'' +
                ", phone='" + phone + '\'' +
                ", fax='" + fax + '\'' +
                ", address='" + address + '\'' +
                ", postCode='" + postCode + '\'' +
                ", linkman='" + linkman + '\'' +
                ", linkmanMobile='" + linkmanMobile + '\'' +
                ", customerType='" + customerType + '\'' +
                ", enterpriseProperty='" + enterpriseProperty + '\'' +
                ", enterpriseSize='" + enterpriseSize + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}