package com.zambrone.entity;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Chamith on 02/07/2017.
 */
@Entity
public class Users {

    @Id
    @Column(name = "email")
    @GeneratedValue(strategy= GenerationType.AUTO)
    private String email;

    @Basic
    @Column(name = "deliverTime")
    private Timestamp deliverTime;

    @Basic
    @Column(name = "firstName")
    private String firstName;

    @Basic
    @Column(name = "lastName")
    private String lastName;

    @Basic
    @Column(name = "password")
    private String password;

    @Basic
    @Column(name = "securityCode")
    private String securityCode;

    @Basic
    @Column(name = "userType")
    private String userType;

}
