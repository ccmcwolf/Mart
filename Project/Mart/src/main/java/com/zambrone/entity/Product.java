package com.zambrone.entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

/**
 * Created by Chamith on 04/07/2017.
 */
@Entity
@Data
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "product_id")
    private Integer productId;
    @Basic
    @NotNull
    @Column(name = "name")
    private String name;
    @Basic
    @Column(name = "weight")
    private Double weight;
    @Basic
    @NotNull
    @Column(name = "description")
    private String description;
    @Basic
    @Column(name = "other_name")
    private String otherName;
    @Basic
    @Column(name = "image_path")
    private String imagePath;
    @Basic
    @Column(name = "shop_id")
    private Integer shopId;
    @Basic
    @Column(name = "size")
    private String size;
    @Basic
    @NotNull
    @Column(name = "unit_price")
    private Double unitPrice;
    @Basic

    @Column(name = "type_id")
    private Integer typeId;
    @Basic

    @Column(name = "other_id")
    private String otherId;
    @Basic
    @NotNull
    @Column(name = "availablilty")
    private String availablilty;
}
