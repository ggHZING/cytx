package com.cytx.controller;

import com.cytx.pojo.QueryVo;
import com.cytx.pojo.Scenic;
import com.cytx.pojo.User;
import com.cytx.service.UserService;
import com.cytx.utils.GetMessageCode;
import com.cytx.utils.Page;
import com.cytx.utils.UploadUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.mail.Session;
import javax.servlet.http.*;
import java.io.IOException;

@Controller
public class UserController {
    @Autowired
     UserService userService;

    /**
     * 用户登录
     * @param model
     * @param request
     * @param session
     * @param response
     * @param user
     * @return
     */
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String userLogin(Model model,HttpServletRequest request, HttpSession session, HttpServletResponse response, User user){
        String inputVerifyCode=request.getParameter("verifyCode");
        String verifyCodeValue=(String) session.getAttribute("verifyCodeValue");
        if(verifyCodeValue.equals(inputVerifyCode.toUpperCase())){
            User u = userService.confirmUser(user);
            if(u==null){
                model.addAttribute("errorInfo","用户名或密码错误！");
                return "user/login";
            }else {
                if (u.getUserId() != null && !"".equals(u.getUserId())) {
                    //登录成功
                    //***************判断用户是否勾选了自动登录*****************
                    String autoLogin = request.getParameter("autoLogin");
                    if("autoLogin".equals(autoLogin)){
                        //要自动登录
                        //创建存储用户名的cookie
                        Cookie cookie_username = new Cookie("cookie_username",user.getUserName());
                        cookie_username.setMaxAge(10*60);
                        //创建存储密码的cookie
                        Cookie cookie_password = new Cookie("cookie_password",user.getUserPassword());
                        cookie_password.setMaxAge(10*60);
                        response.addCookie(cookie_username);
                        response.addCookie(cookie_password);
                    }
                    //将user对象存到session中
                    session.setAttribute("user", u);
                    return "redirect:/user";
                }
                model.addAttribute("errorInfo","用户名id为空！");
                return "user/login";
            }
        }else{
            model.addAttribute("errorInfo","验证码错误！");
            return "user/login";
        }
    }

    /**
     * 短信登录
     */
    @RequestMapping(value = "/sendSMS", method = RequestMethod.POST)
    public void SendSms(HttpServletRequest req,HttpServletResponse resp) throws IOException {
        String phone=req.getParameter("phonenum");
        //根据获取到的手机号发送验证码
        String code= GetMessageCode.getCode(phone);

        System.out.println(code);
        resp.getWriter().print(code);
    }
    @RequestMapping(value = "/phoneIsRegister",method = RequestMethod.POST)
    public String PhoneIsRegister(HttpServletRequest req,HttpServletResponse resp,Model model,HttpSession session){
        String phone=req.getParameter("phonenum");
        Boolean isRegister = userService.phoneIsExist(phone);

            if (isRegister){
               User user =userService.getUserByPhone(phone);
                session.setAttribute("user", user);
                return "redirect:/user";
            }else {
                model.addAttribute("loginInfo","该手机号未注册！");
                return"user/login";
            }

    }

    /**
     * 用户注册
     */
    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String userRegister(Model model, User user){

        user.setUserPhoto("image/tx/moren.png");
        user.setUserState(0);

        if (user.getUserName() != null && !"".equals(user.getUserName())){
            if (user.getUserPassword() != null && !"".equals(user.getUserPassword())){
                int j=userService.checkUsernane(user.getUserName());
                if (j==0){
                    int k = userService.checkPhone(user.getUserPhone());
                    if(k==0) {
                        int i = userService.userRegister(user);
                        if (i > 0) {
                            return "user/login";//注册成功到登陆界面
                        }
                        model.addAttribute("errorInfo","注册用户失败！");
                        return "user/register";//插入注册数据失败
                    }
                    model.addAttribute("errorInfo","手机号已经存在！");
                    return "user/register";//手机号已经存在
                }
                model.addAttribute("errorInfo","用户名已经存在！");
                return "user/register";//用户名已经存在
            }
            model.addAttribute("errorInfo","请您完善信息！");
            return "user/register";//密码非""
        }

        model.addAttribute("errorInfo","请您完善信息！");
        return "user/register";//账号非""

        }

    /**
     * 用户退出
     * @param request
     * @param response
     * @return
     */
    @RequestMapping(value = "/logout")
    public String logout(HttpServletRequest request, HttpServletResponse response){
        HttpSession session = request.getSession();
        //从session中将user删除
        session.removeAttribute("user");

        //将存储在客户端的cookie删除掉
        Cookie cookie_username = new Cookie("cookie_username","");
        cookie_username.setMaxAge(0);
        //创建存储密码的cookie
        Cookie cookie_password = new Cookie("cookie_password","");
        cookie_password.setMaxAge(0);

        response.addCookie(cookie_username);
        response.addCookie(cookie_password);

        return "user/login";
    }

    /**
     * 管理员管理用户信息
     * @param model
     * @param vo
     * @return
     */

    @RequestMapping(value="/manageUser")
    public String getPageTest(QueryVo vo,Model model){
        Page<User> page = userService.selectPageByQueryVo(vo);
        model.addAttribute("page", page);
        model.addAttribute("name",vo.getName());
        return "manager/user";
    }

    /**
     * 管理员删除用户
     * @param id
     * @return
     */
    @RequestMapping(value = "/deleteUser")
    public @ResponseBody
    String deleteScenic(Integer id){
        //删除
        userService.deleteById(id);
        return "OK";
    }

    /**
     * 用户修改个人信息
     * @param user
     * @param image
     * @return
     */
    @RequestMapping(value = "/updatePerson")
    public String update(User user, MultipartFile image){
        //当上传的图片不为空的时候才去存储路径,否则不存
        if (image.getSize() != 0) {
            //将上传的文件保存到磁盘中
            String path = "E:\\ideaworkplace\\cytx\\src\\main\\webapp\\image\\tx";
            String imageName = UploadUtil.upload(image,path);
            //将图片路径封装到Scenic中
            user.setUserPhoto("image/tx/"+imageName);
        }
        //插入
        userService.updatePerson(user);
        return "redirect:/personPage";
    }
}

