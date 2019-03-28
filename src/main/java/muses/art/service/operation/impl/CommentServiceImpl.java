package muses.art.service.operation.impl;

import muses.art.dao.operation.CommentDao;
import muses.art.dao.trade.OrderCommodityDao;
import muses.art.entity.commodity.Commodity;
import muses.art.entity.commodity.Image;
import muses.art.entity.operation.Comment;
import muses.art.entity.trade.Order;
import muses.art.entity.trade.OrderCommodity;
import muses.art.model.base.PageModel;
import muses.art.model.commodity.CommodityListModel;
import muses.art.model.operation.CommentInfoModel;
import muses.art.model.operation.CommentModel;
import muses.art.service.operation.CommentService;
import org.springframework.beans.BeanUtils;
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

    @Autowired
    private OrderCommodityDao orderCommodityDao;


    @Override
    public Boolean addComment(String comment, Integer orderCommodityId, Integer star) {
        CommentModel commentModel = findCommentByOrderCommodityId(orderCommodityId);
        if (commentModel != null) {
            return false;
        } else {
            Comment commentObject = new Comment();
            commentObject.setComment(comment);
            OrderCommodity orderCommodity = orderCommodityDao.get(OrderCommodity.class, orderCommodityId);
            if (orderCommodity != null) {
                Commodity commodity = orderCommodity.getCommodity();
                Order order = orderCommodity.getOrder();
                commentObject.setCommodityId(commodity.getId());
                commentObject.setUserId(order.getUser().getId());
                commentObject.setOrderId(order.getId());
                commentObject.setOrderCommodityId(orderCommodityId);
                commentObject.setAddTime(new Date(System.currentTimeMillis()));
                commentObject.setStar(star);
                commentDao.save(commentObject);
                return true;
            } else {
                return false;
            }
        }
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
    public CommentModel findCommentByOrderCommodityId(Integer orderCommodityId) {
        String SQL = "from Comment where orderCommodityId=:id";
        Map<String, Object> map = new HashMap<>();
        map.put("id", orderCommodityId);
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
            BeanUtils.copyProperties(comment, commentModel);
            commentModel.setHead(comment.getUser().getAvatar());
            commentModel.setUsername(comment.getUser().getUsername());
            commentModel.setDate(comment.getAddTime());
            commentModel.setContent(comment.getComment());
            commentModel.setPraise(getCommentPraiseCount(comment.getId())); // 获取点赞数
            OrderCommodity orderCommodity = orderCommodityDao.get(OrderCommodity.class, comment.getOrderCommodityId());
            commentModel.setCommodityInfo(orderCommodity.getDetail());
            List<String> images = new ArrayList<>();
            for (Image image : comment.getImages()) {
                images.add(image.getImageUrl());
            }
            commentModel.setImages(images);
            commentModel.setStar(comment.getStar()==null?5:comment.getStar());
            return commentModel;
        } else {
            return null;
        }
    }

    private int getCommentPraiseCount(int commentId) {
        String HQL = "select count(*) from CommentPraise where commentId=:id";
        Map<String, Object> map = new HashMap<>();
        map.put("id", commentId);
        return commentDao.count(HQL, map).intValue();
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
    public List<CommentModel> findCommentByCommodityIdAndPage(int commodityId, int page, int size, String filter) {
        String HQL = "from Comment where commodityId=:id";
        switch (filter) {
            case "good": HQL += " and commentLevel=0"; break;
            case "middle": HQL += " and commentLevel=1"; break;
            case "bad": HQL += " and commentLevel=2"; break;
            case "withImage": HQL += " and images.size > 0"; break;
            default: HQL += " order by addTime desc";
        }
        Map<String, Object> map = new HashMap<>();
        map.put("id", commodityId);
        List<Comment> comments = commentDao.find(HQL, map, page, size);
        return entity2model(comments);
    }

    @Override
    public CommentInfoModel getCommentInfoByCommodityId(int commodityId) {
        CommentInfoModel cim = new CommentInfoModel();
        String SQL = "from Comment where commodityId=:id";
        Map<String, Object> map = new HashMap<>();
        map.put("id", commodityId);
        List<Comment> comments = commentDao.find(SQL, map);
        int goodCount = 0, middleCount = 0, badCount = 0, withImageCount = 0;
        for (Comment comment : comments) {
            if (comment.getCommentLevel() == 0) {
                goodCount++;
            } else if (comment.getCommentLevel() == 1) {
                middleCount++;
            } else if (comment.getCommentLevel() == 2) {
                badCount++;
            }
            if (comment.getImages().size() > 0) {
                withImageCount++;
            }
        }
        cim.setGoodCount(goodCount);
        cim.setMiddleCount(middleCount);
        cim.setBadCount(badCount);
        cim.setWithImageCount(withImageCount);
        return cim;
    }

    @Override
    public PageModel<CommentModel> findCommentPage(List<CommentModel> models, int page, int size, int commodityId, String filter) {
        String HQL = "select count(*) from Comment where commodityId=:id";
        switch (filter) {
            case "good": HQL += " and commentLevel=0"; break;
            case "middle": HQL += " and commentLevel=1"; break;
            case "bad": HQL += " and commentLevel=2"; break;
            case "withImage": HQL += " and images.size > 0"; break;
            default: HQL += " order by addTime desc";
        }
        Map<String, Object> map = new HashMap<>();
        map.put("id", commodityId);
        int totalNum = commentDao.count(HQL, map).intValue();
        PageModel<CommentModel> pageModel = new PageModel<>();
        pageModel.setDataList(models);
        pageModel.setCurrentPage(page);
        pageModel.setPageCount(totalNum % size == 0 ? totalNum / size : totalNum / size + 1);
        pageModel.setTotalNum(totalNum);
        pageModel.setPageSize(size);
        return pageModel;
    }
}
