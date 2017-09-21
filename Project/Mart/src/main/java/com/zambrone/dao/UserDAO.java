package com.zambrone.dao;

import com.zambrone.entity.Users;
import org.springframework.dao.DataAccessException;

import java.util.List;

/**
 * Created by Chamith on 17/09/2017.
 */
public interface UserDAO {

    void addUser(Users user)  throws DataAccessException;;

    void deleteUser(Integer userId)  throws DataAccessException;;

    Users searchUser(String userName)  throws DataAccessException;;

    int searchUserCount()  throws DataAccessException;;

    void updateUser(Users user)  throws DataAccessException;;
}
