package com.zambrone.service.impl;

/**
 * Created by Chamith on 11/06/2017.
 */
import java.util.List;

import com.zambrone.dao.UsersDAO;
import com.zambrone.entity.Users;
import com.zambrone.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(
        propagation = Propagation.REQUIRED,
        isolation = Isolation.READ_COMMITTED
)
public class UsersServiceImpl implements UsersService {
    @Autowired
    private UsersDAO usersDAO;

    public UsersServiceImpl() {
    }

    @Transactional(
            propagation = Propagation.REQUIRES_NEW,
            isolation = Isolation.READ_COMMITTED
    )
    public boolean addUser(Users users) {
        return this.getUsersDAO().addUser(users);
    }

    @Transactional(
            propagation = Propagation.REQUIRES_NEW,
            isolation = Isolation.READ_COMMITTED
    )
    public boolean updateUser(Users users, String oldEmail) {
        return this.getUsersDAO().updateUser(users, oldEmail);
    }

    @Transactional(
            propagation = Propagation.REQUIRES_NEW,
            isolation = Isolation.READ_COMMITTED
    )
    public boolean deleteUser(String email) {
        return this.getUsersDAO().deleteUser(email);
    }

    @Transactional(
            propagation = Propagation.REQUIRES_NEW,
            isolation = Isolation.READ_COMMITTED
    )
    public Users searchUser(String email) {
        return this.getUsersDAO().searchUser(email);
    }

    @Transactional(
            propagation = Propagation.REQUIRES_NEW,
            isolation = Isolation.READ_COMMITTED
    )
    public List<Users> searchAllUsers(int from, int to) {
        return this.getUsersDAO().searchAllUsers(from, to);
    }

    @Transactional(
            propagation = Propagation.REQUIRES_NEW,
            isolation = Isolation.READ_COMMITTED
    )
    public List<Users> searchUserbyFirstName(String fname) {
        return this.getUsersDAO().searchUserbyFirstName(fname);
    }

    @Transactional(
            propagation = Propagation.REQUIRES_NEW,
            isolation = Isolation.READ_COMMITTED
    )
    public List<Users> searchUserbyLastName(String lname) {
        return this.getUsersDAO().searchUserbyLastName(lname);
    }

    @Transactional(
            propagation = Propagation.REQUIRES_NEW,
            isolation = Isolation.READ_COMMITTED
    )
    public List<Users> searchUserbyUserType(String userType) {
        return this.getUsersDAO().searchUserbyUserType(userType);
    }

    @Transactional(
            propagation = Propagation.REQUIRES_NEW,
            isolation = Isolation.READ_COMMITTED
    )
    public int searchUserCount() {
        return this.getUsersDAO().searchUserCount();
    }

    public UsersDAO getUsersDAO() {
        return this.usersDAO;
    }

    public void setUsersDAO(UsersDAO usersDAO) {
        this.usersDAO = usersDAO;
    }
}
