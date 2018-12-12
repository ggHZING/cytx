package com.cytx.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Order {
    private Integer orderId;

    private String orderNo;

    private Integer orderAmount;

    private Integer orderStatus;

    private BigDecimal orderTotalPrice;

    private String orderPayMode;

    private Date orderCreateTime;

    private String paySerialsNumber;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo == null ? null : orderNo.trim();
    }

    public Integer getOrderAmount() {
        return orderAmount;
    }

    public void setOrderAmount(Integer orderAmount) {
        this.orderAmount = orderAmount;
    }

    public Integer getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    public BigDecimal getOrderTotalPrice() {
        return orderTotalPrice;
    }

    public void setOrderTotalPrice(BigDecimal orderTotalPrice) {
        this.orderTotalPrice = orderTotalPrice;
    }

    public String getOrderPayMode() {
        return orderPayMode;
    }

    public void setOrderPayMode(String orderPayMode) {
        this.orderPayMode = orderPayMode == null ? null : orderPayMode.trim();
    }

    public Date getOrderCreateTime() {
        return orderCreateTime;
    }

    public void setOrderCreateTime(Date orderCreateTime) {
        this.orderCreateTime = orderCreateTime;
    }

    public String getPaySerialsNumber() {
        return paySerialsNumber;
    }

    public void setPaySerialsNumber(String paySerialsNumber) {
        this.paySerialsNumber = paySerialsNumber == null ? null : paySerialsNumber.trim();
    }
}