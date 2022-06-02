<%@ page import="cn.dy.pojo.Users" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
  Users users= (Users) request.getAttribute("user");
  System.out.println(users);
%>
 成功页面！！！！success！！！<br/>
  您的用户名：<% out.write(users.getUname());%>


</body>
</html>
