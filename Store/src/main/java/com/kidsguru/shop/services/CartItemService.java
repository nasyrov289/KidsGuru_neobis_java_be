package com.kidsguru.shop.services;

import com.kidsguru.shop.entities.CartItemEntity;
import com.kidsguru.shop.models.CartItem;
import com.kidsguru.shop.repositories.CartItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartItemService {
    @Autowired
    private CartItemRepository cartItemRepository;

    public CartItem getCartItemById(int productId) {
        return new CartItem(cartItemRepository.findById(productId).orElseThrow(RuntimeException::new));
    }


    public CartItem saveCartItem(CartItem cartItem) {
        CartItemEntity saveResult = cartItemRepository.save(cartItem.convertToEntity());
        return new CartItem(saveResult);
    }

    public void deleteCartItemById(int productId) {
        cartItemRepository.deleteById(productId);
    }
}
