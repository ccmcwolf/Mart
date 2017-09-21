package com.zambrone.service;

import com.zambrone.entity.UserRoles;
import com.zambrone.entity.Users;

/**
 * Created by Chamith on 17/09/2017.
 */
public interface UserService {

    void addUser(Users user, UserRoles userRoles);

    void deleteUser(Integer userId);

    Users searchUser(String userName);

    void activateUser(Users user);

    UserRoles getUserRole(String username);

    int searchUserCount();

    void updateUser(Users user);
}
