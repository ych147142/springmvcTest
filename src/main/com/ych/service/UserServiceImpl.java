package com.ych.service;

import com.ych.dao.IUserDao;
import com.ych.dao.UserDaoImpl;
import com.ych.pojo.User;

import java.util.List;

public class UserServiceImpl implements IUserService {
    IUserDao dao = new UserDaoImpl();
    @Override
    public List<User> lists() {
        return dao.lists();
    }

    @Override
    public int delete(int id) {
        return dao.delete(id);
    }

    @Override
    public int insert(User user) {
        return dao.insert(user);
    }

    @Override
    public int update(User user) {
        return dao.update(user);
    }

    @Override
    public User getOne(int id) {
        return dao.getOne(id);
    }
}
