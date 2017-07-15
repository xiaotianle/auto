package com.tianle.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by win7 on 2017/6/24.
 */
@Entity
public class ProductType {

    @Id
    @GeneratedValue
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    private String productTypeCode;

    private String productTypeName;

    @Override
    public String toString() {
        return "ProductType{" +
                "id=" + id +
                ", productTypeCode='" + productTypeCode + '\'' +
                ", productTypeName='" + productTypeName  +
                '}';
    }
}
