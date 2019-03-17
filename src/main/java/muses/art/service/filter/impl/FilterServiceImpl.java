package muses.art.service.filter.impl;
import org.apache.commons.codec.binary.Base64;
import muses.art.dao.filter.FilterDao;
import muses.art.entity.filter.Filter;
import muses.art.model.base.PageModel;
import muses.art.model.commodity.SearchModel;
import muses.art.model.filter.FilterInfoModel;
import muses.art.service.filter.FilterService;
import org.hibernate.engine.query.spi.HQLQueryPlan;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.io.FileOutputStream;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class FilterServiceImpl implements FilterService {

    @Autowired
    private FilterDao filterDao;

    @Override
    public Boolean addFilter(FilterInfoModel filterInfoModel) {
        Filter filter = new Filter();
        BeanUtils.copyProperties(filterInfoModel, filter);
        filter.setChecked(false);
        filter.setPublishDate(new Timestamp(System.currentTimeMillis()));
        filter.setVipOnly(false);
        saveBase64Image(filterInfoModel);
        filter.setCoverImage("http://muses.deepicecream.com:7010/img/filter_cover/"+filterInfoModel.getUploadId()+".png");
        filterDao.save(filter);
        return true;
    }

    private void saveBase64Image(FilterInfoModel filterInfoModel) {
        System.out.println("进入图像解码函数");
        byte[] image = Base64.decodeBase64(filterInfoModel.getBase64Image());
        String imgFilePath = "src/main/webapp/image/filter_cover/"+filterInfoModel.getUploadId()+".png"; // 指定图片要存放的位置
        try {
            FileOutputStream out = new FileOutputStream(imgFilePath); // 新建一个文件输出器，并为它指定输出位置imgFilePath
            out.write(image); // 利用文件输出器将二进制格式decodedBytes输出
            out.close(); // 关闭文件输出器
        } catch (Exception e) {
            System.out.println("文件保存失败");
        }
    }

    @Override
    public Boolean deleteFilter(Integer id) {
        Filter filter = filterDao.get(Filter.class, id);
        if (filter != null) {
            filterDao.delete(filter);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public Boolean updateFilter(Integer id, FilterInfoModel filterInfoModel) {
        Filter filter = filterDao.get(Filter.class, id);
        if (filter != null) {
            BeanUtils.copyProperties(filterInfoModel, filter);
            // TODO 根据需求细化更新属性
            filterDao.update(filter);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public FilterInfoModel findFilterById(Integer id) {
        Filter filter = filterDao.get(Filter.class, id);
        FilterInfoModel filterInfoModel = new FilterInfoModel();
        BeanUtils.copyProperties(filter, filterInfoModel);
        return filterInfoModel;
    }

    @Override
    public PageModel<FilterInfoModel> findFiltersByUserId(Integer userId, int page, int size) {
        String HQL = "from Filter where ownerId=:id order by id desc";
        Map<String, Object> map = new HashMap<>();
        map.put("id", userId);
        List<Filter> filters = filterDao.find(HQL, map, page, size);
        int totalNum = filterDao.find(HQL, map).size();
        List<FilterInfoModel> filterInfoModels = entity2model(filters);
        PageModel<FilterInfoModel> pageModel = new PageModel<>();
        pageModel.setDataList(filterInfoModels);
        pageModel.setCurrentPage(page);
        pageModel.setPageCount(totalNum % size == 0 ? totalNum / size : totalNum / size + 1);
        pageModel.setTotalNum(totalNum);
        pageModel.setPageSize(size);
        return pageModel;
    }

    @Override
    public PageModel<FilterInfoModel> findFiltersByCategoryId(Integer categoryId, int page, int size) {
        String HQL = "from Filter where categoryId=:id";
        Map<String, Object> map = new HashMap<>();
        map.put("id", categoryId);
        List<Filter> filters = filterDao.find(HQL, map, page, size);
        int totalNum = filterDao.find(HQL, map).size();
        List<FilterInfoModel> filterInfoModels = entity2model(filters);
        PageModel<FilterInfoModel> pageModel = new PageModel<>();
        pageModel.setDataList(filterInfoModels);
        pageModel.setCurrentPage(page);
        pageModel.setPageCount(totalNum % size == 0 ? totalNum / size : totalNum / size + 1);
        pageModel.setTotalNum(totalNum);
        pageModel.setPageSize(size);
        return pageModel;
    }

    @Override
    public PageModel<FilterInfoModel> searchFilters(SearchModel searchModel) {
        int size = searchModel.getSize();
        int page = searchModel.getPage();
        String keyword = searchModel.getKeyword();
        String HQL = "from Filter where filterName like :name and checked=true order by publishDate asc";
        Map<String, Object> map = new HashMap<>();
        map.put("name", "%"+keyword+"%");
        List<Filter> filters = filterDao.find(HQL, map, page, size);
        int totalNum = filterDao.find(HQL, map).size();
        List<FilterInfoModel> filterInfoModels = entity2model(filters);
        PageModel<FilterInfoModel> pageModel = new PageModel<>();
        pageModel.setDataList(filterInfoModels);
        pageModel.setCurrentPage(page);
        pageModel.setPageCount(totalNum % size == 0 ? totalNum / size : totalNum / size + 1);
        pageModel.setTotalNum(totalNum);
        pageModel.setPageSize(size);
        return pageModel;
    }

    @Override
    public Boolean useFilter(Integer uploadId) {
        String HQL = "from Filter where uploadId=:uploadId";
        Map<String, Object> map = new HashMap<>();
        map.put("uploadId", uploadId);
        List<Filter> filters = filterDao.find(HQL, map);
        if (filters.size() > 0) {
            Filter filter = filters.get(0);
            filter.setUsageCount(filter.getUsageCount()+1);
            filterDao.update(filter);
            return true;
        } else {
            return false;
        }
    }

    private List<FilterInfoModel> entity2model(List<Filter> filters) {
        List<FilterInfoModel> filterInfoModels = new ArrayList<>();
        for (Filter filter : filters) {
            FilterInfoModel filterInfoModel = new FilterInfoModel();
            BeanUtils.copyProperties(filter, filterInfoModel);
            filterInfoModels.add(filterInfoModel);
        }
        return filterInfoModels;
    }
}
