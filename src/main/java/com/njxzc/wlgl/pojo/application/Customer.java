package com.njxzc.wlgl.pojo.application;

public class Customer {
    private int id;
    private int CustomerCode;
    private String CustomerName;
    private String Phone;
    private String Fax;
    private String Address;
    private String PostCode;
    private String Linkman;
    private String LinkmanMobile;
    private String CustomerType;
    private String EnterpriseProperty;
    private String EnterpriseSize;
    private String Email;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCustomerCode() {
        return CustomerCode;
    }

    public void setCustomerCode(int customerCode) {
        CustomerCode = customerCode;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public void setCustomerName(String customerName) {
        CustomerName = customerName;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getFax() {
        return Fax;
    }

    public void setFax(String fax) {
        Fax = fax;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getPostCode() {
        return PostCode;
    }

    public void setPostCode(String postCode) {
        PostCode = postCode;
    }

    public String getLinkman() {
        return Linkman;
    }

    public void setLinkman(String linkman) {
        Linkman = linkman;
    }

    public String getLinkmanMobile() {
        return LinkmanMobile;
    }

    public void setLinkmanMobile(String linkmanMobile) {
        LinkmanMobile = linkmanMobile;
    }

    public String getCustomerType() {
        return CustomerType;
    }

    public void setCustomerType(String customerType) {
        CustomerType = customerType;
    }

    public String getEnterpriseProperty() {
        return EnterpriseProperty;
    }

    public void setEnterpriseProperty(String enterpriseProperty) {
        EnterpriseProperty = enterpriseProperty;
    }

    public String getEnterpriseSize() {
        return EnterpriseSize;
    }

    public void setEnterpriseSize(String enterpriseSize) {
        EnterpriseSize = enterpriseSize;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public Customer() {
    }

    public Customer(int customerCode, String customerName, String phone, String fax, String address, String postCode, String linkman, String linkmanMobile, String customerType, String enterpriseProperty, String enterpriseSize, String email) {
        CustomerCode = customerCode;
        CustomerName = customerName;
        Phone = phone;
        Fax = fax;
        Address = address;
        PostCode = postCode;
        Linkman = linkman;
        LinkmanMobile = linkmanMobile;
        CustomerType = customerType;
        EnterpriseProperty = enterpriseProperty;
        EnterpriseSize = enterpriseSize;
        Email = email;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", CustomerCode=" + CustomerCode +
                ", CustomerName='" + CustomerName + '\'' +
                ", Phone='" + Phone + '\'' +
                ", Fax='" + Fax + '\'' +
                ", Address='" + Address + '\'' +
                ", PostCode='" + PostCode + '\'' +
                ", Linkman='" + Linkman + '\'' +
                ", LinkmanMobile='" + LinkmanMobile + '\'' +
                ", CustomerType='" + CustomerType + '\'' +
                ", EnterpriseProperty='" + EnterpriseProperty + '\'' +
                ", EnterpriseSize='" + EnterpriseSize + '\'' +
                ", Email='" + Email + '\'' +
                '}';
    }
}
