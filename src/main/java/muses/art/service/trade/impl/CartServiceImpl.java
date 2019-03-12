package muses.art.service.trade.impl;

import muses.art.dao.commodity.CommodityDao;
import muses.art.dao.trade.CartDao;
import muses.art.dao.trade.ParameterDao;
import muses.art.entity.commodity.Commodity;
import muses.art.entity.commodity.Parameter;
import muses.art.entity.trade.Cart;
import muses.art.model.commodity.CommodityListModel;
import muses.art.model.trade.CartModel;
import muses.art.service.trade.CartService;
import org.springframework.beans.BeanUtils;
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

    @Autowired
    private CommodityDao commodityDao;

    @Autowired
    private ParameterDao parameterDao;

    @Override
    public Boolean addToCart(CartModel cartModel) {
        Cart cart = findCartExist(cartModel.getUserId(), cartModel.getCommodityId(), cartModel.getDetail());
        Commodity commodity = commodityDao.get(Commodity.class, cartModel.getCommodityId());
        if (commodity == null) return false;
        if (cart != null) {
            cart.setNumber(cart.getNumber() + 1);
            cartDao.update(cart);
            return true;
        }
        cart = new Cart();
        BeanUtils.copyProperties(cartModel, cart);
        cart.setImage(getImage(commodity, cartModel.getParameter()));
        cart.setAddTime(new Timestamp(System.currentTimeMillis()));
        cartDao.save(cart);
        return true;
    }

    private String getImage(Commodity commodity, String param) {
        System.out.println(param);
        String image = null;
        if (param != null) {
            String[] params = param.split(",");
            for (int i = 0; i < params.length; i++ ) { // 遍历所有属性
                Parameter parameter = parameterDao.get(Parameter.class, Integer.valueOf(params[i]));
                System.out.println(parameter.getImage());
                if (parameter != null && parameter.getImage() != null) { // 若属性有图，则将该图作为购物车图像
                    image = parameter.getImage(); // 设置图像
                }
            }
        }
        if (image == null) { // 没有从属性中找到图像
            image = commodity.getCoverImage(); // 使用商品封面图像作为购物车图像
        }
        return image;
    }


    @Override
    public Boolean deleteFromCart(Integer id) {
        Cart cart = cartDao.get(Cart.class, id);
        if (cart == null) return false;
        cartDao.delete(cart);
        return true;
    }

    @Override
    public Boolean updateCart(Integer id, Integer number, String detail, String parameter) {
        Cart cart = cartDao.get(Cart.class, id);
        if (cart == null) return false;
        cart.setNumber(number);
        cart.setDetail(detail);
        cart.setParameter(parameter);
        cart.setImage(getImage(cart.getCommodity(), parameter));
        cartDao.update(cart);
        return true;
    }

    @Override
    public List<CartModel> listCart(Integer userId) {
        String SQL = "from Cart where userId=:id order by addTime desc";
        Map<String, Object> map = new HashMap<>();
        map.put("id", userId);
        List<Cart> carts = cartDao.find(SQL, map);
        List<CartModel> cartModels = new ArrayList<>();
        carts.forEach(cart->{
            CartModel cartModel = cartDao.getModelMapper().map(cart, CartModel.class);
            Commodity commodity = commodityDao.get(Commodity.class, cartModel.getCommodityId());
            CommodityListModel commodityListModel = new CommodityListModel();
            BeanUtils.copyProperties(commodity, commodityListModel);
            cartModel.setCommodity(commodityListModel);
            cartModels.add(cartModel);
        });
        return cartModels;
    }

    @Override
    public CartModel getCart(Integer id) {
        Cart cart = cartDao.get(Cart.class, id);
        if (cart == null) return null;
        CartModel cartModel = cartDao.getModelMapper().map(cart, CartModel.class);
        Commodity commodity = commodityDao.get(Commodity.class, cartModel.getCommodityId());
        CommodityListModel commodityListModel = new CommodityListModel();
        BeanUtils.copyProperties(commodity, commodityListModel);
        cartModel.setCommodity(commodityListModel);
        return cartModel;
    }


    @Override
    public Cart findCartExist(Integer userId, Integer commodityId, String detail) {
        String SQL = "from Cart where userId=:uid and commodityId=:cid and detail=:detail";
        Map<String, Object> map = new HashMap<>();
        map.put("uid", userId);
        map.put("cid", commodityId);
        map.put("detail", detail);
        List<Cart> carts = cartDao.find(SQL, map);
        return carts.isEmpty() ? null : carts.get(0);
    }

}
