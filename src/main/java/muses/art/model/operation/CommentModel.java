package muses.art.model.operation;

import java.util.Date;
import java.util.List;

public class CommentModel {

    private Integer id; // 评论id
    private String head; // 头像地址
    private String username; // 用户名
    private Date date; // 填写日期
    private Integer praise; // 点赞数
    private String content; // 评论内容
    private String commodityInfo; // 订单信息
    private List<String> images; // 图像列表 一对多
    private Integer star; // 评分
    private Integer orderCommodityId;
    private Integer userId;
    private Integer commentId;

    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getOrderCommodityId() {
        return orderCommodityId;
    }

    public void setOrderCommodityId(Integer orderCommodityId) {
        this.orderCommodityId = orderCommodityId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public Integer getStar() {
        return star;
    }

    public void setStar(Integer star) {
        this.star = star;
    }

    public Integer getPraise() {
        return praise;
    }

    public void setPraise(Integer praise) {
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
                ", content='" + content + '\'' +
                ", commodityInfo='" + commodityInfo + '\'' +
                ", images=" + images +
                ", star=" + star +
                '}';
    }
}
