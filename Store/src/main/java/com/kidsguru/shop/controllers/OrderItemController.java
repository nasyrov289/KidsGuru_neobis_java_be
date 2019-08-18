package com.kidsguru.shop.controllers;

import com.kidsguru.shop.models.OrderItem;
import com.kidsguru.shop.services.OrderItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

@RestController
@RequestMapping("/orderItem")
public class OrderItemController {

    @Autowired
    private OrderItemService orderItemService;

    @RequestMapping("/")
    public String defaultOrderItem() {
        return "Default orderItem endpoint";
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public OrderItem getOrderItemById(@RequestParam("id") int id) {
        return orderItemService.getOrderItemById(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public OrderItem createOrderItem(@RequestBody OrderItem orderItem) {
        return orderItemService.saveOrderItem(orderItem);
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public void deleteOrderItemById(@PathParam("id") int id) {
        orderItemService.deleteOrderItemById(id);
    }
}