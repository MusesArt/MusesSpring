package muses.art.model.trade;

public class SimpleOrderModel {
    private int id;
    private String orderSN; // 订单号

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOrderSN() {
        return orderSN;
    }

    public void setOrderSN(String orderSN) {
        this.orderSN = orderSN;
    }
}
