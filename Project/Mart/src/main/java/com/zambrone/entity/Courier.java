package com.zambrone.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by Chamith on 02/07/2017.
 */
@Entity
@Data
public class Courier {
    @NotNull
    @Basic
    @Column(name = "address")
    private String address;

    @Basic
    @Column(name = "vehicle_no")
    private String vehicleNo;

    @Basic
    @Column(name = "imagepath")
    private String imagepath;

    @NotNull
    @Basic
    @Column(name = "nic")
    private String nic;



    @Id
    @Column(name = "courierId")
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer courierId;


    @Basic
    @Column(name = "city")
    private String city;


    @NotNull
    @Basic
    @Column(name = "courier_name")
    private String courierName;

    @NotNull
    @Basic
    @Column(name = "email")
    private String email;


    @Basic
    @Column(name = "province")
    private String province;


    @Basic
    @Column(name = "contact_no")
    private String contactNo;

}
