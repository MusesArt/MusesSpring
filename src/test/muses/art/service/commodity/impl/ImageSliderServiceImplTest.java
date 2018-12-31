package muses.art.service.commodity.impl;

import muses.art.entity.commodity.ImageSlider;
import muses.art.model.commodity.ImageSliderModel;
import muses.art.service.commodity.ImageSliderService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/META-INF/applicationContext.xml", "classpath:/META-INF/spring-mvc.xml"})
public class ImageSliderServiceImplTest extends AbstractJUnit4SpringContextTests {
    @Autowired
    private ImageSliderService imageSliderService;

    @Test
    public void addImageSlider(){
        ImageSliderModel imageSliderModel = new ImageSliderModel();
        imageSliderModel.setImageUrl("/image/1.jsp");
        imageSliderModel.setLinkUrl("www.baidu.com");
        Date date = new Date();
        java.sql.Date now = new java.sql.Date(date.getTime());
        imageSliderModel.setLaunchData(now);
        imageSliderService.addImageSlider(imageSliderModel,1);
    }
    @Test
    public void deleteImageSlider(){
        imageSliderService.deleteImageSlider(2);
    }

    @Test
    public void listImageSlider(){
        List<ImageSliderModel> imageSliderModels = imageSliderService.listImageSlider();
        for(ImageSliderModel imageSliderModel : imageSliderModels)
            System.out.println("活动时间是:"+imageSliderModel.getLaunchData());
    }

    @Test
    public void updateImageSlider(){
        ImageSliderModel imageSliderModel = new ImageSliderModel();
        imageSliderModel.setId(2);
        imageSliderService.updateImageSlider(imageSliderModel);
    }
}
