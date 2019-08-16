package com.kidsguru.shop.entities;

import javax.persistence.*;

@Entity
@Table(name = "order_item", schema = "shop")
@IdClass(OrderItemEntityPK.class)
public class OrderItemEntity {
    private int productId;
    private int orderId;
    private int quantity;

    public OrderItemEntity() {
    }
    public OrderItemEntity(int orderId, int quantity) {
        this.orderId = orderId;
        this.quantity = quantity;
    }
    public OrderItemEntity(int productId, int orderId, int quantity) {
        this.productId = productId;
        this.orderId = orderId;
        this.quantity = quantity;
    }
    @Id
    @Column(name = "product_id")
    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    @Id
    @Column(name = "order_id")
    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    @Basic
    @Column(name = "quantity", nullable = false)
    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OrderItemEntity that = (OrderItemEntity) o;

        if (productId != that.productId) return false;
        if (orderId != that.orderId) return false;
        if (quantity != that.quantity) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = productId;
        result = 31 * result + orderId;
        result = 31 * result + quantity;
        return result;
    }
}
