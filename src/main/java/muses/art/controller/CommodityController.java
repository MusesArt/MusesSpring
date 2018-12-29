package muses.art.controller;

import muses.art.entity.commodity.Commodity;
import muses.art.service.commodity.CommodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("api/commodity")
public class CommodityController {

    @Autowired
    private CommodityService commodityService;

    @RequestMapping(value = "/id", method = RequestMethod.GET)
    public @ResponseBody Commodity get(HttpSession session) {
        Commodity commodity = new Commodity();
        commodity.setId(1234124);
        return commodity;
    }
}
