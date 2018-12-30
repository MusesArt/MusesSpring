package muses.art.model.operation;

public class FavCommodityModel { // 根据收藏夹写
    private String src; // 图片地址
    private String title; // 商品标题
    private String content; // 商品简介
    private float price; // 商品现价
    private float collectPrice; // 商品收藏价
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

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getCollectPrice() {
        return collectPrice;
    }

    public void setCollectPrice(float collectPrice) {
        this.collectPrice = collectPrice;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
