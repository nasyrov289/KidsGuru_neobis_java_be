package com.kidsguru.shop.controllers;

import com.kidsguru.shop.models.CartItem;
import com.kidsguru.shop.services.CartItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;


//Done
@RestController
@RequestMapping("/cartItem")
public class CartItemController {

    @Autowired
    private CartItemService cartItemService;

    @RequestMapping("/")
    public String defaultCartItem() {
        return "Default cartItem endpoint";
    }

    // get all cart items by cart_id
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public List<CartItem> getAllCartItem(@PathVariable("id") int id) {
        return cartItemService.getAllCartItem(id);
    }


    // update cart item
    @RequestMapping(method = RequestMethod.PUT)
    public void updateCartItem(@RequestBody CartItem cartItem) {
        cartItemService.saveCartItem(cartItem);
    }


    // create new cart item
    @RequestMapping(method = RequestMethod.POST)
    public CartItem createCartItem(@RequestBody CartItem cartItem) {
        return cartItemService.saveCartItem(cartItem);
    }


    // delete a cart item
    @RequestMapping(method = RequestMethod.DELETE)
    public void deleteCartItemById(@PathParam("id") int id) {
        cartItemService.deleteCartItemById(id);
    }


    // delete a cart item
    @RequestMapping(value = "cart{id}", method = RequestMethod.DELETE)
    public void deleteCartItemByCartId(@PathVariable("id") int id) {
        cartItemService.deleteCartItemById(id);
    }
}