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
    <title>最新资讯</title>
    <link rel="stylesheet" href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">
    <link rel="stylesheet" href="<%=basePath%>css/index.css">
    <link rel="stylesheet" type="text/css" href="<%=basePath%>css/infomation.css">

</head>
<body>

<div class="main">
    <!-- 引入header.jsp -->
    <jsp:include page="header.jsp"></jsp:include>


    <div class="bgcolor" style="background-color: #eee;">
        <!--资讯轮播图 -->
        <div id="box">
            <div id="box-l">
                <div id="myCarousel" class="carousel slide">
                    <ol class="carousel-indicators">
                        <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
                        <li data-target="#myCarousel" data-slide-to="1"></li>
                        <li data-target="#myCarousel" data-slide-to="2"></li>
                    </ol>
                    <div class="carousel-inner">
                        <div class="item active lunbo-img">
                            <a href="#"><img src="../images/bg-1.jpg"></a>
                        </div>
                        <div class="item lunbo-img">
                            <a href="#"><img src="../images/bg-2.jpg"></a>
                        </div>
                        <div class="item lunbo-img">
                            <a href="#"><img src="../images/bg-3.jpg"></a>
                        </div>
                    </div>
                    <a href="#myCarousel" data-slide="prev" class="carousel-control left">
                        <span class="glyphicon glyphicon-chevron-left" ></span>
                    </a>
                    <a href="#myCarousel" data-slide="next" class="carousel-control right">
                        <span class="glyphicon glyphicon-chevron-right"></span>
                    </a>
                </div>
            </div>


            <!--右边 -->
            <div id="box-r">

                <div id="colee">
                    <div id="colee1">
                        <li><a href="/"><img src="../images/top-1.jpg"></a></li>
                        <li><a href="/"><img src="../images/top-2.jpg"></a></li>
                        <li><a href="/"><img src="../images/top-3.jpg"></a></li>
                        <li><a href="/"><img src="../images/top-4.jpg"></a></li>
                        <li><a href="/"><img src="../images/top-5.jpg"></a></li>
                    </div>
                    <div id="colee2"></div>
                </div>

            </div>
            <div class="clear"></div>
        </div>
        <!--<div class="title_img"><img src="../images/title_logo.jpg" alt=""></div>
        <div class="box_content  hidden-xs">
          <ul id="ul">
            <li><a href="#"><img src="../icon/user.png"><span class="usernumber">xxx</span></a>位用户</li>
            <li><a href="#"><img src="../icon/business.png"><span class="businessnumber">xxx</span></a>位商家</li>
            <li><a href="#"><img src="../icon/infomation.png"><span class="infomationnumber">xxx</span></a>个资讯</li>
            <li><a href="#"><img src="../icon/strategy.png"><span class="strategynumber">xxx</span></a>篇攻略</li>
          </ul>
        </div>
      </div>-->

        <div id="infomation">
            <div class="container all-box">
                <div class="row">
                    <!--左边-->
                    <div class="col-md-7">
                        <div class="left_title"><h3>最热资讯</h3></div>
                        <div class="container-fluid">
                            <div class="row info-content">
                                <div class="col-md-7 col-sm-7 col xs-7"><a href="infomation_detail.html"><img src="../images/10.jpg" class="img-responsive"></a></div>
                                <div class="col-md-5 col-sm-5 col xs-5">
                                    <h3>畅游韩国</h3>
                                    <p class="hidden-xs">简介：天灵大陆,在这片神奇的大陆上,修炼的不是斗气亦非魔法,而是幻灵力。大陆上的职业又分为:战灵师</p>
                                    <div class="money"><img src="../icon/rmb.png"><span id="sum">99.9</span></div>
                                </div>
                            </div>
                            <div class="row info-content">
                                <div class="col-md-7 col-sm-7 col xs-7"><a href="#"><img src="../images/10.jpg" class="img-responsive"></a></div>
                                <div class="col-md-5 col-sm-5 col xs-5">
                                    <h3>畅游韩国</h3>
                                    <p class="hidden-xs">简介：天灵大陆,在这片神奇的大陆上,修炼的不是斗气亦非魔法,而是幻灵力。大陆上的职业又分为:战灵师</p>
                                    <div class="money"><img src="../icon/rmb.png"><span id="sum">99.9</span></div>
                                </div>
                            </div>
                            <div class="row info-content">
                                <div class="col-md-7 col-sm-7 col xs-7"><a href="#"><img src="../images/10.jpg" class="img-responsive" ></a></div>
                                <div class="col-md-5 col-sm-5 col xs-5">
                                    <h3>畅游韩国</h3>
                                    <p class="hidden-xs">简介：天灵大陆,在这片神奇的大陆上,修炼的不是斗气亦非魔法,而是幻灵力。大陆上的职业又分为:战灵师</p>
                                    <div class="money"><img src="../icon/rmb.png"><span id="sum">99.9</span></div>
                                </div>
                            </div>

                        </div>
                    </div>

                    <!--右边-->
                    <div class="col-md-5 info-right">
                        <div class="right_title"><h3>商家推荐</h3></div>
                        <div class="container-fluid">
                            <div class="row right_content">
                                <div class="col-md-5 col-sm-5 col xs-5" style="margin: 15px 0;padding: 0;"><a href="#"><img src="../images/3.jpg" class="img-responsive"></a></div>
                                <div class="col-md-7 col-sm-7 col xs-7" style="padding-right: 0;">
                                    <h4>九州缥缈录</h4>
                                    <p class="hidden-md">简介：当星辰和阳光也熄灭，沉默已久的乱世之轮重新开始运转，未来的帝王们整备了盔甲...</p>
                                    <div class="money"><img src="../icon/rmb.png"><span id="sum">99.9</span></div>
                                </div>
                            </div>

                            <div class="row right_content">
                                <div class="col-md-5 col-sm-5 col xs-5" style="margin: 15px 0;padding: 0;"><a href="#"><img src="../images/3.jpg" class="img-responsive"></a></div>
                                <div class="col-md-7 col-sm-7 col xs-7" style="padding-right: 0;">
                                    <h4>九州缥缈录</h4>
                                    <p class="hidden-md">简介：当星辰和阳光也熄灭，沉默已久的乱世之轮重新开始运转，未来的帝王们整备了盔甲...</p>
                                    <div class="money"><img src="../icon/rmb.png"><span id="sum">99.9</span></div>
                                </div>
                            </div>

                            <div class="row right_content">
                                <div class="col-md-5 col-sm-5 col xs-5" style="margin: 15px 0;padding: 0;"><a href="#"><img src="../images/3.jpg" class="img-responsive"></a></div>
                                <div class="col-md-7 col-sm-7 col xs-7" style="padding-right: 0;">
                                    <h4>九州缥缈录</h4>
                                    <p class="hidden-md">简介：当星辰和阳光也熄灭，沉默已久的乱世之轮重新开始运转，未来的帝王们整备了盔甲...</p>
                                    <div class="money"><img src="../icon/rmb.png"><span id="sum">99.9</span></div>
                                </div>
                            </div>

                        </div>
                    </div>
                </div>
            </div>
        </div>
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
    $('#myCarousel').carousel({
        interval:4000,
        wrap:true
    });
</script>


<script> /* 图片向上无缝滚动 */
var speedi=80;
var colee2=document.getElementById("colee2");
var colee1=document.getElementById("colee1");
var colee=document.getElementById("colee");
colee2.innerHTML=colee1.innerHTML; //克隆colee1为colee2
function Marquee1(){
//当滚动至colee1与colee2交界时
    if(colee2.offsetTop-colee.scrollTop<=0){
        colee.scrollTop-=colee1.offsetHeight; //colee跳到最顶端
    }else{
        colee.scrollTop++
    }
}
var MyMar1=setInterval(Marquee1,speedi)//设置定时器
//鼠标移上时清除定时器达到滚动停止的目的
colee.onmouseover=function() {clearInterval(MyMar1)}
//鼠标移开时重设定时器
colee.onmouseout=function(){MyMar1=setInterval(Marquee1,speedi)}
</script>

</body>
</html>
