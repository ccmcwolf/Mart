package com.zambrone.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by Chamith on 04/07/2017.
 */
@Entity
@Data
public class Category {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "category_id")
    private Integer categoryId;
    @Basic
    @Column(name = "category_name")
    private String categoryName;

    @Basic
    @Column(name = "tag")
    private String tag;
    @Basic
    @Column(name = "tag1")
    private String tag1;
    @Basic
    @Column(name = "tag3")
    private String tag3;

}
