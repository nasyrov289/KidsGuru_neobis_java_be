package com.kidsguru.shop.repositories;

import com.kidsguru.shop.entities.SellerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SellerRepository extends JpaRepository<SellerEntity, Integer> {
}
