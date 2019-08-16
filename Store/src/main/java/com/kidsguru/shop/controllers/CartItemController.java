package com.kidsguru.shop.controllers;

import com.kidsguru.shop.models.CartItem;
import com.kidsguru.shop.services.CartItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping("/cartItem")
public class CartItemController {
    //private Logger logger = LoggerFactory.getLogger(OrderController.class);

    @Autowired
    private CartItemService cartItemService;

    @RequestMapping("/")
    public String defaultCartItem() {
        //logger.info("You've hit the default endpoint");
        //logger.debug("This is a debugging message for the default endpoint");
        return "Default cartItem endpoint";
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public CartItem getCartItemById(@RequestParam("id") int id) {
        return cartItemService.getCartItemById(id);
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<CartItem> getAllCartItem() {
        return cartItemService.getAllCartItem();
    }


    @RequestMapping(method = RequestMethod.PUT)
    public void updateCartItem(@RequestBody CartItem cartItem) {
        cartItemService.saveCartItem(cartItem);
    }

    @RequestMapping(method = RequestMethod.POST)
    public CartItem createCartItem(@RequestBody CartItem cartItem) {
        return cartItemService.saveCartItem(cartItem);
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public void deleteCartItemById(@PathParam("id") int id) {
        cartItemService.deleteCartItemById(id);
    }
}