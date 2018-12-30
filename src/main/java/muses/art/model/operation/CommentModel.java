package muses.art.model.operation;

import java.util.Date;
import java.util.List;

public class CommentModel {

    private int id; // 评论id
    private String head; // 头像地址
    private String username; // 用户名
    private Date date; // 填写日期
    private int praise; // 点赞数
    private int message; // 评论数
    private String content; // 评论内容
    private String commodityInfo; // 订单信息
    private List<String> images; // 图像列表 一对多
    private int star; // 评分

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getMessage() {
        return message;
    }

    public void setMessage(int message) {
        this.message = message;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<String> getImages() {
        return images;
    }

    public void setImages(List<String> images) {
        this.images = images;
    }

    public int getStar() {
        return star;
    }

    public void setStar(int star) {
        this.star = star;
    }

    public int getPraise() {
        return praise;
    }

    public void setPraise(int praise) {
        this.praise = praise;
    }

    public String getCommodityInfo() {
        return commodityInfo;
    }

    public void setCommodityInfo(String commodityInfo) {
        this.commodityInfo = commodityInfo;
    }

    @Override
    public String toString() {
        return "CommentModel{" +
                "id=" + id +
                ", head='" + head + '\'' +
                ", username='" + username + '\'' +
                ", date=" + date +
                ", praise=" + praise +
                ", message=" + message +
                ", content='" + content + '\'' +
                ", commodityInfo='" + commodityInfo + '\'' +
                ", images=" + images +
                ", star=" + star +
                '}';
    }
}
