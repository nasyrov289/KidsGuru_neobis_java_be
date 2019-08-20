package com.kidsguru.shop.entities;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "shop_order", schema = "shop")
public class ShopOrderEntity {
    private int orderId;
    private String status;
    private Timestamp dateCreated;
    private double subTotal;
    private int customerId;
    private int shippingId;

    public ShopOrderEntity() {
    }

    public ShopOrderEntity(String status, Timestamp dateCreated, double subTotal, int customerId, int shippingId) {
        this.status = status;
        this.dateCreated = dateCreated;
        this.subTotal = subTotal;
        this.customerId = customerId;
        this.shippingId = shippingId;
    }

    public ShopOrderEntity(int orderId, String status, Timestamp dateCreated, double subTotal, int customerId, int shippingId) {
        this.orderId = orderId;
        this.status = status;
        this.dateCreated = dateCreated;
        this.subTotal = subTotal;
        this.customerId = customerId;
        this.shippingId = shippingId;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "order_id")
    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    @Basic
    @Column(name = "status", nullable = false)
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Basic
    @Column(name = "date_created")
    public Timestamp getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Timestamp dateCreated) {
        this.dateCreated = dateCreated;
    }

    @Basic
    @Column(name = "sub_total", nullable = false)
    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    @Basic
    @Column(name = "customer_id")
    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    @Basic
    @Column(name = "shipping_id")
    public int getShippingId() {
        return shippingId;
    }

    public void setShippingId(int shippingId) {
        this.shippingId = shippingId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ShopOrderEntity that = (ShopOrderEntity) o;

        if (orderId != that.orderId) return false;
        if (Double.compare(that.subTotal, subTotal) != 0) return false;
        if (customerId != that.customerId) return false;
        if (shippingId != that.shippingId) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (dateCreated != null ? !dateCreated.equals(that.dateCreated) : that.dateCreated != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = orderId;
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (dateCreated != null ? dateCreated.hashCode() : 0);
        temp = Double.doubleToLongBits(subTotal);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + customerId;
        result = 31 * result + shippingId;
        return result;
    }
}
