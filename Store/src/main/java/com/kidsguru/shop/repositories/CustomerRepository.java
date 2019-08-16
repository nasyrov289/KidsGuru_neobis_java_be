package com.kidsguru.shop.repositories;

import com.kidsguru.shop.entities.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<CustomerEntity, Integer> {
}
