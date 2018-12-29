package muses.art.entity.commodity;


import muses.art.entity.operation.Comment;

import javax.persistence.*;

@Entity
@Table(name = "image")
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "image_url")
    private String imageUrl; // 图像url

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "commodity_id", referencedColumnName = "id")
    private Commodity commodity; // 商品对象 多对一

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "comment_id", referencedColumnName = "id")
    private Comment comment;

    public int getId() {
        return id;
    }

    public void setId(int id) {
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
