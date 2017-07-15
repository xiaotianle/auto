package com.tianle.domain;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.TemporalType;
import javax.persistence.Temporal;
import java.math.BigDecimal;

/**
 * Created by win7 on 2017/6/24.
 */

public class Order {

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductTypeName() {
        return productTypeName;
    }

    public void setProductTypeName(String productTypeName) {
        this.productTypeName = productTypeName;
    }

    public String getProductTypeCode() {
        return productTypeCode;
    }

    public void setProductTypeCode(String productTypeCode) {
        this.productTypeCode = productTypeCode;
    }

    public String getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(String orderTime) {
        this.orderTime= orderTime;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    @Id
    @GeneratedValue

    private Integer id;

    /** 产品代码 */
    private String productCode;

    /** 产品名称 */
    private String productName;

    /** 产品类型名称 */
    private String productTypeName;

    /** 产品类型代码 */
    private String productTypeCode;

    /** 订单日期 */

    private String orderTime;

    /** 联系人 */
    private String username;

    /** 联系人 */
    private String contact ;

    /** 联系电话 */
    private String tel;

    /** 地址 */
    private String address;

    /** 数量 */
    private Integer num;

    /** 单价 */
    private BigDecimal price;

    /** 总金额 */
    private BigDecimal amount;





}
