<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>畅游天下登录注册</title>
    <link rel="stylesheet" href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="<%=basePath%>css/register.css">
    <script type="text/javascript" src="<%=basePath%>js/register.js"></script>

</head>
<body>

<!--<div class="top">
      <ul>
          <li><a href="index.html">返回首页</a></li>
          <li><a href="#">联系我们</a></li>
      </ul>
  </div>-->
<div class="container">
    <div class="logo">
        <div class="logo-img">
            <img src="../../../images/logo_1.jpg">
        </div>
        <div class="logo-nav">
            <ul>
                <li><a href="${pageContext.request.contextPath }/user">返回首页</a></li>
                <li><a href="#">联系我们</a></li>
            </ul>
        </div>
        <div class="login">已经有畅游天下账号了？<a href="${pageContext.request.contextPath }/loginPage">立即登录</a></div>
    </div>
</div>

<div class="register container">
    <div class="register-l">
        <div class="form-reg">
            <form action="${pageContext.request.contextPath }/register" method="post" id="myform-register" onsubmit="return checkForm()">
                <table>
                    <tr>
                        <td><c:if test="${errorInfo!=null}">${errorInfo}</c:if></td>
                    </tr>
                    <tr>
                        <td class="txt">用户名</td>
                        <td><input type="text" id="username" name="username"  onkeyup="checkusername();" placeholder="请输入用户名"></td>
                        <td><span id="userMsg" style="margin-left: 15px;"></span>
                            <font color="#999999"></font></td>
                    </tr>
                    <tr>
                        <td class="txt">登录密码</td>
                        <td><input type="password" id="password" name="password" onkeyup="checkpassword();" placeholder="请输入密码"></td>
                        <td><span id="passwordMsg" style="margin-left: 15px;"></span>
                            <font color="#999999"></font></td>
                    </tr>
                    <tr>
                        <td class="txt">确认密码</td>
                        <td><input type="password" id="rpassword" name="rpassword" onkeyup="checkrpassword();" placeholder="确认密码"></td>
                        <td><span id="checkMsg" style="margin-left: 15px;"></span>
                            <font color="#999999"></font></td>
                    </tr>
                    <tr>
                        <td class="txt">邮箱</td>
                        <td><input type="email" name="email"  id="email" onkeyup="checkemail();" placeholder="邮箱"></td>
                        <td><span id="emailMsg" style="margin-left: 15px;"></span>
                            <font color="#999999"></font></td>

                    </tr>
                    <tr>
                        <td class="txt">手机号码</td>
                        <td><input type="text" name="phone" id="phone" onkeyup="checkphone();"  placeholder="手机号"></td>
                        <td><span id="phoneMsg" style="margin-left: 15px;"></span>
                            <font color="#999999"></font></td>
                    </tr>

                </table>
                <input type="submit" class="btn btn-primary" name="register" id="register" value="立即注册"></input>
                <input type="reset" class="btn btn-primary" name="reset" id="reset" value="重置"></input>
            </form>
        </div>
    </div>

    <div class="register-r" id="register-r">
        <h5>注册成为畅游天下用户后，您可以：</h5>
        <ul>
            <li>畅游全国所有景点</li>
            <li>第一时间获取最新攻略信息</li>
            <li>轻松管理订单</li>
            <li>规划最省钱、最质量的行程</li>
        </ul>
    </div>
</div>


</body>
</html>



