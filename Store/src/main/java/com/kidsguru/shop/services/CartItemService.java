package com.kidsguru.shop.services;

import com.kidsguru.shop.entities.CartItemEntity;
import com.kidsguru.shop.exception.RecordNotFoundException;
import com.kidsguru.shop.models.CartItem;
import com.kidsguru.shop.repositories.CartItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CartItemService {

    @Autowired
    private CartItemRepository cartItemRepository;


    public CartItem saveCartItem(CartItem cartItem) {
        CartItemEntity saveResult = cartItemRepository.save(cartItem.convertToEntity());
        return new CartItem(saveResult);
    }

    public void deleteCartItemById(int productId) {
        cartItemRepository.deleteById(productId);
    }

    public List<CartItem> getAllCartItem(int id) {
        return cartItemRepository.findCartItemEntitiesByCartId(id);
    }

    public void deleteCartItemByIdCartId(int id){
        cartItemRepository.deleteCartItemEntitiesByCartId(id);
    }
}
