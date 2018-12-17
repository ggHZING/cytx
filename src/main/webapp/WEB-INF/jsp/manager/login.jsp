<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>畅游天下登录注册</title>
    <link rel="stylesheet" href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
    <script src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <link rel="stylesheet" type="text/css" href="<%=basePath%>css/login.css">
    <script src="http://static.runoob.com/assets/jquery-validation-1.14.0/dist/jquery.validate.min.js"></script>
    <script type="text/javascript" src="<%=basePath%>js/login.js"></script>

</head>
<body>
<input type="hidden" id="baseUrl" value="${pageContext.request.contextPath }/" />


<div class="box">
    <div id="myTabContent" class="tab-content">
        <div class="tab-pane fade in active" id="login">
            <c:if test="${errorInfo!=null}">${errorInfo}</c:if>
            <form action="${pageContext.request.contextPath }/managerLogin" method="post" id="myform-login">
                <input type="text" id="username_txt" name="managerUsername" class="form-control" placeholder="请输入用户名">
                <span class="errorTips"></span>
                <input type="password" id="password_txt" name="managerPassword" class="form-control" placeholder="请输入密码">
                <span class="errorTips"></span>


                <div id="zidong">
                    <input name="autoLogin" type="checkbox" value="" checked><span>下次自动登录</span>

                </div>
                <button type="submit" class="btn btn-primary pwdLogin"  id="denglu" onclick="check()">登录</button>
            </form>


        </div>
    </div>
</div>


<!--生成四位随机数 -->
<script type="text/javascript">
    function getCode(n) {
        var all = "azxcvbnmsdfghjklqwertyuiopZXCVBNMASDFGHJKLQWERTYUIOP0123456789";
        var b = "";
        for (var i = 0; i < n; i++) {
            var index = Math.floor(Math.random() * 62);
            b += all.charAt(index);

        }
        return b;
    };

    function show() {
        document.getElementById("login-code").innerHTML = getCode(4);
    }

    window.onload=show;
    function check(){
        var codeInput = document.getElementById("codetxt").value;
        var code = document.getElementById("login-code").innerHTML;
        if (codeInput != code) {
            alert("验证码错误");
        }
        else{
            return;
        }
    }
</script>

<!--登录验证 -->
<script type="text/javascript">
    $("#myform-login").validate({
        rules:{
            username_txt:{
                required:true,
                minlength:2,
                maxlength:10
            },
            password_txt:{
                required:true,
                minlength:2,
                maxlength:16
            }
        },
        messages:{
            username_txt:{
                required:"用户名为必填项",
                minlength:"最小长度为2",
                maxlength:"最大长度为10"
            },
            password_txt:{
                required:"密码为必填项",
                minlength:"最小长度为2",
                maxlength:"最大长度为16"
            }
        },
        errorPlacement: function(error, element) { //错误信息位置设置方法
            error.appendTo( element.next() ); //这里的element是录入数据的对象
        }
    });
    $("#myform-duanxin").validate({
        rules:{
            phonenum:{
                required:true,
                minlength:11,
                maxlength:11
            },
            txt_yzm:{
                required:true,
                minlength:6,
                maxlength:6
            }
        },
        messages:{
            phonenum:{
                required:"请填写手机号",
                minlength:"手机号格式错误",
                maxlength:"手机号格式错误"
            },
            txt_yzm:{
                required:"请填写验证码",
                minlength:"验证码错误",
                maxlength:"验证码错误"
            }
        },
        errorPlacement: function(error, element) { //错误信息位置设置方法
            error.appendTo( element.next() ); //这里的element是录入数据的对象
        }
    });
</script>


</body>
</html>
