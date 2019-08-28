package com.kidsguru.shop.repositories;

import com.kidsguru.shop.entities.CartItemEntity;
import com.kidsguru.shop.models.CartItem;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CartItemRepository extends JpaRepository<CartItemEntity, Integer> {

    List<CartItem> findCartItemEntitiesByCartId(int id);
    void deleteCartItemEntitiesByCartId(int id);

}
