package com.cytx.service.Impl;

import com.cytx.dao.OrderMapper;
import com.cytx.dao.UserMapper;
import com.cytx.pojo.*;
import com.cytx.service.OrderService;
import com.cytx.utils.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired
    OrderMapper orderMapper;
    @Autowired
    UserMapper userMapper;

    @Override
    public Page<Order> selectOrderPageByQueryVo(QueryVo vo) {
        Page<Order> page = new Page<Order>();
        //每页数
        page.setSize(5);
        vo.setSize(5);
        if (null != vo) {
            // 判断当前页
            if (null != vo.getPage()) {
                page.setPage(vo.getPage());
                vo.setStartRow((vo.getPage() - 1) * vo.getSize());
            }
            if(null != vo.getName() && !"".equals(vo.getName().trim())){
                vo.setName(vo.getName().trim());
            }
            if(null !=vo.getUserid()&&!"".equals(vo.getUserid())){
                vo.setUserid(vo.getUserid());
            }

            //总条数
            page.setTotal(orderMapper.postCountByQueryVo(vo));
            page.setRows(orderMapper.selectPostListByQueryVo(vo));
        }
        return page;
    }

    @Override
    public void updateStateById(Integer id) {
        orderMapper.updateStateById(id);
    }

    @Override
    public int insertOrder(Order order) {
        return orderMapper.insertOrder(order);
    }

    @Override
    public Order getOrderByNo(String no) {
        return orderMapper.getOrderByNo(no);
    }

    @Override
    public void updateStatusToPayById(Integer id) {
        orderMapper.updateStatusToPayById(id);
    }
}
