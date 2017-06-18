package com.zambrone.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by Chamith on 18/06/2017.
 */
@Entity
public class Feedback {
    private Integer fbid;
    private Double dlvrRate;
    private String email;
    private String issues;
    private String name;
    private String other;
    private Double priceRate;
    private Double productRate;
    private Double serviceRate;
    private String tel;

    @Id
    @Column(name = "fbid")
    public Integer getFbid() {
        return fbid;
    }

    public void setFbid(Integer fbid) {
        this.fbid = fbid;
    }

    @Basic
    @Column(name = "dlvrRate")
    public Double getDlvrRate() {
        return dlvrRate;
    }

    public void setDlvrRate(Double dlvrRate) {
        this.dlvrRate = dlvrRate;
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
    @Column(name = "issues")
    public String getIssues() {
        return issues;
    }

    public void setIssues(String issues) {
        this.issues = issues;
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
    @Column(name = "other")
    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

    @Basic
    @Column(name = "priceRate")
    public Double getPriceRate() {
        return priceRate;
    }

    public void setPriceRate(Double priceRate) {
        this.priceRate = priceRate;
    }

    @Basic
    @Column(name = "productRate")
    public Double getProductRate() {
        return productRate;
    }

    public void setProductRate(Double productRate) {
        this.productRate = productRate;
    }

    @Basic
    @Column(name = "serviceRate")
    public Double getServiceRate() {
        return serviceRate;
    }

    public void setServiceRate(Double serviceRate) {
        this.serviceRate = serviceRate;
    }

    @Basic
    @Column(name = "tel")
    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Feedback feedback = (Feedback) o;

        if (fbid != null ? !fbid.equals(feedback.fbid) : feedback.fbid != null) return false;
        if (dlvrRate != null ? !dlvrRate.equals(feedback.dlvrRate) : feedback.dlvrRate != null) return false;
        if (email != null ? !email.equals(feedback.email) : feedback.email != null) return false;
        if (issues != null ? !issues.equals(feedback.issues) : feedback.issues != null) return false;
        if (name != null ? !name.equals(feedback.name) : feedback.name != null) return false;
        if (other != null ? !other.equals(feedback.other) : feedback.other != null) return false;
        if (priceRate != null ? !priceRate.equals(feedback.priceRate) : feedback.priceRate != null) return false;
        if (productRate != null ? !productRate.equals(feedback.productRate) : feedback.productRate != null)
            return false;
        if (serviceRate != null ? !serviceRate.equals(feedback.serviceRate) : feedback.serviceRate != null)
            return false;
        if (tel != null ? !tel.equals(feedback.tel) : feedback.tel != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = fbid != null ? fbid.hashCode() : 0;
        result = 31 * result + (dlvrRate != null ? dlvrRate.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (issues != null ? issues.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (other != null ? other.hashCode() : 0);
        result = 31 * result + (priceRate != null ? priceRate.hashCode() : 0);
        result = 31 * result + (productRate != null ? productRate.hashCode() : 0);
        result = 31 * result + (serviceRate != null ? serviceRate.hashCode() : 0);
        result = 31 * result + (tel != null ? tel.hashCode() : 0);
        return result;
    }
}
