package muses.art.service.operation;

import muses.art.model.operation.CommentModel;

import java.util.List;

public interface CommentService {

    boolean addComment(String comment, int commodityId, int orderId, int userId);

    boolean deleteComment(int id);

    boolean updateComment(int id, String content);

    CommentModel findCommentById(int id);

    List<CommentModel> findCommentByUserId(int userId);

    List<CommentModel> findCommentByCommodityId(int commodityId);
}
