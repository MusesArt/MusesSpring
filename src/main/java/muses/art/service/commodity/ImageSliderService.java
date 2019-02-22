package muses.art.service.commodity;

import muses.art.model.commodity.ImageSliderModel;

import java.util.List;

public interface ImageSliderService {
    //管理员添加轮播图
    Boolean addImageSlider(ImageSliderModel imageSliderModel, int user_id);
    //管理员撤销轮播图(id为轮播图id)
    Boolean deleteImageSlider(int id);
    //更新轮播图相关信息
    Boolean updateImageSlider(ImageSliderModel imageSliderModel);
    //展示轮播图
    List<ImageSliderModel> listImageSlider();
}
