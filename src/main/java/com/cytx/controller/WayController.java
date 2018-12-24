package com.cytx.controller;

import com.cytx.pojo.QueryVo;
import com.cytx.pojo.Scenic;
import com.cytx.pojo.Way;
import com.cytx.service.WayService;
import com.cytx.utils.Page;
import com.cytx.utils.UploadUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class WayController {

    @Autowired
    WayService wayService;

    /**
     * 管理员管理所有攻略
     * @param model
     * @param vo
     * @return
     */
    @RequestMapping(value = "/manageWay")
    public String getWayPage(Model model, QueryVo vo){
        Page<Way> page = wayService.selectPageByQueryVo(vo);
        model.addAttribute("page", page);
        model.addAttribute("name",vo.getName());
        return "manager/way";
    }


    /**
     * 管理员添加攻略
     * @param way
     * @param wayImage
     * @return
     */
    @RequestMapping(value = "/addWay")
    public String insert(Way way, MultipartFile wayImage){
        //当上传的图片不为空的时候才去存储路径,否则不存
        if (wayImage.getSize() != 0) {
            //将上传的文件保存到磁盘中
            String path = "E:\\ideaworkplace\\cytx\\src\\main\\webapp\\image\\way";
            String imageName = UploadUtil.upload(wayImage,path);
            //将图片路径封装到Scenic中
            way.setWayPic("image/way/"+imageName);
        }
        //插入
        wayService.addWay(way);
        return "redirect:/manageWay";
    }

    /**
     * 用户新增攻略
     * @param way
     * @param wayImage
     * @return
     */
    @RequestMapping(value = "/addWayByUser")
    public String insertByUser(Way way, MultipartFile wayImage){
        //当上传的图片不为空的时候才去存储路径,否则不存
        if (wayImage.getSize() != 0) {
            //将上传的文件保存到磁盘中
            String path = "E:\\ideaworkplace\\cytx\\src\\main\\webapp\\image\\way";
            String imageName = UploadUtil.upload(wayImage,path);
            //将图片路径封装到Scenic中
            way.setWayPic("image/way/"+imageName);
        }
        //插入
        wayService.addWay(way);
        return "redirect:/personPage";
    }


    /**
     * 管理员根据id删除攻略
     * @param id
     * @return
     */
    @RequestMapping(value = "/deleteWay")
    public @ResponseBody
    String deleteWay(Integer id){
        //删除
        wayService.deleteById(id);
        return "OK";
    }


    /**
     * 根据id获得攻略信息
     * @param id
     * @return
     */
    @RequestMapping(value = "/getWayById")
    public @ResponseBody Way getWayById(Integer id){
        Way way = wayService.getWayById(id);
        return way;
    }


    /**
     * 修改攻略
     * @param way
     * @param wayImage
     * @return
     */
    @RequestMapping(value = "/updateWay")
    public String update(Way way,MultipartFile wayImage){
        //当上传的图片不为空的时候才去存储路径,否则不存
        if (wayImage.getSize() != 0) {
            //将上传的文件保存到磁盘中
            String path = "E:\\ideaworkplace\\cytx\\src\\main\\webapp\\image\\way";
            String imageName = UploadUtil.upload(wayImage,path);
            //将图片路径封装到Scenic中
            way.setWayPic("image/way/"+imageName);
        }
        //插入
        wayService.updateWay(way);
        return "redirect:/manageWay";
    }

    /**
     * 加载攻略页面
     * @return
     */
    @RequestMapping(value = "/strategyPage")
    public String toStrategyPage(Model model,QueryVo queryVo){
        List<Way> listWay=wayService.selectWayList();
        Page<Way> page = wayService.selectPageByQuery(queryVo);

        List<Way> listWay1 = listWay.subList(0, 3);
        List<Way> listWay2 = listWay.subList(3, 6);

        model.addAttribute("listWay1",listWay1);
        model.addAttribute("listWay2",listWay2);
        model.addAttribute("page", page);
        return "user/strategy";
    }

    @RequestMapping(value = "/selectWayById")
    public  String selectWayById(Integer id, HttpSession session){
        Way way = wayService.getWayById(id);
        session.setAttribute("myway",way);
        return "redirect:/toStrategyDetailPage";
    }

    @RequestMapping(value = "/toStrategyDetailPage")
    public  String toStrategyDetailPage(){

        return "user/strategyDetail";
    }

}
