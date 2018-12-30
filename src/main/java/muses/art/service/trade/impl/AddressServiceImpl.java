package muses.art.service.trade.impl;

import muses.art.dao.trade.AddressDao;
import muses.art.entity.trade.Address;
import muses.art.model.trade.AddressModel;
import muses.art.service.trade.AddressService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

@Service
@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
public class AddressServiceImpl implements AddressService {

    @Autowired
    private AddressDao addressDao;


    @Override
    public boolean addAddressService(AddressModel addressModel,int id) {
        Date data = new Date();
        java.sql.Date now = new java.sql.Date(data.getTime());
        addressModel.setAddTime(now);
        Address address = new Address();
        BeanUtils.copyProperties(addressModel,address);
        address.setUserId(id);
        addressDao.save(address);
        return true;
    }
}
