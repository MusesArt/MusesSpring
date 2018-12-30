package muses.art.service.operation;

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

    /**
     *
     * @param id 评论id
     * @return
     */
    boolean deleteComment(int id);

    /**
     *
     * @param id 评论id
     * @param content 评论内容
     * @return
     */
    boolean updateComment(int id, String content);

    /**
     *
     * @param id 评论id
     * @return
     */
    CommentModel findCommentById(int id);

    /**
     *
     * @param userId 用户id
     * @return
     */
    List<CommentModel> findCommentByUserId(int userId);

    /**
     *
     * @param commodityId 商品id
     * @return
     */
    List<CommentModel> findCommentByCommodityId(int commodityId);
}
