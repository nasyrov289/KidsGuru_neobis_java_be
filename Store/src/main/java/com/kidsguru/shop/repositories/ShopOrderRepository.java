package com.kidsguru.shop.repositories;

import com.kidsguru.shop.entities.ShopOrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShopOrderRepository extends JpaRepository<ShopOrderEntity, Integer> {
}
