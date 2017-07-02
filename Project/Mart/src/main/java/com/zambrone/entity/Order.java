package com.zambrone.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.sql.Timestamp;

/**
 * Created by Chamith on 02/07/2017.
 */
@Entity
public class Order {
    private Integer orderNo;
    private Double amount;
    private String city;
    private Double courierCharj;
    private Timestamp courierPaymentSettledDate;
    private String courierTrackingNo;
    private Timestamp date;
    private String deliveryAddress;
    private String deliveryEmail;
    private String deliveryName;
    private String deliveryTelephoneNo;
    private Double delveryCost;
    private Double delveryVat;
    private String district;
    private Timestamp shopPaymentSettledDate;
    private String province;
    private Double serviceCharg;
    private String specialRequest;
    private String statusCourier;
    private String statusDescription;
    private String statusShop;
    private Double vat;
    private Integer courierId;
    private String customerEmail;
    private Integer deliveryOptionid;
    private Integer shopNo;

    @Id
    @Column(name = "orderNo")
    public Integer getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(Integer orderNo) {
        this.orderNo = orderNo;
    }

    @Basic
    @Column(name = "amount")
    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
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
    @Column(name = "courierCharj")
    public Double getCourierCharj() {
        return courierCharj;
    }

    public void setCourierCharj(Double courierCharj) {
        this.courierCharj = courierCharj;
    }

    @Basic
    @Column(name = "courierPaymentSettledDate")
    public Timestamp getCourierPaymentSettledDate() {
        return courierPaymentSettledDate;
    }

    public void setCourierPaymentSettledDate(Timestamp courierPaymentSettledDate) {
        this.courierPaymentSettledDate = courierPaymentSettledDate;
    }

    @Basic
    @Column(name = "courierTrackingNo")
    public String getCourierTrackingNo() {
        return courierTrackingNo;
    }

    public void setCourierTrackingNo(String courierTrackingNo) {
        this.courierTrackingNo = courierTrackingNo;
    }

    @Basic
    @Column(name = "date")
    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    @Basic
    @Column(name = "deliveryAddress")
    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    @Basic
    @Column(name = "deliveryEmail")
    public String getDeliveryEmail() {
        return deliveryEmail;
    }

    public void setDeliveryEmail(String deliveryEmail) {
        this.deliveryEmail = deliveryEmail;
    }

    @Basic
    @Column(name = "deliveryName")
    public String getDeliveryName() {
        return deliveryName;
    }

    public void setDeliveryName(String deliveryName) {
        this.deliveryName = deliveryName;
    }

    @Basic
    @Column(name = "deliveryTelephoneNo")
    public String getDeliveryTelephoneNo() {
        return deliveryTelephoneNo;
    }

    public void setDeliveryTelephoneNo(String deliveryTelephoneNo) {
        this.deliveryTelephoneNo = deliveryTelephoneNo;
    }

    @Basic
    @Column(name = "delveryCost")
    public Double getDelveryCost() {
        return delveryCost;
    }

    public void setDelveryCost(Double delveryCost) {
        this.delveryCost = delveryCost;
    }

    @Basic
    @Column(name = "delveryVat")
    public Double getDelveryVat() {
        return delveryVat;
    }

    public void setDelveryVat(Double delveryVat) {
        this.delveryVat = delveryVat;
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
    @Column(name = "shopPaymentSettledDate")
    public Timestamp getShopPaymentSettledDate() {
        return shopPaymentSettledDate;
    }

    public void setShopPaymentSettledDate(Timestamp shopPaymentSettledDate) {
        this.shopPaymentSettledDate = shopPaymentSettledDate;
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
    @Column(name = "serviceCharg")
    public Double getServiceCharg() {
        return serviceCharg;
    }

    public void setServiceCharg(Double serviceCharg) {
        this.serviceCharg = serviceCharg;
    }

    @Basic
    @Column(name = "specialRequest")
    public String getSpecialRequest() {
        return specialRequest;
    }

    public void setSpecialRequest(String specialRequest) {
        this.specialRequest = specialRequest;
    }

    @Basic
    @Column(name = "statusCourier")
    public String getStatusCourier() {
        return statusCourier;
    }

    public void setStatusCourier(String statusCourier) {
        this.statusCourier = statusCourier;
    }

    @Basic
    @Column(name = "statusDescription")
    public String getStatusDescription() {
        return statusDescription;
    }

    public void setStatusDescription(String statusDescription) {
        this.statusDescription = statusDescription;
    }

    @Basic
    @Column(name = "statusShop")
    public String getStatusShop() {
        return statusShop;
    }

    public void setStatusShop(String statusShop) {
        this.statusShop = statusShop;
    }

    @Basic
    @Column(name = "vat")
    public Double getVat() {
        return vat;
    }

    public void setVat(Double vat) {
        this.vat = vat;
    }

    @Basic
    @Column(name = "courierId")
    public Integer getCourierId() {
        return courierId;
    }

    public void setCourierId(Integer courierId) {
        this.courierId = courierId;
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
    @Column(name = "delivery_optionid")
    public Integer getDeliveryOptionid() {
        return deliveryOptionid;
    }

    public void setDeliveryOptionid(Integer deliveryOptionid) {
        this.deliveryOptionid = deliveryOptionid;
    }

    @Basic
    @Column(name = "shopNo")
    public Integer getShopNo() {
        return shopNo;
    }

    public void setShopNo(Integer shopNo) {
        this.shopNo = shopNo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Order order = (Order) o;

        if (orderNo != null ? !orderNo.equals(order.orderNo) : order.orderNo != null) return false;
        if (amount != null ? !amount.equals(order.amount) : order.amount != null) return false;
        if (city != null ? !city.equals(order.city) : order.city != null) return false;
        if (courierCharj != null ? !courierCharj.equals(order.courierCharj) : order.courierCharj != null) return false;
        if (courierPaymentSettledDate != null ? !courierPaymentSettledDate.equals(order.courierPaymentSettledDate) : order.courierPaymentSettledDate != null)
            return false;
        if (courierTrackingNo != null ? !courierTrackingNo.equals(order.courierTrackingNo) : order.courierTrackingNo != null)
            return false;
        if (date != null ? !date.equals(order.date) : order.date != null) return false;
        if (deliveryAddress != null ? !deliveryAddress.equals(order.deliveryAddress) : order.deliveryAddress != null)
            return false;
        if (deliveryEmail != null ? !deliveryEmail.equals(order.deliveryEmail) : order.deliveryEmail != null)
            return false;
        if (deliveryName != null ? !deliveryName.equals(order.deliveryName) : order.deliveryName != null) return false;
        if (deliveryTelephoneNo != null ? !deliveryTelephoneNo.equals(order.deliveryTelephoneNo) : order.deliveryTelephoneNo != null)
            return false;
        if (delveryCost != null ? !delveryCost.equals(order.delveryCost) : order.delveryCost != null) return false;
        if (delveryVat != null ? !delveryVat.equals(order.delveryVat) : order.delveryVat != null) return false;
        if (district != null ? !district.equals(order.district) : order.district != null) return false;
        if (shopPaymentSettledDate != null ? !shopPaymentSettledDate.equals(order.shopPaymentSettledDate) : order.shopPaymentSettledDate != null)
            return false;
        if (province != null ? !province.equals(order.province) : order.province != null) return false;
        if (serviceCharg != null ? !serviceCharg.equals(order.serviceCharg) : order.serviceCharg != null) return false;
        if (specialRequest != null ? !specialRequest.equals(order.specialRequest) : order.specialRequest != null)
            return false;
        if (statusCourier != null ? !statusCourier.equals(order.statusCourier) : order.statusCourier != null)
            return false;
        if (statusDescription != null ? !statusDescription.equals(order.statusDescription) : order.statusDescription != null)
            return false;
        if (statusShop != null ? !statusShop.equals(order.statusShop) : order.statusShop != null) return false;
        if (vat != null ? !vat.equals(order.vat) : order.vat != null) return false;
        if (courierId != null ? !courierId.equals(order.courierId) : order.courierId != null) return false;
        if (customerEmail != null ? !customerEmail.equals(order.customerEmail) : order.customerEmail != null)
            return false;
        if (deliveryOptionid != null ? !deliveryOptionid.equals(order.deliveryOptionid) : order.deliveryOptionid != null)
            return false;
        if (shopNo != null ? !shopNo.equals(order.shopNo) : order.shopNo != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = orderNo != null ? orderNo.hashCode() : 0;
        result = 31 * result + (amount != null ? amount.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (courierCharj != null ? courierCharj.hashCode() : 0);
        result = 31 * result + (courierPaymentSettledDate != null ? courierPaymentSettledDate.hashCode() : 0);
        result = 31 * result + (courierTrackingNo != null ? courierTrackingNo.hashCode() : 0);
        result = 31 * result + (date != null ? date.hashCode() : 0);
        result = 31 * result + (deliveryAddress != null ? deliveryAddress.hashCode() : 0);
        result = 31 * result + (deliveryEmail != null ? deliveryEmail.hashCode() : 0);
        result = 31 * result + (deliveryName != null ? deliveryName.hashCode() : 0);
        result = 31 * result + (deliveryTelephoneNo != null ? deliveryTelephoneNo.hashCode() : 0);
        result = 31 * result + (delveryCost != null ? delveryCost.hashCode() : 0);
        result = 31 * result + (delveryVat != null ? delveryVat.hashCode() : 0);
        result = 31 * result + (district != null ? district.hashCode() : 0);
        result = 31 * result + (shopPaymentSettledDate != null ? shopPaymentSettledDate.hashCode() : 0);
        result = 31 * result + (province != null ? province.hashCode() : 0);
        result = 31 * result + (serviceCharg != null ? serviceCharg.hashCode() : 0);
        result = 31 * result + (specialRequest != null ? specialRequest.hashCode() : 0);
        result = 31 * result + (statusCourier != null ? statusCourier.hashCode() : 0);
        result = 31 * result + (statusDescription != null ? statusDescription.hashCode() : 0);
        result = 31 * result + (statusShop != null ? statusShop.hashCode() : 0);
        result = 31 * result + (vat != null ? vat.hashCode() : 0);
        result = 31 * result + (courierId != null ? courierId.hashCode() : 0);
        result = 31 * result + (customerEmail != null ? customerEmail.hashCode() : 0);
        result = 31 * result + (deliveryOptionid != null ? deliveryOptionid.hashCode() : 0);
        result = 31 * result + (shopNo != null ? shopNo.hashCode() : 0);
        return result;
    }
}
