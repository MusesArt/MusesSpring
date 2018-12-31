package muses.art.model.user;

import java.util.Date;

public class VerifyCodeModel {

    private Integer id;
    private String code; // 短信验证码
    private String mobile; // 申请的手机号
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
        return "VerifyCodeModel{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", mobile='" + mobile + '\'' +
                ", addTime=" + addTime +
                '}';
    }
}
