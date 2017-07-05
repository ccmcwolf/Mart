package com.zambrone.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by Chamith on 04/07/2017.
 */

@Entity
@Data
public class Type {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "type_id")
    private Integer typeId;

    @Basic
    @Column(name = "type_name")
    private String typeName;

}
