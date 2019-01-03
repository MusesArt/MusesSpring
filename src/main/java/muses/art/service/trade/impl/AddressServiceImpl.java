package muses.art.service.trade.impl;

import muses.art.dao.trade.AddressDao;
import muses.art.entity.trade.Address;
import muses.art.model.trade.AddressModel;
import muses.art.service.trade.AddressService;
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
    public Boolean addAddress(AddressModel addressModel) {
        Date data = new Date();
        java.util.Date now = new java.util.Date(data.getTime());
        addressModel.setAddTime(now);
        Address address = model2entity(addressModel);
        addressDao.save(address);
        return true;
    }

    @Override
    public Boolean deleteAddress(int id) {
        Address address = addressDao.get(Address.class, id);
        System.out.println(address);
        if (address != null) {
            addressDao.delete(address);
            return true;
        }
        return false;
    }

    @Override
    public Boolean updateAddress(AddressModel addressModel) {
        Address address = addressDao.get(Address.class, addressModel.getId());
        if (address != null) {
            address.setAddress(addressModel.getAddress());
            address.setCity(addressModel.getCity());
            address.setAddTime(new java.util.Date(new Date().getTime()));
            address.setDistrict(addressModel.getDistrict());
            address.setProvince(addressModel.getProvince());
            address.setSignerMobile(addressModel.getSignerMobile());
            address.setSignerName(addressModel.getSignerName());
            addressDao.update(address);
            return true;
        }
        return false;
    }

    @Override
    public AddressModel findAddressById(int id) {
        Address address = addressDao.get(Address.class, id);
        return entity2model(address);
    }


    @Override
    public List<AddressModel> findAllAddressByUserId(int id) {
        String hql = "from Address add where add.userId = :userId";
        Map<String, Object> map = new HashMap<>();
        map.put("userId", id);
        List<Address> addresses = addressDao.find(hql, map);
        return entity2model(addresses);
    }

    private AddressModel entity2model(Address address) {
        if (address != null) {
            AddressModel addressModel = new AddressModel();
            addressModel.setAddress(address.getAddress());
            addressModel.setCity(address.getCity());
            addressModel.setAddTime(address.getAddTime());
            addressModel.setDistrict(address.getDistrict());
            addressModel.setId(address.getId());
            addressModel.setProvince(address.getProvince());
            addressModel.setSignerMobile(address.getSignerMobile());
            addressModel.setSignerName(address.getSignerName());
            return addressModel;
        } else {
            return null;
        }
    }

    private List<AddressModel> entity2model(List<Address> addresses) {
        List<AddressModel> addressModels = new ArrayList<>();
        if (addresses != null && addresses.size() > 0) {
            for (Address address : addresses) {
                addressModels.add(entity2model(address));
            }
            return addressModels;
        }
        return null;
    }


    private Address model2entity(AddressModel addressModel) {
        if (addressModel != null) {
            Address address = new Address();
            address.setAddress(addressModel.getAddress());
            address.setCity(addressModel.getCity());
            address.setAddTime(addressModel.getAddTime());
            address.setDistrict(addressModel.getDistrict());
            address.setId(addressModel.getId());
            address.setUserId(addressModel.getUserId());
            address.setProvince(addressModel.getProvince());
            address.setSignerMobile(addressModel.getSignerMobile());
            address.setSignerName(addressModel.getSignerName());
            return address;
        } else {
            return null;
        }
    }

}
