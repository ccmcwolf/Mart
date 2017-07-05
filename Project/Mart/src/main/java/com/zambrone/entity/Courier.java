package com.zambrone.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by Chamith on 04/07/2017.
 */
@Entity
@Data
public class Courier {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "courier_id")
    private Integer courierId;
    @Basic
    @Column(name = "city")
    private String city;
    @Basic
    @Column(name = "nic")
    private String nic;
    @Basic
    @Column(name = "address")
    private String address;
    @Basic
    @Column(name = "contact_no")
    private String contactNo;
    @Basic
    @Column(name = "vehicle_no")
    private String vehicleNo;
    @Basic
    @Column(name = "courier_name")
    private String courierName;
    @Basic
    @Column(name = "email")
    private String email;
    @Basic
    @Column(name = "province")
    private String province;
    @Basic
    @Column(name = "imagepath")
    private String imagepath;

}
