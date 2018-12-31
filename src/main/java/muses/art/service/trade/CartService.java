package muses.art.service.trade;

import muses.art.model.trade.CartModel;

import java.util.List;

public interface CartService {

    /**
     * @param userId      用户id
     * @param commodityId 商品id
     * @param number      商品数量
     * @return 操作状态
     */
    Boolean addToCart(Integer userId, Integer commodityId, Integer number);

    /**
     * @param id 购物车id
     * @return
     */
    Boolean deleteFromCart(Integer id);

    /**
     * @param id     购物车id
     * @param number 商品数量
     * @return
     */
    Boolean UpdateCart(Integer id, Integer number);

    /**
     * @param userId 用户id
     * @return
     */
    List<CartModel> listCart(Integer userId);

    /**
     * @param userId      用户id
     * @param commodityId 商品id
     * @return
     */
    Boolean findCartExist(Integer userId, Integer commodityId);


}
