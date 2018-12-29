package muses.art.controller;

import muses.art.entity.commodity.Commodity;
import muses.art.model.base.PageModel;
import muses.art.model.base.StatusModel;
import muses.art.model.operation.CommentModel;
import muses.art.service.commodity.CommodityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("api/commodity")
public class CommodityController {

    @Autowired
    private CommodityService commodityService;

    @RequestMapping(value = "/list/{page}/{size}/json", method = RequestMethod.GET)
    public @ResponseBody StatusModel<PageModel<Commodity>> getCommoditiesByPage(@PathVariable int page, @PathVariable int size) {

//        commodityService;
        List<Commodity> commodities = new ArrayList<>();
        for (int i = 0; i < 10; i++ ) {
            Commodity commodity = new Commodity();
            commodity.setId(i);
            commodities.add(commodity);
        }
        PageModel<Commodity> pageModel = new PageModel<>();
        pageModel.setCurrentPage(1);
        pageModel.setDataList(commodities);
        pageModel.setPageCount(1);
        pageModel.setPageSize(10);
        pageModel.setTotalNum(10);
        StatusModel<PageModel<Commodity>> statusModel = new StatusModel<>();
        statusModel.setErrorCode(0);
        statusModel.setErrorMsg("ERROR CODE == 0");
        PageModel<Commodity> commodityPageModel = new PageModel<>();
        commodityPageModel.setDataList(new ArrayList<Commodity>());
        statusModel.setData(commodityPageModel);
        return statusModel;
    }

    @RequestMapping(value = "/comment", method = RequestMethod.GET)
    public @ResponseBody CommentModel getComment() {
        CommentModel commentModel = new CommentModel();
        return commentModel;
    }
}
