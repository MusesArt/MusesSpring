package muses.art.model.trade;

import java.util.ArrayList;

public class OrderFromCartModel {
    private ArrayList<Integer> cartIds;
    private Integer addressId;
    private Integer userId;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public ArrayList<Integer> getCartIds() {
        return cartIds;
    }

    public void setCartIds(ArrayList<Integer> cartIds) {
        this.cartIds = cartIds;
    }

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }
}
