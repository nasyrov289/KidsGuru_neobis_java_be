package com.kidsguru.shop.models;

import com.kidsguru.shop.entities.CartItemEntity;

public class CartItem {
    private int productId;
    private int cartId;
    private int quantity;

    public CartItem() {

    }

    public CartItem(int productId, int cartId, int quantity) {
        this.cartId = cartId;
        this.productId = productId;
        this.quantity = quantity;
    }

    public CartItem(CartItemEntity cartItemEntity) {
        this.quantity = cartItemEntity.getQuantity();
        this.productId = cartItemEntity.getProductId();
        this.cartId = cartItemEntity.getProductId();
    }

    public CartItemEntity convertToEntity() {
        return new CartItemEntity(cartId, productId, quantity);
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getCartId() {
        return cartId;
    }

    public void setCartId(int cartId) {
        this.cartId = cartId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
