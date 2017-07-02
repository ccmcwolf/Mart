package com.zambrone.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by Chamith on 02/07/2017.
 */
@Entity
@Data
public class Feedback {

    @Id
    @NotNull
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "fbid")
    private Integer fbid;

    @Basic
    @Column(name = "dlvrRate")
    private Double dlvrRate;

    @Basic
    @Column(name = "email")
    private String email;

    @Basic
    @Column(name = "issues")
    private String issues;

    @Basic
    @Column(name = "name")
    private String name;

    @Basic
    @Column(name = "other")
    private String other;

    @Basic
    @Column(name = "priceRate")
    private Double priceRate;

    @Basic
    @Column(name = "productRate")
    private Double productRate;

    @Basic
    @Column(name = "serviceRate")
    private Double serviceRate;

    @Basic
    @Column(name = "tel")
    private String tel;


}
