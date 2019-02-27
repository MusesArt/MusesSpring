package muses.art.service.filter;

import muses.art.model.base.PageModel;
import muses.art.model.filter.FilterInfoModel;


public interface FilterService {
    /**
     * gpu服务器向web服务器传输模型信息
     * @param filterInfoModel 滤镜信息
     * @return 操作的状态
     */
    Boolean addFilter(FilterInfoModel filterInfoModel);

    /**
     * 删除滤镜
     * @param id 滤镜id
     * @return 操作的状态
     */
    Boolean deleteFilter(Integer id);

    /**
     * 更新滤镜信息
     * @param id 滤镜id
     * @param filterInfoModel 滤镜信息
     * @return 操作的状态
     */
    Boolean updateFilter(Integer id, FilterInfoModel filterInfoModel);

    /**
     * 根据滤镜id查找滤镜
     * @param id 滤镜id
     * @return 滤镜信息
     */
    FilterInfoModel findFilterById(Integer id);

    /**
     * 根据用户id查找滤镜
     * @param userId 用户id
     * @return 滤镜列表
     */
    PageModel<FilterInfoModel> findFiltersByUserId(Integer userId, int page, int size);

    /**
     * 根据滤镜分类id查找滤镜
     * @param categoryId 商品id
     * @return 滤镜列表
     */
    PageModel<FilterInfoModel> findFiltersByCategoryId(Integer categoryId, int page, int size);

    /**
     * 搜索滤镜
     * @param keyword 搜索关键词
     * @param page 页数
     * @return
     */
    PageModel<FilterInfoModel> searchFilters(String keyword, int page, int size);

}
