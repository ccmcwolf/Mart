package com.zambrone.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Arrays;

/**
 * Created by Chamith on 02/07/2017.
 */
@Entity
@Data
public class Product {
    @Id
    @Column(name = "productId")
    @GeneratedValue(strategy= GenerationType.AUTO)
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
    private byte[] imagePath;

    @Basic
    @Column(name = "size")
    private String size;

    @Basic
    @Column(name = "unitPrice")
    private Double unitPrice;

    @Basic
    @Column(name = "typeId")
    private Integer typeId;
}
