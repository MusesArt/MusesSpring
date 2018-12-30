package muses.art.controller;

import muses.art.model.base.StatusModel;
import muses.art.model.trade.CartModel;
import muses.art.service.trade.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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
    ResponseEntity<?> updateCart(@RequestBody CartModel cartModel, @PathVariable int cart_id) {
        cartService.UpdateCart(cart_id, cartModel.getNumber());
        return ResponseEntity.ok("Cart updated");
    }

    @RequestMapping(value = "/{user_id}", method = RequestMethod.POST)
    public @ResponseBody
    ResponseEntity<?> addToCart(@RequestBody CartModel cartModel, @PathVariable int user_id) {
        Boolean status = cartService.addToCart(cartModel.getUserId(), cartModel.getCommodityId(), cartModel.getNumber());
        return ResponseEntity.ok("Cart saved");
    }
}
