package muses.art.service.operation.impl;

import muses.art.dao.operation.CommentDao;
import muses.art.entity.commodity.Image;
import muses.art.entity.operation.Comment;
import muses.art.model.operation.CommentModel;
import muses.art.service.operation.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class CommentServiceImpl implements CommentService {

    @Autowired
    private CommentDao commentDao;

    @Override
    public boolean addComment(String comment, int commodityId, int orderId, int userId) {
        Comment commentObject = new Comment();
        commentObject.setComment(comment);
        commentObject.setCommodityId(commodityId);
        commentObject.setUserId(userId);
        commentDao.save(commentObject);
        return true;
    }

    @Override
    public boolean deleteComment(int id) {
        Comment comment = commentDao.get(Comment.class, id);
        commentDao.delete(comment);
        return true;
    }

    @Override
    public boolean updateComment(int id, String content) {
        Comment comment = commentDao.get(Comment.class, id);
        comment.setComment(content);
        commentDao.update(comment);
        return true;
    }

    @Override
    public CommentModel findCommentById(int id) {
        Comment comment = commentDao.get(Comment.class, id);
        return entity2model(comment);
    }

    @Override
    public List<CommentModel> findCommentByUserId(int userId) {
        String SQL = "select Comment as comment where userId=:id";
        Map<String, Object> map = new HashMap<>();
        map.put("id", userId);
        List<Comment> comments = commentDao.find(SQL, map);
        return entity2model(comments);
    }

    @Override
    public List<CommentModel> findCommentByCommodityId(int commodityId) {
        return null;
    }

    private CommentModel entity2model(Comment comment) {
        CommentModel commentModel = new CommentModel();
        commentModel.setId(comment.getId());
        commentModel.setHead(comment.getUser().getAvatar());
        commentModel.setUsername(comment.getUser().getUsername());
        commentModel.setDate(comment.getAddTime());
        String HQL = "select count(*) from Comment as comment where commodityId=:id";
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
    }

    private List<CommentModel> entity2model(List<Comment> comments) {
        List<CommentModel> commentModels = new ArrayList<>();
        for (Comment comment : comments) {
            commentModels.add(entity2model(comment));
        }
        return commentModels;
    }

}
