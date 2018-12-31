package muses.art.model.trade;

import java.sql.Date;

public class AddressModel {
    private Integer id;

    private String province; // 省份

    private String city; // 城市

    private String district; // 区域

    private String address; // 详细地址

    private String signerName; // 签收人姓名

    private String signerMobile; // 签收人手机

    private Date addTime; // 添加时间

    private Integer userId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSignerName() {
        return signerName;
    }

    public void setSignerName(String signerName) {
        this.signerName = signerName;
    }

    public String getSignerMobile() {
        return signerMobile;
    }

    public void setSignerMobile(String signerMobile) {
        this.signerMobile = signerMobile;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}
