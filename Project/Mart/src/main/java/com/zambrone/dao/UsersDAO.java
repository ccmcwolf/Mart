package com.zambrone.dao;

/**
 * Created by Chamith on 11/06/2017.
 */
import com.zambrone.entity.Users;

import java.util.List;

public interface UsersDAO {
    boolean addUser(Users users);

    boolean deleteUser(String userId);

    Users searchUser(String userId);

    List<Users> searchUserbyFirstName(String firstName);

    List<Users> searchUserbyLastName(String lastName);

    List<Users> searchUserbyUserType(String type);

    List<Users> searchAllUsers(int var1, int var2);

    int searchUserCount();

    boolean updateUser(Users user, String userName);
}