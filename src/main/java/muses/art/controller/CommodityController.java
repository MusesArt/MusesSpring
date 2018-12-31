package muses.art.controller;

import muses.art.model.base.PageModel;
import muses.art.model.base.StatusModel;
import muses.art.model.commodity.CommodityDetailModel;
import muses.art.model.commodity.CommodityListModel;
import muses.art.service.commodity.CommodityService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("api/commodity")
public class CommodityController {

    @Autowired
    private CommodityService commodityService;
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping(value = "/page/{page}/{size}", method = RequestMethod.POST)
    public @ResponseBody
    StatusModel<PageModel<CommodityListModel>> getCommoditiesPage(@PathVariable int page, @PathVariable int size, @RequestParam int sortType, @RequestParam Boolean isASC) {
        switch (sortType) {
            case 0:
                PageModel<CommodityListModel> timeModels = commodityService.findCommoditiesPageOrderByTime(page, size, isASC);
                if (timeModels != null) {
                    return new StatusModel<>(timeModels);
                } else {
                    logger.info("获取时间排序分页商品列表信息失败");
                    return new StatusModel<>("获取时间排序分页商品列表信息失败");
                }
            case 1:
                PageModel<CommodityListModel> priceModels = commodityService.findCommoditiesPageOrderByPrice(page, size, isASC);
                if (priceModels != null) {
                    return new StatusModel<>(priceModels);
                } else {
                    logger.info("获取价格排序分页商品列表信息失败");
                    return new StatusModel<>("获取价格排序分页商品列表信息失败");
                }
            case 2:
                PageModel<CommodityListModel> salesVolumeModel = commodityService.findCommoditiesPageOrderBySalesVolume(page, size, isASC);
                if (salesVolumeModel != null) {
                    return new StatusModel<>(salesVolumeModel);
                } else {
                    logger.info("获取销量排序分页商品列表信息失败");
                    return new StatusModel<>("获取销量排序分页商品列表信息失败");
                }
            default:
                PageModel<CommodityListModel> models = commodityService.findCommoditiesPage(page, size);
                if (models != null) {
                    return new StatusModel<>(models);
                } else {
                    logger.info("获取综合排序分页商品列表信息失败");
                    return new StatusModel<>("获取综合排序分页商品列表信息失败");
                }
        }
    }

    @RequestMapping(value = "list/{page}/{size}", method = RequestMethod.POST)
    public @ResponseBody
    StatusModel<List<CommodityListModel>> getCommodities(@PathVariable int page, @PathVariable int size, @RequestParam int sortType, @RequestParam Boolean isASC) {
        switch (sortType) {
            case 0:
                List<CommodityListModel> timeModels = commodityService.findCommoditiesOrderByTime(page, size, isASC);
                if (timeModels != null) {
                    return new StatusModel<>(timeModels);
                } else {
                    logger.info("获取时间排序商品列表信息失败");
                    return new StatusModel<>("获取时间排序商品列表信息失败");
                }
            case 1:
                List<CommodityListModel> priceModels = commodityService.findCommoditiesOrderByPrice(page, size, isASC);
                if (priceModels != null) {
                    return new StatusModel<>(priceModels);
                } else {
                    logger.info("获取价格排序商品列表信息失败");
                    return new StatusModel<>("获取价格排序商品列表信息失败");
                }
            case 2:
                List<CommodityListModel> salesVolumeModel = commodityService.findCommoditiesOrderBySalesVolume(page, size, isASC);
                if (salesVolumeModel != null) {
                    return new StatusModel<>(salesVolumeModel);
                } else {
                    logger.info("获取销量排序商品列表信息失败");
                    return new StatusModel<>("获取销量排序商品列表信息失败");
                }
            default:
                List<CommodityListModel> models = commodityService.findCommodities(page, size);
                if (models != null) {
                    return new StatusModel<>(models);
                } else {
                    logger.info("获取综合排序商品列表信息失败");
                    return new StatusModel<>("获取综合排序商品列表信息失败");
                }
        }
    }

    @RequestMapping(value = "/detail", method = RequestMethod.POST)
    public @ResponseBody
    StatusModel<CommodityDetailModel> getCommodity(@RequestParam int id) {
        CommodityDetailModel commodityDetailModel = commodityService.getCommodity(id);
        if (commodityDetailModel != null) {
            return new StatusModel<>(commodityDetailModel);
        } else {
            logger.info("获取商品详细信息失败");
            return new StatusModel<>("获取商品详细信息失败");
        }
    }


}
