package com.kidsguru.shop.repositories;

import com.kidsguru.shop.entities.OrderItemEntity;
import com.kidsguru.shop.entities.OrderItemEntityPK;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItemEntity, OrderItemEntityPK> {

}
