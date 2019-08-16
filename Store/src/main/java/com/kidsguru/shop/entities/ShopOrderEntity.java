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

    public ShopOrderEntity() {
    }

    public ShopOrderEntity(int orderId, String status, Timestamp dateCreated, double subTotal) {
        this.orderId = orderId;
        this.status = status;
        this.dateCreated = dateCreated;
        this.subTotal = subTotal;
    }

    public ShopOrderEntity(String status, Timestamp dateCreated, double subTotal) {
        this.status = status;
        this.dateCreated = dateCreated;
        this.subTotal = subTotal;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ShopOrderEntity that = (ShopOrderEntity) o;

        if (orderId != that.orderId) return false;
        if (Double.compare(that.subTotal, subTotal) != 0) return false;
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
        return result;
    }
}
