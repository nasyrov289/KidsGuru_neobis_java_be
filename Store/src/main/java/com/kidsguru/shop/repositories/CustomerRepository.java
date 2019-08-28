package com.kidsguru.shop.repositories;

import com.kidsguru.shop.entities.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<CustomerEntity, Integer> {

    void deleteCustomerEntitiesByAddressId(int addressId);
}
