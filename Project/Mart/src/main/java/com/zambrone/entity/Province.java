package com.zambrone.entity;

import lombok.ToString;

import javax.persistence.*;

/**
 * Created by Chamith on 24/09/2017.
 */
@Entity
@ToString
public class Province {
    private Integer provinceId;
    private String provinceName;

    @Id
    @Column(name = "province_id")
    @GeneratedValue(strategy= GenerationType.AUTO)
    public Integer getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }

    @Basic
    @Column(name = "province_name")
    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Province province = (Province) o;

        if (provinceId != null ? !provinceId.equals(province.provinceId) : province.provinceId != null) return false;
        if (provinceName != null ? !provinceName.equals(province.provinceName) : province.provinceName != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = provinceId != null ? provinceId.hashCode() : 0;
        result = 31 * result + (provinceName != null ? provinceName.hashCode() : 0);
        return result;
    }
}
