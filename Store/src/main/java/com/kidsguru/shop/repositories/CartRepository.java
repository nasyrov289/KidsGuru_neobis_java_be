package com.kidsguru.shop.repositories;

import com.kidsguru.shop.entities.CartEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<CartEntity, Integer> {

}
