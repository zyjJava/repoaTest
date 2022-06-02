package cn.dy.dao.impl;

import cn.dy.dao.UsersDao;
import cn.dy.pojo.Users;
import cn.dy.utils.JDBCUtils;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.Map;

public class UsersDaoImpl  implements UsersDao {

    JdbcTemplate template= new JdbcTemplate(JDBCUtils.getDataSource());

    //注册
    @Override
    public int insertUser(Users users) {
        String sql="INSERT INTO users(uname,email,phone,address) VALUES(?,?,?,?)";
        int result=template.update(sql,users.getUname(),users.getEmail(),users.getPhone(),users.getAddress());
        return result;
    }

    //登录
    @Override
    public Users login(String name, String pwd) {
        String sql="SELECT *  FROM users WHERE uname=? AND phone =?";
        Map<String, Object> map = template.queryForMap(sql, name, pwd);
        Users users=new Users();
        users.setId((Integer) map.get("id")); //get中的key就是数据库中的字段名
        users.setUname((String)map.get("uname"));
        users.setEmail((String)map.get("email"));
        users.setAddress((String)map.get("address"));
        users.setPhone((Integer) map.get("phone"));
        return users;
    }
}
