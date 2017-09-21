package com.zambrone.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by Chamith on 20/09/2017.
 */
@Entity
@Data
public class Users {
    @Id
    @Column(name = "username")
    private String username;
    private String password;
    private Byte enabled;

}
