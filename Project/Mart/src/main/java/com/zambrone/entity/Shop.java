package com.zambrone.entity;

import javax.persistence.*;
import java.sql.Time;

/**
 * Created by Chamith on 24/09/2017.
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
    private String shoplogoPath;
    private String shopcoverPath;
    private Time openTime;
    private Time closeTime;
    private String opendayFrom;
    private String opendayTo;
    private String description;

    @Id
    @Column(name = "shop_no")
    @GeneratedValue(strategy= GenerationType.AUTO)
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
    @Column(name = "contact_no")
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
    @Column(name = "shop_name")
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
    @Column(name = "shoplogo_path")
    public String getShoplogoPath() {
        return shoplogoPath;
    }

    public void setShoplogoPath(String shoplogoPath) {
        this.shoplogoPath = shoplogoPath;
    }

    @Basic
    @Column(name = "shopcover_path")
    public String getShopcoverPath() {
        return shopcoverPath;
    }

    public void setShopcoverPath(String shopcoverPath) {
        this.shopcoverPath = shopcoverPath;
    }

    @Basic
    @Column(name = "open_time")
    public Time getOpenTime() {
        return openTime;
    }

    public void setOpenTime(Time openTime) {
        this.openTime = openTime;
    }

    @Basic
    @Column(name = "close_time")
    public Time getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(Time closeTime) {
        this.closeTime = closeTime;
    }

    @Basic
    @Column(name = "openday_from")
    public String getOpendayFrom() {
        return opendayFrom;
    }

    public void setOpendayFrom(String opendayFrom) {
        this.opendayFrom = opendayFrom;
    }

    @Basic
    @Column(name = "openday_to")
    public String getOpendayTo() {
        return opendayTo;
    }

    public void setOpendayTo(String opendayTo) {
        this.opendayTo = opendayTo;
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
        if (shoplogoPath != null ? !shoplogoPath.equals(shop.shoplogoPath) : shop.shoplogoPath != null) return false;
        if (shopcoverPath != null ? !shopcoverPath.equals(shop.shopcoverPath) : shop.shopcoverPath != null)
            return false;
        if (openTime != null ? !openTime.equals(shop.openTime) : shop.openTime != null) return false;
        if (closeTime != null ? !closeTime.equals(shop.closeTime) : shop.closeTime != null) return false;
        if (opendayFrom != null ? !opendayFrom.equals(shop.opendayFrom) : shop.opendayFrom != null) return false;
        if (opendayTo != null ? !opendayTo.equals(shop.opendayTo) : shop.opendayTo != null) return false;
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
        result = 31 * result + (shoplogoPath != null ? shoplogoPath.hashCode() : 0);
        result = 31 * result + (shopcoverPath != null ? shopcoverPath.hashCode() : 0);
        result = 31 * result + (openTime != null ? openTime.hashCode() : 0);
        result = 31 * result + (closeTime != null ? closeTime.hashCode() : 0);
        result = 31 * result + (opendayFrom != null ? opendayFrom.hashCode() : 0);
        result = 31 * result + (opendayTo != null ? opendayTo.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        return result;
    }
}
