package muses.art.service.operation.impl;

import muses.art.dao.commodity.CommodityDao;
import muses.art.dao.operation.UserFavCommodityDao;
import muses.art.entity.commodity.Commodity;
import muses.art.entity.operation.UserFavCommodity;
import muses.art.model.operation.FavCommodityModel;
import muses.art.service.operation.UserFavCommodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

@Service
@Transactional
public class UserFavCommodityServiceImpl implements UserFavCommodityService {

    @Autowired
    private UserFavCommodityDao userFavCommodityDao;

    @Autowired
    private CommodityDao commodityDao;

    @Override
    public Boolean addFavCommodity(int userId, int commodityId) {
        UserFavCommodity userFavCommodity = new UserFavCommodity();
        userFavCommodity.setUserId(userId);
        userFavCommodity.setCommodityId(commodityId);
        userFavCommodity.setPrice(commodityDao.get(Commodity.class, commodityId).getDiscountPrice());
        userFavCommodity.setAddTime(new Date(System.currentTimeMillis()));
        userFavCommodityDao.save(userFavCommodity);
        return true;
    }

    @Override
    public Boolean deleteFavCommodity(int id) {
        UserFavCommodity userFavCommodity = userFavCommodityDao.get(UserFavCommodity.class, id);
        if (userFavCommodity != null) {
            userFavCommodityDao.delete(userFavCommodity);
            return true;
        }
        return false;
    }

    @Override
    public FavCommodityModel findFavCommodityById(int id) {
        UserFavCommodity userFavCommodity = userFavCommodityDao.get(UserFavCommodity.class, id);
        if (userFavCommodity == null) {
            return null;
        } else {
            return entity2model(userFavCommodity);
        }
    }

    @Override
    public List<FavCommodityModel> findFavCommodityByUserId(int userId) {
        String HQL = "from UserFavCommodity u where userId=:id";
        Map<String, Object> map = new HashMap<>();
        map.put("id", userId);
        List<UserFavCommodity> userFavCommodities = userFavCommodityDao.find(HQL, map);
        return entity2model(userFavCommodities);
    }

    private FavCommodityModel entity2model(UserFavCommodity userFavCommodity) {
        FavCommodityModel fav = new FavCommodityModel();
        Commodity commodity = userFavCommodity.getCommodity();
        fav.setId(userFavCommodity.getId());
        fav.setCommodityId(commodity.getId());
        fav.setContent(commodity.getBrief());
        if (commodity.getDiscountPrice() < userFavCommodity.getPrice()) {
            fav.setMessage("降价通知");
        }
        fav.setCollectPrice(userFavCommodity.getPrice());
        fav.setPrice(commodity.getDiscountPrice());
        fav.setSrc(commodity.getCoverImage());
        fav.setTitle(commodity.getName());
        return fav;
    }

    private List<FavCommodityModel> entity2model(List<UserFavCommodity> favs) {
        List<FavCommodityModel> favModels = new ArrayList<>();
        for (UserFavCommodity fav : favs) {
            favModels.add(entity2model(fav));
        }
        return favModels;
    }

    @Override
    public List<UserFavCommodity> findFavCommodityByUserIdAndCommodityId(int userId, int commodityId) {
        String HQL = "from UserFavCommodity where userId=:id1 and commodityId=:id2";
        Map<String, Object> map = new HashMap<>();
        map.put("id1", userId);
        map.put("id2", commodityId);
        List<UserFavCommodity> userFavCommodities = userFavCommodityDao.find(HQL, map);
        return userFavCommodities;
    }

    @Override
    public Boolean deleteAllFavCommodity(Integer userId) {
        String HQL = "from UserFavCommodity where userId=:id";
        Map<String, Object> map = new HashMap<>();
        map.put("id", userId);
        List<UserFavCommodity> userFavCommodities = userFavCommodityDao.find(HQL, map);
        if (!userFavCommodities.isEmpty()) {
            userFavCommodities.removeAll(userFavCommodities);
        }
        return true;
    }
}
