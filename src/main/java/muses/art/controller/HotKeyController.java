package muses.art.controller;


import muses.art.model.base.StatusModel;
import muses.art.model.commodity.HotKeyModel;
import muses.art.service.commodity.HotKeyService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@RequestMapping("api/hotkey")
@CrossOrigin(origins = "*", maxAge = 3600)
public class HotKeyController {

    @Autowired
    private HotKeyService hotKeyService;
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @CrossOrigin(origins = "*", maxAge = 3600)
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public @ResponseBody StatusModel<List<HotKeyModel>> findHotKeyList() {
        List<HotKeyModel> hotKeyModels = hotKeyService.findHotKeyList();
        if (hotKeyModels != null) {
            return new StatusModel<>(hotKeyModels);
        } else {
            logger.info("热搜关键词数据获取异常");
            return new StatusModel<>("热搜关键词数据获取异常");
        }

    }
}
