package com.kidsguru.shop.models;

import com.kidsguru.shop.entities.CartEntity;

public class Cart {
    private int cartId;
    private double subTotal;
    private int customerId;

    public Cart() {
    }

    public Cart(double subTotal, int cartId, int customerId) {
        this.subTotal = subTotal;
        this.cartId = cartId;
        this.customerId = customerId;
    }

    public Cart(CartEntity cartEntity) {
        this.customerId = cartEntity.getCustomerId();
        this.cartId = cartEntity.getCartId();
        this.subTotal = cartEntity.getSubTotal();
    }

    public CartEntity convertToEntity() {
        return new CartEntity(cartId, subTotal, customerId);
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

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }
}