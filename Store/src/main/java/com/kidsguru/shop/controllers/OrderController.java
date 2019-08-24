package com.kidsguru.shop.controllers;

import com.kidsguru.shop.models.Order;
import com.kidsguru.shop.models.OrderAndShipping;
import com.kidsguru.shop.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @RequestMapping("/")
    public String defaultShopOrder() {
        return "Default shopOrder endpoint";
    }

    @RequestMapping(method = RequestMethod.GET)
    public Order getShopOrderById(@RequestParam("id") int id) throws Exception {
        return orderService.getOrderById(id);
    }


    @RequestMapping(method = RequestMethod.PUT)
    public void updateShopOrder(@RequestBody Order order) {
        orderService.saveOrder(order);
    }

    @RequestMapping(method = RequestMethod.POST)
    public Order createShopOrder(@RequestBody Order order) {
        return orderService.saveOrder(order);
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public void deleteShopOrderById(@PathParam("id") int id) {
        orderService.deleteOrderById(id);
    }

}