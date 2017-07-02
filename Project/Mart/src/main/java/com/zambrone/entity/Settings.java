package com.zambrone.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by Chamith on 02/07/2017.
 */
@Entity
@Data
public class Settings {
    @Id
    @Column(name = "settingsid")
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer settingsid;

    @Basic
    @Column(name = "serviceCharg")
    private Double serviceCharg;


    @Basic
    @Column(name = "vat")
    private Double vat;

}
