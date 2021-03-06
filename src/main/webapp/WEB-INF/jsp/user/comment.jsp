<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
    <title>攻略详情</title>
    <link rel="stylesheet" href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">
    <link rel="stylesheet" href="<%=basePath%>css/index.css">
    <link rel="stylesheet" type="text/css" href="<%=basePath%>css/strategy_detail.css">
    <script type="text/javascript" src="<%=basePath%>js/startegy_detail.js"></script>
</head>
<body>
<!-- 引入header.jsp -->
<jsp:include page="header.jsp"></jsp:include>

<div id="strategy_detail">
    <!--详情简介 -->
    <div id="introduce">
        <div class="container box">

            <div class="row">
                <div class="col-md-7">
                    <img src="../${myway.wayPic}" class="img-responsive" alt="">
                </div>
                <div class="col-md-5 info-right">
                    <div class="title"><p>${myway.wayName}</p></div>
                    <div class="content hidden-md hidden-sm hidden-xs">
                        走过的路途是成长，留下的足迹是生命
                        走过的路途是成长，留下的足迹是生命
                        走过的路途是成长，留下的足迹是生命
                    </div>

                    <!--收藏 -->
                    <%--<div class="shoucang">--%>
                    <%--<div class="shoucang_txt">喜欢就收藏我吧</div>--%>
                    <%--<div class="p"></div>--%>
                    <%--</div>--%>
                </div>
            </div>

        </div>
    </div>


    <!--详情信息 -->
    <div class="strategy_detail">

        <ul id="myTab" class="nav nav-tabs">
            <li ><a href="${pageContext.request.contextPath }/toStrategyDetailPage" >详情路线</a></li>
            <li class="active"><a href="#rule" data-toggle="tab">驴友评价</a></li>


        </ul>

        <div id="myTabContent" class="tab-content">

            <div class="tab-pane fade" id="notice">
                <div class="strategy_toute_detail">
                    <p>${myway.wayContent}</p>
                    <%--<img src="../${myway.wayPic}" style="width: 80%;">--%>
                </div>
            </div>

        </div>

            <!--驴友评价 -->
            <div class="tab-pane fade in active" id="rule">

                <div id="strategy_comment">
                    <div id="strategy_header">
                        <span class="strategy_l">驴友评论</span>
                        <%--<span class="strategy_r">(已有<input type="text" id="strategy_number" value="0" style="border: 0;width: 2%;" />条评论)</span>--%>
                    </div>

                    <div id="strategy_publish">
                        <div id="strategy_box">
                            <img src="../icon/write.png"><span>发表评论</span>
                            <div>
                                <form action="${pageContext.request.contextPath }/insertComment" method="post">
                                    <textarea id="strategy_txt" rows="10" cols="30" name="content"></textarea>
                                    <button type="submit" id="strategy_report" class="btn btn-primary">发表</button>
                                </form>

                            </div>

                        </div>
                    </div>
                    <div id="comment_txt" style="margin-top: 20px;">
                        <c:forEach var="comment" items="${page.rows}">

                            <div class="user" style="width: 30%;height: 100px;text-align: center;float: left;">
                                <img src="../${comment.user.userPhoto}" onerror="this.src='../images/none.jpg';this.onerror=null" style="width: 60px;height: 60px;border-radius: 100%;margin: auto;">
                                <h4>${comment.user.userName}</h4>
                            </div>
                            <div class="comment_detail" style="width: 70%;float: left;height: 100px;position:relative;">
                                <div style="width: 100%;height: 20px;">${comment.time}</div>
                                <div style="width: 100%;height: 70px;margin-top: 10px;">${comment.content}</div>
                            </div>

                        </c:forEach>
                    </div>
                    <div class="col-md-12 text-right" style="text-align:center">
                        <p:page url="${pageContext.request.contextPath }/comment" />
                    </div>

                </div>

            </div>




    </div>
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
    $(document).ready(function(){
        var onOff=true;
        var p=$(".p");
        p.click(function(){
            if (p.onOff) {
                p.css({"background-image":'url(../icon/like.png)'});
                p.onOff = false;
            } else {
                p.css({"background-image":'url(../icon/dislike.png)'});
                p.onOff = true;
            }
        });
    });


    <%--function getComment(wid) {--%>
        <%--$.ajax({--%>
            <%--type:"get",--%>
            <%--url:"${pageContext.request.contextPath }/getComment",--%>
            <%--data:{"wid":wid},--%>
            <%--success:function(data) {--%>

            <%--}--%>
        <%--});--%>
    <%--}--%>

</script>

</body>
</html>

