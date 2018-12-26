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
    <title>确认订单</title>
    <link rel="stylesheet" href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">
    <link rel="stylesheet" href="<%=basePath%>css/index.css">
    <link rel="stylesheet" href="<%=basePath%>css/order.css">
    <script type="text/javascript" src="<%=basePath%>js/index.js"></script>
    <style>
        body {
            margin-top: 20px;
            margin: 0 auto;
        }
        .carousel-inner .item img {
            width: 100%;
            height: 300px;
        }
    </style>
</head>
<body>
<!-- 引入header.jsp -->
<jsp:include page="header.jsp"></jsp:include>

<div class="container"
     style="width: 98%;height:50%; background: url(${pageContext.request.contextPath }/images/orderbg.png);">
    <div class="row">
        <div class="col-md-2"></div>
        <div class="col-md-8" style=" width: 650px; padding: 10px 100px; margin: 30px; border: 7px solid #ccc;">
            <h2 style="text-align: center">支付结果</h2>
            <div class="form-group">
                <label style="text-align: left" class="col-sm-12 control-label">您订单编号为"${code}"的订单支付成功！</label>
                <label style="text-align: left" class="col-sm-12 control-label">您的取票码是:${no}</label>
            </div>
        </div>
    </div>
</div>

<!-- 引入footer.jsp -->
<jsp:include page="footer.jsp"></jsp:include>
</div>




</body>
</html>
