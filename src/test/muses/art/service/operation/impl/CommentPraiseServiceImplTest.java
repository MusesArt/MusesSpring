package muses.art.service.operation.impl;

import muses.art.dao.commodity.CommodityDao;
import muses.art.service.operation.CommentPraiseService;
import muses.art.service.operation.CommentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/META-INF/applicationContext.xml", "classpath:/META-INF/spring-mvc.xml"})
public class CommentPraiseServiceImplTest extends AbstractJUnit4SpringContextTests {

    @Autowired
    private CommentPraiseService commentPraiseService;

    private CommentService commentService;

    @Test
    public void commentPraiseServiceTest() {

       commentPraiseService.addPraise(1, 1);
       logger.info("用户给评论点赞成功");

       commentPraiseService.deletePraise(1, 1);
       logger.info("用户取消点赞成功");

       commentPraiseService.addPraise(1, 1);
       logger.info("用户给评论点赞成功");

       int praiseNumber = commentPraiseService.findPraiseNumberByCommentId(1);
       logger.info("统计评论的点赞数成功:"+praiseNumber);

       commentPraiseService.deletePraise(1, 1);
       logger.info("用户取消点赞成功");

       boolean flag = commentPraiseService.findPraiseByCommentIdAndUserID(1, 1);
       logger.info("判断用户是否给某个评论点赞:"+flag);
    }
}