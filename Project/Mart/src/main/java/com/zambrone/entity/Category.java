package com.zambrone.entity;

import javax.persistence.*;

/**
 * Created by Chamith on 24/09/2017.
 */
@Entity
@Table
public class Category {
    private Integer categoryId;
    private String categoryName;
    private String tag;
    private String tag1;
    private String tag3;

    @Id
    @Column(name = "category_id")
    @GeneratedValue(strategy= GenerationType.AUTO)
    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    @Basic
    @Column(name = "category_name")
    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    @Basic
    @Column(name = "tag")
    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    @Basic
    @Column(name = "tag1")
    public String getTag1() {
        return tag1;
    }

    public void setTag1(String tag1) {
        this.tag1 = tag1;
    }

    @Basic
    @Column(name = "tag3")
    public String getTag3() {
        return tag3;
    }

    public void setTag3(String tag3) {
        this.tag3 = tag3;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Category category = (Category) o;

        if (categoryId != null ? !categoryId.equals(category.categoryId) : category.categoryId != null) return false;
        if (categoryName != null ? !categoryName.equals(category.categoryName) : category.categoryName != null)
            return false;
        if (tag != null ? !tag.equals(category.tag) : category.tag != null) return false;
        if (tag1 != null ? !tag1.equals(category.tag1) : category.tag1 != null) return false;
        if (tag3 != null ? !tag3.equals(category.tag3) : category.tag3 != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = categoryId != null ? categoryId.hashCode() : 0;
        result = 31 * result + (categoryName != null ? categoryName.hashCode() : 0);
        result = 31 * result + (tag != null ? tag.hashCode() : 0);
        result = 31 * result + (tag1 != null ? tag1.hashCode() : 0);
        result = 31 * result + (tag3 != null ? tag3.hashCode() : 0);
        return result;
    }
}
