package com.cytx.service;

import com.cytx.pojo.Comment;
import com.cytx.pojo.QueryVo;
import com.cytx.utils.Page;


public interface CommentService {
    Page<Comment> getCommentByVo(QueryVo vo);

    void addComment(Comment comment);
}
