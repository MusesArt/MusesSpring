package muses.art.service.trade;

import muses.art.entity.trade.Cart;
import muses.art.model.trade.CartModel;

import java.util.List;

public interface CartService {

    /**
     * @return 操作状态
     */
    Boolean addToCart(CartModel cartModel);

    /**
     * @param id 购物车id
     * @return
     */
    Boolean deleteFromCart(Integer id);

    /**
     * @param id     购物车id
     * @param number 商品数量
     * @param detail 商品属性详情
     * @return
     */
    Boolean updateCart(Integer id, Integer number, String detail, String parameter);

    /**
     * @param userId 用户id
     * @return
     */
    List<CartModel> listCart(Integer userId);

    /**
     * @param id 购物车id
     * @return
     */
    CartModel getCart(Integer id);

    /**
     * @param userId      用户id
     * @param commodityId 商品id
     * @return
     */
    Cart findCartExist(Integer userId, Integer commodityId, String detail);


}
