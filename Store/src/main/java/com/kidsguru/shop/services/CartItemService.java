package com.kidsguru.shop.services;

import com.kidsguru.shop.entities.CartItemEntity;
import com.kidsguru.shop.models.CartItem;
import com.kidsguru.shop.repositories.CartItemRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CartItemService {
    private CartItemRepository cartItemRepository;

    public CartItem getCartItemById(int productId) {
        return new CartItem(cartItemRepository.findById(productId).orElse(new CartItemEntity()));
    }

    public List<CartItem> getAllCartItem() {
        ArrayList<CartItem> cartItemList = new ArrayList<>();
        for (int i = 0; i < cartItemRepository.findAll().size(); i++) {
            cartItemList.add(new CartItem(cartItemRepository.findAll().get(i)));
        }
        return cartItemList;
    }

    public CartItem saveCartItem(CartItem cartItem) {
        CartItemEntity saveResult = cartItemRepository.save(cartItem.convertToEntity());
        return new CartItem(saveResult);
    }

    public void deleteCartItemById(int productId) {
        cartItemRepository.deleteById(productId);
    }
}
