package com.kidsguru.shop.repositories;

import com.kidsguru.shop.entities.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserEntity, Integer> {
}
