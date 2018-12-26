<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="/WEB-INF/tld/myTag.tld" prefix="lyz" %>
<%@ taglib prefix="p" uri="http://commonutils.cn/tld/" %>
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

        <c:forEach items="${list}" var="scenic">
            <div class="introduce-l">
                <div class="img">
                    <button type="button" onclick="getScenic(${scenic.scenicId})"><img src="../${scenic.scenicPicture}"></button>
                    <button><span id="discount">8.5</span>折</button>
                </div>
                <div class="title">${scenic.scenicName}</div>
                <div class="content hidden-xs">&nbsp;&nbsp;&nbsp;&nbsp;<lyz:htmlFilter>${scenic.scenicIntro}</lyz:htmlFilter>......</div>
                <div class="money" style="margin-top: 5%;margin-left: 75%;">优惠价<img src="../icon/rmb.png" id="rmb"><span id="sum">${scenic.scenicCharge}</span></div>
            </div>
        </c:forEach>



    </div>


    <!--分割线 -->
    <div class="line">
        <div class="middle-line">
            <span class="line-text">所有景区</span>
        </div>
    </div>

    <div id="all_strategy" style="height: 400px;">
        <c:forEach items="${page.rows}" var="scenic">
            <div class="strategy_1">
                <div class="strategy_img"><button type="button" onclick="getScenic(${scenic.scenicId})"><img src="../${scenic.scenicPicture}"></button></div>
                <div class="strategy_title">${scenic.scenicName}</div>
                <div class="strategy_money" style="margin-top: 1%;margin-left: 70%;">价格<img src="../icon/rmb.png" id="rmb"><span id="sum">${scenic.scenicCharge}</span></div>
            </div>
        </c:forEach>


    </div>
    <div class="col-md-12 text-right" style="text-align:center">
        <p:page url="${pageContext.request.contextPath }/routePage" />
    </div>
    <div class="toTop">
        <a href="#wellcome"><span class="glyphicon glyphicon-chevron-up"></span></a>
    </div>




    <!-- 引入footer.jsp -->
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


    function getScenic(id) {
        $.ajax({
            type:"get",
            url:"${pageContext.request.contextPath }/selectScenicById",
            data:{"id":id},
            success:function() {
                window.location.href="<%=basePath%>toScenicDetailPage";

            }

        });
    }
</script>

</body>
</html>
