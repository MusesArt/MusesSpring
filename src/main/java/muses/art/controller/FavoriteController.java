package muses.art.controller;

import muses.art.model.base.StatusModel;
import muses.art.model.operation.FavCommodityModel;
import muses.art.service.operation.UserFavCommodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("api/favorite/commodity")
public class FavoriteController {

    @Autowired
    private UserFavCommodityService userFavCommodityService;

    @CrossOrigin(origins = "*", maxAge = 3600)
    @RequestMapping(value = "/", method = RequestMethod.POST)
    public @ResponseBody StatusModel addFavCommodity(@RequestParam Integer userId, @RequestParam Integer commodityId) {
        if (userFavCommodityService.findFavCommodityByUserIdAndCommodityId(userId, commodityId) != null) {
            return new StatusModel("请勿重复添加收藏", StatusModel.ERROR);
        } else {
            userFavCommodityService.addFavCommodity(userId, commodityId);
            return new StatusModel("添加收藏成功", StatusModel.OK);
        }
    }

    @CrossOrigin(origins = "*", maxAge = 3600)
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public @ResponseBody StatusModel deleteFavCommodity(@PathVariable Integer id) {
        boolean flag = userFavCommodityService.deleteFavCommodity(id);
        if (flag) {
            return new StatusModel("移除收藏成功", StatusModel.OK);
        } else {
            return new StatusModel("移除收藏失败", StatusModel.ERROR);
        }
    }

    @CrossOrigin(origins = "*", maxAge = 3600)
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public @ResponseBody StatusModel listFavCommodity(@RequestParam Integer userId) {
        List<FavCommodityModel> userFavCommodities = userFavCommodityService.findFavCommodityByUserId(userId);
        if (userFavCommodities != null) {
            return new StatusModel("加载收藏夹成功", StatusModel.OK);
        } else {
            return new StatusModel("加载收藏夹失败", StatusModel.ERROR);
        }
    }

    @CrossOrigin(origins = "*", maxAge = 3600)
    @RequestMapping(value = "/", method = RequestMethod.DELETE)
    public @ResponseBody StatusModel deleteALlFavCommodity(@RequestParam Integer userId) {
        boolean flag = userFavCommodityService.deleteAllFavCommodity(userId);
        if (flag) {
            return new StatusModel("清空收藏夹成功", StatusModel.OK);
        } else {
            return new StatusModel("清空收藏夹失败", StatusModel.ERROR);
        }
    }
}
