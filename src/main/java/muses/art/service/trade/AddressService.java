package muses.art.service.trade;

import muses.art.model.trade.AddressModel;

import java.util.List;

public interface AddressService {

    /**
     * 添加地址
     * @param addressModel
     * @return
     */
    Boolean addAddress(AddressModel addressModel);

    /**
     * 根据地址id删除
     * @param id 地址id
     * @return
     */
    Boolean deleteAddress(int id);

    /**
     * 编辑地址（id为地址id）
     * @param addressModel
     * @return
     */
    Boolean updateAddress(AddressModel addressModel);

    /**
     * 根据地址id得到详细地址
     * @param id 地址id
     * @return
     */
    AddressModel findAddressById(int id);

    //列出某个用户所有的地址

    /**
     * 列出某个用户所有的地址
     * @param id 用户id
     * @return
     */
    List<AddressModel> findAllAddressByUserId(int id);

//    /**
//     * 设置默认地址
//     * @return
//     */
//    Boolean setDefaultAddress(AddressModel addressModel);

    /**
     * 获取用户默认收货地址
     * @param userId 用户id
     * @return
     */
    AddressModel getDefaultAddress(int userId);


}
