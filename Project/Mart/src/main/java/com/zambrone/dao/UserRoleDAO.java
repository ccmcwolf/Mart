package com.zambrone.dao;

import com.zambrone.entity.UserRoles;
import org.springframework.dao.DataAccessException;

/**
 * Created by Chamith on 21/09/2017.
 */
public interface UserRoleDAO {

    void addUserRole(UserRoles userRoles)  throws DataAccessException;;

    void deleteUserRole(Integer roleid)  throws DataAccessException;

    void deleteUserRoleName(String  rolename)  throws DataAccessException;;

    UserRoles searchUserRole(String userName)  throws DataAccessException;;

    int searchUserCount()  throws DataAccessException;;

    void updateUserRole(UserRoles userRole)  throws DataAccessException;;
}
