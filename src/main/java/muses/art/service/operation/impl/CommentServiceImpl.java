package muses.art.service.operation.impl;

import muses.art.dao.operation.CommentDao;
import muses.art.entity.commodity.Image;
import muses.art.entity.operation.Comment;
import muses.art.model.operation.CommentModel;
import muses.art.service.operation.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.sql.Date;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Transactional
public class CommentServiceImpl implements CommentService {

    @Autowired
    private CommentDao commentDao;

    @Override
    public boolean addComment(String comment, Integer commodityId, Integer orderId, Integer userId) {
        Comment commentObject = new Comment();
        commentObject.setComment(comment);
        commentObject.setCommodityId(commodityId);
        commentObject.setUserId(userId);
        commentObject.setAddTime(new Date(System.currentTimeMillis()));
        commentDao.save(commentObject);
        return true;
    }

    @Override
    public boolean deleteComment(Integer id) {
        Comment comment = commentDao.get(Comment.class, id);
        commentDao.delete(comment);
        return true;
    }

    @Override
    public boolean updateComment(Integer id, String content) {
        Comment comment = commentDao.get(Comment.class, id);
        comment.setComment(content);
        commentDao.update(comment);
        return true;
    }

    @Override
    public CommentModel findCommentById(Integer id) {
        Comment comment = commentDao.get(Comment.class, id);
        return entity2model(comment);
    }

    @Override
    public List<CommentModel> findCommentByUserId(Integer userId) {
        String SQL = "from Comment where userId=:id";
        Map<String, Object> map = new HashMap<>();
        map.put("id", userId);
        List<Comment> comments = commentDao.find(SQL, map);
        return entity2model(comments);
    }

    @Override
    public List<CommentModel> findCommentByCommodityId(Integer commodityId) {
        String SQL = "from Comment where commodityId=:id";
        Map<String, Object> map = new HashMap<>();
        map.put("id", commodityId);
        List<Comment> comments = commentDao.find(SQL, map);
        return entity2model(comments);
    }

    @Override
    public CommentModel findCommentByCommodityIdAndUserID(Integer commodityId, Integer userId) {
        String SQL = "from Comment where userId=:id1 and commodityId=:id2";
        Map<String, Object> map = new HashMap<>();
        map.put("id1", userId);
        map.put("id2", commodityId);
        List<Comment> comments = commentDao.find(SQL, map);
        return entity2model(comments.get(0));
    }

    private CommentModel entity2model(Comment comment) {
        if (comment != null) {
            CommentModel commentModel = new CommentModel();
            commentModel.setId(comment.getId());
            commentModel.setHead(comment.getUser().getAvatar());
            commentModel.setUsername(comment.getUser().getUsername());
            commentModel.setDate(comment.getAddTime());
            String HQL = "select count(*) from Comment where commodityId=:id";
            Map<String, Object> map = new HashMap<>();
            map.put("id", comment.getCommodity().getId());
            commentModel.setMessage(commentDao.count(HQL, map).intValue());
            commentModel.setContent(comment.getComment());
//        commentModel.setCommodityInfo();
            List<String> images = new ArrayList<>();
            for (Image image : comment.getImages()) {
                images.add(image.getImageUrl());
            }
            commentModel.setImages(images);
            commentModel.setStar(5);
            return commentModel;
        } else {
            return null;
        }
    }

    private List<CommentModel> entity2model(List<Comment> comments) {
        if (comments != null && comments.size() > 0) {
            List<CommentModel> commentModels = new ArrayList<>();
            for (Comment comment : comments) {
                commentModels.add(entity2model(comment));
            }
            return commentModels;
        } else {
            return null;
        }
    }

}
