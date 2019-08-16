package com.kidsguru.shop.repositories;

import com.kidsguru.shop.entities.CartEntity;
import com.kidsguru.shop.entities.CartItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartItemRepository extends JpaRepository<CartItemEntity, Integer> {
}
