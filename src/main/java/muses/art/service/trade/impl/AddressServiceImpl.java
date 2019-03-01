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

@SuppressWarnings("Duplicates")
@Service
@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
public class AddressServiceImpl implements AddressService {

    @Autowired
    private AddressDao addressDao;

    @Override
    public Boolean addAddress(AddressModel addressModel) {
        if (addressModel.getDefaultAddress()) {
            int userId = addressModel.getUserId();
            String hql = "from Address where userId =:userId";
            Map<String, Object> map = new HashMap<>();
            map.put("userId", userId);
            List<Address> addresses = addressDao.find(hql, map);
            for (Address addr : addresses) {
                if (addr.getDefaultAddress()) {
                    addr.setDefaultAddress(false);
                    addressDao.update(addr);
                }
            }
        }
        Date data = new Date();
        java.util.Date now = new java.util.Date(data.getTime());
        Address address = model2entity(addressModel);
        address.setAddTime(now);
        address.setDefaultAddress(addressModel.getDefaultAddress());
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
        if (address.getDefaultAddress() != addressModel.getDefaultAddress() && addressModel.getDefaultAddress()) {
            int userId = addressModel.getUserId();
            String hql = "from Address where userId =:userId";
            Map<String, Object> map = new HashMap<>();
            map.put("userId", userId);
            List<Address> addresses = addressDao.find(hql, map);
            for (Address addr : addresses) {
                if (addr.getDefaultAddress()) {
                    addr.setDefaultAddress(false);
                    addressDao.update(addr);
                }
            }
        }
        if (address != null) {
            BeanUtils.copyProperties(addressModel, address);
            address.setAddTime(new java.util.Date(new Date().getTime()));
            address.setDefaultAddress(addressModel.getDefaultAddress());
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

//    @Override
//    public Boolean setDefaultAddress(AddressModel addressModel) {
//        int userId = addressModel.getUserId();
//        String hql = "from Address where userId =:userId";
//        Map<String, Object> map = new HashMap<>();
//        map.put("userId", userId);
//        List<Address> addresses = addressDao.find(hql, map);
//        for (Address address : addresses) {
//            address.setDefaultAddress(false);
//            addressDao.update(address);
//        }
//        Address address = addressDao.get(Address.class, addressModel.getId());
//        if (address != null) {
//            address.setDefaultAddress(true);
//            addressDao.update(address);
//            return true;
//        }
//        return false;
//    }

    public AddressModel getDefaultAddress(int userId) {
        String HQL = "from Address where userId =:userId and defaultAddress = true";
        Map<String, Object> map = new HashMap<>();
        map.put("userId", userId);
        Address address = addressDao.get(HQL, map);
        AddressModel addressModel = new AddressModel();
        if (address != null) {
            BeanUtils.copyProperties(address, addressModel);
            return addressModel;
        }
        return null;
    }

    private AddressModel entity2model(Address address) {
        if (address != null) {
            AddressModel addressModel = new AddressModel();
            BeanUtils.copyProperties(address, addressModel);
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
            BeanUtils.copyProperties(addressModel, address);
            return address;
        } else {
            return null;
        }
    }

}
