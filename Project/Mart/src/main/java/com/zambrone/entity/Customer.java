package com.zambrone.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Chamith on 13/06/2017.
 */
@Entity
public class Customer {
    private Integer customerId;
    private String city;
    private String customerAddress;
    private String customerEmail;
    private String customerName;
    private String district;
    private Long mobileNo;
    private String province;

    @Id
    @Column(name = "customerId")
    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
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
    @Column(name = "customerAddress")
    public String getCustomerAddress() {
        return customerAddress;
    }

    public void setCustomerAddress(String customerAddress) {
        this.customerAddress = customerAddress;
    }

    @Basic
    @Column(name = "customerEmail")
    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    @Basic
    @Column(name = "customerName")
    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
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
    @Column(name = "mobileNo")
    public Long getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(Long mobileNo) {
        this.mobileNo = mobileNo;
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

        Customer customer = (Customer) o;

        if (customerId != null ? !customerId.equals(customer.customerId) : customer.customerId != null) return false;
        if (city != null ? !city.equals(customer.city) : customer.city != null) return false;
        if (customerAddress != null ? !customerAddress.equals(customer.customerAddress) : customer.customerAddress != null)
            return false;
        if (customerEmail != null ? !customerEmail.equals(customer.customerEmail) : customer.customerEmail != null)
            return false;
        if (customerName != null ? !customerName.equals(customer.customerName) : customer.customerName != null)
            return false;
        if (district != null ? !district.equals(customer.district) : customer.district != null) return false;
        if (mobileNo != null ? !mobileNo.equals(customer.mobileNo) : customer.mobileNo != null) return false;
        if (province != null ? !province.equals(customer.province) : customer.province != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = customerId != null ? customerId.hashCode() : 0;
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (customerAddress != null ? customerAddress.hashCode() : 0);
        result = 31 * result + (customerEmail != null ? customerEmail.hashCode() : 0);
        result = 31 * result + (customerName != null ? customerName.hashCode() : 0);
        result = 31 * result + (district != null ? district.hashCode() : 0);
        result = 31 * result + (mobileNo != null ? mobileNo.hashCode() : 0);
        result = 31 * result + (province != null ? province.hashCode() : 0);
        return result;
    }
}
