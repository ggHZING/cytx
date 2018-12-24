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
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>我的订单</title>
    <link rel="shortcut icon" href="../image/logo1.png" type="../image/x-icon" />
    <link rel="stylesheet" href="<%=basePath%>css/bootstrap.min.css" type="text/css" />
    <link rel="stylesheet" href="<%=basePath%>css/index.css">
    <script src="<%=basePath%>js/jquery-1.11.3.min.js" type="text/javascript"></script>
    <script src="<%=basePath%>js/bootstrap.min.js" type="text/javascript"></script>
    <!-- 引入自定义css文件 style.css -->
    <link rel="stylesheet" href="<%=basePath%>css/style.css" type="text/css" />
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
<input type="hidden" id="baseUrl" value="${pageContext.request.contextPath }/" />


<div class="main">
    <!-- 引入header.jsp -->
    <jsp:include page="header.jsp"></jsp:include>

    <div class="container">
        <div class="row">
            <div style="margin: 0 auto; margin-top: 10px; width: 900px;">
                <h2>订单列表</h2>
                <table class="table table-bordered">
                    <c:forEach items="${page.rows}" var="order">
                        <tbody>
                        <tr class="success">
                            <th colspan="6">订单编号:${order.orderNo}</th>
                        </tr>
                        <tr class="warning">
                            <th>景点名称</th>
                            <th>数量</th>
                            <th>合计</th>
                            <th>订单状态</th>
                            <th>支付状态</th>

                        </tr>
                        <tr class="active">
                            <td width="25%">
                                <span class="subtotal">${order.scenic.scenicName}</span>
                            </td>
                            <td width="15%">
                                <span class="subtotal">${order.orderAmount}</span>
                            </td>
                            <td width="20%">
                                <span class="subtotal">${order.orderTotalPrice}</span>
                            </td>
                            <c:if test="${order.state==1}">
                                <td width="20%"><span class="subtotal">已取票</span></td>
                            </c:if>
                            <c:if test="${order.state==0}">
                                <td width="20%"><span class="subtotal">未取票</span></td>
                            </c:if>
                            <c:if test="${order.orderStatus==0}">
                                <td width="20%"><span class="subtotal">未支付</span></td>
                            </c:if>
                            <c:if test="${order.orderStatus==1}">
                                <td width="20%"><span class="subtotal">已支付</span></td>
                            </c:if>
                        </tr>
                        </tbody>
                    </c:forEach>

                </table>
            </div>
        </div>
        <%--分页--%>
        <div class="col-md-12 text-right" style="text-align:center">
            <p:page url="${pageContext.request.contextPath }/listOrder" />
        </div>
    </div>




    <!-- 引入footer.jsp -->
    <jsp:include page="footer.jsp"></jsp:include>
</div>




</body>
</html>

