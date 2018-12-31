package muses.art.controller;

import muses.art.entity.commodity.Commodity;
import muses.art.entity.operation.Comment;
import muses.art.model.base.PageModel;
import muses.art.model.base.StatusModel;
import muses.art.model.operation.CommentModel;
import muses.art.service.operation.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("api/comment")
public class CommentController {

    @Autowired
    private CommentService commentService;

    @RequestMapping(value = "/{commodityId}/{page}/", method = RequestMethod.GET)
    public @ResponseBody
    StatusModel<PageModel<CommentModel>> findCommentByCommodityId(@PathVariable Integer page,
                                                             @PathVariable Integer commodityId,
                                                             @RequestParam("size") Integer size) {
        List<CommentModel> comments = commentService.findCommentByCommodityIdAndPage(commodityId, page, size);
        StatusModel<PageModel<CommentModel>> statusModel = new StatusModel<>();
        statusModel.setData(commentService.findCommentPage(comments, page, size));
        statusModel.setCode(StatusModel.OK);
        statusModel.setMessage("");
        return statusModel;
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public @ResponseBody
    StatusModel<CommentModel> addComment(@RequestParam("comment") String comment,
                                                    @RequestParam("commodityId") Integer commodityId,
                                                    @RequestParam("orderId") Integer orderId,
                                                    @RequestParam("userId") Integer userId,
                                                    @RequestParam("orderCommodityId") Integer orderCommodityId) {
        commentService.addComment(comment, commodityId, orderId, userId, orderCommodityId);
        StatusModel<CommentModel> statusModel = new StatusModel<>("添加评论成功", StatusModel.OK);
        return statusModel;
    }

    @RequestMapping(value = "/", method = RequestMethod.DELETE)
    public @ResponseBody
    StatusModel<CommentModel> deleteComment(@RequestParam("userId") Integer userId,
                                         @RequestParam("orderCommodityId") Integer orderCommodityId) {
        CommentModel commentModel = commentService.findCommentByOrderCommodityIdAndUserID(orderCommodityId, userId);
        if (commentModel != null) {
            commentService.deleteComment(commentModel.getId());
            return new StatusModel<>("删除评论成功", StatusModel.OK);
        } else {
            return new StatusModel<>("删除评论失败", StatusModel.ERROR);
        }
    }
}
