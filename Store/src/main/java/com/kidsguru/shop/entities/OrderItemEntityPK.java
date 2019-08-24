package com.kidsguru.shop.entities;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class OrderItemEntityPK implements Serializable {
    private int productId;
    private int orderId;

    public OrderItemEntityPK() {
    }

    public OrderItemEntityPK(int productId, int orderId) {
        this.productId = productId;
        this.orderId = orderId;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

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

        if (orderId != that.orderId) return false;
        return productId == that.productId;
    }

    @Override
    public int hashCode() {
        int result;
        result = orderId;
        result = 31 * result + productId;

        return result;
    }
}
