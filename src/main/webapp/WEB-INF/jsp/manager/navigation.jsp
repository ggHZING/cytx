<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<!-- Navigation -->
<nav class="navbar navbar-default navbar-static-top" role="navigation"
     style="margin-bottom: 0;/*background-color:#2551ff;*/" >
    <div class="navbar-header">
        <button type="button" class="navbar-toggle" data-toggle="collapse"
                data-target=".navbar-collapse">
            <span class="sr-only">Toggle navigation</span> <span
                class="icon-bar"></span> <span class="icon-bar"></span> <span
                class="icon-bar"></span>
        </button>
        <%--<div class="col-md-1" style="padding-top: 4px">--%>
            <%--<img style="height: 50px;width: 110px" src="image/logo1.png" />--%>
        <%--</div>--%>
        <div class="col-md-4" style="padding-left: 5px;padding-top: 4px">
            <img src="image/mlogo.png" />
        </div>
       <%-- <a class="navbar-brand" href="index.html">&lt;%&ndash;<font color="#F6FFFF">&ndash;%&gt;5爱旅游网管理系统&lt;%&ndash;</font>&ndash;%&gt;</a>--%>
    </div>
    <!-- /.navbar-header -->

    <ul class="nav navbar-top-links navbar-right">
        <!-- /.dropdown -->
        <li class="dropdown"><a class="dropdown-toggle"
                                data-toggle="dropdown" href="#"> <i class="fa fa-user fa-fw"></i>
            <i class="fa fa-caret-down"></i>
        </a>
            <ul class="dropdown-menu dropdown-user">
                <li><a href="${pageContext.request.contextPath }/managerLogout"><i class="fa fa-sign-out fa-fw"></i>
                    退出登录</a></li>
            </ul> <!-- /.dropdown-user --></li>
        <!-- /.dropdown -->
    </ul>
    <!-- /.navbar-top-links -->

    <div class="navbar-default sidebar" role="navigation">
        <div class="sidebar-nav navbar-collapse">
            <ul class="nav" id="side-menu">
                <li class="sidebar-search">
                    <div class="input-group custom-search-form">
                        <input type="text" disabled="disabled" class="form-control" placeholder="畅游天下旅游网主页">
                        <span class="input-group-btn">
								<button class="btn btn-default" type="button">
                                    <a href="http://localhost:8080/cytx/user">
									<i class="fa fa-search" style="padding: 3px 0 3px 0;"></i>
                                    </a>
								</button>
                        </span>
                    </div> <!-- /input-group -->
                </li>
                <li><a href="${pageContext.request.contextPath }/manageScenic"><i
                        class="fa fa-dashboard fa-fw"></i> 景点管理</a></li>
                <li><a href="${pageContext.request.contextPath }/manageTicket"><i
                        class="fa fa-dashboard fa-fw"></i> 入驻管理</a></li>
                <li><a href="${pageContext.request.contextPath }/manageFood"><i
                        class="fa fa-dashboard fa-fw"></i> 攻略管理</a></li>
                <li><a href="${pageContext.request.contextPath }/manageOrder"><i
                        class="fa fa-dashboard fa-fw"></i> 订单管理</a></li>
                <li><a href="${pageContext.request.contextPath }/manageUser"><i
                        class="fa fa-dashboard fa-fw"></i> 用户管理</a></li>

            </ul>
        </div>
        <!-- /.sidebar-collapse -->
    </div>
    <!-- /.navbar-static-side --> </nav>