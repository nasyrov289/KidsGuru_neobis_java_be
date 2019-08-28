package com.kidsguru.shop.entities;

import javax.persistence.Entity;
import javax.persistence.*;

@Entity
@Table(name = "order_item")
public class OrderItemEntity {

    /*
    CREATE TABLE IF NOT EXISTS `order_item` (
      `product_id` INT NOT NULL,
      `order_id` INT NOT NULL,
      `quantity` INT NOT NULL,
      PRIMARY KEY (`product_id`,`order_id`),
      FOREIGN KEY (`product_id`) REFERENCES `product` (`product_id`),
      FOREIGN KEY (`order_id`) REFERENCES `order` (`order_id`)
      );
     */

    @EmbeddedId
    private OrderItemEntityPK orderItemEntityPK;

    private int quantity;

    public OrderItemEntity(int quantity) { }

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

        if (orderItemEntityPK != that.orderItemEntityPK) return false;
        if (quantity != that.quantity) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        result = orderItemEntityPK.hashCode();
        result = 31 * result + quantity;

        return result;
    }
}
