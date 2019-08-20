package com.kidsguru.shop.entities;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Id;
import java.io.Serializable;

@Embeddable
public class CartItemEntityPK implements Serializable {
    private int productId;
    private int cartId;

    @Column(name = "product_id")
    @Id
    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    @Column(name = "cart_id")
    @Id
    public int getCartId() {
        return cartId;
    }

    public void setCartId(int cartId) {
        this.cartId = cartId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CartItemEntityPK that = (CartItemEntityPK) o;

        if (productId != that.productId) return false;
        if (cartId != that.cartId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = productId;
        result = 31 * result + cartId;
        return result;
    }
}
