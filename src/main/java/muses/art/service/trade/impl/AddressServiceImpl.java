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

import java.util.*;

@Service
@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
public class AddressServiceImpl implements AddressService {

    @Autowired
    private AddressDao addressDao;


    @Override
    public Boolean addAddress(AddressModel addressModel, int id) {
        Date data = new Date();
        java.sql.Date now = new java.sql.Date(data.getTime());
        addressModel.setAddTime(now);
        Address address = new Address();
        BeanUtils.copyProperties(addressModel,address);
        address.setUserId(id);
        addressDao.save(address);
        return true;
    }

    @Override
    public Boolean deleteAddress(int id) {
        Address address = addressDao.get(Address.class,id);
        addressDao.delete(address);
        return true;
    }

    @Override
    public Boolean updateAddressById(AddressModel addressModel, int id) {
        Address address = new Address();
        BeanUtils.copyProperties(addressModel,address);
        address.setId(id);
        addressDao.update(address);
        return true;
    }

    @Override
    public AddressModel findAddressById(int id) {
        Address address = addressDao.get(Address.class,id);
        AddressModel addressModel = new AddressModel();
        BeanUtils.copyProperties(address,addressModel);
        return addressModel;
    }


    @Override
    public List<AddressModel> findAllAddressByUserId(int id) {
        String hql = "from Address add where add.userId = :userId";
        Map<String,Object> map = new HashMap<>();
        map.put("userId",id);
        List<Address> list = addressDao.find(hql,map);
        List<AddressModel> addressModels = new ArrayList<>();
        for(Address address : list){
            AddressModel addressModel = new AddressModel();
            BeanUtils.copyProperties(address,addressModel);
            addressModels.add(addressModel);
        }
        return addressModels;
    }

}
