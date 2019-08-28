package com.kidsguru.shop.services;

import com.kidsguru.shop.entities.CartEntity;
import com.kidsguru.shop.exception.RecordNotFoundException;
import com.kidsguru.shop.models.Cart;
import com.kidsguru.shop.repositories.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartService {
    @Autowired
    private CartRepository cartRepository;

    public Cart getCartById(int cartId) throws Exception {
        return new Cart(cartRepository.findById(cartId).orElseThrow(RecordNotFoundException::new));
    }

    public Cart saveCart(Cart cart) {
        CartEntity saveResult = cartRepository.save(cart.convertToEntity());
        return new Cart(saveResult);
    }

    public void deleteCartById(int cartId) {
        cartRepository.deleteById(cartId);
    }
}
