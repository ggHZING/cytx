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
    <title>特价路线</title>
    <link rel="stylesheet" href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">
    <link rel="stylesheet" href="<%=basePath%>css/index.css">
    <link rel="stylesheet" type="text/css" href="<%=basePath%>css/route.css">


</head>
<body>
<input type="hidden" id="baseUrl" value="${pageContext.request.contextPath }/" />


<div class="main">
    <!-- 引入header.jsp -->
    <jsp:include page="header.jsp"></jsp:include>

    <div id="bg" style="background-image: url(<%=basePath%>/images/mssj.jpg)">
        <h1>用最少的钱</h1>
        <h3>畅游天下</h3>
    </div>

    <!--分割线 -->
    <div class="line">
        <div class="middle-line">
            <span class="line-text">最新特价</span>
        </div>
    </div>

    <div id="introduce">
        <div class="introduce-l">
            <div class="img">
                <img src="../images/yangsuo.jpg">
                <button><span id="discount">8.5</span>折</button>
            </div>
            <div class="title">广西桂林山水甲天下</div>
            <div class="content hidden-xs">&nbsp;&nbsp;&nbsp;&nbsp;桂林山水甲天下,阳朔山水甲桂林。阳朔是一个绝佳的山水旅游地方.....</div>
            <div class="money">优惠价<img src="../icon/rmb.png" id="rmb"><span id="sum">99.9</span></div>
        </div>

        <div class="introduce-c">
            <div class="img"><img src="../images/yangsuo.jpg">
                <button><span id="discount">8.5</span>折</button></div>
            <div class="title">广西桂林山水甲天下</div>
            <div class="content hidden-xs">&nbsp;&nbsp;&nbsp;&nbsp;桂林山水甲天下,阳朔山水甲桂林。阳朔是一个绝佳的山水旅游地方.....</div>
            <div class="money">优惠价<img src="../icon/rmb.png" id="rmb"><span id="sum">99.9</span></div>
        </div>

        <div class="introduce-r">
            <div class="img"><img src="../images/yangsuo.jpg">
                <button><span id="discount">8.5</span>折</button></div>
            <div class="title">广西桂林山水甲天下</div>
            <div class="content hidden-xs">&nbsp;&nbsp;&nbsp;&nbsp;桂林山水甲天下,阳朔山水甲桂林。阳朔是一个绝佳的山水旅游地方.....</div>
            <div class="money">优惠价<img src="../icon/rmb.png" id="rmb"><span id="sum">99.9</span></div>
        </div>
    </div>


    <!--分割线 -->
    <div class="line">
        <div class="middle-line">
            <span class="line-text">所有特价</span>
        </div>
    </div>

    <div id="all_strategy">
        <div class="strategy_1">
            <div class="strategy_img"><img src="../images/yancheng.jpg"></div>
            <div class="strategy_title">盐城</div>
            <div class="strategy_money">优惠价<img src="../icon/rmb.png" id="rmb"><span id="sum">99.9</span></div>
        </div>

        <div class="strategy_2">
            <div class="strategy_img"><img src="../images/yancheng.jpg"></div>
            <div class="strategy_title">盐城</div>
            <div class="strategy_money">优惠价<img src="../icon/rmb.png" id="rmb"><span id="sum">99.9</span></div>
        </div>

        <div class="strategy_3">
            <div class="strategy_img"><img src="../images/yancheng.jpg"></div>
            <div class="strategy_title">盐城</div>
            <div class="strategy_money">优惠价<img src="../icon/rmb.png" id="rmb"><span id="sum">99.9</span></div>
        </div>

        <div class="strategy_4">
            <div class="strategy_img"><img src="../images/yancheng.jpg"></div>
            <div class="strategy_title">盐城</div>
            <div class="strategy_money">优惠价<img src="../icon/rmb.png" id="rmb"><span id="sum">99.9</span></div>
        </div>
    </div>
    <div class="toTop">
        <a href="#wellcome"><span class="glyphicon glyphicon-chevron-up"></span></a>
    </div>




    <!-- 引入header.jsp -->
    <jsp:include page="footer.jsp"></jsp:include>
</div>


<script src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
<script src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script type="text/javascript">
    //$(function(){
    //自动播放
    $('#myCarousel').carousel({
        interval:4000,
        wrap:true
    });
</script>

</body>
</html>
