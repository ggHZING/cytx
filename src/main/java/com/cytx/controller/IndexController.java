package com.cytx.controller;

import com.cytx.pojo.Scenic;
import com.cytx.pojo.Way;
import com.cytx.service.ScenicService;
import com.cytx.service.WayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class IndexController {
    @Autowired
    ScenicService scenicService;

    @Autowired
    WayService wayService;
    /**
     * 用户登录界面
     * @return
     */
    @RequestMapping(value = "/loginPage")
    public String toLoginPage(){
        return "user/login";
    }


    /**
     * 用户注册界面
     * @return
     */
    @RequestMapping(value = "/registerPage")
    public String toRegisterPage(){
        return "user/register";
    }


    /**
     * 加载用户主界面
     * @param
     * @return
     */
    @RequestMapping(value = "/user")
    public String testUserIndex(Model model){
        List<Scenic> list =  scenicService.selectScenicList();
        List<Way> listWay=wayService.selectWayList();
        list = list.subList(0, 3);
        List<Way> listWay1=listWay.subList(0,1);
        List<Way> listWay2=listWay.subList(1,2);
        List<Way> listWay3=listWay.subList(2,3);
        List<Way> listWay4=listWay.subList(3,4);

        model.addAttribute("list",list);
        model.addAttribute("listWay1",listWay1);
        model.addAttribute("listWay2",listWay2);
        model.addAttribute("listWay3",listWay3);
        model.addAttribute("listWay4",listWay4);
        return "user/index";
    }

    /**
     * 管理员登陆界面
     * @return
     */
    @RequestMapping(value = "/managerLoginPage")
    public String toManagerLoginPage(){
        return "manager/login";
    }

    /**
     * 加载管理员首页
     * @return
     */
    @RequestMapping(value = "/manager")
    public String testManagerIndex(){
        return "manager/index";
    }






}
