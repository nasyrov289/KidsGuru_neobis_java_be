package com.kidsguru.shop.services;

import com.kidsguru.shop.entities.UserEntity;
import com.kidsguru.shop.models.User;
import com.kidsguru.shop.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    private UserRepository userRepository;

    public User getUserById(int userId) {
        return new User(userRepository.findById(userId).orElse(new UserEntity()));
    }

    public List<User> getAllUser() {
        ArrayList<User> userList = new ArrayList<>();
        for (int i = 0; i < userRepository.findAll().size(); i++) {
            userList.add(new User(userRepository.findAll().get(i)));
        }
        return userList;
    }

    public User saveUser(User user) {
        UserEntity saveResult = userRepository.save(user.convertToEntity());
        return new User(saveResult);
    }

    public void deleteUserById(int userId) {
        userRepository.deleteById(userId);
    }
}
