
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册页面</title>
    <%--01、引入bootstrap的CSS文件--%>
    <link href="css/bootstrap.css" rel="stylesheet">
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
<%--action 是提交的后台地址，对应某个servlet  method 是提交方式    --%>
<form action="addUser" method="post">
    <div class="form-group">
        <label for="username">用户名</label>
        <input type="text" class="form-control" name="username" id="username" placeholder="请输入用户名">
    </div>
    <div class="form-group">
        <label for="Email">邮箱：</label>
        <input type="email" class="form-control" name="email" id="Email" placeholder="请输入邮箱">
    </div>
    <div class="form-group">
        <label for="phone">电话：</label>
        <input type="text" class="form-control" name="phone" id="phone" placeholder="请输入手机号">
    </div>
    <div class="form-group">
        <label for="address">地址：</label>
        <input type="text" class="form-control" name="address" id="address" placeholder="请输入地址">
    </div>
    <button type="submit" class="btn btn-warning">注册</button>
    <button type="reset" class="btn  btn-danger">重置</button>
</form>

</body>
</html>
