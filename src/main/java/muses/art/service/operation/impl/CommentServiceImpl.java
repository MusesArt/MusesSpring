package muses.art.service.operation.impl;

import muses.art.dao.operation.CommentDao;
import muses.art.entity.commodity.Commodity;
import muses.art.entity.commodity.Image;
import muses.art.entity.operation.Comment;
import muses.art.model.base.PageModel;
import muses.art.model.commodity.CommodityListModel;
import muses.art.model.operation.CommentModel;
import muses.art.service.operation.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

@Service
@Transactional
public class CommentServiceImpl implements CommentService {

    @Autowired
    private CommentDao commentDao;

    @Override
    public Boolean addComment(String comment, Integer commodityId, Integer orderId, Integer userId, Integer orderCommodityId) {
        Comment commentObject = new Comment();
        commentObject.setComment(comment);
        commentObject.setCommodityId(commodityId);
        commentObject.setUserId(userId);
        commentObject.setOrderId(orderId);
        commentObject.setOrderCommodityId(orderCommodityId);
        commentObject.setAddTime(new Date(System.currentTimeMillis()));
        commentDao.save(commentObject);
        return true;
    }

    @Override
    public Boolean deleteComment(Integer id) {
        Comment comment = commentDao.get(Comment.class, id);
        commentDao.delete(comment);
        return true;
    }

    @Override
    public Boolean updateComment(Integer id, String content) {
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
    public CommentModel findCommentByOrderCommodityIdAndUserID(Integer commodityId, Integer userId) {
        String SQL = "from Comment where userId=:id1 and orderCommodityId=:id2";
        Map<String, Object> map = new HashMap<>();
        map.put("id1", userId);
        map.put("id2", commodityId);
        List<Comment> comments = commentDao.find(SQL, map);
        if (comments != null && comments.size() > 0) {
            return entity2model(comments.get(0));
        } else {
            return null;
        }
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

    @Override
    public List<CommentModel> findCommentByCommodityIdAndPage(int commodityId, int page, int size) {
        String HQL = "from Comment where commodityId=:id";
        Map<String, Object> map = new HashMap<>();
        map.put("id", commodityId);
        List<Comment> comments = commentDao.find(HQL, map, page, size);
        return entity2model(comments);
    }

    @Override
    public PageModel<CommentModel> findCommentPage(List<CommentModel> models, int page, int size) {
        int totalNum = commentDao.count("select count(*) from Comment").intValue();
        PageModel<CommentModel> pageModel = new PageModel<>();
        pageModel.setDataList(models);
        pageModel.setCurrentPage(page);
        pageModel.setPageCount(totalNum % size == 0 ? totalNum / size : totalNum / size + 1);
        pageModel.setTotalNum(totalNum);
        pageModel.setPageSize(size);
        return pageModel;
    }
}
