package com.zambrone.entity;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by Chamith on 04/07/2017.
 */
@Entity
public class Orders {
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
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "order_no")
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
    @Column(name = "courier_charj")
    public Double getCourierCharj() {
        return courierCharj;
    }

    public void setCourierCharj(Double courierCharj) {
        this.courierCharj = courierCharj;
    }

    @Basic
    @Column(name = "courier_payment_settled_date")
    public Timestamp getCourierPaymentSettledDate() {
        return courierPaymentSettledDate;
    }

    public void setCourierPaymentSettledDate(Timestamp courierPaymentSettledDate) {
        this.courierPaymentSettledDate = courierPaymentSettledDate;
    }

    @Basic
    @Column(name = "courier_tracking_no")
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
    @Column(name = "delivery_address")
    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    @Basic
    @Column(name = "delivery_email")
    public String getDeliveryEmail() {
        return deliveryEmail;
    }

    public void setDeliveryEmail(String deliveryEmail) {
        this.deliveryEmail = deliveryEmail;
    }

    @Basic
    @Column(name = "delivery_name")
    public String getDeliveryName() {
        return deliveryName;
    }

    public void setDeliveryName(String deliveryName) {
        this.deliveryName = deliveryName;
    }

    @Basic
    @Column(name = "delivery_telephone_no")
    public String getDeliveryTelephoneNo() {
        return deliveryTelephoneNo;
    }

    public void setDeliveryTelephoneNo(String deliveryTelephoneNo) {
        this.deliveryTelephoneNo = deliveryTelephoneNo;
    }

    @Basic
    @Column(name = "delvery_cost")
    public Double getDelveryCost() {
        return delveryCost;
    }

    public void setDelveryCost(Double delveryCost) {
        this.delveryCost = delveryCost;
    }

    @Basic
    @Column(name = "delvery_vat")
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
    @Column(name = "shop_payment_settled_date")
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
    @Column(name = "service_charg")
    public Double getServiceCharg() {
        return serviceCharg;
    }

    public void setServiceCharg(Double serviceCharg) {
        this.serviceCharg = serviceCharg;
    }

    @Basic
    @Column(name = "special_request")
    public String getSpecialRequest() {
        return specialRequest;
    }

    public void setSpecialRequest(String specialRequest) {
        this.specialRequest = specialRequest;
    }

    @Basic
    @Column(name = "status_courier")
    public String getStatusCourier() {
        return statusCourier;
    }

    public void setStatusCourier(String statusCourier) {
        this.statusCourier = statusCourier;
    }

    @Basic
    @Column(name = "status_description")
    public String getStatusDescription() {
        return statusDescription;
    }

    public void setStatusDescription(String statusDescription) {
        this.statusDescription = statusDescription;
    }

    @Basic
    @Column(name = "status_shop")
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
    @Column(name = "courier_id")
    public Integer getCourierId() {
        return courierId;
    }

    public void setCourierId(Integer courierId) {
        this.courierId = courierId;
    }

    @Basic
    @Column(name = "customer_email")
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
    @Column(name = "shop_no")
    public Integer getShopNo() {
        return shopNo;
    }

    public void setShopNo(Integer shopNo) {
        this.shopNo = shopNo;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "orderNo=" + orderNo +
                ", amount=" + amount +
                ", city='" + city + '\'' +
                ", courierCharj=" + courierCharj +
                ", courierPaymentSettledDate=" + courierPaymentSettledDate +
                ", courierTrackingNo='" + courierTrackingNo + '\'' +
                ", date=" + date +
                ", deliveryAddress='" + deliveryAddress + '\'' +
                ", deliveryEmail='" + deliveryEmail + '\'' +
                ", deliveryName='" + deliveryName + '\'' +
                ", deliveryTelephoneNo='" + deliveryTelephoneNo + '\'' +
                ", delveryCost=" + delveryCost +
                ", delveryVat=" + delveryVat +
                ", district='" + district + '\'' +
                ", shopPaymentSettledDate=" + shopPaymentSettledDate +
                ", province='" + province + '\'' +
                ", serviceCharg=" + serviceCharg +
                ", specialRequest='" + specialRequest + '\'' +
                ", statusCourier='" + statusCourier + '\'' +
                ", statusDescription='" + statusDescription + '\'' +
                ", statusShop='" + statusShop + '\'' +
                ", vat=" + vat +
                ", courierId=" + courierId +
                ", customerEmail='" + customerEmail + '\'' +
                ", deliveryOptionid=" + deliveryOptionid +
                ", shopNo=" + shopNo +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Orders orders = (Orders) o;

        if (orderNo != null ? !orderNo.equals(orders.orderNo) : orders.orderNo != null) return false;
        if (amount != null ? !amount.equals(orders.amount) : orders.amount != null) return false;
        if (city != null ? !city.equals(orders.city) : orders.city != null) return false;
        if (courierCharj != null ? !courierCharj.equals(orders.courierCharj) : orders.courierCharj != null) return false;
        if (courierPaymentSettledDate != null ? !courierPaymentSettledDate.equals(orders.courierPaymentSettledDate) : orders.courierPaymentSettledDate != null)
            return false;
        if (courierTrackingNo != null ? !courierTrackingNo.equals(orders.courierTrackingNo) : orders.courierTrackingNo != null)
            return false;
        if (date != null ? !date.equals(orders.date) : orders.date != null) return false;
        if (deliveryAddress != null ? !deliveryAddress.equals(orders.deliveryAddress) : orders.deliveryAddress != null)
            return false;
        if (deliveryEmail != null ? !deliveryEmail.equals(orders.deliveryEmail) : orders.deliveryEmail != null)
            return false;
        if (deliveryName != null ? !deliveryName.equals(orders.deliveryName) : orders.deliveryName != null) return false;
        if (deliveryTelephoneNo != null ? !deliveryTelephoneNo.equals(orders.deliveryTelephoneNo) : orders.deliveryTelephoneNo != null)
            return false;
        if (delveryCost != null ? !delveryCost.equals(orders.delveryCost) : orders.delveryCost != null) return false;
        if (delveryVat != null ? !delveryVat.equals(orders.delveryVat) : orders.delveryVat != null) return false;
        if (district != null ? !district.equals(orders.district) : orders.district != null) return false;
        if (shopPaymentSettledDate != null ? !shopPaymentSettledDate.equals(orders.shopPaymentSettledDate) : orders.shopPaymentSettledDate != null)
            return false;
        if (province != null ? !province.equals(orders.province) : orders.province != null) return false;
        if (serviceCharg != null ? !serviceCharg.equals(orders.serviceCharg) : orders.serviceCharg != null) return false;
        if (specialRequest != null ? !specialRequest.equals(orders.specialRequest) : orders.specialRequest != null)
            return false;
        if (statusCourier != null ? !statusCourier.equals(orders.statusCourier) : orders.statusCourier != null)
            return false;
        if (statusDescription != null ? !statusDescription.equals(orders.statusDescription) : orders.statusDescription != null)
            return false;
        if (statusShop != null ? !statusShop.equals(orders.statusShop) : orders.statusShop != null) return false;
        if (vat != null ? !vat.equals(orders.vat) : orders.vat != null) return false;
        if (courierId != null ? !courierId.equals(orders.courierId) : orders.courierId != null) return false;
        if (customerEmail != null ? !customerEmail.equals(orders.customerEmail) : orders.customerEmail != null)
            return false;
        if (deliveryOptionid != null ? !deliveryOptionid.equals(orders.deliveryOptionid) : orders.deliveryOptionid != null)
            return false;
        if (shopNo != null ? !shopNo.equals(orders.shopNo) : orders.shopNo != null) return false;

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
