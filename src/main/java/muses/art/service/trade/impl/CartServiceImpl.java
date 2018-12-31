package muses.art.service.trade.impl;

import muses.art.dao.trade.CartDao;
import muses.art.entity.trade.Cart;
import muses.art.model.trade.CartModel;
import muses.art.service.trade.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Transactional
public class CartServiceImpl implements CartService {

    @Autowired
    private CartDao cartDao;

    @Override
    public Boolean addToCart(Integer userId, Integer commodityId, Integer number) {
        if (findCartExist(userId, commodityId)) return false;
        Cart cart = new Cart();
        cart.setUserId(userId);
        cart.setCommodityId(commodityId);
        cart.setNumber(number);
        cart.setAddTime(new Timestamp(System.currentTimeMillis()));
        cartDao.save(cart);
        return true;
    }

    @Override
    public Boolean deleteFromCart(Integer id) {
        Cart cart = cartDao.get(Cart.class, id);
        if (cart == null) return false;
        cartDao.delete(cart);
        return true;
    }

    @Override
    public Boolean updateCart(Integer id, Integer number) {
        Cart cart = cartDao.get(Cart.class, id);
        if (cart == null) return false;
        cart.setNumber(number);
        cartDao.update(cart);
        return true;
    }

    @Override
    public List<CartModel> listCart(Integer userId) {
        String SQL = "from Cart where userId=:id";
        Map<String, Object> map = new HashMap<>();
        map.put("id", userId);
        List<Cart> carts = cartDao.find(SQL, map);
        return entity2model(carts);
    }

    @Override
    public Boolean findCartExist(Integer userId, Integer commodityId) {
        String SQL = "from Cart where userId=:uid and commodityId=:cid";
        Map<String, Object> map = new HashMap<>();
        map.put("uid", userId);
        map.put("cid", commodityId);
        List<Cart> carts = cartDao.find(SQL, map);
        return !carts.isEmpty();
    }

    private List<CartModel> entity2model(List<Cart> carts) {
        if (carts != null) {
            List<CartModel> cartModels = new ArrayList<>();
            for (Cart cart : carts) {
                cartModels.add(entity2model(cart));
            }
            return cartModels;
        }
        return null;
    }

    private CartModel entity2model(Cart cart) {
        if (cart != null) {
            CartModel cartModel = new CartModel();
            cartModel.setId(cart.getId());
            cartModel.setAddTime(cart.getAddTime());
            cartModel.setCommodityId(cart.getCommodityId());
            cartModel.setCommodity(cart.getCommodity());
            cartModel.setUserId(cart.getUserId());
            cartModel.setUser(cart.getUser());
            cartModel.setAddTime(cart.getAddTime());
            return cartModel;
        }
        return null;
    }

}
