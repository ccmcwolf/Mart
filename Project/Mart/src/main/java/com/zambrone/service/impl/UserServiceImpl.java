package com.zambrone.service.impl;

import com.zambrone.dao.UserDAO;
import com.zambrone.dao.UserRoleDAO;
import com.zambrone.entity.UserRoles;
import com.zambrone.entity.Users;
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
    @Autowired
    UserRoleDAO userRoleDAO;


    @Override
    public void addUser(Users user, UserRoles userRoles) {
        userDAO.addUser(user);

        userRoleDAO.addUserRole(userRoles);
    }

    @Override
    public void deleteUser(Integer userId) {

    }

    @Override
    public Users searchUser(String userName) {
        return userDAO.searchUser(userName);
    }

    @Override
    public void activateUser(Users user) {
        byte bi = (byte) 1;
        user.setEnabled(bi);
        userDAO.updateUser(user);
    }

    @Override
    public UserRoles getUserRole(String username) {
      return null;
    }

    @Override
    public int searchUserCount() {
        return 0;
    }

    @Override
    public void updateUser(Users user) {

    }
}
