package cn.dy.dao;

import cn.dy.pojo.Users;

public interface UsersDao {
    //注册的方法
    int insertUser(Users users);
    //登录的方法

    Users login(String name,String pwd);
}
