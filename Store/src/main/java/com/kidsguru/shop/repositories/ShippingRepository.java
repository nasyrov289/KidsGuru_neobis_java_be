package com.kidsguru.shop.repositories;

import com.kidsguru.shop.entities.ShippingEntity;
import com.kidsguru.shop.entities.ShippingEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ShippingRepository extends JpaRepository<ShippingEntity, Integer> {
}
