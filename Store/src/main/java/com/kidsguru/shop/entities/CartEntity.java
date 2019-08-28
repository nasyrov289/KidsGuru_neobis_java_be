package com.kidsguru.shop.entities;

import javax.persistence.*;

@Entity
@Table(name = "cart", schema = "shop")
public class CartEntity {
    private int cartId;
    private double subTotal;
    private int customerId;

    public CartEntity() {
    }

    public CartEntity(double subTotal, int customerId) {
        this.subTotal = subTotal;
        this.customerId = customerId;
    }

    public CartEntity(int cartId, double subTotal, int customerId) {
        this.cartId = cartId;
        this.subTotal = subTotal;
        this.customerId = customerId;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "cart_id")
    public int getCartId() {
        return cartId;
    }

    public void setCartId(int cartId) {
        this.cartId = cartId;
    }

    @Basic
    @Column(name = "sub_total")
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CartEntity that = (CartEntity) o;

        if (cartId != that.cartId) return false;
        if (Double.compare(that.subTotal, subTotal) != 0) return false;
        return customerId == that.customerId;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = cartId;
        temp = Double.doubleToLongBits(subTotal);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + customerId;
        return result;
    }
}
