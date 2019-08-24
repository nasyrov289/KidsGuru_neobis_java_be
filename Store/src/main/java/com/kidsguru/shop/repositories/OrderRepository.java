package com.kidsguru.shop.repositories;

import com.kidsguru.shop.entities.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderRepository extends JpaRepository<OrderEntity, Integer> {
    List<OrderEntity> findOrdersByCustomerId(int customerId);
    List<OrderEntity> findOrdersByShippingId(int shippingId);
}
