package muses.art.model.operation;

public class FavCommodityModel { // 根据收藏夹写
    private String src; // 图片地址
    private String title; // 商品标题
    private String content; // 商品简介
    private Float price; // 商品现价
    private Float collectPrice; // 商品收藏价
    private String message; // 消息

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Float getCollectPrice() {
        return collectPrice;
    }

    public void setCollectPrice(Float collectPrice) {
        this.collectPrice = collectPrice;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
