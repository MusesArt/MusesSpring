package muses.art.controller;

import muses.art.model.base.PageModel;
import muses.art.model.base.StatusModel;
import muses.art.model.operation.CommentModel;
import muses.art.service.operation.CommentPraiseService;
import muses.art.service.operation.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@Controller
@RequestMapping("api/comment")
@CrossOrigin(origins = "*", maxAge = 3600)
public class CommentController {

    @Autowired
    private CommentService commentService;

    @Autowired
    private CommentPraiseService commentPraiseService;

    @CrossOrigin(origins = "*", maxAge = 3600)
    @RequestMapping(value = "/{commodityId}/{page}/", method = RequestMethod.GET)
    public @ResponseBody
    StatusModel<PageModel<CommentModel>> findCommentByCommodityId(@PathVariable Integer page,
                                                             @PathVariable Integer commodityId,
                                                             @RequestParam("size") Integer size) {
        List<CommentModel> comments = commentService.findCommentByCommodityIdAndPage(commodityId, page, size);
        PageModel<CommentModel> pageModel = commentService.findCommentPage(comments, page, size);
        return new StatusModel<>("获取评论列表成功", StatusModel.OK, pageModel);
    }

    @CrossOrigin(origins = "*", maxAge = 3600)
    @RequestMapping(value = "/", method = RequestMethod.POST)
    public @ResponseBody
    StatusModel<CommentModel> addComment(@RequestParam("comment") String comment,
                                         @RequestParam("orderCommodityId") Integer orderCommodityId) {
        Boolean flag = commentService.addComment(comment, orderCommodityId);
        if (flag) {
            return new StatusModel<>("添加评论成功", StatusModel.OK);
        } else {
            return new StatusModel<>("请勿重复评论", StatusModel.OK);
        }
    }

    @CrossOrigin(origins = "*", maxAge = 3600)
    @RequestMapping(value = "/", method = RequestMethod.DELETE)
    public @ResponseBody
    StatusModel<CommentModel> deleteComment(@RequestParam("orderCommodityId") Integer orderCommodityId) {
        CommentModel commentModel = commentService.findCommentByOrderCommodityId(orderCommodityId);
        if (commentModel != null) {
            commentService.deleteComment(commentModel.getId());
            return new StatusModel<>("删除评论成功", StatusModel.OK);
        } else {
            return new StatusModel<>("删除评论失败", StatusModel.ERROR);
        }
    }

    @CrossOrigin(origins = "*", maxAge = 3600)
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public @ResponseBody
    StatusModel<CommentModel> findCommentByOrderCommodityID(@RequestParam("orderCommodityId") Integer orderCommodityId) {
        CommentModel commentModel = commentService.findCommentByOrderCommodityId(orderCommodityId);
        if (commentModel != null) {
            return new StatusModel<>("获取评论成功", StatusModel.OK, commentModel);
        } else {
            return new StatusModel<>("尚未评论", StatusModel.ERROR);
        }
    }

    @CrossOrigin(origins = "*", maxAge = 3600)
    @RequestMapping(value = "/praise", method = RequestMethod.POST)
    public @ResponseBody
    StatusModel<CommentModel> addPraiseByCommentIdAndUserId(@RequestParam("commentId") Integer commentId,
                                                            @RequestParam("userId") Integer userId) {
        Boolean flag = commentPraiseService.addPraise(userId, commentId);
        if (flag) {
            return new StatusModel<>("点赞成功", StatusModel.OK);
        } else {
            return new StatusModel<>("点赞失败", StatusModel.ERROR);
        }
    }

    @CrossOrigin(origins = "*", maxAge = 3600)
    @RequestMapping(value = "/praise", method = RequestMethod.DELETE)
    public @ResponseBody StatusModel<CommentModel> deletePraiseByCommentIdAndUserId(@RequestParam("commentId") Integer commentId,
                                                                                    @RequestParam("userId") Integer userId) {
        Boolean flag = commentPraiseService.deletePraise(userId, commentId);
        if (flag) {
            return new StatusModel<>("取消点赞成功", StatusModel.OK);
        } else {
            return new StatusModel<>("取消点赞失败", StatusModel.ERROR);
        }
    }
}
