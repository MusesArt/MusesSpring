package muses.art.service.operation;

import muses.art.entity.operation.Comment;
import muses.art.model.operation.CommentModel;

import java.util.List;

public interface CommentService {
    /**
     *
     * @param comment 评论内容
     * @param commodityId 商品id
     * @param orderId 订单id
     * @param userId 用户id
     * @return
     */
    boolean addComment(String comment, int commodityId, int orderId, int userId);

    boolean deleteComment(int id);

    boolean updateComment(int id, String content);

    CommentModel findCommentById(int id);

    List<CommentModel> findCommentByUserId(int userId);

    List<CommentModel> findCommentByCommodityId(int commodityId);
}
