package muses.art.service.operation.impl;

import muses.art.dao.operation.CommentPraiseDao;
import muses.art.entity.operation.CommentPraise;
import muses.art.service.operation.CommentPraiseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
@Transactional
public class CommentPraiseServiceImpl implements CommentPraiseService {

    @Autowired
    private CommentPraiseDao commentPraiseDao;

    @Override
    public Boolean addPraise(Integer userId, Integer commentId) {
        String HQL = "from CommentPraise where userId=:id1 and commentId=:id2";
        Map<String, Object> map = new HashMap<>();
        map.put("id1", userId);
        map.put("id2", commentId);
        List<CommentPraise> commentPraises = commentPraiseDao.find(HQL, map);
        if (commentPraises == null || commentPraises.size() == 0) {
            CommentPraise commentPraise = new CommentPraise();
            commentPraise.setUserId(userId);
            commentPraise.setCommentId(commentId);
            commentPraiseDao.save(commentPraise);
        }
        return true;
    }

    @Override
    public Boolean deletePraise(Integer userId, Integer commentId) {
        String HQL = "from CommentPraise where userId=:id1 and commentId=:id2";
        Map<String, Object> map = new HashMap<>();
        map.put("id1", userId);
        map.put("id2", commentId);
        List<CommentPraise> commentPraises = commentPraiseDao.find(HQL, map);
        if (commentPraises != null && commentPraises.size() > 0) {
            commentPraiseDao.delete(commentPraises.get(0));
            return true;
        }
        return false;
    }

    @Override
    public Integer findPraiseNumberByCommentId(Integer commentId) {
        String HQL = "select count(*) from CommentPraise where commentId=:id";
        Map<String, Object> map = new HashMap<>();
        map.put("id", commentId);
        Integer praiseNumber = commentPraiseDao.count(HQL, map).intValue();
        return praiseNumber;
    }

    @Override
    public Boolean findPraiseByCommentIdAndUserID(Integer commentId, Integer userId) {
        String HQL = "from CommentPraise where userId=:id1 and commentId=:id2";
        Map<String, Object> map = new HashMap<>();
        map.put("id1", userId);
        map.put("id2", commentId);
        List<CommentPraise> commentPraises = commentPraiseDao.find(HQL, map);
        if (commentPraises != null && commentPraises.size() > 0) {
            return true;
        }
        return false;
    }
}
