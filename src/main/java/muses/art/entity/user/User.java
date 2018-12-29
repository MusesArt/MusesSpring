package muses.art.entity.user;

import muses.art.entity.filter.Filter;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.List;

@Entity
@Table(name = "user")
public class User { // 用户个人信息
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "username", nullable = false)
    private String username; // 用户名

    @Column(name = "password", nullable = false)
    private String password; // 密码

    @Column(name = "avatar")
    private String avatar; // 头像的地址

    @Column(name = "nickname")
    private String nickname; // 昵称

    @Column(name = "birthday")
    private Timestamp birthday; // 生日

    @Column(name = "gender")
    private int gender;  // 性别 0-男 1-女

    @Column(name = "mobile")
    private String mobile; // 手机号

    @Column(name = "email")
    private String email; // 电子邮箱

    @Column(name = "level")
    private String level; // 用户等级

    @OneToMany(fetch = FetchType.LAZY)
    private List<Filter> filters; // 用户制作的所有滤镜 一对多

    @OneToMany(fetch = FetchType.LAZY)
    private List<Filter> favFilters; // 用户喜欢的所有滤镜 一对多

    @OneToMany(fetch = FetchType.LAZY)
    private List<Filter> favCommodities; // 用户喜欢的所有商品 一对多

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Filter> getFavFilters() {
        return favFilters;
    }

    public void setFavFilters(List<Filter> favFilters) {
        this.favFilters = favFilters;
    }

    public List<Filter> getFavCommodities() {
        return favCommodities;
    }

    public void setFavCommodities(List<Filter> favCommodities) {
        this.favCommodities = favCommodities;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Timestamp getBirthday() {
        return birthday;
    }

    public void setBirthday(Timestamp birthday) {
        this.birthday = birthday;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public List<Filter> getFilters() {
        return filters;
    }

    public void setFilters(List<Filter> filters) {
        this.filters = filters;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", avatar='" + avatar + '\'' +
                ", nickname='" + nickname + '\'' +
                ", birthday=" + birthday +
                ", gender=" + gender +
                ", mobile='" + mobile + '\'' +
                ", email='" + email + '\'' +
                ", level='" + level + '\'' +
                ", filters=" + filters +
                '}';
    }
}
