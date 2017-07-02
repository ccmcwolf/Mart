package com.zambrone.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Time;

/**
 * Created by Chamith on 02/07/2017.
 */
@Entity
@Data
public class Shop {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "shopNo")
    private Integer shopNo;

    @Basic
    @Column(name = "address")
    private String address;

    @Basic
    @Column(name = "city")
    private String city;

    @Basic
    @Column(name = "contactNo")
    private Integer contactNo;

    @Basic
    @Column(name = "district")
    private String district;

    @Basic
    @Column(name = "email")
    private String email;

    @Basic
    @Column(name = "shopName")
    private String shopName;

    @Basic
    @Column(name = "province")
    private String province;

    @Basic
    @Column(name = "category")
    private String category;

    @Basic
    @Column(name = "shoplogopath")
    private String shoplogopath;

    @Basic
    @Column(name = "shopcoverpath")
    private String shopcoverpath;


    @Basic
    @Column(name = "opentime")
    private Time opentime;

    @Basic
    @Column(name = "closetime")
    private Time closetime;


    @Basic
    @Column(name = "opendayfrom")
    private String opendayfrom;

    @Basic
    @Column(name = "opendayto")
    private String opendayto;

    @Basic
    @Column(name = "description")
    private String description;


}
