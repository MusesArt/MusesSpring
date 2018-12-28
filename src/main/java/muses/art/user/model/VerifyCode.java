package muses.art.user.model;

import javax.persistence.*;
import java.sql.Timestamp;


@Entity
@Table(name = "verify_code")
public class VerifyCode { // 短信验证码
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "code")
    private String code; // 短信验证码

    @Column(name = "mobile")
    private String mobile; // 申请的手机号

    @Column(name = "add_time")
    private Timestamp addTime; // 申请时间，有效期5分钟

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public Timestamp getAddTime() {
        return addTime;
    }

    public void setAddTime(Timestamp addTime) {
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
