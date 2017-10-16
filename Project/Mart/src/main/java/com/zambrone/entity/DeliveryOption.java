package com.zambrone.entity;

import javax.persistence.*;

/**
 * Created by Chamith on 24/09/2017.
 */
@Entity
@Table(name = "delivery_option", schema = "mart", catalog = "")
public class DeliveryOption {
    private Integer deliveryOptionid;
    private Double cost;
    private String description;
    private String typeName;

    @Id
    @Column(name = "delivery_optionid")
    @GeneratedValue(strategy= GenerationType.AUTO)
    public Integer getDeliveryOptionid() {
        return deliveryOptionid;
    }

    public void setDeliveryOptionid(Integer deliveryOptionid) {
        this.deliveryOptionid = deliveryOptionid;
    }

    @Basic
    @Column(name = "cost")
    public Double getCost() {
        return cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
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
    @Column(name = "type_name")
    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DeliveryOption that = (DeliveryOption) o;

        if (deliveryOptionid != null ? !deliveryOptionid.equals(that.deliveryOptionid) : that.deliveryOptionid != null)
            return false;
        if (cost != null ? !cost.equals(that.cost) : that.cost != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (typeName != null ? !typeName.equals(that.typeName) : that.typeName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = deliveryOptionid != null ? deliveryOptionid.hashCode() : 0;
        result = 31 * result + (cost != null ? cost.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (typeName != null ? typeName.hashCode() : 0);
        return result;
    }
}
