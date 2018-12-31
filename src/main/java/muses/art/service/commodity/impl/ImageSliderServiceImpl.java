package muses.art.service.commodity.impl;

import muses.art.dao.commodity.ImageSliderDao;
import muses.art.entity.commodity.ImageSlider;
import muses.art.model.commodity.ImageSliderModel;
import muses.art.service.commodity.ImageSliderService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

@Service
@Transactional
public class ImageSliderServiceImpl implements ImageSliderService {

    @Autowired
    private ImageSliderDao imageSliderDao;

    @Override
    public Boolean addImageSlider(ImageSliderModel imageSliderModel, int user_id) {
        Date date = new Date();
        java.util.Date now = new java.util.Date(date.getTime());
        ImageSlider imageSlider = new ImageSlider();
        //活动开始时间必须大于等于当前时间
        if(now.compareTo(imageSliderModel.getLaunchData())>=0) {
            BeanUtils.copyProperties(imageSliderModel, imageSlider);
            imageSliderModel.setManagerId(user_id);
            imageSliderDao.save(imageSlider);
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public Boolean deleteImageSlider(int id) {
        ImageSlider imageSlider = imageSliderDao.get(ImageSlider.class,id);
        imageSliderDao.delete(imageSlider);
        return true;
    }

    @Override
    public Boolean updateImageSlider(ImageSliderModel imageSliderModel) {
        ImageSlider imageSlider = imageSliderDao.get(ImageSlider.class,imageSliderModel.getId());
        imageSliderDao.update(imageSlider);
        return true;
    }

    @Override
    public List<ImageSliderModel> listImageSlider() {
        String hql = "from ImageSlider image order by image.launchData";
        Map<String,Object> map = new HashMap<>();
        List<ImageSlider> imageSliders = imageSliderDao.find(hql,1,4);
        List<ImageSliderModel> imageSliderModels = new ArrayList<ImageSliderModel>();
        for(ImageSlider imageSlider : imageSliders){
            ImageSliderModel imageSliderModel = new ImageSliderModel();
            BeanUtils.copyProperties(imageSlider,imageSliderModel);
            imageSliderModels.add(imageSliderModel);
        }
        return imageSliderModels;
    }


}
