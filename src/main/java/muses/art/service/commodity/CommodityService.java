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
     * 分页获取商品列表（综合）
     * @param page 页码
     * @param size 每页数量
     * @return List<CommodityListModel>
     */
    List<CommodityListModel> findCommodities(int page, int size);

    /**
     * 分页获取商品列表（时间）
     * @param page 页码
     * @param size 每页数量
     * @param isASC 是否升序
     * @return List<CommodityListModel>
     */
    List<CommodityListModel> findCommoditiesOrderByTime(String keyword, int page, int size, Boolean isASC);

    /**
     * 分页获取商品列表（价格）
     * @param page 页码
     * @param size 每页数量
     * @param isASC 是否升序
     * @return List<CommodityListModel>
     */
    List<CommodityListModel> findCommoditiesOrderByPrice(String keyword, int page, int size, Boolean isASC);

    /**
     * 分页获取商品列表（销量）
     * @param page 页码
     * @param size 每页数量
     * @param isASC 是否升序
     * @return List<CommodityListModel>
     */
    List<CommodityListModel> findCommoditiesOrderBySalesVolume(String keyword, int page, int size, Boolean isASC);

    /**
     * 分页获取商品列表及分页信息（综合）
     * @param page 页码
     * @param size 每页数量
     * @return PageModel<CommodityListModel>
     */
    PageModel<CommodityListModel> findCommoditiesPage(int page, int size);

    /**
     * 分页获取商品列表及分页信息（时间）
     * @param page 页码
     * @param size 每页数量
     * @param isASC 是否升序
     * @return PageModel<CommodityListModel>
     */
    PageModel<CommodityListModel> findCommoditiesPageOrderByTime(String keyword, int page, int size, Boolean isASC);

    /**
     * 分页获取商品列表及分页信息（价格）
     * @param page 页码
     * @param size 每页数量
     * @param isASC 是否升序
     * @return PageModel<CommodityListModel>
     */
    PageModel<CommodityListModel> findCommoditiesPageOrderByPrice(String keyword, int page, int size, Boolean isASC);

    /**
     * 分页获取商品列表及分页信息（销量）
     * @param page 页码
     * @param size 每页数量
     * @param isASC 是否升序
     * @return PageModel<CommodityListModel>
     */
    PageModel<CommodityListModel> findCommoditiesPageOrderBySalesVolume(String keyword, int page, int size, Boolean isASC);
}
