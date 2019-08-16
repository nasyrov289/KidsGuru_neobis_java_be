package com.kidsguru.shop.repositories;

import com.kidsguru.shop.entities.AddressEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<AddressEntity, Integer> {
}
