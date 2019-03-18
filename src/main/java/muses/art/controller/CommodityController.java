package muses.art.controller;

import muses.art.entity.commodity.Commodity;
import muses.art.model.base.PageModel;
import muses.art.model.base.StatusModel;
import muses.art.model.commodity.CommodityDetailModel;
import muses.art.model.commodity.CommodityListModel;
import muses.art.model.commodity.SearchModel;
import muses.art.service.commodity.CommodityService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.MultipartResolver;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("api/commodity")
@CrossOrigin(origins = "*", maxAge = 3600)
public class CommodityController {

    @Autowired
    private CommodityService commodityService;
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @CrossOrigin(origins = "*", maxAge = 3600)
    @RequestMapping(value = "/page/{page}", method = RequestMethod.POST)
    public @ResponseBody
    StatusModel<PageModel<CommodityListModel>> getCommoditiesPage(@PathVariable int page, @RequestBody SearchModel searchModel) {
        System.out.println(searchModel);
        switch (searchModel.getSortType()) {
            case 0:
                PageModel<CommodityListModel> timeModels = commodityService.findCommoditiesPageOrderByTime(searchModel.getKeyword(), page, searchModel.getSize(), searchModel.getAsc());
                if (timeModels != null) {
                    return new StatusModel<>(timeModels);
                } else {
                    logger.info("获取时间排序分页商品列表信息失败");
                    return new StatusModel<>("获取时间排序分页商品列表信息失败");
                }
            case 1:
                PageModel<CommodityListModel> priceModels = commodityService.findCommoditiesPageOrderByPrice(searchModel.getKeyword(), page, searchModel.getSize(), searchModel.getAsc());
                if (priceModels != null) {
                    return new StatusModel<>(priceModels);
                } else {
                    logger.info("获取价格排序分页商品列表信息失败");
                    return new StatusModel<>("获取价格排序分页商品列表信息失败");
                }
            case 2:
                PageModel<CommodityListModel> salesVolumeModel = commodityService.findCommoditiesPageOrderBySalesVolume(searchModel.getKeyword(), page, searchModel.getSize(), searchModel.getAsc());
                if (salesVolumeModel != null) {
                    return new StatusModel<>(salesVolumeModel);
                } else {
                    logger.info("获取销量排序分页商品列表信息失败");
                    return new StatusModel<>("获取销量排序分页商品列表信息失败");
                }
            default:
                PageModel<CommodityListModel> models = commodityService.findCommoditiesPage(searchModel.getKeyword(), page, searchModel.getSize());
                if (models != null) {
                    return new StatusModel<>(models);
                } else {
                    logger.info("获取综合排序分页商品列表信息失败");
                    return new StatusModel<>("获取综合排序分页商品列表信息失败");
                }
        }
    }

    @CrossOrigin(origins = "*", maxAge = 3600)
    @RequestMapping(value = "list/{page}", method = RequestMethod.POST)
    public @ResponseBody
    StatusModel<List<CommodityListModel>> getCommodities(@PathVariable Integer page, @RequestBody SearchModel searchModel) {
        switch (searchModel.getSortType()) {
            case 0:
                List<CommodityListModel> timeModels = commodityService.findCommoditiesOrderByTime(searchModel.getKeyword(), page, searchModel.getSize(), searchModel.getAsc());
                if (timeModels != null) {
                    return new StatusModel<>(timeModels);
                } else {
                    logger.info("获取时间排序商品列表信息失败");
                    return new StatusModel<>("获取时间排序商品列表信息失败");
                }
            case 1:
                List<CommodityListModel> priceModels = commodityService.findCommoditiesOrderByPrice(searchModel.getKeyword(), page, searchModel.getSize(), searchModel.getAsc());
                if (priceModels != null) {
                    return new StatusModel<>(priceModels);
                } else {
                    logger.info("获取价格排序商品列表信息失败");
                    return new StatusModel<>("获取价格排序商品列表信息失败");
                }
            case 2:
                List<CommodityListModel> salesVolumeModel = commodityService.findCommoditiesOrderBySalesVolume(searchModel.getKeyword(), page, searchModel.getSize(), searchModel.getAsc());
                if (salesVolumeModel != null) {
                    return new StatusModel<>(salesVolumeModel);
                } else {
                    logger.info("获取销量排序商品列表信息失败");
                    return new StatusModel<>("获取销量排序商品列表信息失败");
                }
            default:
                List<CommodityListModel> models = commodityService.findCommodities(searchModel.getKeyword(), page, searchModel.getSize());
                if (models != null) {
                    return new StatusModel<>(models);
                } else {
                    logger.info("获取综合排序商品列表信息失败");
                    return new StatusModel<>("获取综合排序商品列表信息失败");
                }
        }
    }

    @CrossOrigin(origins = "*", maxAge = 3600)
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public @ResponseBody
    StatusModel<CommodityDetailModel> getCommodity(@PathVariable int id) {
        CommodityDetailModel commodityDetailModel = commodityService.getCommodity(id);
        if (commodityDetailModel != null) {
            return new StatusModel<>(commodityDetailModel);
        } else {
            logger.info("获取商品详细信息失败");
            return new StatusModel<>("获取商品详细信息失败");
        }
    }

    @CrossOrigin(origins = "*", maxAge = 3600)
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public StatusModel<CommodityDetailModel> deleteCommodity(@PathVariable int id) {
        boolean flag = commodityService.deleteCommodity(id);
        if (flag) {
            return new StatusModel<>("删除成功", StatusModel.OK);
        } else {
            return new StatusModel<>("商品不存在", StatusModel.ERROR);
        }
    }

    @CrossOrigin(origins = "*", maxAge = 3600)
    @RequestMapping(value = "/", method = RequestMethod.POST)
    @ResponseBody
    public StatusModel<Integer> addCommodity(HttpServletRequest request) throws IOException {
        MultipartResolver resolver = new CommonsMultipartResolver(request.getSession().getServletContext());
        MultipartHttpServletRequest multipartRequest = resolver.resolveMultipart(request);
        MultipartFile file = multipartRequest.getFile("photo");
        String filename = file.getOriginalFilename();
        filename = new Date().getTime() + filename;
        System.out.println(filename);
        String filePath = "src/main/webapp/image/create/"+filename;
        File source = new File(filePath);
        file.transferTo(source); // 保存用户上传的图片
        int userId = Integer.parseInt(multipartRequest.getParameter("userId"));
        Integer commodityId = commodityService.addCommodity(userId, filename);
        if (commodityId != null) {
            return new StatusModel<>("添加商品成功", StatusModel.OK, commodityId);
        } else {
            return new StatusModel<>("出现异常，请不要联系吉皮", StatusModel.ERROR);
        }
    }

}