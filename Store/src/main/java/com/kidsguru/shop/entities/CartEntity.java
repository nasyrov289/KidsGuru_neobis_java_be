package com.kidsguru.shop.entities;

import javax.persistence.*;

@Entity
@Table(name = "cart", schema = "shop")
public class CartEntity {
    private int cartId;
    private double subTotal;

    public CartEntity() {

    }

    public CartEntity(double subTotal) {
        this.subTotal = subTotal;
    }

    public CartEntity(int cartId, double subTotal) {
        this.cartId = cartId;
        this.subTotal = subTotal;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cart_id")
    public int getCartId() {
        return cartId;
    }

    public void setCartId(int cartId) {
        this.cartId = cartId;
    }

    @Basic
    @Column(name = "sub_total", nullable = false)
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

        CartEntity that = (CartEntity) o;

        if (cartId != that.cartId) return false;
        return Double.compare(that.subTotal, subTotal) == 0;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = cartId;
        temp = Double.doubleToLongBits(subTotal);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
