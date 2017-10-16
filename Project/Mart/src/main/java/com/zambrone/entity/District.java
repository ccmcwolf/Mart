package com.zambrone.entity;

import javax.persistence.*;

/**
 * Created by Chamith on 24/09/2017.
 */
@Entity
public class District {
    private Integer districtId;
    private String districtName;
    private Integer provinceId;

    @Id
    @Column(name = "district_id")
    @GeneratedValue(strategy= GenerationType.AUTO)
    public Integer getDistrictId() {
        return districtId;
    }

    public void setDistrictId(Integer districtId) {
        this.districtId = districtId;
    }

    @Basic
    @Column(name = "district_name")
    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }

    @Basic
    @Column(name = "province_id")
    public Integer getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        District district = (District) o;

        if (districtId != null ? !districtId.equals(district.districtId) : district.districtId != null) return false;
        if (districtName != null ? !districtName.equals(district.districtName) : district.districtName != null)
            return false;
        if (provinceId != null ? !provinceId.equals(district.provinceId) : district.provinceId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = districtId != null ? districtId.hashCode() : 0;
        result = 31 * result + (districtName != null ? districtName.hashCode() : 0);
        result = 31 * result + (provinceId != null ? provinceId.hashCode() : 0);
        return result;
    }
}
