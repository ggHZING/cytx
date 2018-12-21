package com.cytx.dao;

import com.cytx.pojo.Order;
import com.cytx.pojo.QueryVo;

import java.util.List;

public interface OrderMapper {


    int postCountByQueryVo(QueryVo vo);

    List<Order> selectPostListByQueryVo(QueryVo vo);

    void updateStateById(Integer id);

    int insertOrder(Order order);

    Order getOrderByNo(String no);

    void updateStatusToPayById(Integer id);
}