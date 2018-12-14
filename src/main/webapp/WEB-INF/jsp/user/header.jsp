<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<input type="hidden" id="baseUrl" value="${pageContext.request.contextPath }/" />
<!--欢迎框 -->
<%--<div class="wellcome" id="wellcome">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;您好，<span class="user_id">xxx</span>，欢迎来到畅游天下</div>--%>
<div class="col-md-4" style="padding-left:20px;padding-top:20px;font-size: 17px;float: right" >
    <ol class="list-inline">
        <c:if test="${empty user }">
            <li style="margin-left:180px;"><a href="${pageContext.request.contextPath }/loginPage">登录</a></li>
            <li ><a href="${pageContext.request.contextPath }/registerPage">注册</a></li>
        </c:if>
        <c:if test="${!empty user }">
            <li style="color:red;margin-left:120px;">欢迎您，${user.userName }</li>
            <li><a href="${pageContext.request.contextPath }/logout">退出</a></li>
        </c:if>
    </ol>
</div>


<!--logo部分 -->
<div id="logobox">
    <div id="logo"><img src="../images/logo.png"></div>
    <div id="serchbox">
        <div id="serch"><input type="text" id="serchtxt"  placeholder="请输入"></div>
        <div id="serchbtn"><button type="button" class="btn btn-primary" id="serchbutton">搜索</button></div>
    </div>
    <div id="contact" class="hidden-xs">
        <div class="phonelogo"><img src="../images/phone.png"></div>
        <div class="phonetxt"><p>咨询热线</p><h4 style="color: blue;font-size: 26px;">134201xxxxx</h4></div>
    </div>
</div>


<!--nav部分 -->
<div class="nav">
    <nav class="navbar navbar-default" id="nav_daohang">
        <div class="container">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#navbar-collapse">
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span></button>
            </div>
            <div class="collapse navbar-collapse" id="navbar-collapse">
                <ul class="nav navbar-nav navbar-right" style="padding: 0px;">
                    <li class="active"><a href="index.html"><span class="glyphicon glyphicon-home"></span>首页</a></li>
                    <li class="dropdown"><a href="infomation.html"><span class="glyphicon glyphicon-th-list"></span>最新资讯</a>
                        <ul class="dropdown-content">
                            <li><a href="#">凤凰古城</a></li>
                            <li><a href="#">北京故宫</a></li>
                            <li><a href="#">云南大理</a></li>
                            <li><a href="#">武汉樱花</a></li>
                            <li><a href="#">四川美食</a></li>
                            <li><a href="#">港澳风情</a></li>
                        </ul>
                    </li>
                    <li><a href="strategy.html"><span class="glyphicon glyphicon-fire"></span>热门攻略</a>
                    <li><a href="route.html"><span class="glyphicon glyphicon-flag"></span>特价路线</a></li>
                    <li><a href="person.html"><span class="glyphicon glyphicon-user"></span>个人中心</a></li>
                    <li><a href="collection.html"><span class="glyphicon glyphicon-heart"></span>我的收藏</a></li>

                </ul>
            </div>
        </div>
    </nav>
</div>