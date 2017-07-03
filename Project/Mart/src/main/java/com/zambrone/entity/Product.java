package com.zambrone.entity;

import lombok.Data;
import lombok.ToString;

import javax.persistence.*;

/**
 * Created by Chamith on 03/07/2017.
 */
@Entity
@ToString
public class Product {


    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer productId;
    private String name;
    private String description;
    private String otherName;
    private String imagePath;
    private Integer shopId;
    private String size;
    private Double unitPrice;
    private Integer typeId;
    private String otherId;
    private String availablilty;

    @Id
    @Column(name = "productId")
    public Integer getProductId() {
        return productId;
    }

    public void setProductId(Integer productId) {
        this.productId = productId;
    }

    @Basic
    @Column(name = "name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "other_name")
    public String getOtherName() {
        return otherName;
    }

    public void setOtherName(String otherName) {
        this.otherName = otherName;
    }

    @Basic
    @Column(name = "imagePath")
    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }

    @Basic
    @Column(name = "shopId")
    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    @Basic
    @Column(name = "size")
    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
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
    @Column(name = "typeId")
    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    @Basic
    @Column(name = "otherId")
    public String getOtherId() {
        return otherId;
    }

    public void setOtherId(String otherId) {
        this.otherId = otherId;
    }

    @Basic
    @Column(name = "availablilty")
    public String getAvailablilty() {
        return availablilty;
    }

    public void setAvailablilty(String availablilty) {
        this.availablilty = availablilty;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Product product = (Product) o;

        if (productId != null ? !productId.equals(product.productId) : product.productId != null) return false;
        if (name != null ? !name.equals(product.name) : product.name != null) return false;
        if (description != null ? !description.equals(product.description) : product.description != null) return false;
        if (otherName != null ? !otherName.equals(product.otherName) : product.otherName != null) return false;
        if (imagePath != null ? !imagePath.equals(product.imagePath) : product.imagePath != null) return false;
        if (shopId != null ? !shopId.equals(product.shopId) : product.shopId != null) return false;
        if (size != null ? !size.equals(product.size) : product.size != null) return false;
        if (unitPrice != null ? !unitPrice.equals(product.unitPrice) : product.unitPrice != null) return false;
        if (typeId != null ? !typeId.equals(product.typeId) : product.typeId != null) return false;
        if (otherId != null ? !otherId.equals(product.otherId) : product.otherId != null) return false;
        if (availablilty != null ? !availablilty.equals(product.availablilty) : product.availablilty != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = productId != null ? productId.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (otherName != null ? otherName.hashCode() : 0);
        result = 31 * result + (imagePath != null ? imagePath.hashCode() : 0);
        result = 31 * result + (shopId != null ? shopId.hashCode() : 0);
        result = 31 * result + (size != null ? size.hashCode() : 0);
        result = 31 * result + (unitPrice != null ? unitPrice.hashCode() : 0);
        result = 31 * result + (typeId != null ? typeId.hashCode() : 0);
        result = 31 * result + (otherId != null ? otherId.hashCode() : 0);
        result = 31 * result + (availablilty != null ? availablilty.hashCode() : 0);
        return result;
    }
}

