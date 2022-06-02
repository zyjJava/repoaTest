package cn.dy.servlet;

import cn.dy.pojo.Users;
import cn.dy.service.UsersService;
import cn.dy.service.impl.UsersServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class LoginServlet extends HttpServlet {

    private UsersService service=new UsersServiceImpl();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //处理乱码
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        //获取前台用户的输入
       String username= req.getParameter("username");
       String pwd= req.getParameter("password");
        //调用service层登录的方法
        Users users =service.login(username,pwd);
        System.out.println(users);
        //转发到success 界面
        req.setAttribute("user",users);
        req.getRequestDispatcher("success.jsp").forward(req,resp);
    }
}
