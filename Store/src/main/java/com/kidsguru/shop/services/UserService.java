package com.kidsguru.shop.services;

import com.kidsguru.shop.entities.UserEntity;
import com.kidsguru.shop.exception.RecordNotFoundException;
import com.kidsguru.shop.models.User;
import com.kidsguru.shop.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public User getUserById(int userId) throws Exception {
        return new User(userRepository.findById(userId).orElseThrow(RecordNotFoundException::new));
    }


    public User saveUser(User user) {
        UserEntity saveResult = userRepository.save(user.convertToEntity());
        return new User(saveResult);
    }

    public void deleteUserById(int userId) {
        userRepository.deleteById(userId);
    }
    public void deleteUserByAddressId(int addressId) {
        userRepository.deleteById(addressId);
    }
}
