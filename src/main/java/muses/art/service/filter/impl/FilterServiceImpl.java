package muses.art.service.filter.impl;

import muses.art.dao.filter.FilterDao;
import muses.art.service.filter.FilterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FilterServiceImpl implements FilterService {
    
    @Autowired
    private FilterDao filterDao;
}
