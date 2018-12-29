package muses.art.entity.trade;


import muses.art.entity.user.User;

import javax.persistence.*;
import java.security.Timestamp;

@Entity
@Table(name = "address")
public class Address { // 收货地址
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

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
    private Timestamp addTime; // 添加时间

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    private User user; // 用户对象 多对一

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public Timestamp getAddTime() {
        return addTime;
    }

    public void setAddTime(Timestamp addTime) {
        this.addTime = addTime;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }


}
