package muses.art.controller;

import muses.art.model.base.StatusModel;
import muses.art.model.commodity.ImageSliderModel;
import muses.art.service.commodity.ImageSliderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("api/banner")
public class  BannerController {

    @Autowired
    ImageSliderService imageSliderService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public @ResponseBody StatusModel<List<ImageSliderModel>> listBanner() {
        List<ImageSliderModel> imageSliderModels = imageSliderService.listImageSlider();
        return new StatusModel<>("加载成功", StatusModel.OK, imageSliderModels);
    }
}
