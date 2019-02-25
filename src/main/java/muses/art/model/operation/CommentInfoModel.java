package muses.art.model.operation;

public class CommentInfoModel {
    private int withImageCount; // 带图数量
    private int goodCount; // 好评
    private int middleCount; // 中评
    private int badCount; // 差评

    public int getMiddleCount() {
        return middleCount;
    }

    public void setMiddleCount(int middleCount) {
        this.middleCount = middleCount;
    }

    public int getWithImageCount() {
        return withImageCount;
    }

    public void setWithImageCount(int withImageCount) {
        this.withImageCount = withImageCount;
    }

    public int getGoodCount() {
        return goodCount;
    }

    public void setGoodCount(int goodCount) {
        this.goodCount = goodCount;
    }

    public int getBadCount() {
        return badCount;
    }

    public void setBadCount(int badCount) {
        this.badCount = badCount;
    }
}
