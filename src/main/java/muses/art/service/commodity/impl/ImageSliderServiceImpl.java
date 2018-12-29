package muses.art.service.commodity.impl;

import muses.art.dao.commodity.ImageSliderDao;
import muses.art.service.commodity.ImageSliderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImageSliderServiceImpl implements ImageSliderService {

    @Autowired
    private ImageSliderDao imageSliderDao;
}
