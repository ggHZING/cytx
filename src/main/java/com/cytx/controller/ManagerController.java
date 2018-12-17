package com.cytx.controller;

import com.cytx.pojo.Manager;
import com.cytx.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
public class ManagerController {

    @Autowired
    ManagerService managerService;

    /**
     * 管理员登陆
     *
     * @param model
     * @param session
     * @param manager
     * @return
     */
    @RequestMapping(value = "/managerLogin")
    public String confirmManager(Model model, HttpSession session, Manager manager, HttpServletRequest request, HttpServletResponse response) {
        Manager manager1 = managerService.confirmManager(manager);
        if (manager1 == null) {
            model.addAttribute("errorInfo", "用户名或密码错误！");
            return "manager/login";
        } else {
            if (manager1.getManagerId() != null && !"".equals(manager1.getManagerId())) {
                //登录成功
                //***************判断用户是否勾选了自动登录*****************
                String autoLogin = request.getParameter("autoLogin");
                if ("autoLogin".equals(autoLogin)) {
                    //要自动登录
                    //创建存储用户名的cookie
                    Cookie cookie_username = new Cookie("cookie_username", manager.getManagerUsername());
                    cookie_username.setMaxAge(10 * 60);
                    //创建存储密码的cookie
                    Cookie cookie_password = new Cookie("cookie_password", manager.getManagerPassword());
                    cookie_password.setMaxAge(10 * 60);
                    response.addCookie(cookie_username);
                    response.addCookie(cookie_password);
                }
                //将user对象存到session中
                session.setAttribute("manager", manager1);
                return "redirect:/manager";
            }
            model.addAttribute("errorInfo", "用户名id为空！");
            return "manager/login";
        }
    }

    /**
     * 管理员注销
     * @param request
     * @return
     */
    @RequestMapping(value = "/managerLogout")
    public String logout(HttpServletRequest request){
        HttpSession session = request.getSession();
        //从session中将user删除
        session.removeAttribute("manager");
        return "manager/login";
    }
}

