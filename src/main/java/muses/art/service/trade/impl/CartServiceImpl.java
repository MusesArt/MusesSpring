package muses.art.service.trade.impl;

import muses.art.dao.trade.CartDao;
import muses.art.entity.trade.Cart;
import muses.art.model.trade.CartModel;
import muses.art.service.trade.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
        Cart cart = new Cart();
        cart.setUserId(userId);
        cart.setCommodityId(commodityId);
        cart.setNumber(number);
        cartDao.save(cart);
        return true;
    }

    @Override
    public Boolean deleteFromCart(Integer id) {
        Cart cart = cartDao.get(Cart.class, id);
        cartDao.delete(cart);
        return true;
    }

    @Override
    public Boolean UpdateCart(Integer id, Integer number) {
        Cart cart = cartDao.get(Cart.class, id);
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
