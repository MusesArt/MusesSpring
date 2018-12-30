package muses.art.service.commodity.impl;

import muses.art.dao.commodity.HotkeyDao;
import muses.art.entity.commodity.HotKey;
import muses.art.model.commodity.HotKeyModel;
import muses.art.service.commodity.HotKeyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Transactional
public class HotKeyServiceImpl implements HotKeyService {

    @Autowired
    private HotkeyDao hotkeyDao;

    @Override
    public List<HotKeyModel> findHotKeyList() {
        String HQL = "from HotKey";
        List<HotKey> hotKeys = hotkeyDao.find(HQL, 1, 7);
        return entity2model(hotKeys);
    }

    @Override
    public void addHotKey(String keyword) {
        HotKey hotKey = new HotKey();
        hotKey.setKeyword(keyword);
        hotkeyDao.save(hotKey);
    }

    @Override
    public void deleteHotKey(int id) {
        HotKey hotKey = hotkeyDao.get(HotKey.class, id);
        hotkeyDao.delete(hotKey);
    }

    @Override
    public void deleteHotKey(String keyword) {
        String HQL = "from HotKey where keyword=:keyword";
        Map<String, Object> map = new HashMap<>();
        map.put("keyword", keyword);
        HotKey hotKey = hotkeyDao.get(HQL, map);
        hotkeyDao.delete(hotKey);
    }

    @Override
    public void updateHotKey(int id, String newKeyword) {
        HotKey hotKey = hotkeyDao.get(HotKey.class, id);
        hotKey.setKeyword(newKeyword);
        hotkeyDao.update(hotKey);
    }

    @Override
    public void updateHotKey(String oldKeyword, String newKeyword) {
        String HQL = "from HotKey where keyword=:oldKeyword";
        Map<String, Object> map = new HashMap<>();
        map.put("oldKeyword", oldKeyword);
        HotKey hotKey = hotkeyDao.get(HQL, map);
        hotKey.setKeyword(newKeyword);
        hotkeyDao.update(hotKey);
    }

    private List<HotKeyModel> entity2model(List<HotKey> hotKeys) {
        if (hotKeys != null) {
            List<HotKeyModel> hotKeyModels = new ArrayList<>();
            for (HotKey hotKey : hotKeys) {
                hotKeyModels.add(entity2model(hotKey));
            }
            return hotKeyModels;
        }
        return null;
    }

    private HotKeyModel entity2model(HotKey hotKey) {
        if (hotKey != null) {
            HotKeyModel hotKeyModel = new HotKeyModel();
            hotKeyModel.setId(hotKey.getId());
            hotKeyModel.setKeyword(hotKey.getKeyword());
            return hotKeyModel;
        }
        return null;
    }
}
