package com.kidsguru.shop.entities;

import javax.persistence.*;

@Entity
@Table(name = "shipping")
public class ShippingEntity {
    /*
    CREATE TABLE IF NOT EXISTS `shipping` (
      `shipping_id` INT NOT NULL AUTO_INCREMENT,
      `type` VARCHAR(255), -- delivery or pickup at pickup points
      `shipping_cost` FLOAT,
      PRIMARY KEY (`shipping_id`)
      );
      */

    private int shippingId;
    private String type;
    private double shippingCost;

    public ShippingEntity() {}

    public ShippingEntity (int shippingId, String type, double shippingCost) {
        this.shippingId = shippingId;
        this.type = type;
        this.shippingCost = shippingCost;
    }

    public ShippingEntity convertToEntity() {
        return new ShippingEntity(shippingId, type, shippingCost);
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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
}
