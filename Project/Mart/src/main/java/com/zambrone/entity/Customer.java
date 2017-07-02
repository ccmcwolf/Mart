package com.zambrone.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by Chamith on 02/07/2017.
 */
@Entity
@Data
public class Customer {

    @Id
    @NotNull
    @Column(name = "customerId")
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer customerId;

    @Basic
    @Column(name = "city")
    private String city;

    @Basic
    @Column(name = "geolocation")
    private String geolocation;

    @Basic
    @Column(name = "customerAddress")
    private String customerAddress;

    @Basic
    @NotNull
    @Column(name = "customerEmail")
    private String customerEmail;

    @Basic
    @NotNull
    @Column(name = "customerName")
    private String customerName;

    @Basic
    @Column(name = "district")
    private String district;

    @Basic
    @NotNull
    @Column(name = "mobileNo")
    private Long mobileNo;

    @Basic
    @Column(name = "province")
    private String province;

    @Basic
    @Column(name = "imagepath")
    private String imagepath;



}
