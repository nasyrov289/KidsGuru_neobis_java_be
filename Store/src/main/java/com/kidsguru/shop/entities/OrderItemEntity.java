package com.kidsguru.shop.entities;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "order_item", schema = "shop")
public class OrderItemEntity {

    @EmbeddedId
    private OrderItemEntityPK orderItemEntityPK;

    private int quantity;

    public OrderItemEntity() {
    }

    public OrderItemEntity(int quantity) {
        this.quantity = quantity;
    }

    @Column(name = "quantity")
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

        if (quantity != that.quantity) return false;
        return orderItemEntityPK.equals(that.orderItemEntityPK);
    }

    @Override
    public int hashCode() {
        int result = orderItemEntityPK.hashCode();
        result = 31 * result + quantity;
        return result;
    }

}
