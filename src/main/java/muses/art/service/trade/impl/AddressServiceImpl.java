package muses.art.service.trade.impl;

import muses.art.dao.trade.AddressDao;
import muses.art.service.trade.AddressService;
import org.springframework.beans.factory.annotation.Autowired;

public class AddressServiceImpl implements AddressService {

    @Autowired
    private AddressDao addressDao;
}
