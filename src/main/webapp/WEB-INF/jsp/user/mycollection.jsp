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
    <title>我的收藏</title>
    <link rel="stylesheet" href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">
    <link rel="stylesheet" href="<%=basePath%>css/index.css">
    <link rel="stylesheet" type="text/css" href="<%=basePath%>css/collection.css">

</head>
<body>
<div class="main">
<!-- 引入header.jsp -->
<jsp:include page="header.jsp"></jsp:include>

    <div id="collection">
        <div class="container box">
            <table>
                <tr>
                    <c:forEach items="${page.rows}" var="row">
                        <div class="row" style="margin-top: 30px;">
                            <div class="col-md-7">
                                <button type="button" onclick="getScenic(${row.scenic.scenicId})"><img src="../${row.scenic.scenicPicture}" class="img-responsive" alt=""></button>
                            </div>
                            <div class="col-md-5 info-right">
                                <div class="title"><p>${row.scenic.scenicName}</p></div>
                                <div class="content hidden-md hidden-sm hidden-xs">
                                    <lyz:htmlFilter>${row.scenic.scenicIntro}</lyz:htmlFilter>......
                                </div>
                            </div>
                        </div>
                    </c:forEach>
                </tr>
            </table>


            <div class="col-md-12 text-right" style="text-align:center">
                <p:page url="${pageContext.request.contextPath }/mycollectionPage" />
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
