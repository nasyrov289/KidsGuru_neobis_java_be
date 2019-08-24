package com.kidsguru.shop.entities;

import javax.persistence.*;

@Entity
@Table(name = "shipping", schema = "shop")
public class ShippingEntity {
    private int shippingId;
    private String type;
    private double shippingCost;

    public ShippingEntity() {
    }

    public ShippingEntity(String type, double shippingCost) {
        this.type = type;
        this.shippingCost = shippingCost;
    }

    public ShippingEntity(int shippingId, String type, double shippingCost) {
        this.shippingId = shippingId;
        this.type = type;
        this.shippingCost = shippingCost;
    }

    @Id
    @Column(name = "shipping_id")
    public int getShippingId() {
        return shippingId;
    }

    public void setShippingId(int shippingId) {
        this.shippingId = shippingId;
    }

    @Basic
    @Column(name = "type")
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Basic
    @Column(name = "shipping_cost")
    public double getShippingCost() {
        return shippingCost;
    }

    public void setShippingCost(double shippingCost) {
        this.shippingCost = shippingCost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ShippingEntity that = (ShippingEntity) o;

        if (shippingId != that.shippingId) return false;
        if (Double.compare(that.shippingCost, shippingCost) != 0) return false;
        return type.equals(that.type);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = shippingId;
        result = 31 * result + type.hashCode();
        temp = Double.doubleToLongBits(shippingCost);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
