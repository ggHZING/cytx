package com.cytx.dao;

import com.cytx.pojo.Comment;
import com.cytx.pojo.CommentExample;
import com.cytx.pojo.QueryVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CommentMapper {

    int postCountByQueryVo(QueryVo vo);

    List<Comment> selectPostListByQueryVo(QueryVo vo);

    void add(Comment comment);
}