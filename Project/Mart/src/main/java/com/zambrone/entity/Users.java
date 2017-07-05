package com.zambrone.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Chamith on 04/07/2017.
 */
@Entity
@Data
public class Users {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "email")
    private String email;
    @Basic
    @Column(name = "deliver_time")
    private Timestamp deliverTime;

    @Basic
    @Column(name = "first_name")
    private String firstName;

    @Basic
    @Column(name = "last_name")
    private String lastName;

    @Basic
    @Column(name = "password")
    private String password;

    @Basic
    @Column(name = "security_code")
    private String securityCode;

    @Basic
    @Column(name = "user_type")
    private String userType;


}
