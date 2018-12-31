package muses.art.service.trade;

import muses.art.model.trade.AddressModel;

import java.util.List;

public interface AddressService {

    /**
     * 添加地址
     * @param addressModel
     * @param id 用户id
     * @return
     */
    Boolean addAddress(AddressModel addressModel, int id);

    /**
     * 根据地址id删除
     * @param id 地址id
     * @return
     */
    Boolean deleteAddress(int id);

    /**
     * 编辑地址（id为地址id）
     * @param addressModel
     * @param id 地址id
     * @return
     */
    Boolean updateAddressById(AddressModel addressModel, int id);

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


}
