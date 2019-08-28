package com.kidsguru.shop.repositories;

import com.kidsguru.shop.entities.SellerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SellerRepository extends JpaRepository<SellerEntity, Integer> {
}
