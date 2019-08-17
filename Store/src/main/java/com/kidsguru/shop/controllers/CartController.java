package com.kidsguru.shop.controllers;

import com.kidsguru.shop.models.Cart;
import com.kidsguru.shop.services.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping("/cart")
public class CartController {
    @Autowired
    private CartService cartService;

    @RequestMapping("/")
    public String defaultCart() {
        return "Default cart endpoint";
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Cart getCartById(@RequestParam("id") int id) {
        return cartService.getCartById(id);
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<Cart> getAllCart() {
        return cartService.getAllCart();
    }


    @RequestMapping(method = RequestMethod.PUT)
    public void updateCart(@RequestBody Cart cart) {
        cartService.saveCart(cart);
    }

    @RequestMapping(method = RequestMethod.POST)
    public Cart createCart(@RequestBody Cart cart) {
        return cartService.saveCart(cart);
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public void deleteCartById(@PathParam("id") int id) {
        cartService.deleteCartById(id);
    }
}