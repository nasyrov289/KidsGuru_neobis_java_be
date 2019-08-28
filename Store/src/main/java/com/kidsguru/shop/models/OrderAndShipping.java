package com.kidsguru.shop.models;

import java.time.Instant;

public class OrderAndShipping {
    private int orderId;
    private String status;
    private Instant dateCreated;
    private double subtotal;
    private int customerId;

    private int shippingId;
    private String type;
    private double shippingCost;

    public Order extractOrder() {
        return new Order(orderId, status, dateCreated, subtotal, customerId, shippingId);
    }

    public Shipping extractShipping() {
        return new Shipping(shippingId, type, shippingCost);
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

    public Instant getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Instant dateCreated) {
        this.dateCreated = dateCreated;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
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



    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getShippingCost() {
        return shippingCost;
    }

    public void setShippingCost(double shippingCost) {
        this.shippingCost = shippingCost;
    }

}
