package com.kidsguru.shop.entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Id;
import java.io.Serializable;

@Embeddable
public class OrderItemEntityPK implements Serializable {
    private int productId;
    private int orderId;

    @Column(name = "product_id")
    @Id
    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    @Column(name = "order_id")
    @Id
    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        OrderItemEntityPK that = (OrderItemEntityPK) o;

        if (productId != that.productId) return false;
        if (orderId != that.orderId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = productId;
        result = 31 * result + orderId;
        return result;
    }
}
