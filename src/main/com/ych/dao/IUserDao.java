package com.ych.dao;

import com.ych.pojo.User;

import java.util.List;

public interface IUserDao {
    public List<User> lists();
    public int delete(int id);
    public int insert(User user);
    public int update(User user);
}
