package muses.art.entity.trade;


import muses.art.entity.user.User;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "address")
public class Address { // 收货地址
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "province")
    private String province; // 省份

    @Column(name = "city")
    private String city; // 城市

    @Column(name = "district")
    private String district; // 区域

    @Column(name = "address")
    private String address; // 详细地址

    @Column(name = "signer_name")
    private String signerName; // 签收人姓名

    @Column(name = "signer_mobile")
    private String signerMobile; // 签收人手机

    @Column(name = "add_time")
    private Date addTime; // 添加时间

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", insertable = false, updatable = false)
    private User user; // 用户对象 多对一

    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "default_address")
    private Boolean defaultAddress;

    public Boolean getDefaultAddress() {
        return defaultAddress;
    }

    public void setDefaultAddress(Boolean defaultAddress) {
        this.defaultAddress = defaultAddress;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return province+city+district+address+";"+signerName+";"+signerMobile;
    }
}
