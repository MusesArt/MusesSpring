package muses.art.controller;

import muses.art.model.base.StatusModel;
import muses.art.model.trade.CartModel;
import muses.art.service.trade.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("api/cart")
public class CartController {

    @Autowired
    private CartService cartService;

    @ResponseBody
    @CrossOrigin(origins = "*", maxAge = 3600)
    @RequestMapping(value = "/list/{userId}", method = RequestMethod.GET)
    public StatusModel<List<CartModel>> listCart(@PathVariable int userId) {
        StatusModel<List<CartModel>> statusModel;
        List<CartModel> cartModels = cartService.listCart(userId);
        if (cartModels == null) {
            statusModel = new StatusModel<>("购物车数据获取异常");
        } else {
            statusModel = new StatusModel<>(cartModels);
        }
        return statusModel;
    }

    @ResponseBody
    @CrossOrigin(origins = "*", maxAge = 3600)
    @RequestMapping(value = "/{cartId}", method = RequestMethod.GET)
    public StatusModel<CartModel> getCart(@PathVariable int cartId) {
        StatusModel<CartModel> statusModel;
        CartModel cartModel = cartService.getCart(cartId);
        if (cartModel == null) {
            statusModel = new StatusModel<>("购物车数据获取异常");
        } else {
            statusModel = new StatusModel<>(cartModel);
        }
        return statusModel;
    }

    @ResponseBody
    @CrossOrigin(origins = "*", maxAge = 3600)
    @RequestMapping(value = "/{cartId}", method = RequestMethod.PUT)
    public StatusModel updateCart(@RequestBody CartModel cartModel, @PathVariable int cartId) {
        StatusModel statusModel;
        Boolean status = cartService.updateCart(cartId, cartModel.getNumber(), cartModel.getDetail(), cartModel.getParameter());
        if (!status) {
            statusModel = new StatusModel("购物车内无此商品");
        } else {
            statusModel = new StatusModel("购物车数据更新成功", StatusModel.OK);
        }
        return statusModel;
    }

    @ResponseBody
    @CrossOrigin(origins = "*", maxAge = 3600)
    @RequestMapping(value = "/{cartId}", method = RequestMethod.DELETE)
    public StatusModel deleteFromCart(@PathVariable int cartId) {
        StatusModel statusModel;
        Boolean status = cartService.deleteFromCart(cartId);
        if (!status) {
            statusModel = new StatusModel("购物车内无此商品");
        } else {
            statusModel = new StatusModel("删除成功", StatusModel.OK);
        }
        return statusModel;
    }

    @ResponseBody
    @CrossOrigin(origins = "*", maxAge = 3600)
    @RequestMapping(value = "/{userId}", method = RequestMethod.POST)
    public StatusModel addToCart(@RequestBody CartModel cartModel, @PathVariable int userId) {
        StatusModel statusModel;
        Boolean status = cartService.addToCart(cartModel);
        if (!status) {
            statusModel = new StatusModel("购物车数据更新失败");
        } else {
            statusModel = new StatusModel("购物车数据更新成功", StatusModel.OK);
        }
        return statusModel;
    }
}
