package com.njxzc.wlgl.pojo.Transfer;

public class Zzgsxx {
    private Integer id;

    private String city;

    private String companyName;

    private String linkPhone;

    private String detailAddress;

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

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName == null ? null : companyName.trim();
    }

    public String getLinkPhone() {
        return linkPhone;
    }

    public void setLinkPhone(String linkPhone) {
        this.linkPhone = linkPhone == null ? null : linkPhone.trim();
    }

    public String getDetailAddress() {
        return detailAddress;
    }

    public void setDetailAddress(String detailAddress) {
        this.detailAddress = detailAddress == null ? null : detailAddress.trim();
    }

    @Override
    public String toString() {
        return "Zzgsxx{" +
                "id=" + id +
                ", city='" + city + '\'' +
                ", companyName='" + companyName + '\'' +
                ", linkPhone='" + linkPhone + '\'' +
                ", detailAddress='" + detailAddress + '\'' +
                '}';
    }


}