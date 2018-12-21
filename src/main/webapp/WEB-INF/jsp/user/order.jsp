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
    <link rel="stylesheet" href="../css/index.css">
    <link rel="stylesheet" href="../css/order.css">
    <script type="text/javascript" src="../js/index.js"></script>

</head>
<body>
<!-- 引入header.jsp -->
<jsp:include page="header.jsp"></jsp:include>

<div class="container"
    style="width: 98%;height:50%; background: url(${pageContext.request.contextPath }/images/orderbg.png);">
    <div class="row">
        <div class="col-md-2"></div>
        <div class="col-md-8" style=" width: 650px; padding: 10px 100px; margin: 30px; border: 7px solid #ccc;">
            <h2 style="text-align: center">待支付订单信息</h2>
            <form id="myform" class="form-horizontal" action="${pageContext.request.contextPath }/payForOrder" method="post" style="margin-top: 5px;">
                <div class="form-group">
                    <label for="username" style="text-align: left" class="col-sm-3 control-label">订单编号</label>
                    <div class="col-sm-9">
                        <label style="padding-top: 7px">${order.orderNo}</label>
                    </div>
                </div>

                <div class="form-group">
                    <label for="inputEmail3" style="text-align: left" class="col-sm-3 control-label">门票单价</label>
                    <div class="col-sm-9">
                        <label style="padding-top: 7px">${mprice}</label>
                    </div>
                </div>
                <div class="form-group">
                    <label for="usercaption" style="text-align: left" class="col-sm-3 control-label">门票数量</label>
                    <div class="col-sm-9">
                        <label style="padding-top: 7px">${order.orderAmount}</label>
                    </div>
                </div>
                <div class="form-group opt">
                    <label for="inlineRadio1" style="text-align: left" class="col-sm-3 control-label">应付金额</label>
                    <div class="col-sm-9">
                        <label style="padding-top: 7px">${order.orderTotalPrice}</label>
                    </div>
                </div>
                <div class="form-group">
                    <label for="date" style="text-align: left" class="col-sm-3 control-label">选择银行</label>
                    <div class="col-sm-9" style="padding-top: 5px">
                        <input type="radio" name="pd_FrpId" value="ICBC-NET-B2C" checked="checked" />
                        <img src="../image/bank_img/icbc.bmp" style="width: 30%" align="middle" />&nbsp;&nbsp;&nbsp;&nbsp;
                        <input type="radio" name="pd_FrpId" value="CCB-NET-B2C" />
                        <img src="../image/bank_img/ccb.bmp" style="width: 30%" align="middle" />
                    </div>
                </div>
                <div class="form-group">
                    <label for="date" style="text-align: left" class="col-sm-3 control-label">操作按钮</label>
                    <div class="col-sm-9" style="padding-top: 5px">
                        <input type="hidden" name="no" value="${order.orderNo}">
                        <input type="hidden" name="paid" value="${order.orderTotalPrice}">
                        <input  type="submit" value="立即支付" class="btn btn-default btn-info">
                    </div>
                </div>
            </form>
        </div>

    </div>
</div>

<!-- 引入header.jsp -->
<jsp:include page="footer.jsp"></jsp:include>
</div>


<script src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
<script src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script type="text/javascript">
    $(document).ready(function(){
        var input = $("#quantity");
        $(".goodsName").text(sessionStorage.getItem("scenicName")),
            $(".scenicCharge").text(sessionStorage.getItem("scenicCharge")),
            $(".address").text(sessionStorage.getItem("scenicAddr")),
            $(".contact").text(sessionStorage.getItem("scenicLink")),
            $(".contactNum").text(sessionStorage.getItem("scenicTel")),
            $("#quantity").val(sessionStorage.getItem("quantity"));

        var quantity = document.getElementById("quantity").value;
        var num_add = parseInt(quantity);
        var price=document.getElementById("price").value;
        document.getElementById("quantity").value=num_add;
        var Num=price*num_add;
        document.getElementById("totalPrice").innerHTML=Num.toFixed(2);

        if(!document.getElementById("quantity").value){
            $("#submit").attr("disabled",true)
        }
        input.keyup(function(){
            var quantity = document.getElementById("quantity").value;
            var num_add = parseInt(quantity);
            var price=document.getElementById("price").value;
            if(quantity==""){
                num_add = 1;
            }
            if(num_add>=100){
                document.getElementById("quantity").value=100;
                var Num=price*100;
                document.getElementById("totalPrice").innerHTML=Num.toFixed(2);
                alert("商品数量不能大于100");
            }else{
                document.getElementById("quantity").value=num_add;
                var Num=price*num_add;
                document.getElementById("totalPrice").innerHTML=Num.toFixed(2);
            }
            $("#submit").removeAttr("disabled")
        });
    })


    /*商品数量+1*/
    function numAdd(){
        var quantity = document.getElementById("quantity").value;
        var num_add = parseInt(quantity)+1;
        var price=document.getElementById("price").value;
        if(quantity==""){
            num_add = 1;
        }
        if(num_add>=100){
            document.getElementById("quantity").value=100;
            var Num=price*100;
            document.getElementById("totalPrice").innerHTML=Num.toFixed(2);
            alert("商品数量不能大于100");
        }else{
            document.getElementById("quantity").value=num_add;
            var Num=price*num_add;
            document.getElementById("totalPrice").innerHTML=Num.toFixed(2);
        }
        $("#submit").removeAttr("disabled")
    }
    /*商品数量-1*/
    function numDec(){
        var quantity = document.getElementById("quantity").value;
        var price=document.getElementById("price").value;
        var num_dec = parseInt(quantity)-1;
        if(num_dec>0){
            document.getElementById("quantity").value=num_dec;
            var Num=price*num_dec;
            document.getElementById("totalPrice").innerHTML=Num.toFixed(2);
        }
        $("#submit").removeAttr("disabled")
    }
</script>

</body>
</html>
