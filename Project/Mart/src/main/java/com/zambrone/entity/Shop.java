package com.zambrone.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Time;

/**
 * Created by Chamith on 04/07/2017.
 */
@Entity
@Data
public class Shop {

    @Id
    @Column(name = "shop_no")
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer shopNo;
    @Basic
    @NotNull
    @Column(name = "address")
    private String address;

    @Basic
    @NotNull
    @Column(name = "city")
    private String city;

    @Basic
    @NotNull
    @Column(name = "contact_no")
    private Integer contactNo;

    @Basic
    @NotNull
    @Column(name = "district")
    private String district;

    @Basic
    @NotNull
    @Column(name = "email")
    private String email;
    @Basic
    @NotNull
    @Column(name = "shop_name")
    private String shopName;
    @Basic
    @Column(name = "province")
    private String province;
    @Basic
    @Column(name = "category")
    private String category;

    @Basic
    @Column(name = "shoplogo_path")
    private String shoplogoPath;

    @Basic
    @Column(name = "shopcover_path")
    private String shopcoverPath;

    @Basic
    @Column(name = "open_time")
    private Time openTime;

    @Basic
    @Column(name = "close_time")
    private Time closeTime;

    @Basic
    @Column(name = "openday_from")
    private String opendayFrom;

    @Basic
    @Column(name = "openday_to")
    private String opendayTo;

    @Basic
    @NotNull
    @Column(name = "description")
    private String description;


}
