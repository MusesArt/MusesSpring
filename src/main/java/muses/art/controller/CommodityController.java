package muses.art.controller;

import muses.art.model.base.PageModel;
import muses.art.model.base.StatusModel;
import muses.art.model.commodity.CommodityDetailModel;
import muses.art.model.commodity.CommodityListModel;
import muses.art.service.commodity.CommodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("api/commodity")
public class CommodityController {

    @Autowired
    private CommodityService commodityService;

    @RequestMapping(value = "/page/{page}/{size}", method = RequestMethod.GET)
    public @ResponseBody StatusModel<PageModel<CommodityListModel>> getCommoditiesPage(@PathVariable int page, @PathVariable int size) {
        PageModel<CommodityListModel> pageModel = commodityService.findCommoditiesPage(page, size);
        return pageModel != null ? new StatusModel<>(pageModel) : new StatusModel<PageModel<CommodityListModel>>("获取商品分页数据失败");
    }

    @RequestMapping(value = "list/{page}/{size}", method = RequestMethod.GET)
    public @ResponseBody StatusModel<List<CommodityListModel>> getCommodities(@PathVariable int page, @PathVariable int size) {
        List<CommodityListModel> commodityListModels = commodityService.findCommodities(page, size);
        if (commodityListModels != null) {
            return new StatusModel<>(commodityListModels);
        } else {
            return new StatusModel<>("获取商品列表数据失败");
        }
    }

    @RequestMapping(value = "/detail/{id}" , method = RequestMethod.GET)
    public @ResponseBody StatusModel<CommodityDetailModel> getCommodity(@PathVariable int id) {
        CommodityDetailModel commodityDetailModel = commodityService.getCommodity(id);
        if (commodityDetailModel != null) {
            return new StatusModel<>(commodityDetailModel);
        } else {
            return new StatusModel<>("获取商品详细信息失败");
        }
    }


}
