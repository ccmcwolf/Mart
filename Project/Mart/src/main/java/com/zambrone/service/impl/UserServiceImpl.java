package com.zambrone.service.impl;

import com.zambrone.dao.UserDAO;
import com.zambrone.entity.User;
import com.zambrone.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Chamith on 17/09/2017.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDAO userDAO;

    @Override
    public void addUser(User user) {
        userDAO.addUser(user);
    }

    @Override
    public void deleteUser(Integer userId) {
        userDAO.deleteUser(userId);
    }

    @Override
    public User searchUser(Integer userId) {
        return userDAO.searchUser(userId);
    }

    @Override
    public int searchUserCount() {
        return userDAO.searchUserCount();
    }

    @Override
    public void updateUser(User user, String userName) {
        userDAO.updateUser(user,userName);
    }
}
