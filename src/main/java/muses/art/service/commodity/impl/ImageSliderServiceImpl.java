package muses.art.service.commodity.impl;

import com.sun.prism.Image;
import muses.art.dao.commodity.ImageSliderDao;
import muses.art.entity.commodity.ImageSlider;
import muses.art.model.commodity.ImageSliderModel;
import muses.art.service.commodity.ImageSliderService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

@Service
@Transactional
public class ImageSliderServiceImpl implements ImageSliderService {

    @Autowired
    private ImageSliderDao imageSliderDao;

    @Override
    public boolean addImageSlider(ImageSliderModel imageSliderModel,int user_id) {
        Date date = new Date();
        java.sql.Date now = new java.sql.Date(date.getTime());
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
    public boolean deleteImageSlider(int id) {
        ImageSlider imageSlider = imageSliderDao.get(ImageSlider.class,id);
        imageSliderDao.delete(imageSlider);
        return true;
    }

    @Override
    public boolean updateImageSlider(ImageSliderModel imageSliderModel) {
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
