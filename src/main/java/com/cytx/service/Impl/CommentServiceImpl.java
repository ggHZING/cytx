package com.cytx.service.Impl;

import com.cytx.dao.CommentMapper;
import com.cytx.pojo.Comment;
import com.cytx.pojo.QueryVo;
import com.cytx.service.CommentService;
import com.cytx.utils.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentServiceImpl implements CommentService {
    @Autowired
    CommentMapper commentMapper;


    @Override
    public Page<Comment> getCommentByVo(QueryVo vo) {
        Page<Comment> page = new Page<Comment>();
        //每页数
        page.setSize(1);
        vo.setSize(1);
        if (null != vo) {
            // 判断当前页
            if (null != vo.getPage()) {
                page.setPage(vo.getPage());
                vo.setStartRow((vo.getPage() - 1) * vo.getSize());
            }

            if(null !=vo.getWayid()&&!"".equals(vo.getWayid())){
                vo.setWayid(vo.getWayid());
            }

            //总条数
            page.setTotal(commentMapper.postCountByQueryVo(vo));
            page.setRows(commentMapper.selectPostListByQueryVo(vo));
        }
        return page;
    }

    @Override
    public void addComment(Comment comment) {
        commentMapper.add(comment);
    }
}
