package com.kidsguru.shop.models;

import com.kidsguru.shop.entities.CartEntity;

public class Cart {
    private int cartId;
    private double subTotal;

    public Cart() {
    }

    public Cart(double subTotal, int cartId) {
        this.subTotal = subTotal;
        this.cartId = cartId;
    }

    public Cart(CartEntity cartEntity) {
        this.cartId = cartEntity.getCartId();
        this.subTotal = cartEntity.getSubTotal();
    }

    public CartEntity convertToEntity() {
        return new CartEntity(cartId, subTotal);
    }

    public int getCartId() {
        return cartId;
    }

    public void setCartId(int cartId) {
        this.cartId = cartId;
    }

    public double getSubTotal() {
        return subTotal;
    }

    public void setSubTotal(double subTotal) {
        this.subTotal = subTotal;
    }
}