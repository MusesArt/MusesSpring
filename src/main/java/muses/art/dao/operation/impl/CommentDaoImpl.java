package muses.art.dao.operation.impl;

import muses.art.dao.common.impl.BaseDaoImpl;
import muses.art.dao.operation.CommentDao;
import muses.art.entity.operation.Comment;
import org.springframework.stereotype.Repository;

@Repository
public class CommentDaoImpl extends BaseDaoImpl<Comment> implements CommentDao {
}
