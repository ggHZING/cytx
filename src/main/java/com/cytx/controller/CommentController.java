package com.cytx.controller;

import com.cytx.pojo.*;
import com.cytx.service.CommentService;
import com.cytx.utils.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Date;

@Controller
public class CommentController {
    @Autowired
    CommentService commentService;


    @RequestMapping(value = "/getComment")
    public String getCommentPage(Model model, QueryVo vo, HttpServletRequest request, HttpSession httpSession){
        Way way =(Way) request.getSession().getAttribute("myway");
        vo.setWayid(way.getWayId());
        Page<Comment> page = commentService.getCommentByVo(vo);
        httpSession.setAttribute("page",page);
//        model.addAttribute("page", page);
        return "user/strategyDetail";
    }


    @RequestMapping(value = "/insertComment")
    public String insert( Comment comment, HttpServletRequest request){
        User user = (User)request.getSession().getAttribute("user");
        Way way =(Way) request.getSession().getAttribute("myway");
        comment.setUid(user.getUserId());
        comment.setWid(way.getWayId());
        comment.setTime(new Date());
        commentService.addComment(comment);
        return "user/comment";
    }

    @RequestMapping(value = "/comment")
    public String test(Model model, QueryVo vo, HttpServletRequest request){
        Way way =(Way) request.getSession().getAttribute("myway");
        vo.setWayid(way.getWayId());
        Page<Comment> page = commentService.getCommentByVo(vo);

        model.addAttribute("page", page);
        return "user/comment";
    }
}
