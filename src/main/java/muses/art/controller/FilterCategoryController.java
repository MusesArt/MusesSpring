package muses.art.controller;

import muses.art.model.base.StatusModel;
import muses.art.model.filter.FilterCategoryModel;
import muses.art.service.filter.FilterCategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("api/filterCategory")
public class FilterCategoryController {
    @Autowired
    FilterCategoryService filterCategoryService;

    @CrossOrigin(origins = "*", maxAge = 3600)
    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
    public StatusModel<List<FilterCategoryModel>> getFilterCategoryList() {
        List<FilterCategoryModel> filterCategoryModels = filterCategoryService.getCategoryList();
        return new StatusModel<>("请求成功", StatusModel.OK, filterCategoryModels);
    }
}
