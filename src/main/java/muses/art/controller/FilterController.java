package muses.art.controller;

import muses.art.model.base.PageModel;
import muses.art.model.filter.FilterInfoModel;
import muses.art.service.filter.FilterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("api/filter")
public class FilterController {

    @Autowired
    FilterService filterService;


    @CrossOrigin(origins = "*", maxAge = 3600)
    @RequestMapping(value = "/{key}/{id}/{page}", method = RequestMethod.GET)
    @ResponseBody
    public PageModel<FilterInfoModel> findFilterList(@PathVariable String key, @PathVariable int id, @PathVariable int page) {
        PageModel<FilterInfoModel> pageModel = null;
        switch (key) {
            case "category":
                pageModel = filterService.findFiltersByCategoryId(id, page, 10);
                break;
            case "user":
                pageModel = filterService.findFiltersByUserId(id, page, 10);
                break;
        }
        if (pageModel != null) {
            return pageModel;
        } else {
            return new PageModel<>();
        }
    }
}
