package com.zambrone.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Time;

/**
 * Created by Chamith on 03/07/2017.
 */
@Entity
public class Shop {
    private Integer shopNo;
    private String address;
    private String city;
    private Integer contactNo;
    private String district;
    private String email;
    private String shopName;
    private String province;
    private String category;
    private String shoplogopath;
    private String shopcoverpath;
    private Time opentime;
    private Time closetime;
    private String opendayfrom;
    private String opendayto;
    private String description;

    @Id
    @Column(name = "shopNo")
    public Integer getShopNo() {
        return shopNo;
    }

    public void setShopNo(Integer shopNo) {
        this.shopNo = shopNo;
    }

    @Basic
    @Column(name = "address")
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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
    @Column(name = "shopName")
    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    @Basic
    @Column(name = "province")
    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    @Basic
    @Column(name = "category")
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Basic
    @Column(name = "shoplogopath")
    public String getShoplogopath() {
        return shoplogopath;
    }

    public void setShoplogopath(String shoplogopath) {
        this.shoplogopath = shoplogopath;
    }

    @Basic
    @Column(name = "shopcoverpath")
    public String getShopcoverpath() {
        return shopcoverpath;
    }

    public void setShopcoverpath(String shopcoverpath) {
        this.shopcoverpath = shopcoverpath;
    }

    @Basic
    @Column(name = "opentime")
    public Time getOpentime() {
        return opentime;
    }

    public void setOpentime(Time opentime) {
        this.opentime = opentime;
    }

    @Basic
    @Column(name = "closetime")
    public Time getClosetime() {
        return closetime;
    }

    public void setClosetime(Time closetime) {
        this.closetime = closetime;
    }

    @Basic
    @Column(name = "opendayfrom")
    public String getOpendayfrom() {
        return opendayfrom;
    }

    public void setOpendayfrom(String opendayfrom) {
        this.opendayfrom = opendayfrom;
    }

    @Basic
    @Column(name = "opendayto")
    public String getOpendayto() {
        return opendayto;
    }

    public void setOpendayto(String opendayto) {
        this.opendayto = opendayto;
    }

    @Basic
    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Shop shop = (Shop) o;

        if (shopNo != null ? !shopNo.equals(shop.shopNo) : shop.shopNo != null) return false;
        if (address != null ? !address.equals(shop.address) : shop.address != null) return false;
        if (city != null ? !city.equals(shop.city) : shop.city != null) return false;
        if (contactNo != null ? !contactNo.equals(shop.contactNo) : shop.contactNo != null) return false;
        if (district != null ? !district.equals(shop.district) : shop.district != null) return false;
        if (email != null ? !email.equals(shop.email) : shop.email != null) return false;
        if (shopName != null ? !shopName.equals(shop.shopName) : shop.shopName != null) return false;
        if (province != null ? !province.equals(shop.province) : shop.province != null) return false;
        if (category != null ? !category.equals(shop.category) : shop.category != null) return false;
        if (shoplogopath != null ? !shoplogopath.equals(shop.shoplogopath) : shop.shoplogopath != null) return false;
        if (shopcoverpath != null ? !shopcoverpath.equals(shop.shopcoverpath) : shop.shopcoverpath != null)
            return false;
        if (opentime != null ? !opentime.equals(shop.opentime) : shop.opentime != null) return false;
        if (closetime != null ? !closetime.equals(shop.closetime) : shop.closetime != null) return false;
        if (opendayfrom != null ? !opendayfrom.equals(shop.opendayfrom) : shop.opendayfrom != null) return false;
        if (opendayto != null ? !opendayto.equals(shop.opendayto) : shop.opendayto != null) return false;
        if (description != null ? !description.equals(shop.description) : shop.description != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = shopNo != null ? shopNo.hashCode() : 0;
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (contactNo != null ? contactNo.hashCode() : 0);
        result = 31 * result + (district != null ? district.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (shopName != null ? shopName.hashCode() : 0);
        result = 31 * result + (province != null ? province.hashCode() : 0);
        result = 31 * result + (category != null ? category.hashCode() : 0);
        result = 31 * result + (shoplogopath != null ? shoplogopath.hashCode() : 0);
        result = 31 * result + (shopcoverpath != null ? shopcoverpath.hashCode() : 0);
        result = 31 * result + (opentime != null ? opentime.hashCode() : 0);
        result = 31 * result + (closetime != null ? closetime.hashCode() : 0);
        result = 31 * result + (opendayfrom != null ? opendayfrom.hashCode() : 0);
        result = 31 * result + (opendayto != null ? opendayto.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        return result;
    }
}
