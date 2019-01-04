package com.ych.service;

import com.ych.pojo.User;

import java.util.List;

public interface IUserService {
    public List<User> lists();
    public int delete(int id);
    public int insert(User user);
    public int update(User user);
}
