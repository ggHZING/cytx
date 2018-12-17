package com.cytx.controller;

import com.cytx.pojo.QueryVo;
import com.cytx.pojo.Scenic;
import com.cytx.service.ScenicService;
import com.cytx.utils.Page;
import com.cytx.utils.UploadUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class ScenicController {
    @Autowired
    ScenicService scenicService;

    /**
     * 管理员管理所有景点
     * @param model
     * @param vo
     * @return
     */
    @RequestMapping(value = "/manageScenic")
    public String getScenicPage(Model model, QueryVo vo){
        Page<Scenic> page = scenicService.selectPageByQueryVo(vo);
        model.addAttribute("page", page);
        model.addAttribute("name",vo.getName());
        return "manager/scenic";
    }

    /**
     * 管理员删除景区
     * @param id
     * @return
     */
    @RequestMapping(value = "/deleteScenic")
    public @ResponseBody
    String deleteScenic(Integer id){
        //删除
        scenicService.deleteById(id);
        return "OK";
    }

    /**
     * 管理员新增景点信息
     * @param scenic
     * @return
     */
    @RequestMapping(value = "/addScenic")
    public String insert(Scenic scenic,MultipartFile scenicImage){
        //当上传的图片不为空的时候才去存储路径,否则不存
        if (scenicImage.getSize() != 0) {
            //将上传的文件保存到磁盘中
            String path = "E:\\ideaworkplace\\cytx\\src\\main\\webapp\\image\\jq";
            String imageName = UploadUtil.upload(scenicImage,path);
            //将图片路径封装到Scenic中
            scenic.setScenicPicture("image/jq/"+imageName);
        }
        //插入
        scenicService.addScenic(scenic);
        return "redirect:/manageScenic";
    }
}
