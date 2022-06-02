package cn.dy.servlet;

import cn.dy.pojo.Users;
import cn.dy.service.UsersService;
import cn.dy.service.impl.UsersServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class UsersServlet extends HttpServlet {
    //调用对应service层的方法
    private UsersService service=new UsersServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp); //调用自己类中的doPost
    }

    /*所有的代码只写在doPost中*/
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //处理请求和响应的乱码问题
        req.setCharacterEncoding("utf-8");
        resp.setCharacterEncoding("utf-8");
        //01、获取前台用户的输入 需要前台标签中有对应的name属性
        Users users=new Users();
        users.setUname(req.getParameter("username"));
        users.setPhone(Integer.parseInt(req.getParameter("phone")));
        users.setEmail(req.getParameter("email"));
        users.setAddress(req.getParameter("address"));
        //02、调用service的方法
       int result= service.insertUser(users);
       //03、根据返回值给用户一个不同的响应页面
        if (result>0){
            //将我们的result保存在了请求对象中，名称是result
            req.setAttribute("result",result); //只是为了验证转发的时候 数据不丢失
            //跳转到成功页面   转发
            req.getRequestDispatcher("success.jsp").forward(req,resp);
        }else {
            //跳转到失败页面   重定向
            req.setAttribute("r",result); //这里只是为了验证重定向会丢失数据
            resp.sendRedirect("/fail.jsp");
        }
    }


     //登录的方法   login


    //注册的方法  addUser

}
