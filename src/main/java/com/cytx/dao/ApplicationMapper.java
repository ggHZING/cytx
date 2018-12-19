package com.cytx.dao;

import com.cytx.pojo.Application;
import com.cytx.pojo.ApplicationExample;
import com.cytx.pojo.QueryVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ApplicationMapper {


    int postCountByQueryVo(QueryVo vo);

    List<Application> selectPostListByQueryVo(QueryVo vo);

    void pass(Integer id);

    void fail(Integer id);
}