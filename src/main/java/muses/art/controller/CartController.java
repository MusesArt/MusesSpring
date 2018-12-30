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

    @RequestMapping(value = "/list/{user_id}", method = RequestMethod.GET)
    public @ResponseBody
    StatusModel<List<CartModel>> listCart(@PathVariable int user_id) {
        StatusModel<List<CartModel>> statusModel = new StatusModel<>();
        List<CartModel> CartModels = cartService.listCart(user_id);
        if (CartModels == null) {
            statusModel.setErrorCode(-1);
            statusModel.setErrorMsg("购物车数据获取异常");
            statusModel.setData(null);
        } else {
            statusModel.setErrorCode(0);
            statusModel.setErrorMsg("");
            statusModel.setData(CartModels);
        }
        return statusModel;
    }

    @RequestMapping(value = "/{cart_id}", method = RequestMethod.PUT)
    public @ResponseBody
    StatusModel updateCart(@RequestBody CartModel cartModel, @PathVariable int cart_id) {
        StatusModel statusModel = new StatusModel();
        Boolean status = cartService.UpdateCart(cart_id, cartModel.getNumber());
        if (status == false) {
            statusModel.setErrorCode(-1);
            statusModel.setErrorMsg("购物车内无此商品");
        } else {
            statusModel.setErrorCode(0);
            statusModel.setErrorMsg("购物车数据更新成功");
        }
        return statusModel;
    }

    @RequestMapping(value = "/{user_id}", method = RequestMethod.POST)
    public @ResponseBody
    StatusModel addToCart(@RequestBody CartModel cartModel, @PathVariable int user_id) {
        StatusModel statusModel = new StatusModel();
        Boolean status = cartService.addToCart(cartModel.getUserId(), cartModel.getCommodityId(), cartModel.getNumber());
        if (status == false) {
            statusModel.setErrorCode(-1);
            statusModel.setErrorMsg("购物车内已有此商品");
        } else {
            statusModel.setErrorCode(0);
            statusModel.setErrorMsg("购物车数据更新成功");
        }
        return statusModel;
    }
}
