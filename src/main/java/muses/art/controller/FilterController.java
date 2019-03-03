package muses.art.controller;

import muses.art.model.base.PageModel;
import muses.art.model.base.StatusModel;
import muses.art.model.commodity.SearchModel;
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
                pageModel = filterService.findFiltersByCategoryId(id, page, 15);
                break;
            case "user":
                pageModel = filterService.findFiltersByUserId(id, page, 15);
                break;
        }
        if (pageModel != null) {
            return pageModel;
        } else {
            return new PageModel<>();
        }
    }

    @CrossOrigin(origins = "*", maxAge = 3600)
    @RequestMapping(value = "/", method = RequestMethod.POST)
    @ResponseBody
    public StatusModel<FilterInfoModel> addFilter(@RequestBody FilterInfoModel filterInfoModel) {
        boolean flag = filterService.addFilter(filterInfoModel);
        if (flag) {
            return new StatusModel<>("添加滤镜成功", StatusModel.OK);
        } else {
            return new StatusModel<>("添加滤镜失败", StatusModel.ERROR);
        }
    }

    @CrossOrigin(origins = "*", maxAge = 3600)
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public StatusModel<FilterInfoModel> deleteFilter(@PathVariable int id) {
        boolean flag = filterService.deleteFilter(id);
        if (flag) {
            return new StatusModel<>("删除滤镜成功", StatusModel.OK);
        } else {
            return new StatusModel<>("删除滤镜失败", StatusModel.ERROR);
        }
    }

    @CrossOrigin(origins = "*", maxAge = 3600)
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    @ResponseBody
    public StatusModel<FilterInfoModel> updateFilter(@PathVariable int id, @RequestBody FilterInfoModel filterInfoModel) {
        boolean flag = filterService.updateFilter(id, filterInfoModel);
        if (flag) {
            return new StatusModel<>("更新滤镜成功", StatusModel.OK);
        } else {
            return new StatusModel<>("更新滤镜失败", StatusModel.ERROR);
        }
    }

    @CrossOrigin(origins = "*", maxAge = 3600)
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public StatusModel<FilterInfoModel> findFilterById(@PathVariable int id) {
        FilterInfoModel filterInfoModel = filterService.findFilterById(id);
        if (filterInfoModel != null) {
            return new StatusModel<>("加载成功", StatusModel.OK, filterInfoModel);
        } else {
            return new StatusModel<>("该滤镜不存在", StatusModel.ERROR);
        }
    }

    @CrossOrigin(origins = "*", maxAge = 3600)
    @RequestMapping(value = "/search", method = RequestMethod.POST)
    @ResponseBody
    public PageModel<FilterInfoModel> searchFilter(@RequestBody SearchModel searchModel) {
        PageModel<FilterInfoModel> pageModel = filterService.searchFilters(searchModel);
        if (pageModel != null) {
            return pageModel;
        } else {
            return new PageModel<>();
        }
    }


}
