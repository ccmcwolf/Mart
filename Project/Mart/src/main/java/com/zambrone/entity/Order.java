package com.zambrone.entity;

import lombok.Data;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Chamith on 02/07/2017.
 */
@Entity
@Data
public class Order {

    @Id
    @Column(name = "orderNo")
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer orderNo;

    @Basic
    @Column(name = "amount")
    private Double amount;

    @Basic
    @Column(name = "city")
    private String city;

    @Basic
    @Column(name = "courierCharj")
    private Double courierCharj;

    @Basic
    @Column(name = "courierPaymentSettledDate")
    private Timestamp courierPaymentSettledDate;

    @Basic
    @Column(name = "courierTrackingNo")
    private String courierTrackingNo;

    @Basic
    @Column(name = "date")
    private Timestamp date;

    @Basic
    @Column(name = "deliveryAddress")
    private String deliveryAddress;

    @Basic
    @Column(name = "deliveryEmail")
    private String deliveryEmail;

    @Basic
    @Column(name = "deliveryName")
    private String deliveryName;

    @Basic
    @Column(name = "deliveryTelephoneNo")
    private String deliveryTelephoneNo;

    @Basic
    @Column(name = "delveryCost")
    private Double delveryCost;

    @Basic
    @Column(name = "delveryVat")
    private Double delveryVat;

    @Basic
    @Column(name = "district")
    private String district;

    @Basic
    @Column(name = "shopPaymentSettledDate")
    private Timestamp shopPaymentSettledDate;

    @Basic
    @Column(name = "province")
    private String province;

    @Basic
    @Column(name = "serviceCharg")
    private Double serviceCharg;

    @Basic
    @Column(name = "specialRequest")
    private String specialRequest;

    @Basic
    @Column(name = "statusCourier")
    private String statusCourier;

    @Basic
    @Column(name = "statusDescription")
    private String statusDescription;

    @Basic
    @Column(name = "statusShop")
    private String statusShop;

    @Basic
    @Column(name = "vat")
    private Double vat;

    @Basic
    @Column(name = "courierId")
    private Integer courierId;

    @Basic
    @Column(name = "customerEmail")
    private String customerEmail;

    @Basic
    @Column(name = "delivery_optionid")
    private Integer deliveryOptionid;

    @Basic
    @Column(name = "shopNo")
    private Integer shopNo;

}
