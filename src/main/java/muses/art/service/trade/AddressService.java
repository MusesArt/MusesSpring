package muses.art.service.trade;

import muses.art.model.trade.AddressModel;

import java.util.List;

public interface AddressService {
    //添加地址(id为用户id)
    boolean addAddressService(AddressModel addressModel,int id);

    //删除地址(根据地址id删除)
    boolean deleteAddressService(int id);

    //编辑地址（id为地址id）
    boolean editAddressService(AddressModel addressModel,int id);

    //根据地址id得到详细地址
    AddressModel getAddressByIdService(int id);

    //列出某个用户所有的地址
    List<AddressModel> getAllAddress(int id);


}
