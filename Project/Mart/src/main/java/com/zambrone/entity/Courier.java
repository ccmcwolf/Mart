package com.zambrone.entity;

import javax.persistence.*;

/**
 * Created by Chamith on 24/09/2017.
 */
@Entity
public class Courier {
    private Integer courierId;
    private String city;
    private String nic;
    private String address;
    private String contactNo;
    private String vehicleNo;
    private String courierName;
    private String email;
    private String province;
    private String imagepath;

    @Id
    @Column(name = "courier_id")
    @GeneratedValue(strategy= GenerationType.AUTO)
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
    @Column(name = "nic")
    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
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
    @Column(name = "contact_no")
    public String getContactNo() {
        return contactNo;
    }

    public void setContactNo(String contactNo) {
        this.contactNo = contactNo;
    }

    @Basic
    @Column(name = "vehicle_no")
    public String getVehicleNo() {
        return vehicleNo;
    }

    public void setVehicleNo(String vehicleNo) {
        this.vehicleNo = vehicleNo;
    }

    @Basic
    @Column(name = "courier_name")
    public String getCourierName() {
        return courierName;
    }

    public void setCourierName(String courierName) {
        this.courierName = courierName;
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

    @Basic
    @Column(name = "imagepath")
    public String getImagepath() {
        return imagepath;
    }

    public void setImagepath(String imagepath) {
        this.imagepath = imagepath;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Courier courier = (Courier) o;

        if (courierId != null ? !courierId.equals(courier.courierId) : courier.courierId != null) return false;
        if (city != null ? !city.equals(courier.city) : courier.city != null) return false;
        if (nic != null ? !nic.equals(courier.nic) : courier.nic != null) return false;
        if (address != null ? !address.equals(courier.address) : courier.address != null) return false;
        if (contactNo != null ? !contactNo.equals(courier.contactNo) : courier.contactNo != null) return false;
        if (vehicleNo != null ? !vehicleNo.equals(courier.vehicleNo) : courier.vehicleNo != null) return false;
        if (courierName != null ? !courierName.equals(courier.courierName) : courier.courierName != null) return false;
        if (email != null ? !email.equals(courier.email) : courier.email != null) return false;
        if (province != null ? !province.equals(courier.province) : courier.province != null) return false;
        if (imagepath != null ? !imagepath.equals(courier.imagepath) : courier.imagepath != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = courierId != null ? courierId.hashCode() : 0;
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (nic != null ? nic.hashCode() : 0);
        result = 31 * result + (address != null ? address.hashCode() : 0);
        result = 31 * result + (contactNo != null ? contactNo.hashCode() : 0);
        result = 31 * result + (vehicleNo != null ? vehicleNo.hashCode() : 0);
        result = 31 * result + (courierName != null ? courierName.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (province != null ? province.hashCode() : 0);
        result = 31 * result + (imagepath != null ? imagepath.hashCode() : 0);
        return result;
    }
}
