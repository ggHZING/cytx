package com.cytx.controller;

import com.cytx.pojo.*;
import com.cytx.service.MycollectionService;
import com.cytx.utils.Page;
import com.cytx.utils.UploadUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class MycollectionController {
    @Autowired
    MycollectionService mycollectionService;


    /**
     *  添加收藏
     * @param mycollection
     * @param request
     * @return
     */
    @RequestMapping(value = "/insertCollection")
    public String insert(Mycollection mycollection, HttpServletRequest request){
        User user = (User)request.getSession().getAttribute("user");
        Scenic scenics =(Scenic) request.getSession().getAttribute("scenics");
        mycollection.setUid(user.getUserId());
        mycollection.setSid(scenics.getScenicId());
        mycollectionService.addCollection(mycollection);
        return "user/ScenicDetail";
    }


    @RequestMapping(value = "/mycollectionPage")
    public String getOrderPage(Model model,HttpServletRequest request,QueryVo vo){
        User user = (User)request.getSession().getAttribute("user");
        Integer id=user.getUserId();
        vo.setUserid(id);
        Page<Mycollection> page = mycollectionService.selectCollectionPage(vo);
        model.addAttribute("page", page);

        return "user/mycollection";
    }
}
