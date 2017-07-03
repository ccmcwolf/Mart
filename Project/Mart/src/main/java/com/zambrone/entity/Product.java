package com.zambrone.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by Chamith on 03/07/2017.
 */
@Entity
@Data
public class Product {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "productId")
    private Integer productId;
    @Basic
    @Column(name = "name")
    private String name;
    @Basic
    @Column(name = "description")
    private String description;
    @Basic
    @Column(name = "other_name")
    private String otherName;
    @Basic
    @Column(name = "imagePath")
    private String imagePath;
    @Basic
    @Column(name = "shopId")
    private Integer shopId;
    @Basic
    @Column(name = "size")
    private String size;
    @Basic
    @Column(name = "unitPrice")
    private Double unitPrice;
    @Basic
    @Column(name = "typeId")
    private Integer typeId;
    @Basic
    @Column(name = "otherId")
    private String otherId;
    @Basic
    @Column(name = "availablilty")
    private String availablilty;


}
