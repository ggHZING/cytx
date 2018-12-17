package com.cytx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
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
    public String testUserIndex(){
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
