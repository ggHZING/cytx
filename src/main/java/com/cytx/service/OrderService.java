package com.cytx.service;

import com.cytx.pojo.Order;
import com.cytx.pojo.QueryVo;
import com.cytx.utils.Page;

public interface OrderService {
    Page<Order> selectOrderPageByQueryVo(QueryVo vo);

    void updateStateById(Integer id);
}
