<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<%@ taglib uri="/WEB-INF/tld/myTag.tld" prefix="lyz" %>
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
    <script type="text/javascript" src="<%=basePath%>js/index.serch.js"></script>

</head>
<body>


<div class="main">
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
                                <a href="#"><img src="<%=basePath%>/images/l-1.jpg"></a>
                            </div>
                            <div class="item lunbo-img">
                                <a href="#"><img src="<%=basePath%>/images/l-2.jpg"></a>
                            </div>
                            <div class="item lunbo-img">
                                <a href="#"><img src="<%=basePath%>/images/l-1.jpg"></a>
                            </div>
                        </div>

                    </div>
                </div>
            </div>
        </div>



    <!--资讯部分 -->
    <!--分割线 -->
    <div class="line">
        <div class="middle-line">
            <span class="line-text">最新资讯</span>
        </div>
    </div>


    <div id="hot-infomation">
        <c:forEach items="${list}" var="scenic">
            <div class="infomation_l">
                <div class="img"><button type="button" onclick="getScenic(${scenic.scenicId})"><img src="<%=basePath%>/${scenic.scenicPicture}" id="img1"></button></div>
                <div class="title">${scenic.scenicName}</div>
                <div class="content"><lyz:htmlFilter>${scenic.scenicIntro}</lyz:htmlFilter>......</div>
                <div class="money hidden-xs"><img src="<%=basePath%>/icon/rmb.png" class="rmb"><span id="sum">${scenic.scenicCharge}元</span></div>
            </div>
        </c:forEach>



    </div>


    <!--攻略部分 -->
    <!--分割线 -->
    <div class="line">
        <div class="middle-line">
            <span class="line-text">热门攻略</span>
        </div>
    </div>
    <div id="hot-strategy">
        <c:forEach items="${listWay1}" var="way">
            <div id="strategy_1" class="strategy" style="background-image: url(<%=basePath%>/${way.wayPic})">
                <div id="title1">
                    <h3>${way.wayName}</h3>
                    <p class="introduce" class="hidden-xs">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<lyz:htmlFilter>${way.wayContent}</lyz:htmlFilter>......</p>
                </div>
                <div id="check1" style="display: none;"><button class="chenkinfomation" onclick="getWay(${way.wayId})">查看详情</button></div>
            </div>
        </c:forEach>

        <c:forEach items="${listWay2}" var="way">
            <div id="strategy_2" class="strategy" style="background-image: url(<%=basePath%>/${way.wayPic})">
                <div id="title2">
                    <h3>${way.wayName}</h3>
                    <p class="introduce" class="hidden-xs">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<lyz:htmlFilter>${way.wayContent}</lyz:htmlFilter>......</p>
                </div>
                <div id="check2" style="display: none;"><button class="chenkinfomation" onclick="getWay(${way.wayId})">查看详情</button></div>
            </div>
        </c:forEach>

        <c:forEach items="${listWay3}" var="way">
            <div id="strategy_3" class="strategy" style="background-image: url(<%=basePath%>/${way.wayPic})">
                <div id="title3">
                    <h3>${way.wayName}</h3>
                    <p class="introduce" class="hidden-xs">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<lyz:htmlFilter>${way.wayContent}</lyz:htmlFilter>......</p>
                </div>
                <div id="check3" style="display: none;"><button class="chenkinfomation" onclick="getWay(${way.wayId})">查看详情</button></div>
            </div>
        </c:forEach>

        <c:forEach items="${listWay4}" var="way">
            <div id="strategy_4" class="strategy" style="background-image: url(<%=basePath%>/${way.wayPic})">
                <div id="title4">
                    <h3>${way.wayName}</h3>
                    <p class="introduce" class="hidden-xs">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<lyz:htmlFilter>${way.wayContent}</lyz:htmlFilter>......</p>
                </div>
                <div id="check4" style="display: none;"><button class="chenkinfomation" onclick="getWay(${way.wayId})">查看详情</button></div>
            </div>
        </c:forEach>

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

    //alert("hello");

    function oSearchSuggest(searchFuc)
    {
        var input = $('#serchtxt');
        var suggestWrap = $('#serch_tip');
        var key = "";
        var init = function(){
            input.bind('keyup',sendKeyWord);
            input.bind('blur',function(){setTimeout(hideSuggest,100);})
        }
        var hideSuggest = function(){
            suggestWrap.hide();
        }
        //发送请求，根据关键字到后台查询
        var sendKeyWord = function(event){
            //键盘选择下拉项
            if(suggestWrap.css('display')=='block'&&event.keyCode == 38||event.keyCode == 40)
            {
                var current = suggestWrap.find('li.hover');
                if(event.keyCode == 38)
                {
                    if(current.length>0)
                    {
                        var prevLi = current.removeClass('hover').prev();
                        if(prevLi.length>0)
                        {
                            prevLi.addClass('hover');
                            input.val(prevLi.html());
                        }
                    }
                    else
                    {
                        var last = suggestWrap.find('li:last');
                        last.addClass('hover');
                        input.val(last.html());
                    }
                }
                else if(event.keyCode == 40)
                {
                    if(current.length>0)
                    {
                        var nextLi = current.removeClass('hover').next();
                        if(nextLi.length>0)
                        {
                            nextLi.addClass('hover');
                            input.val(nextLi.html());
                        }
                    }
                    else
                    {
                        var first = suggestWrap.find('li:first');
                        first.addClass('hover');
                        input.val(first.html());
                    }
                }
                //输入字符
            }
            else
            {
                var valText = $.trim(input.val());
                if(valText ==''||valText==key)
                {
                    return;
                }
                searchFuc(valText);
                key = valText;
            }
        }
        //请求返回后，执行数据展示
        this.dataDisplay = function(data){
            if(data.length<=0)
            {
                suggestWrap.hide();
                return;
            }
            //往搜索框下拉建议显示栏中添加条目并显示
            var li;
            var tmpFrag = document.createDocumentFragment();
            suggestWrap.find('ul').html('');
            for(var i=0; i<data.length; i++)
            {
                li = document.createElement('LI');
                li.innerHTML = data[i];
                tmpFrag.appendChild(li);
            }
            suggestWrap.find('ul').append(tmpFrag);
            suggestWrap.show();
            //为下拉选项绑定鼠标事件
            suggestWrap.find('li').hover(function(){
                suggestWrap.find('li').removeClass('hover');
                $(this).addClass('hover');
            },function(){
                $(this).removeClass('hover');
            }).bind('click',function(){
                $(this).find("span").remove();
                input.val(this.innerHTML);
                suggestWrap.hide();
            });
        }
        init();
    };
    //实例化输入提示的JS,参数为进行查询操作时要调用的函数名
    var searchSuggest = new oSearchSuggest(sendKeyWordToBack);
    //这是一个模似函数，实现向后台发送ajax查询请求，并返回一个查询结果数据，传递给前台的JS,再由前台JS来展示数据。本函数由程序员进行修改实现查询的请求
    //参数为一个字符串，是搜索输入框中当前的内容
    function sendKeyWordToBack(keyword){
        var aData = [];
        aData.push('<span class="num_right">约15条关于</span>'+keyword+'资讯');
        aData.push('<span class="num_right">约10条关于</span>'+keyword+'攻略');
        aData.push('<span class="num_right">约100条关于</span>'+keyword+'评价');
        aData.push('<span class="num_right">约80张关于</span>'+keyword+'图片');
        searchSuggest.dataDisplay(aData);
    }


    function getWay(id) {
        $.ajax({
            type:"get",
            url:"${pageContext.request.contextPath }/selectWayById",
            data:{"id":id},
            success:function() {
                window.location.href="<%=basePath%>toStrategyDetailPage";

            }

        });
    }

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
