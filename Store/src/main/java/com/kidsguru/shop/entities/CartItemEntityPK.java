package com.kidsguru.shop.entities;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class CartItemEntityPK implements Serializable {
    private int productId;
    private int cartId;

    public CartItemEntityPK() {
    }

    public CartItemEntityPK(int productId, int cartId) {
        this.productId = productId;
        this.cartId = cartId;
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
