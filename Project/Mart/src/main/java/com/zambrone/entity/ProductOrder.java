package com.zambrone.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by Chamith on 04/07/2017.
 */
@Entity
@Table(name = "product_order", schema = "mart", catalog = "")
public class ProductOrder {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer productOrderid;
    private Integer orderId;
    private Integer quantity;
    private Double unitPrice;
    private Integer productId;


    @Column(name = "product_orderid")
    public Integer getProductOrderid() {
        return productOrderid;
    }

    public void setProductOrderid(Integer productOrderid) {
        this.productOrderid = productOrderid;
    }

    @Basic
    @Column(name = "order_id")
    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    @Basic
    @Column(name = "quantity")
    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    @Basic
    @Column(name = "unit_price")
    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    @Basic
    @Column(name = "product_id")
    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    @Override
    public String toString() {
        return "ProductOrder{" +
                "productOrderid=" + productOrderid +
                ", orderId=" + orderId +
                ", quantity=" + quantity +
                ", unitPrice=" + unitPrice +
                ", productId=" + productId +
                '}';
    }
}
