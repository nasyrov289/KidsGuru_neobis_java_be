package com.kidsguru.shop.controllers;

import com.kidsguru.shop.models.Cart;
import com.kidsguru.shop.services.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;


@RestController
@RequestMapping("/cart")
public class CartController {
    @Autowired
    private CartService cartService;

    @RequestMapping("/")
    public String defaultCart() {
        return "Default cart endpoint";
    }


    // get cart by customer_id
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Cart getCartById(@PathVariable("id") int id) throws Exception {
        return cartService.getCartById(id);
    }


    // update cart
    @RequestMapping(method = RequestMethod.PUT)
    public void updateCart(@RequestBody Cart cart) {
        cartService.saveCart(cart);
    }


    // create new cart
    @RequestMapping(method = RequestMethod.POST)
    public Cart createCart(@RequestBody Cart cart) {
        return cartService.saveCart(cart);
    }


    // delete cart
    @RequestMapping(method = RequestMethod.DELETE)
    public void deleteCartById(@PathParam("id") int id) {
        cartService.deleteCartById(id);
    }
}