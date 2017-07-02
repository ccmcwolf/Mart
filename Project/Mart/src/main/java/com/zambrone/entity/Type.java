package com.zambrone.entity;

import javax.persistence.*;

/**
 * Created by Chamith on 02/07/2017.
 */
@Entity
public class Type {

    @Id
    @Column(name = "typeId")
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer typeId;

    @Basic
    @Column(name = "typeName")
    private String typeName;

}
