package com.zambrone.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by Chamith on 02/07/2017.
 */
@Entity
@Data
@Table(name = "delivery_option", schema = "mart")
public class DeliveryOption {

    @Id
    @Column(name = "delivery_optionid")
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer deliveryOptionid;

    @Basic
    @Column(name = "cost")
    private Double cost;

    @Basic
    @Column(name = "description")
    private String description;

    @Basic
    @Column(name = "type_name")
    private String typeName;

}
