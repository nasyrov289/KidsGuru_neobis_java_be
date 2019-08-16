package com.kidsguru.shop.repositories;

import com.kidsguru.shop.entities.OrderItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemRepository extends JpaRepository<OrderItemEntity, Integer> {
}
