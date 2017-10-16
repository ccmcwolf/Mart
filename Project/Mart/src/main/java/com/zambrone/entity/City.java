package com.zambrone.entity;

import javax.persistence.*;

/**
 * Created by Chamith on 24/09/2017.
 */
@Entity
public class City {
    private Integer cityId;
    private String cityName;
    private Integer provinceId;
    private Integer districtId;

    @Id
    @Column(name = "city_id")
    @GeneratedValue(strategy= GenerationType.AUTO)
    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    @Basic
    @Column(name = "city_ name")
    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    @Basic
    @Column(name = "province_id")
    public Integer getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }

    @Basic
    @Column(name = "district_id")
    public Integer getDistrictId() {
        return districtId;
    }

    public void setDistrictId(Integer districtId) {
        this.districtId = districtId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        City city = (City) o;

        if (cityId != null ? !cityId.equals(city.cityId) : city.cityId != null) return false;
        if (cityName != null ? !cityName.equals(city.cityName) : city.cityName != null) return false;
        if (provinceId != null ? !provinceId.equals(city.provinceId) : city.provinceId != null) return false;
        if (districtId != null ? !districtId.equals(city.districtId) : city.districtId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = cityId != null ? cityId.hashCode() : 0;
        result = 31 * result + (cityName != null ? cityName.hashCode() : 0);
        result = 31 * result + (provinceId != null ? provinceId.hashCode() : 0);
        result = 31 * result + (districtId != null ? districtId.hashCode() : 0);
        return result;
    }
}
