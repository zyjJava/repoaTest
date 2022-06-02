package cn.dy.service;

import cn.dy.pojo.Users;

public interface UsersService {
    //注册的方法
    int insertUser(Users users);

    //登录的方法
    Users login(String name,String pwd);
}
