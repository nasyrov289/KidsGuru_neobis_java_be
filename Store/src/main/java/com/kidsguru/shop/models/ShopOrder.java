package com.kidsguru.shop.models;

import com.kidsguru.shop.entities.ShopOrderEntity;

import java.sql.Timestamp;

public class ShopOrder {
    private int orderId;
    private String status;
    private Timestamp dateCreated;
    private double subTotal;
    private int customerId;
    private int shippingId;

    public ShopOrder() {
    }

    public ShopOrder(int orderId, String status, Timestamp dateCreated, double subTotal, int customerId, int shippingId) {
        this.orderId = orderId;
        this.status = status;
        this.dateCreated = dateCreated;
        this.subTotal = subTotal;
        this.customerId = customerId;
        this.shippingId = shippingId;
    }

    public ShopOrder(ShopOrderEntity shopOrderEntity) {
        this.orderId = shopOrderEntity.getOrderId();
        this.status = shopOrderEntity.getStatus();
        this.dateCreated = shopOrderEntity.getDateCreated();
        this.subTotal = shopOrderEntity.getSubTotal();
        this.customerId = shopOrderEntity.getCustomerId();
        this.shippingId = shopOrderEntity.getShippingId();
    }

    public ShopOrderEntity convertToEntity() {
        return new ShopOrderEntity(orderId, status, dateCreated, subTotal, customerId, shippingId);
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Timestamp getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Timestamp dateCreated) {
        this.dateCreated = dateCreated;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getShippingId() {
        return shippingId;
    }

    public void setShippingId(int shippingId) {
        this.shippingId = shippingId;
    }
}
