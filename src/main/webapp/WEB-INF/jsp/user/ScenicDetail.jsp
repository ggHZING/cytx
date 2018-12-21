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
    <title>资讯详情</title>
    <link rel="stylesheet" href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">
    <link rel="stylesheet" href="<%=basePath%>css/index.css">
    <link rel="stylesheet" type="text/css" href="<%=basePath%>css/infomation_detail.css">
    <script type="text/javascript" src="<%=basePath%>js/infomation_detail.js"></script>
    <script type="text/javascript" src="<%=basePath%>js/infomation_detail_report.js"></script>
</head>
<body>
<!-- 引入header.jsp -->
<jsp:include page="header.jsp"></jsp:include>

    <div id="infomation_detail">
        <!--详情简介 -->
        <div id="introduce">
            <div class="container box">

                <div class="row">
                    <form id="order_confirm" action="${pageContext.request.contextPath }/submitOrderInfo" method="post">
                        <input type="hidden" name="sid" value="${scenics.scenicId}">
                        <div class="col-md-7">
                            <img src="${pageContext.request.contextPath }/${scenics.scenicPicture}" class="img-responsive" alt="">
                        </div>
                        <div class="col-md-5 info-right">
                            <div class="title"><p>${scenics.scenicName}</p></div>
                            <div class="content hidden-md hidden-sm hidden-xs">
                                <div id="address">详细地址:<span>${scenics.scenicAddr}</span></div>
                                <div id="confirm">
                                    <div id="goods">
                                        <div id="goods_price"><img src="../icon/rmb.png"><span style="color: red;font-size: 24px;">${scenics.scenicCharge}</span></div>
                                    </div>
                                    <div id="box">
                                        <div class="contact">
                                            <h4>联系人：</h4><span>${scenics.scenicLink}</span>
                                            <h4>联系电话：</h4><span>${scenics.scenicTel}</span>
                                        </div>
                                        <div>
                                            <h4>购票类型：</h4><span>${scenics.scenicTicket}</span>
                                        </div>
                                        <div id="number">
                                            <div id="person_number">购买票数：</div>
                                            <div id="adult">
                                                <div class="dec" onclick="numDec()" style="width: 30px;border: solid 1px gray;height: 30px;"><span >-</span></div>
                                                <div><input type="text" id="quantity" style="width: 40px;height: 30px;text-align: center;" name="orderAmount"/></div>
                                                <div class="add" onclick="numAdd()" style="width: 30px;border: solid 1px gray;height: 30px;margin-right: 20px;"><span>+</span></div>
                                            </div>
                                        </div>
                                        <div id="sum">
                                            <p class="sdsd">总价格:
                                                <span id="totalPrice"style="color: red;font-size: 20px;">00.00</span>

                                            </p>
                                            <input type="hidden" value="${scenics.scenicCharge}" id="price" name="price"/><!--单价-->
                                        </div>
                                    </div>
                                    <div class="reserve_box">
                                        <div class="reserve_l"><input type="submit" id="reserve" value="购买"/></div>
                                        <div class="reserve_r">
                                            <div class="txt">喜欢就收藏我吧</div>
                                            <div class="like"></div>
                                        </div>
                                    </div>
                    </form>
                </div>

            </div>
        </div>
    </div>

</div>
</div>


<!--详情信息 -->
<div class="detail">

    <ul id="myTab" class="nav nav-tabs">
        <li class="active"><a href="#notice" data-toggle="tab">详情信息</a></li>
        <li><a href="#evaluate" data-toggle="tab">驴友评价</a></li>

    </ul>

    <div id="myTabContent" class="tab-content">

        <div class="tab-pane fade in active" id="notice">
            <p>${scenics.scenicIntro}</p>
            <%--<img src="${pageContext.request.contextPath }/${scenics.scenicPicture}" style="width: 80%;">--%>
        </div>

        <!--驴友评价 -->
        <div class="tab-pane fade" id="evaluate">

            <div id="comment">
                <div id="header">
                    <span class="l">驴友评论</span>
                    <span class="r">(已有<input type="text" id="comment_number" value="0" style="border: 0;width: 2%;" />条评论)</span>
                    <input type="hidden" value="1" id="count" />
                </div>

                <div id="publish">
                    <div id="wirte_box">
                        <img src="../icon/write.png"><span>发表评论</span>
                        <div>
                            <textarea id="wirte_txt" rows="10" cols="30"></textarea>
                            <button type="button" id="report" class="btn btn-primary">发表</button>
                        </div>

                    </div>
                </div>

                <h5>精彩评论</h5>
                <div id="comment_txt">

                </div>
            </div>
        </div>
    </div>
</div>

</div>
<div class="toTop">
    <a href="#wellcome"><span class="glyphicon glyphicon-chevron-up"></span></a>
</div>

</div>
<!-- 引入header.jsp -->
<jsp:include page="footer.jsp"></jsp:include>




<script src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
<script src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script type="text/javascript">
    $(document).ready(function(){
        var onOff=true;
        var p=$(".like");
        p.click(function(){
            if (p.onOff) {
                p.css({"background-image":'url(../icon/喜欢.png)'});
                p.onOff = false;
            } else {
                p.css({"background-image":'url(../icon/喜欢2.png)'});
                p.onOff = true;
            }
        });
    });
</script>

</body>
</html>
