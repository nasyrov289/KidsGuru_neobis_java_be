package com.kidsguru.shop.controllers;

import com.kidsguru.shop.models.User;
import com.kidsguru.shop.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/")
    public String defaultUser() {
        return "Default user endpoint";
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public User getUserById(@RequestParam("id") int id) {
        return userService.getUserById(id);
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<User> getAllUser() {
        return userService.getAllUser();
    }


    @RequestMapping(method = RequestMethod.PUT)
    public void updateUser(@RequestBody User user) {
        userService.saveUser(user);
    }

    @RequestMapping(method = RequestMethod.POST)
    public User createUser(@RequestBody User user) {
        return userService.saveUser(user);
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public void deleteUserById(@PathParam("id") int id) {
        userService.deleteUserById(id);
    }
}