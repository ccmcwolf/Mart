package com.zambrone.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by Chamith on 04/07/2017.
 */
@Entity
@Data
public class Customer {

    @Id
    @Column(name = "customer_id")
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer customerId;

    @Basic
    @Column(name = "city")
    private String city;

    @Basic
    @Column(name = "geolocation")
    private String geolocation;
    @Basic
    @Column(name = "customer_address")
    private String customerAddress;
    @Basic
    @Column(name = "customer_email")
    private String customerEmail;
    @Basic
    @Column(name = "customer_name")
    private String customerName;
    @Basic
    @Column(name = "district")
    private String district;
    @Basic
    @Column(name = "mobile_no")
    private Long mobileNo;

    @Basic
    @Column(name = "province")
    private String province;
    @Basic
    @Column(name = "image_path")
    private String imagePath;


}
