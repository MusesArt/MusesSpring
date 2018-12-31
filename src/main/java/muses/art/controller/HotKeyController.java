package muses.art.controller;


import muses.art.model.base.StatusModel;
import muses.art.model.commodity.HotKeyModel;
import muses.art.service.commodity.HotKeyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
        List<HotKeyModel> hotKeyModels = hotKeyService.findHotKeyList();
        return hotKeyModels != null ? new StatusModel<>(hotKeyModels) : new StatusModel<List<HotKeyModel>>("热搜关键词数据获取异常");
    }
}
