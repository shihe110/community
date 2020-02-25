package life.majiang.community.service;

import life.majiang.community.mapper.CommentMapper;
import life.majiang.community.model.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName CommentService
 * @Description TODO
 * @Author admin
 * @Date 2020-01-13 13:39
 * @Version 1.0
 */
@Service
public class CommentService {

    @Autowired
    private CommentMapper commentMapper;

    public void insert(Comment comment) {
        commentMapper.insert(comment);
    }
}
