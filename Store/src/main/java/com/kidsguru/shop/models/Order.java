package com.kidsguru.shop.models;

import com.kidsguru.shop.entities.OrderEntity;

import java.sql.Timestamp;
import java.time.Instant;

public class Order {
    private int orderId;
    private String status;
    private Instant dateCreated;
    private double subTotal;
    private int customerId;
    private int shippingId;

    public Order() {

    }

    public Order(int orderId, String status, Instant dateCreated, double subTotal, int customerId, int shippingId) {
        this.orderId = orderId;
        this.status = status;
        this.dateCreated = dateCreated;
        this.subTotal = subTotal;
        this.customerId = customerId;
        this.shippingId = shippingId;
    }

    public Order(OrderEntity orderEntity) {
        this.orderId = orderEntity.getOrderId();
        this.status = orderEntity.getStatus();
        this.dateCreated = orderEntity.getDateCreated() == null ? null : orderEntity.getDateCreated().toInstant();
        this.subTotal = orderEntity.getSubTotal();
        this.customerId = orderEntity.getCustomerId();
        this.shippingId = orderEntity.getShippingId();
    }

    public OrderEntity convertToEntity() {
        return new OrderEntity(orderId, status, dateCreated == null ? null : Timestamp.from(dateCreated), subTotal, customerId, shippingId);
    }

    public int getShopOrderId() {
        return orderId;
    }

    public void setShopOrderId(int orderId) {
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
