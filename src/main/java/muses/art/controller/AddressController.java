package muses.art.controller;

import muses.art.model.base.StatusModel;
import muses.art.model.trade.AddressModel;
import muses.art.service.trade.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("api/address")
public class AddressController {

    @Autowired
    private AddressService addressService;

    // 返回该用户所有的地址
    @CrossOrigin(origins = "*", maxAge = 3600)
    @RequestMapping(value = "/list/{userId}", method = RequestMethod.GET)
    public @ResponseBody StatusModel<List<AddressModel>> getAllAddress(@PathVariable int userId) {
        List<AddressModel> addressModels = addressService.findAllAddressByUserId(userId);
        return new StatusModel<>("获取地址列表成功", StatusModel.OK, addressModels);
    }

    // 清空该用户的地址
    @CrossOrigin(origins = "*", maxAge = 3600)
    @RequestMapping(value = "/list/{userId}", method = RequestMethod.DELETE)
    public @ResponseBody StatusModel deleteAddress(@PathVariable int userId) {
        List<AddressModel> addressModels = addressService.findAllAddressByUserId(userId);
        if (addressModels != null) {
            for (AddressModel addressModel : addressModels) {
                addressService.deleteAddress(addressModel.getId());
            }
            return new StatusModel<>("清空用户地址成功", StatusModel.OK);
        }
        return new StatusModel<>("用户地址已清空", StatusModel.ERROR);
    }

    //增加地址
    @CrossOrigin(origins = "*", maxAge = 3600)
    @RequestMapping(value = "/", method = RequestMethod.POST)
    public @ResponseBody StatusModel addAddress(@RequestBody AddressModel addressModel) {
        Boolean flag = addressService.addAddress(addressModel);
        if (flag) {
            return new StatusModel<>("添加地址成功", StatusModel.OK);
        }
        return new StatusModel<>("添加地址失败", StatusModel.ERROR);
    }

    //编辑地址
    @CrossOrigin(origins = "*",maxAge = 3600)
    @RequestMapping(value = "/{id}", method = RequestMethod.POST)
    public @ResponseBody StatusModel modifyAddress(@RequestBody AddressModel addressModel, @PathVariable int id){
        Boolean flag = addressService.updateAddress(addressModel);
        if (flag) {
            return new StatusModel<>("编辑地址成功", StatusModel.OK);
        }
        return new StatusModel<>("编辑地址失败", StatusModel.ERROR);
    }

    //得到用户某地址的详细信息
    @CrossOrigin(origins = "*", maxAge = 3600)
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public @ResponseBody StatusModel<AddressModel> getAddressItem(@PathVariable int id) {
        AddressModel addressModel = addressService.findAddressById(id);
        if (addressModel != null) {
            return new StatusModel<>("获取地址成功", StatusModel.OK, addressModel);
        }
        return new StatusModel<>("获取地址失败", StatusModel.ERROR, addressModel);
    }

    @CrossOrigin(origins = "*", maxAge = 3600)
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public @ResponseBody StatusModel<AddressModel> deleteAddressItem(@PathVariable int id) {
        Boolean flag = addressService.deleteAddress(id);
        if (flag) {
            return new StatusModel<>("删除地址成功", StatusModel.OK);
        } else {
            return new StatusModel<>("删除地址失败", StatusModel.ERROR);
        }
    }

    @ResponseBody
    @CrossOrigin(origins = "*", maxAge = 3600)
    @RequestMapping(value = "/default", method = RequestMethod.POST)
    public StatusModel<AddressModel> setDefaultAddress(@RequestBody AddressModel addressModel) {
        Boolean flag = addressService.setDefaultAddress(addressModel);
        if (flag) {
            return new StatusModel<>("设置默认地址成功", StatusModel.OK);
        } else {
            return new StatusModel<>("设置默认地址失败", StatusModel.ERROR);
        }
    }


    @ResponseBody
    @CrossOrigin(origins = "*", maxAge = 3600)
    @RequestMapping(value = "/default/{userId}", method = RequestMethod.GET)
    public StatusModel<AddressModel> getDefaultAddress(@PathVariable int userId) {
        AddressModel addressModel = addressService.getDefaultAddress(userId);
        if (addressModel != null) {
            return new StatusModel<>("获取默认地址成功", StatusModel.OK, addressModel);
        } else {
            return new StatusModel<>("未设置默认地址", StatusModel.ERROR);
        }
    }
}
