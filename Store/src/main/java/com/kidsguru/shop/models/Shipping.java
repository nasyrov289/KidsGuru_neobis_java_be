package com.kidsguru.shop.models;

import com.kidsguru.shop.entities.ShippingEntity;

public class Shipping {
    private int shippingId;
    private String type;
    private double shippingCost;

    public Shipping() {
    }

    public Shipping(int shippingId, String type, double shippingCost) {
        this.shippingId = shippingId;
        this.type = type;
        this.shippingCost = shippingCost;
    }

    public Shipping(ShippingEntity shippingEntity) {
        this.shippingId = shippingEntity.getShippingId();
        this.type = shippingEntity.getType();
        this.shippingCost = shippingEntity.getShippingCost();
    }

    public ShippingEntity convertToEntity() {
        return new ShippingEntity(shippingId, type, shippingCost);
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
