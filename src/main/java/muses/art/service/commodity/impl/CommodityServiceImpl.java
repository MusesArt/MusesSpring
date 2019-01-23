package muses.art.service.commodity.impl;

import muses.art.dao.commodity.CommodityDao;
import muses.art.entity.commodity.Attribute;
import muses.art.entity.commodity.Commodity;
import muses.art.entity.commodity.Image;
import muses.art.entity.commodity.Parameter;
import muses.art.model.base.PageModel;
import muses.art.model.commodity.AttributeModel;
import muses.art.model.commodity.CommodityDetailModel;
import muses.art.model.commodity.CommodityListModel;
import muses.art.model.commodity.ParameterModel;
import muses.art.service.commodity.CommodityService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Date;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Transactional
public class CommodityServiceImpl implements CommodityService {

    @Autowired
    private CommodityDao commodityDao;

    @Override
    public void addCommodity(CommodityDetailModel commodityDetailModel) {
        Commodity commodity = detailModel2entity(commodityDetailModel);
        commodityDao.save(commodity);
    }

    @Override
    public void updateCommodity(CommodityDetailModel commodityDetailModel) {
        int id = commodityDetailModel.getId();
        Commodity commodity = detailModel2entity(commodityDao.get(Commodity.class, id), commodityDetailModel);
        commodityDao.update(commodity);
    }

    @Override
    public void deleteCommodity(CommodityDetailModel commodityDetailModel) {
        int id = commodityDetailModel.getId();
        deleteCommodity(id);
    }

    @Override
    public Boolean deleteCommodity(int commodityId) {
        Commodity commodity = commodityDao.get(Commodity.class, commodityId);
        if (commodity != null) {
            commodityDao.delete(commodity);
            return true;
        } else {
            return false;
        }
    }

    @Override
    public CommodityDetailModel getCommodity(int commodityId) {
        Commodity commodity = commodityDao.get(Commodity.class, commodityId);
        return entity2detailModel(commodity);
    }

    @Override
    public List<CommodityListModel> findCommodities(String keyword, int page, int size) {
        if ("".equals(keyword) || keyword == null) { // 没有搜索关键词
            String HQL = "from Commodity order by name asc, soldNum desc, discountPrice asc, updateTime desc";
            List<Commodity> commodities = commodityDao.find(HQL, page, size);
            return entity2listModel(commodities);
        } else { // 有搜索关键词
            String HQL = "from Commodity where name like :name or brief like :brief order by name asc, soldNum desc, discountPrice asc, updateTime asc";
            Map<String, Object> map = new HashMap<>();
            map.put("name", "%" + keyword + "%");
            map.put("brief", "%" + keyword + "%");
            List<Commodity> commodities = commodityDao.find(HQL, map, page, size);
            return entity2listModel(commodities);
        }
    }

    @Override
    public List<CommodityListModel> findCommoditiesOrderByTime(String keyword, int page, int size, Boolean isASC) {
        if ("".equals(keyword) || keyword == null) { // 没有搜索关键词
            String HQL = isASC ? "from Commodity order by updateTime asc" : "from Commodity order by updateTime desc";
            List<Commodity> commodities = commodityDao.find(HQL, page, size);
            return entity2listModel(commodities);
        } else { // 有搜索关键词
            String HQL = isASC ? "from Commodity where name like :name or brief like :brief order by updateTime asc" : "from Commodity where name like :name or brief like :brief order by updateTime desc";
            Map<String, Object> map = new HashMap<>();
            map.put("name", "%"+keyword+"%");
            map.put("brief", "%"+keyword+"%");
            List<Commodity> commodities = commodityDao.find(HQL, map, page, size);
            return entity2listModel(commodities);
        }

    }

    @Override
    public List<CommodityListModel> findCommoditiesOrderByPrice(String keyword, int page, int size, Boolean isASC) {
        if ("".equals(keyword) || keyword == null) { // 没有搜索关键词
            String HQL = isASC ? "from Commodity order by discountPrice asc" : "from Commodity order by discountPrice desc";
            List<Commodity> commodities = commodityDao.find(HQL, page, size);
            return entity2listModel(commodities);
        } else { // 有搜索关键词
            String HQL = isASC ? "from Commodity where name like :name or brief like :brief order by discountPrice asc" : "from Commodity where name like :name or brief like :brief order by discountPrice desc";
            Map<String, Object> map = new HashMap<>();
            map.put("name", "%"+keyword+"%");
            map.put("brief", "%"+keyword+"%");
            List<Commodity> commodities = commodityDao.find(HQL, map, page, size);
            return entity2listModel(commodities);
        }
    }

    @Override
    public List<CommodityListModel> findCommoditiesOrderBySalesVolume(String keyword, int page, int size, Boolean isASC) {
        if ("".equals(keyword) || keyword == null) { // 没有搜索关键词
            String HQL = isASC ? "from Commodity order by soldNum asc" : "from Commodity order by soldNum desc";
            List<Commodity> commodities = commodityDao.find(HQL, page, size);
            return entity2listModel(commodities);
        } else { // 有搜索关键词
            String HQL = isASC ? "from Commodity where name like :name or brief like :brief order by soldNum asc" : "from Commodity where name like :name or brief like :brief order by soldNum desc";
            Map<String, Object> map = new HashMap<>();
            map.put("name", "%"+keyword+"%");
            map.put("brief", "%"+keyword+"%");
            List<Commodity> commodities = commodityDao.find(HQL, map, page, size);
            return entity2listModel(commodities);
        }
    }

    @Override
    public PageModel<CommodityListModel> findCommoditiesPage(String keyword, int page, int size) {
        List<CommodityListModel> models = findCommodities(keyword, page, size);
        int totalNum = count(keyword);
        return new PageModel<>(page, size, totalNum, models);
    }

    @Override
    public PageModel<CommodityListModel> findCommoditiesPageOrderByTime(String keyword, int page, int size, Boolean isASC) {
        List<CommodityListModel> models = findCommoditiesOrderByTime(keyword, page, size, isASC);
        int totalNum = count(keyword);
        return new PageModel<>(page, size, totalNum, models);
    }

    @Override
    public PageModel<CommodityListModel> findCommoditiesPageOrderByPrice(String keyword, int page, int size, Boolean isASC) {
        List<CommodityListModel> models = findCommoditiesOrderByPrice(keyword, page, size, isASC);
        int totalNum = count(keyword);
        return new PageModel<>(page, size, totalNum, models);
    }

    @Override
    public PageModel<CommodityListModel> findCommoditiesPageOrderBySalesVolume(String keyword, int page, int size, Boolean isASC) {
        List<CommodityListModel> models = findCommoditiesOrderBySalesVolume(keyword, page, size, isASC);
        int totalNum = count(keyword);
        return new PageModel<>(page, size, totalNum, models);
    }

    private int count(String keyword) {
        if ("".equals(keyword) || keyword == null) { // 没有搜索关键词
            return commodityDao.count("select count(*) from Commodity").intValue();
        } else { // 有搜索关键词
            String HQL = "select count(*) from Commodity where name like :name or brief like :brief";
            Map<String, Object> map = new HashMap<>();
            map.put("name", "%" + keyword + "%");
            map.put("brief", "%" + keyword + "%");
            return commodityDao.count(HQL, map).intValue();
        }
    }

    //添加新商品
    private Commodity detailModel2entity(CommodityDetailModel model) {
        if (model != null) {
            Commodity commodity = detailModel2entity(new Commodity(), model);
            commodity.setAddTime(new Date(System.currentTimeMillis()));
            return commodity;
        } else {
            return null;
        }

    }

    //更新商品
    private Commodity detailModel2entity(Commodity commodity, CommodityDetailModel model) {
        BeanUtils.copyProperties(commodity, model);
        commodity.setUpdateTime(new Date(System.currentTimeMillis()));
        return commodity;
    }

    //获取单个商品详细信息
    private CommodityDetailModel entity2detailModel(Commodity commodity) {
        if (commodity != null) {
            CommodityDetailModel model = new CommodityDetailModel();
            BeanUtils.copyProperties(commodity, model);
            model.setImageUrls(entity2imageUrls(commodity.getImages()));
            List<AttributeModel> attributeModels = new ArrayList<>();
            for (Attribute attribute : commodity.getAttributes()) {
                AttributeModel attributeModel = new AttributeModel();
                BeanUtils.copyProperties(attribute, attributeModel);
                List<ParameterModel> parameterModels = new ArrayList<>();
                for (Parameter parameter:attribute.getParameters()) {
                    ParameterModel parameterModel = new ParameterModel();
                    BeanUtils.copyProperties(parameter, parameterModel);
                    parameterModels.add(parameterModel);
                }
                attributeModel.setParameters(parameterModels);
                attributeModels.add(attributeModel);
            }
            model.setAttributes(attributeModels);
            return model;
        } else {
            return null;
        }
    }

    //获取单个商品简略信息
    private CommodityListModel entity2listModel(Commodity commodity) {
        if (commodity != null) {
            CommodityListModel model = new CommodityListModel();
            BeanUtils.copyProperties(commodity, model);
            return model;
        }
        return null;
    }

    //获取列表商品简略信息
    private List<CommodityListModel> entity2listModel(List<Commodity> commodities) {
        if (commodities != null && commodities.size() > 0) {
            List<CommodityListModel> models = new ArrayList<>();
            for (Commodity commodity : commodities) {
                models.add(entity2listModel(commodity));
            }
            return models;
        }
        return null;
    }

    //获取图片链接
    private List<String> entity2imageUrls(List<Image> images) {
        if (images != null && images.size() > 0) {
            List<String> imageUrls = new ArrayList<>();
            for (Image image : images) {
                imageUrls.add(image.getImageUrl());
            }
            return imageUrls;
        } else {
            return null;
        }
    }
}