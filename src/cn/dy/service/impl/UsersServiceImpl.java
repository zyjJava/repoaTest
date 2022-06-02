package cn.dy.service.impl;

import cn.dy.dao.UsersDao;
import cn.dy.dao.impl.UsersDaoImpl;
import cn.dy.pojo.Users;
import cn.dy.service.UsersService;

public class UsersServiceImpl implements UsersService {

     //调用对应dao层的方法
    private UsersDao dao=new UsersDaoImpl();

    @Override
    public int insertUser(Users users) {
        return dao.insertUser(users);
    }

    @Override
    public Users login(String name, String pwd) {
        return dao.login(name,pwd);
    }


}
