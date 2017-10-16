package com.zambrone.entity;

import javax.persistence.*;

/**
 * Created by Chamith on 24/09/2017.
 */
@Entity
public class Type {
    private Integer typeId;
    private String typeName;

    @Id
    @Column(name = "type_id")
    @GeneratedValue(strategy= GenerationType.AUTO)
    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
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

        Type type = (Type) o;

        if (typeId != null ? !typeId.equals(type.typeId) : type.typeId != null) return false;
        if (typeName != null ? !typeName.equals(type.typeName) : type.typeName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = typeId != null ? typeId.hashCode() : 0;
        result = 31 * result + (typeName != null ? typeName.hashCode() : 0);
        return result;
    }
}
