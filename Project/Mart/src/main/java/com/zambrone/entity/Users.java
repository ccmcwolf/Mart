package com.zambrone.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;

/**
 * Created by Chamith on 11/06/2017.
 */
@Entity
public class Users {
    private String email;
    private Timestamp deliverTime;
    private String firstName;
    private String lastName;
    private String password;
    private String securityCode;
    private String userType;

    @Id
    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "deliverTime")
    public Timestamp getDeliverTime() {
        return deliverTime;
    }

    public void setDeliverTime(Timestamp deliverTime) {
        this.deliverTime = deliverTime;
    }

    @Basic
    @Column(name = "firstName")
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Basic
    @Column(name = "lastName")
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Basic
    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Basic
    @Column(name = "securityCode")
    public String getSecurityCode() {
        return securityCode;
    }

    public void setSecurityCode(String securityCode) {
        this.securityCode = securityCode;
    }

    @Basic
    @Column(name = "userType")
    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Users users = (Users) o;

        if (email != null ? !email.equals(users.email) : users.email != null) return false;
        if (deliverTime != null ? !deliverTime.equals(users.deliverTime) : users.deliverTime != null) return false;
        if (firstName != null ? !firstName.equals(users.firstName) : users.firstName != null) return false;
        if (lastName != null ? !lastName.equals(users.lastName) : users.lastName != null) return false;
        if (password != null ? !password.equals(users.password) : users.password != null) return false;
        if (securityCode != null ? !securityCode.equals(users.securityCode) : users.securityCode != null) return false;
        if (userType != null ? !userType.equals(users.userType) : users.userType != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = email != null ? email.hashCode() : 0;
        result = 31 * result + (deliverTime != null ? deliverTime.hashCode() : 0);
        result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
        result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (securityCode != null ? securityCode.hashCode() : 0);
        result = 31 * result + (userType != null ? userType.hashCode() : 0);
        return result;
    }
}
