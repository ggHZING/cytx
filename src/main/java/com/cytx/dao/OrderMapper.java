package com.cytx.dao;

import com.cytx.pojo.Order;
import com.cytx.pojo.OrderExample;
import com.cytx.pojo.QueryVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface OrderMapper {


    int postCountByQueryVo(QueryVo vo);

    List<Order> selectPostListByQueryVo(QueryVo vo);

    void updateStateById(Integer id);
}