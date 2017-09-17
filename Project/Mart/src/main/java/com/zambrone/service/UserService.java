package com.zambrone.service;

import com.zambrone.entity.User;

import java.util.List;

/**
 * Created by Chamith on 17/09/2017.
 */
public interface UserService {

    void addUser(User user);

    void deleteUser(Integer userId);

    User searchUser(Integer userId);

    int searchUserCount();

    void updateUser(User user, String userName);
}
