package com.kidsguru.shop.services;

import com.kidsguru.shop.entities.CartEntity;
import com.kidsguru.shop.models.Cart;
import com.kidsguru.shop.repositories.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CartService {
    @Autowired
    private CartRepository cartRepository;

    public Cart getCartById(int cartId) {
        return new Cart(cartRepository.findById(cartId).orElse(new CartEntity()));
    }

    public List<Cart> getAllCart() {
        ArrayList<Cart> cartList = new ArrayList<>();
        for (int i = 0; i < cartRepository.findAll().size(); i++) {
            cartList.add(new Cart(cartRepository.findAll().get(i)));
        }
        return cartList;
    }

    public Cart saveCart(Cart cart) {
        CartEntity saveResult = cartRepository.save(cart.convertToEntity());
        return new Cart(saveResult);
    }

    public void deleteCartById(int cartId) {
        cartRepository.deleteById(cartId);
    }
}
