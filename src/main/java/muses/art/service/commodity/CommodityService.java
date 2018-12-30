package muses.art.service.commodity;

import muses.art.model.commodity.CommodityDetailModel;
import muses.art.model.base.PageModel;
import muses.art.model.commodity.CommodityListModel;

import java.util.List;

public interface CommodityService {


    /**
     * 添加商品
     * @param commodityDetailModel 商品传输类
     */
    void addCommodity(CommodityDetailModel commodityDetailModel);

    /**
     * 更新商品信息
     * @param commodityDetailModel 商品传输类
     */
    void updateCommodity(CommodityDetailModel commodityDetailModel);

    /**
     * 删除商品
     * @param commodityDetailModel 商品传输类
     */
    void deleteCommodity(CommodityDetailModel commodityDetailModel);

    /**
     * 删除商品
     * @param commodityId 商品 id
     */
    void deleteCommodity(int commodityId);

    /**
     * 获得单个商品信息
     * @param commodityId 商品id
     * @return CommodityDetailModel
     */
    CommodityDetailModel getCommodity(int commodityId);

    /**
     * 分页获取商品列表
     * @param page 页码
     * @param size 每页数量
     * @return List<CommodityListModel>
     */
    List<CommodityListModel> findCommodities(int page, int size);

    /**
     * 分页获取商品列表及分页信息
     * @param page 页码
     * @param size 每页数量
     * @return PageModel<CommodityListModel>
     */
    PageModel<CommodityListModel> findCommoditiesPage(int page, int size);


}
