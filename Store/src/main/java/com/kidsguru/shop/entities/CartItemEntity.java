package com.kidsguru.shop.entities;

import javax.persistence.*;

@Entity
@Table(name = "cart_item", schema = "shop")
@IdClass(CartItemEntityPK.class)
public class CartItemEntity {
    private int productId;
    private int cartId;
    private int quantity;

    public CartItemEntity() {
    }

    public CartItemEntity(int cartId, int quantity) {
        this.cartId = cartId;
        this.quantity = quantity;
    }

    public CartItemEntity(int productId, int cartId, int quantity) {
        this.productId = productId;
        this.cartId = cartId;
        this.quantity = quantity;
    }

    @Id
    @Column(name = "product_id")
    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    @Id
    @Column(name = "cart_id")
    public int getCartId() {
        return cartId;
    }

    public void setCartId(int cartId) {
        this.cartId = cartId;
    }

    @Basic
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

        CartItemEntity that = (CartItemEntity) o;

        if (productId != that.productId) return false;
        if (cartId != that.cartId) return false;
        if (quantity != that.quantity) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = productId;
        result = 31 * result + cartId;
        result = 31 * result + quantity;
        return result;
    }
}
