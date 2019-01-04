package com.ych.dao;

import com.ych.Utiltest.JdbcUtil;
import com.ych.Utiltest.RowMap;
import com.ych.pojo.User;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class UserDaoImpl implements IUserDao {
    @Override
    public List<User> lists() {
        return JdbcUtil.executeQuery("select * from user", new RowMap<User>() {
            @Override
            public User RowMapping(ResultSet rs) {
                User u = new User();
                try {
                    u.setId(rs.getInt("id"));
                    u.setUsername(rs.getString("username"));
                    u.setPassword(rs.getString("password"));
                    u.setEmail(rs.getString("email"));
                    u.setLv(rs.getInt("lv"));
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                return u;
            }
        }, null);
    }

    @Override
    public int delete(int id) {
        return JdbcUtil.executeUpdate("delete from user where id = ?",id);
    }

    @Override
    public int insert(User user) {
        return JdbcUtil.executeUpdate("insert into user(username,password,email,lv) values (?,?,?,?)",user.getUsername(),user.getPassword(),user.getEmail(),user.getLv());
    }

    @Override
    public int update(User user) {
        return JdbcUtil.executeUpdate("update user set username=?,password=?,email=?,lv=? where id=?",user.getUsername(),user.getPassword(),user.getEmail(),user.getLv(),user.getId());
    }
}
