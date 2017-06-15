package com.zambrone.service;

/**
 * Created by Chamith on 11/06/2017.
 */

import com.zambrone.entity.Users;

import java.util.List;

public interface UsersService {
    boolean addUser(Users users);

    boolean updateUser(Users var1, String var2);

    boolean deleteUser(String userId);

    Users searchUser(String userId);

    List<Users> searchUserbyFirstName(String firstName);

    List<Users> searchUserbyLastName(String lastName);

    List<Users> searchUserbyUserType(String userType);

    List<Users> searchAllUsers(int var1, int var2);

    int searchUserCount();
}
