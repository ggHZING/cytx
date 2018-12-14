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
    <title>畅游天下主页</title>
    <link rel="stylesheet" href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">
    <link rel="stylesheet" href="<%=basePath%>css/index.css">
    <script type="text/javascript" src="<%=basePath%>js/index.js"></script>

</head>
<body>
<!-- 引入header.jsp -->
<jsp:include page="header.jsp"></jsp:include>


<!--轮播图 -->
<div class="lunbo">

    <div class="row">
        <div class="lun">
            <div id="myCarousel" class="carousel slide">
                <ol class="carousel-indicators">
                    <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
                    <li data-target="#myCarousel" data-slide-to="1"></li>
                    <li data-target="#myCarousel" data-slide-to="2"></li>
                </ol>
                <div class="carousel-inner">
                    <div class="item active lunbo-img">
                        <a href="#"><img src="../images/l-1.jpg"></a>
                    </div>
                    <div class="item lunbo-img">
                        <a href="#"><img src="../images/l-2.jpg"></a>
                    </div>
                    <div class="item lunbo-img">
                        <a href="#"><img src="../images/l-1.jpg"></a>
                    </div>
                </div>

            </div>
        </div>
    </div>
</div>
<!-- <div id="list">
    <div id="list-l" class="list-l" onmouseover="display()" onmouseout="hid()">
       <table class="list-table">
           <tr class="active">
               <td id="pictrue"><img src="../icon/release.png" alt="" ></span></td>
               <td id="cont"><a href="#">休闲度假</a><img src="../icon/right.png"></td>
           </tr>
           <tr>
               <td id="pictrue"><img src="../icon/spot.png"></td>
               <td id="cont"><a href="#">热门景点</a><img src="../icon/right.png"></td>
           </tr>
           <tr>
               <td id="pictrue"><img src="../icon/beach.png"></td>
               <td id="cont"><a href="#">情侣蜜游</a><img src="../icon/right.png"></td>
           </tr>
           <tr>
               <td id="pictrue"><img src="../icon/account.png"></td>
               <td id="cont"><a href="#">毕业旅行</a><img src="../icon/right.png"></td>
           </tr>
           <tr>
               <td id="pictrue"><img src="../icon/changyou.png"></td>
               <td id="cont"><a href="#">畅游港澳台</a><img src="../icon/right.png"></td>
           </tr>
       </table>
    </div>
    <div id="list-r" class="list-r" onmouseover="display()" onmouseout="hid()" style="display: none;">333</div>
</div>-->


<!--消息滚动 -->
<!--<div class="gundong">
    <div class="box1">
    <div class="manyi container"><img src="../icon/赞.png" alt="" style="width: 30px;height: 30px;"><span style="display: block;float: right; margin-top: 3px;margin-right: 1px;">满意度<span style="color: red;font-size: 20px;padding-left: 0px;">98%</span></span></div>
    <div class="content" id="scrollBox" style="overflow: hidden;text-align: left;">
        <ul id="con1">
            <li> 四川--九寨沟--云南大理西双版纳双人三日游</li>
            <li>香港--九龙--迪士尼乐园三日游</li>
            <li>广州--广州塔--广州的小蛮腰</li>
        </ul>
         <div id="con2" style="text-align: left"></div>
    </div>
   </div>
</div>-->




<!--资讯部分 -->
<!--分割线 -->
<div class="line">
    <div class="middle-line">
        <span class="line-text">最新资讯</span>
    </div>
</div>
<div id="hot-infomation">
    <div class="infomation_l">
        <div class="img"><img src="../images/l-5.jpg" id="img1"></div>
        <div class="title">欢乐海洋之旅</div>
        <div class="content">带你玩转秦皇岛、山海关、南戴河，惊爆价出游</div>
        <div class="money hidden-xs"><img src="../icon/rmb.png" id="rmb"><span id="sum">99.9元</span></div>
    </div>

    <div class="infomation_c">
        <div class="img"><img src="../images/l-5.jpg" alt=""></div>
        <div class="title">欢乐海洋之旅</div>
        <div class="content">带你玩转秦皇岛、山海关、南戴河，惊爆价出游</div>
        <div class="money hidden-xs"><img src="../icon/rmb.png" id="rmb"><span id="sum">99.9元</span></div>
    </div>

    <div class="infomation_r">
        <div class="img"><img src="../images/l-5.jpg" alt=""></div>
        <div class="title">欢乐海洋之旅</div>
        <div class="content">带你玩转秦皇岛、山海关、南戴河，惊爆价出游</div>
        <div class="money hidden-xs"><img src="../icon/rmb.png" id="rmb"><span id="sum">99.9元</span></div>
    </div>
</div>

<!--攻略部分 -->
<!--分割线 -->
<div class="line">
    <div class="middle-line">
        <span class="line-text">热门攻略</span>
    </div>
</div>
<div id="hot-strategy">
    <div id="strategy_1" style="background-image: url(<%=path%>/images/ttd.jpg);">
        <div id="title1">
            <h3>繁华香港</h3>
            <p id="introduce" class="hidden-xs">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;石板街上老旧的小摊，叮叮车里质朴的香港人，都爹利街里上演的浪漫依旧。如果你肯放慢脚步，你就能发现另一个不一样的香港城。</p>
        </div>
        <div id="check1" style="display: none;"><a href="strategy_detail.html" title=""><button id="chenkinfomation" >查看详情</button></a></div>
    </div>
    <div id="strategy_2" style="background-image: url(<%=path%>/images/ttd.jpg);">
        <div id="title2">
            <h3>繁华香港</h3>
            <p id="introduce1" class="hidden-xs">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;石板街上老旧的小摊，叮叮车里质朴的香港人，都爹利街里上演的浪漫依旧。如果你肯放慢脚步，你就能发现另一个不一样的香港城。</p>
        </div>
        <div id="check2" style="display: none;"><button id="chenkinfomation1">查看详情</button></div>
    </div>
    <div id="strategy_3" style="background-image: url(<%=path%>/images/ttd.jpg);">
        <div id="title3">
            <h3>繁华香港</h3>
            <p id="introduce2" class="hidden-xs">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;石板街上老旧的小摊，叮叮车里质朴的香港人，都爹利街里上演的浪漫依旧。如果你肯放慢脚步，你就能发现另一个不一样的香港城。</p>
        </div>
        <div id="check3" style="display: none;"><button id="chenkinfomation2">查看详情</button></div>
    </div>
    <div id="strategy_4" style="background-image: url(<%=path%>/images/ttd.jpg);">
        <div id="title4">
            <h3>繁华香港</h3>
            <p id="introduce3" class="hidden-xs">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;石板街上老旧的小摊，叮叮车里质朴的香港人，都爹利街里上演的浪漫依旧。如果你肯放慢脚步，你就能发现另一个不一样的香港城。</p>
        </div>
        <div id="check4" style="display: none;"><button id="chenkinfomation3">查看详情</button></div>
    </div>
</div>
<div class="toTop">
    <a href="#wellcome"><span class="glyphicon glyphicon-chevron-up"></span></a>
</div>



<!-- 引入footer.jsp -->
<jsp:include page="footer.jsp"></jsp:include>



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
