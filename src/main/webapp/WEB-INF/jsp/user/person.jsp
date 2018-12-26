<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="/WEB-INF/tld/myTag.tld" prefix="lyz" %>
<%@ taglib prefix="p" uri="http://commonutils.cn/tld/" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>个人中心</title>
    <link rel="stylesheet" href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">
    <link rel="stylesheet" href="<%=basePath%>css/index.css">
    <link rel="stylesheet" href="<%=basePath%>css/person.css">
    <script type="text/javascript" src="<%=basePath%>js/index.js"></script>

</head>
<body>
<div class="main">
<!-- 引入header.jsp -->
<jsp:include page="header.jsp"></jsp:include>

    <!--个人信息部分 -->
    <div class="person">
        <div class="selection">
            <ul>
                <li class="select active">我的个人信息 <span class="glyphicon glyphicon-hand-right"></span></li>
                <li class="select">新建攻略 <span class="glyphicon glyphicon-hand-right"></span></li>
                <%--<li class="select">我的订单 <span class="glyphicon glyphicon-hand-right"></span></li>--%>
                <c:if test="${application.role==1}">
                    <li class="select">新建景区 <span class="glyphicon glyphicon-hand-right"></span></li>
                </c:if>

            </ul>
        </div>
        <!-- 我的个人信息 -->
        <div class="info active">
            <table class="myInfo">
                <tr>
                    <td class="txt">头像:</td>
                    <td><img src="../${user.userPhoto}"  class="head" onerror="this.src='../images/none.jpg';this.onerror=null"></td>
                </tr>
                <tr>
                    <td class="txt">用户名:</td>
                    <td>${user.userName}</td>
                </tr>
                <tr>
                    <td class="txt">邮箱:</td>
                    <td>${user.userEmail}</td>
                </tr>
                <tr>
                    <td class="txt">手机号:</td>
                    <td>${user.userPhone}</td>
                </tr>
            </table>
            <input type="button" name="modify" class="btn btn-primary modify" value="修改" data-toggle="modal" data-target="#modifyModal">

            <!-- 申请成为商家-->
            <c:if test="${application.state==null}">
                <form action="${pageContext.request.contextPath }/apply" method="post">
                    <input type="hidden"  name="uid" value="${user.userId}" style="margin-left: -100px;"/>
                    <input type="submit"  class="btn btn-primary apply" value="申请成为商家" style="margin-left: 700px;margin-top: -35px;">
                </form>
            </c:if>


        </div>
        <!-- 我的攻略资讯 -->
        <div class="info">
            <div>
                <a href="#" class="btn btn-primary" data-toggle="modal" data-target="#addDialog" >添加攻略</a>
            </div>
            <%--<div>--%>
                <%--<table class="strategy">--%>
                    <%--<tr>--%>
                        <%--<th class="title">标题</th>--%>
                        <%--<th class="photo">图片</th>--%>
                        <%--<th class="operation">操作</th>--%>
                    <%--</tr>--%>
                    <%--<tr>--%>
                        <%--<td class="title">${way.wayName}</td>--%>
                        <%--<td class="photo">${way.wayPhoto}</td>--%>
                        <%--<td class="operation"><a href="#" class="delete">修改</a><p><a href="#" class="delete">删除</a></p></td>--%>
                    <%--</tr>--%>
                <%--</table>--%>
            <%--</div>--%>
        </div>

        <!-- 我的商品 -->
        <div class="info">
            <div>
                <a href="#" class="btn btn-primary" data-toggle="modal" data-target="#addScenicDialog">添加景区</a>
            </div>
            <%--<div>--%>
                <%--<table class="goods">--%>
                    <%--<tr>--%>
                        <%--<th class="goodsImg">商品图</th>--%>
                        <%--<th class="goodsName">商品名称</th>--%>
                        <%--<th class="price">商品金额</th>--%>
                        <%--<th class="operation">操作</th>--%>
                    <%--</tr>--%>
                    <%--<tr>--%>
                        <%--<td class="goodsImg">${scenic.scenicPicture}</td>--%>
                        <%--<td class="goodsName">${scenic.scenicName}</td>--%>
                        <%--<td class="price">${scenic.scenicCharge}</td>--%>
                        <%--<td class="operation"><a href="#" class="detail">修改</a>--%>
                            <%--<p><a href="#" class="delete">删除</a></p></td>--%>
                    <%--</tr>--%>
                <%--</table>--%>
            <%--</div>--%>
        </div>
    </div>
    <!-- Modal -->
    <div class="modal fade" id="modifyModal" tabindex="-1" role="dialog"
         aria-labelledby="myModalLabel">
        <div class="modal-dialog" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal"
                            aria-label="Close">
                        <span aria-hidden="true">&times;</span>
                    </button>
                    <h4 class="modal-title" id="personModal">修改个人信息</h4>
                </div>
                <div class="modal-body">
                    <form class="form-horizontal" role="form" style="margin-top: 30px;"
                          method="post" enctype="multipart/form-data" action="${pageContext.request.contextPath }/updatePerson">
                        <input type="hidden" id="edit_id" name="userId" value="${user.userId}"/>
                        <input type="hidden" id="edit_name" name="userName" value="${user.userName}"/>
                        <div class="form-group">
                            <div class="col-sm-8">
                                <input type="file" id="image-file" name="image" accept="image/gif, image/jpeg, image/png, image/jpg" style="display: none" />
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="show" class="col-sm-2 control-label">头像</label>
                            <div class="col-sm-8">
                                <img src="" class="head" id="headImg" onerror="this.src='../images/none.jpg';this.onerror=null" onclick="getPicture()" style="cursor: pointer;margin-left: 40%;">
                            </div>
                        </div>
                        <br>
                        <div class="form-group">
                            <label for="input2" class="col-sm-2 control-label">密码</label>
                            <div class="col-sm-8">
                                <input type="password" class="form-control" id="input2" placeholder="请输入密码" value="${user.userPassword}" name="userPassword"/>
                            </div>
                        </div>

                        <div class="form-group">
                            <label for="input3" class="col-sm-2 control-label">确认密码</label>
                            <div class="col-sm-8">
                                <input type="password" class="form-control" id="input3" placeholder="请再次输入密码"/>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="input4" class="col-sm-2 control-label">邮箱</label>
                            <div class="col-sm-8">
                                <input type="text" class="form-control" id="input4" placeholder="请输入邮箱" value="${user.userEmail}" name="userEmail"/>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="input5" class="col-sm-2 control-label">手机号</label>
                            <div class="col-sm-8">
                                <input type="text" class="form-control" id="input5" placeholder="请输入手机号" value="${user.userPhone}" name="userPhone"/>
                            </div>
                        </div>
                        <div class="modal-footer">
                            <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
                            <button id="submitPerson" type="submit" class="btn btn-primary">提交</button>
                        </div>
                    </form>
                </div>

            </div>
        </div>
    </div>

<!-- 新增攻略弹框 -->
<div class="modal fade" id="addDialog" tabindex="-1" role="dialog"
     aria-labelledby="myModalLabel">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
                <h4 class="modal-title" id="myModalLabel">新增攻略信息</h4>
            </div>
            <form action="${pageContext.request.contextPath }/addWayByUser" class="form-horizontal" id="add_form" method="post" enctype="multipart/form-data">
                <div class="modal-body">
                    <div class="form-group">
                        <label for="add_name" class="col-sm-2 control-label">攻略名称</label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control" id="add_name" placeholder="攻略名称" name="wayName">
                        </div>
                    </div>

                    <div class="form-group">
                        <label for="add_content" class="col-sm-2 control-label">攻略内容</label>
                        <div class="col-sm-10">
                            <textarea rows="15" cols="50" id="add_content" name="wayContent"></textarea>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="add_wayImage" class="col-sm-2 control-label">图片</label>
                        <div class="col-sm-10">
                            <input type="file" id="add_wayImage" name="wayImage"/>
                        </div>
                    </div>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                    <input type="submit" class="btn btn-primary">
                </div>
            </form>
        </div>
    </div>
</div>

<!-- 新增景区弹框 -->
<div class="modal fade" id="addScenicDialog" tabindex="-1" role="dialog"
     aria-labelledby="myModalLabel">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
                <h4 class="modal-title" id="myModalLabel">新增景点信息</h4>
            </div>
            <form action="${pageContext.request.contextPath }/addScenicByUser" class="form-horizontal" id="add_form" method="post" enctype="multipart/form-data">
                <div class="modal-body">
                    <div class="form-group">
                        <label for="add_name" class="col-sm-2 control-label">景点名称</label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control" id="add_name" placeholder="景点名称" name="scenicName">
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="add_addr" class="col-sm-2 control-label">景点地址</label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control" id="add_addr" placeholder="景点地址" name="scenicAddr">
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="add_link" class="col-sm-2 control-label">联系人</label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control" id="add_link" placeholder="联系人" name="scenicLink">
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="add_tel" class="col-sm-2 control-label">联系电话</label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control" id="add_tel" placeholder="联系电话" name="scenicTel">
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="add_ticket" class="col-sm-2 control-label">购票类型</label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control" id="add_ticket" placeholder="购票类型" name="scenicTicket">
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="add_charge" class="col-sm-2 control-label">收费金额</label>
                        <div class="col-sm-10">
                            <input type="text" class="form-control" id="add_charge" placeholder="收费金额" name="scenicCharge">
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="add_intro" class="col-sm-2 control-label">景区介绍</label>
                        <div class="col-sm-10">
                            <textarea rows="15" cols="50" id="add_intro" name="scenicIntro"></textarea>
                        </div>
                    </div>
                    <div class="form-group">
                        <label for="add_scenicImage" class="col-sm-2 control-label">景点图片</label>
                        <div class="col-sm-10">
                            <input type="file" id="add_scenicImage" name="scenicImage"/>
                        </div>
                    </div>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                    <input type="submit" class="btn btn-primary">
                </div>
            </form>
        </div>
    </div>
</div>
    <div class="toTop">
        <a href="#wellcome"><span class="glyphicon glyphicon-chevron-up"></span></a>
    </div>


</div>

<!-- 引入footer.jsp -->
<jsp:include page="footer.jsp"></jsp:include>
<script src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
<script src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script type="text/javascript">
    $(".select").on("click", function (e) {
        e.preventDefault();
        var i=$(this).index();
        $(".select").removeClass("active").eq(i).addClass("active"),
            $(".info").removeClass("active").eq(i).addClass("active")
    });
</script>

<script type="text/javascript">
    function getPicture(){
        $("#image-file").click();
    }

    var result = $("#headImg"); //获得最后图片显示的img
    var input = $("#image-file");

    //检测浏览器是否兼容FileReader因为这个 html5的新特性
    if (typeof FileReader === 'undefined') {
        alert("抱歉，你的浏览器不支持 FileReader");
        input[0].setAttribute('disabled', 'disabled');
        //这里加个[0]将jquery对象转化成dom对象
    } else {
        input.get(0).addEventListener('change', readFile, false);//同上
    }

    function readFile() {
        var file = this.files[0];
        if (!/image\/\w+/.test(file.type)) {
            alert("文件必须为图片！");
            return false;
        }
        var reader = new FileReader();
        reader.readAsDataURL(file);
        reader.onload = function (e) {
            result.attr("src", this.result);
        }
    }

    var result = document.getElementById("headImg");
    var input = document.getElementById("image-file");

    if (typeof FileReader === 'undefined') {
        result.innerHTML = "抱歉，你的浏览器不支持 FileReader";
        input.setAttribute('disabled', 'disabled');
    } else {
        input.addEventListener('change', readFile, false);
    }

    function readFile() {
        var file = this.files[0];
        if (!/image\/\w+/.test(file.type)) {
            alert("文件必须为图片！");
            return false;
        }
        var reader = new FileReader();
        reader.readAsDataURL(file);
        reader.onload = function (e) {
            result.src = this.result;
        }
    }
</script>
<script type="text/javascript">
    var url =  $(".head")[0].src;
    $("#headImg").attr('src',url);
</script>

</body>
</html>
