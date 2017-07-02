package com.zambrone.entity;

import lombok.ToString;

import javax.persistence.*;

/**
 * Created by Chamith on 02/07/2017.
 */
@Entity
@ToString
@Table(name = "product_order", schema = "mart", catalog = "")
public class ProductOrder {
    private Integer productOrderId;
    private Integer orderOrderNo;
    private Integer quantity;
    private Double unitPrice;
    private Integer productId;

    @Id
    @Column(name = "productOrderId")
    public Integer getProductOrderId() {
        return productOrderId;
    }

    public void setProductOrderId(Integer productOrderId) {
        this.productOrderId = productOrderId;
    }

    @Basic
    @Column(name = "orderOrderNo")
    public Integer getOrderOrderNo() {
        return orderOrderNo;
    }

    public void setOrderOrderNo(Integer orderOrderNo) {
        this.orderOrderNo = orderOrderNo;
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
    @Column(name = "unitPrice")
    public Double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    @Basic
    @Column(name = "productId")
    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProductOrder that = (ProductOrder) o;

        if (productOrderId != null ? !productOrderId.equals(that.productOrderId) : that.productOrderId != null)
            return false;
        if (orderOrderNo != null ? !orderOrderNo.equals(that.orderOrderNo) : that.orderOrderNo != null) return false;
        if (quantity != null ? !quantity.equals(that.quantity) : that.quantity != null) return false;
        if (unitPrice != null ? !unitPrice.equals(that.unitPrice) : that.unitPrice != null) return false;
        if (productId != null ? !productId.equals(that.productId) : that.productId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = productOrderId != null ? productOrderId.hashCode() : 0;
        result = 31 * result + (orderOrderNo != null ? orderOrderNo.hashCode() : 0);
        result = 31 * result + (quantity != null ? quantity.hashCode() : 0);
        result = 31 * result + (unitPrice != null ? unitPrice.hashCode() : 0);
        result = 31 * result + (productId != null ? productId.hashCode() : 0);
        return result;
    }
}
