package com.cytx.controller;

import com.cytx.pojo.Application;
import com.cytx.pojo.QueryVo;
import com.cytx.service.ApplicationService;
import com.cytx.utils.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ApplicationController {
    @Autowired
    ApplicationService applicationService;

    /**
     * 后台查询申请表
     * @param model
     * @param vo
     * @return
     */
    @RequestMapping(value = "/manageApplication")
    public String getApplicationPage(Model model, QueryVo vo){
        Page<Application> page = applicationService.selectApplicationPageByQueryVo(vo);
        model.addAttribute("page", page);
        model.addAttribute("name",vo.getName());
        return "manager/application";
    }

    @RequestMapping(value = "/passApplication")
    public @ResponseBody
    String pass(Integer id){
        applicationService.pass(id);
        return "OK";
    }

    @RequestMapping(value = "/failApplication")
    public @ResponseBody
    String fail(Integer id){
        applicationService.fail(id);
        return "OK";
    }
}
