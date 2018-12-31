package muses.art.service.operation.impl;

import muses.art.model.operation.CommentModel;
import muses.art.service.operation.CommentService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:/META-INF/applicationContext.xml", "classpath:/META-INF/spring-mvc.xml"})
public class CommentServiceImplTest extends AbstractJUnit4SpringContextTests {

    @Autowired
    private CommentService commentService;

    @Test
    public void commentServiceTest() {
        CommentModel commentModel = commentService.findCommentById(1);
        logger.info(commentModel);
        logger.info("根据id查找评论测试通过");
        Boolean flag = commentService.addComment("这是一条测试评论", 1, null, 1, 1);
        if (flag) {
            logger.info("添加评论测试通过");
        }
        CommentModel commentModel2 = commentService.findCommentByOrderCommodityIdAndUserID(1, 1);
        if (commentModel2 != null) {
            logger.info("根据订单商品Id和用户Id查找评论测试通过（订单商品不同于商品）");
            commentService.deleteComment(commentModel2.getId());
            logger.info("删除评论测试通过");
        }
        List<CommentModel> commentModelList = commentService.findCommentByCommodityId(1);
        logger.info(commentModelList);
        logger.info("根据商品id查找测试通过");
        commentModelList = commentService.findCommentByUserId(1);
        logger.info(commentModelList);
        logger.info("根据用户id查找测试通过");
    }
}