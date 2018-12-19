package com.cytx.controller;

import com.cytx.pojo.Order;
import com.cytx.pojo.QueryVo;
import com.cytx.service.OrderService;
import com.cytx.utils.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class OrderController {

    @Autowired
    OrderService orderService;

    /**
     *管理员查看所有订单
     * @param model
     * @param vo
     * @return
     */
    @RequestMapping(value = "/manageOrder")
    public String getOrderPage(Model model, QueryVo vo){
        Page<Order> page = orderService.selectOrderPageByQueryVo(vo);
        model.addAttribute("page", page);
        model.addAttribute("name",vo.getName());
        return "manager/order";
    }

    @RequestMapping(value = "/updateOrderState")
    public @ResponseBody
    String updateState(Integer id){
        orderService.updateStateById(id);
        return "OK";
    }
}
