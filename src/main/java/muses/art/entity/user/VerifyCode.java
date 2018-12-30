package muses.art.entity.user;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "verify_code")
public class VerifyCode { // 短信验证码
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "code")
    private String code; // 短信验证码

    @Column(name = "mobile")
    private String mobile; // 申请的手机号

    @Column(name = "add_time")
    private Date addTime; // 申请时间，有效期5分钟

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    @Override
    public String toString() {
        return "VerifyCode{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", mobile='" + mobile + '\'' +
                ", addTime=" + addTime +
                '}';
    }
}
