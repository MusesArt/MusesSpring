package muses.art.controller;

import muses.art.model.trade.AddressModel;
import muses.art.service.trade.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("api/address")
public class AddressController {

    @Autowired
    private AddressService addressService;

    //返回该用户所有的地址
    @CrossOrigin(origins="*",maxAge=3600)
    @ResponseBody
    @RequestMapping(value = "/list",method = RequestMethod.GET)
    public List<AddressModel> getAllAddress(){
        //用户id为1
        int id = 1;
        List<AddressModel> list = addressService.getAllAddress(id);
        return list;
    }

    //删除该用户的地址
    @CrossOrigin(origins = "*",maxAge = 3600)
    @ResponseBody
    @RequestMapping(value = "/list",method = RequestMethod.DELETE)
    public void deleteAddress(@RequestParam(value = "Id") int id){
        addressService.deleteAddressService(id);
    }

    //增加地址
    @CrossOrigin(origins = "*",maxAge = 3600)
    @ResponseBody
    @RequestMapping(value = "/list",method = RequestMethod.POST)
    public void addAddress(AddressModel addressModel){
        //用户id为1
        int id = 1;
        addressService.addAddressService(addressModel,id);
    }

    //编辑地址
    @CrossOrigin(origins = "*",maxAge = 3600)
    @ResponseBody
    @RequestMapping(value = "/list",method = RequestMethod.POST)
    public void modifyAddress(AddressModel addressModel){
        addressService.editAddressService(addressModel);
    }

    //得到用户某地址的详细信息
    @CrossOrigin(origins = "*",maxAge = 3600)
    @ResponseBody
    @RequestMapping(value = "/one",method = RequestMethod.GET)
    public AddressModel getAddress(@RequestParam(value = "Id") int id){
        AddressModel addressModel = addressService.getAddressByIdService(id);
        return addressModel;
    }
}
