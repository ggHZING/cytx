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
    <title>热门攻略</title>
    <link rel="stylesheet" href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">
    <link rel="stylesheet" href="<%=basePath%>css/index.css">
    <link rel="stylesheet" type="text/css" href="<%=basePath%>css/strategy.css">

</head>
<body>

<div class="main">
    <!-- 引入header.jsp -->
    <jsp:include page="header.jsp"></jsp:include>


    <!--分割线 -->
    <div class="line">
        <div class="middle-line">
            <span class="line-text">热门攻略</span>
        </div>
    </div>
    <!--热门资讯列表 -->
    <div id="infomation">
        <div id="content">
            <c:forEach items="${listWay1}" var="way">
                <div id="content-1">
                    <div class="content_img"><img src="../${way.wayPic}"></div>
                    <div class="title"><p>${way.wayName}</p></div>
                    <div class="text"><h5>&nbsp;&nbsp;&nbsp;&nbsp;<lyz:htmlFilter>${way.wayContent}</lyz:htmlFilter>......</h5></div>
                    <button type="button" id="detail" class="btn btn-primary" onclick="getWay(${way.wayId})">查看详情</button>
                </div>
            </c:forEach>

        </div>

        <div id="content">
            <c:forEach items="${listWay2}" var="way">
                <div id="content-1">
                    <div class="content_img"><img src="../${way.wayPic}"></div>
                    <div class="title"><p>${way.wayName}</p></div>
                    <div class="text"><h5>&nbsp;&nbsp;&nbsp;&nbsp;<lyz:htmlFilter>${way.wayContent}</lyz:htmlFilter>......</h5></div>
                    <button type="button" id="detail" class="btn btn-primary" onclick="getWay(${way.wayId})">查看详情</button>
                </div>
            </c:forEach>
    </div>


    <!--分割线 -->
    <div class="line">
        <div class="middle-line">
            <span class="line-text">所有攻略</span>
        </div>
    </div>

    <!--所有资讯列表 -->
    <div id="all_infomation">

        <div id="content">
            <c:forEach items="${page.rows}" var="way">
                <div id="content-1">
                    <div class="content_img"><img src="../${way.wayPic}"></div>
                    <div class="title"><p>${way.wayName}</p></div>
                    <div class="text"><h5>&nbsp;&nbsp;&nbsp;&nbsp;<lyz:htmlFilter>${way.wayContent}</lyz:htmlFilter>......</h5></div>
                    <button type="button" id="detail" class="btn btn-primary" onclick="getWay(${way.wayId})">查看详情</button>
                </div>
            </c:forEach>

        </div>

        <div class="col-md-12 text-right" style="text-align:center">
            <p:page url="${pageContext.request.contextPath }/strategyPage" />
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
</script>

</body>
</html>
