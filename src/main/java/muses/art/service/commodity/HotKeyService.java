package muses.art.service.commodity;

import muses.art.model.commodity.HotKeyModel;

import java.util.List;

public interface HotKeyService {

    /**
     * 获取热门搜索词列表
     * @return List<HotKeyModel>
     */
    List<HotKeyModel> findHotKeyList();

    /**
     * 添加热门搜索词
     * @param keyword 关键词
     */
    void addHotKey(String keyword);

    /**
     * 删除热门搜索词
     * @param id 关键词 id
     */
    void deleteHotKey(int id);

    /**
     * 删除热门搜索词
     * @param keyword 关键词
     */
    void deleteHotKey(String keyword);

    /**
     * 更新热门关键词
     * @param id 关键词id
     * @param newKeyword 新关键词
     */
    void updateHotKey(int id, String newKeyword);

    /**
     * 更新热门关键词
     * @param oldKeyword 旧关键词
     * @param newKeyword 新关键词
     */
    void updateHotKey(String oldKeyword, String newKeyword);
}
