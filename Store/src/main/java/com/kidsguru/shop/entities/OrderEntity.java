package com.kidsguru.shop.entities;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "shop_order")
public class OrderEntity {


    private int orderId;
    private String status;
    private Timestamp dateCreated;
    private double subtotal;
    private int customerId;
    private int shippingId;

    public OrderEntity() {
    }

    public OrderEntity(int orderId, String status, Timestamp dateCreated, double subtotal, int customerId, int shippingId) {
        this.orderId = orderId;
        this.status = status;
        this.dateCreated = dateCreated;
        this.subtotal = subtotal;
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
    @Column(name = "status")
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
    @Column(name = "sub_total")
    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    @Column(name = "customer_id")
    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

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

        OrderEntity that = (OrderEntity) o;

        if (orderId != that.orderId) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (dateCreated != null ? !dateCreated.equals(that.dateCreated) : that.dateCreated != null) return false;
        if (Double.compare(that.subtotal, subtotal) != 0) return false;
        if (customerId != that.customerId) return false;
        if (shippingId != that.shippingId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = orderId;
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (dateCreated != null ? dateCreated.hashCode() : 0);
        temp = Double.doubleToLongBits(subtotal);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + customerId;
        result = 31 * result + shippingId;

        return result;
    }
}
