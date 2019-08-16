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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "shipping_id")
    public int getShippingId() {
        return shippingId;
    }

    public void setShippingId(int shippingId) {
        this.shippingId = shippingId;
    }

    @Basic
    @Column(name = "type", nullable = false)
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Basic
    @Column(name = "shipping_cost", nullable = false)
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
        if (type != null ? !type.equals(that.type) : that.type != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = shippingId;
        result = 31 * result + (type != null ? type.hashCode() : 0);
        temp = Double.doubleToLongBits(shippingCost);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
