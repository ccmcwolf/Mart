package com.zambrone.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Chamith on 18/06/2017.
 */
@Entity
public class Courier {
    private Integer courierId;
    private String city;
    private Integer contactNo;
    private String courierAddress;
    private String courierName;
    private String district;
    private String email;
    private String province;

    @Id
    @Column(name = "courierId")
    public Integer getCourierId() {
        return courierId;
    }

    public void setCourierId(Integer courierId) {
        this.courierId = courierId;
    }

    @Basic
    @Column(name = "city")
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Basic
    @Column(name = "contactNo")
    public Integer getContactNo() {
        return contactNo;
    }

    public void setContactNo(Integer contactNo) {
        this.contactNo = contactNo;
    }

    @Basic
    @Column(name = "courierAddress")
    public String getCourierAddress() {
        return courierAddress;
    }

    public void setCourierAddress(String courierAddress) {
        this.courierAddress = courierAddress;
    }

    @Basic
    @Column(name = "courierName")
    public String getCourierName() {
        return courierName;
    }

    public void setCourierName(String courierName) {
        this.courierName = courierName;
    }

    @Basic
    @Column(name = "district")
    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    @Basic
    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "province")
    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Courier courier = (Courier) o;

        if (courierId != null ? !courierId.equals(courier.courierId) : courier.courierId != null) return false;
        if (city != null ? !city.equals(courier.city) : courier.city != null) return false;
        if (contactNo != null ? !contactNo.equals(courier.contactNo) : courier.contactNo != null) return false;
        if (courierAddress != null ? !courierAddress.equals(courier.courierAddress) : courier.courierAddress != null)
            return false;
        if (courierName != null ? !courierName.equals(courier.courierName) : courier.courierName != null) return false;
        if (district != null ? !district.equals(courier.district) : courier.district != null) return false;
        if (email != null ? !email.equals(courier.email) : courier.email != null) return false;
        if (province != null ? !province.equals(courier.province) : courier.province != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = courierId != null ? courierId.hashCode() : 0;
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (contactNo != null ? contactNo.hashCode() : 0);
        result = 31 * result + (courierAddress != null ? courierAddress.hashCode() : 0);
        result = 31 * result + (courierName != null ? courierName.hashCode() : 0);
        result = 31 * result + (district != null ? district.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (province != null ? province.hashCode() : 0);
        return result;
    }
}
