package muses.art.service.operation;


public interface CommentPraiseService { // 给评论点赞

    /**
     * 用户给评论点赞
     * @param userId 用户id
     * @param commentId 评论id
     * @return
     */
    Boolean addPraise(Integer userId, Integer commentId);

    /**
     * 用户取消点赞
     * @param userId 用户id
     * @param commentId 评论id
     * @return
     */
    Boolean deletePraise(Integer userId, Integer commentId);

    /**
     * 根据评论id查找点赞数
     * @param commentId
     * @return
     */
    Integer findPraiseNumberByCommentId(Integer commentId);

    /**
     * 查找用户是否给某个评论进行点赞
     * @param commentId 评论id
     * @param userId 用户id
     * @return
     */
    Boolean findPraiseByCommentIdAndUserID(Integer commentId, Integer userId);
}
