
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录页面</title>
    <%--01、引入bootstrap的CSS文件--%>
    <link href="css/bootstrap.css"  rel="stylesheet">
    <%--02、引入jquery文件--%>
    <script  src="js/jquery-3.2.1.min.js"></script>
    <%--03、引入bootstrap的js文件--%>
    <script  src="js/bootstrap.js"></script>

    <style>
        .form-control{
            width: 40%;
        }
        form{
            margin-left: 350px;
        }
    </style>
</head>
<body>

<%--  action的值 login就是请求的后台路径--%>
<form class="form-horizontal" action="login"  method="post">
    <div class="form-group">
        <label for="username" class="col-sm-2 control-label">用户名：</label>
        <div class="col-sm-10">
            <input type="text" class="form-control" name="username" id="username" placeholder="请输入用户名">
        </div>
    </div>
    <div class="form-group">
        <label for="pwd" class="col-sm-2 control-label">密码：</label>
        <div class="col-sm-10">
            <input type="password" class="form-control"  name="password" id="pwd" placeholder="请输入密码">
        </div>
    </div>
    <div class="form-group">
        <div class="col-sm-offset-2 col-sm-10">
            <div class="checkbox">
                <label>
                    <input type="checkbox"> Remember me
                </label>
            </div>
        </div>
    </div>
    <div class="form-group">
        <div class="col-sm-offset-2 col-sm-10">
            <button type="submit" class="btn btn-default">登录</button>
        </div>
    </div>
</form>





</body>
</html>
