package muses.art.service.commodity.impl;

import muses.art.dao.commodity.ImageDao;
import muses.art.service.commodity.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImageServiceImpl implements ImageService {

    @Autowired
    private ImageDao imageDao;
}
