package muses.art.service.commodity.impl;

import muses.art.model.commodity.HotKeyModel;
import muses.art.service.commodity.HotKeyService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/META-INF/applicationContext.xml", "classpath:/META-INF/spring-mvc.xml"})
public class HotKeyServiceImplTest extends AbstractJUnit4SpringContextTests {

    @Autowired
    private HotKeyService hotKeyService;

    @Test
    public void addHotKey() {
        hotKeyService.addHotKey("欧式");
        hotKeyService.addHotKey("水墨画");
        hotKeyService.addHotKey("莫奈");
        hotKeyService.addHotKey("印象派");
        hotKeyService.addHotKey("梵高");
        hotKeyService.addHotKey("超现实主义");
        hotKeyService.addHotKey("现代");
        hotKeyService.addHotKey("简约");
        hotKeyService.addHotKey("抽象");
        hotKeyService.addHotKey("测试删除1");
        hotKeyService.addHotKey("测试删除2");
        hotKeyService.addHotKey("测试更新1");
        hotKeyService.addHotKey("测试更新2");
        logger.info("添加热门搜素词");
    }

    @Test
    public void findHotKeyList() {
        List<HotKeyModel> hotKeyModels = hotKeyService.findHotKeyList();
        for (HotKeyModel hotKeyModel : hotKeyModels) {
            logger.info(hotKeyModel.toString());
        }
        logger.info("获取列表");
    }

    @Test
    public void deleteHotKey() {
        hotKeyService.deleteHotKey(23);
        logger.info("删除成功1");
    }

    @Test
    public void deleteHotKey1() {
        hotKeyService.deleteHotKey("测试删除2");
        logger.info("删除成功2");
    }

    @Test
    public void updateHotKey() {
        hotKeyService.updateHotKey(25, "更新成功1");
        logger.info("更新成功1");
    }

    @Test
    public void updateHotKey1() {
        hotKeyService.updateHotKey("测试更新2", "更新成功2");
        logger.info("更新成功2");
    }
}