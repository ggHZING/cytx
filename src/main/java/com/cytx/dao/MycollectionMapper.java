package com.cytx.dao;

import com.cytx.pojo.Mycollection;
import com.cytx.pojo.MycollectionExample;
import com.cytx.pojo.QueryVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MycollectionMapper {

    void addCollection(Mycollection mycollection);

    List<Mycollection> selectCollection(QueryVo vo);

    int postCountByQueryVo(QueryVo vo);
}