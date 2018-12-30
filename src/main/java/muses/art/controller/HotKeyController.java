package muses.art.controller;


import muses.art.model.base.StatusModel;
import muses.art.model.commodity.HotKeyModel;
import muses.art.service.commodity.HotKeyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("api/hotkey")
public class HotKeyController {

    @Autowired
    private HotKeyService hotKeyService;

    @RequestMapping(value = "/json", method = RequestMethod.GET)
    public @ResponseBody StatusModel<List<HotKeyModel>> findHotKeyList() {
        StatusModel<List<HotKeyModel>> statusModel = new StatusModel<>();
        List<HotKeyModel> hotKeyModels = hotKeyService.findHotKeyList();
        if (hotKeyModels == null) {
            statusModel.setErrorCode(-1);
            statusModel.setErrorMsg("热搜关键词数据获取异常");
            statusModel.setData(null);
        } else {
            statusModel.setErrorCode(0);
            statusModel.setErrorMsg("");
            statusModel.setData(hotKeyModels);
        }
        return statusModel;
    }
}
