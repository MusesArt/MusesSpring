package muses.art.entity.commodity;


import muses.art.entity.operation.Comment;

import javax.persistence.*;

@Entity
@Table(name = "image")
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "image_url")
    private String imageUrl; // 图像url

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "commodity_id", insertable = false, updatable = false)
    private Commodity commodity; // 商品对象 多对一

    @Column(name = "commodity_id")
    private Integer commodityId;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "comment_id", insertable = false, updatable = false)
    private Comment comment; // 评论对象 多对一

    @Column(name = "comment_id")
    private Integer commentId;

    public Integer getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(Integer commodityId) {
        this.commodityId = commodityId;
    }

    public Integer getCommentId() {
        return commentId;
    }

    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Commodity getCommodity() {
        return commodity;
    }

    public void setCommodity(Commodity commodity) {
        this.commodity = commodity;
    }

    public Comment getComment() {
        return comment;
    }

    public void setComment(Comment comment) {
        this.comment = comment;
    }

}
