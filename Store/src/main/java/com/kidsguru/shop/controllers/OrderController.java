package com.kidsguru.shop.controllers;

import com.kidsguru.shop.entities.OrderItemEntityPK;
import com.kidsguru.shop.models.Order;
import com.kidsguru.shop.models.OrderAndShipping;

import com.kidsguru.shop.services.OrderItemService;
import com.kidsguru.shop.services.OrderService;
import com.kidsguru.shop.services.ShippingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
// Done
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private OrderService orderService;


    private ShippingService shippingService;

    private OrderItemService orderItemService;

    @RequestMapping("/")
    public String defaultOrder() {
        return "Default order endpoint";
    }


    // get orders by customer_id
    @RequestMapping(path = "/customer{id}", method = RequestMethod.GET)
    public List<Order> getOrderByCustomerId(@PathVariable("id") int id) {
        return orderService.getOrderByCustomerId(id);
    }


    // get orders by shipping_id
    @RequestMapping(path = "/shipping{id}", method = RequestMethod.GET)
    public List<Order> getOrderByShippingId(@PathVariable("id") int id) {
        return orderService.getOrderByShippingId(id);
    }


    // get order by order_id
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Order getOrder(@PathVariable("id") int id) throws Exception {
        return orderService.getOrderById(id);
    }


    // update order status
    @RequestMapping(method = RequestMethod.PUT)
    public void putOrder(@RequestBody OrderAndShipping orderAndShipping) throws Exception {
        orderService.saveOrder(orderAndShipping);
    }


    //create new order
    @RequestMapping(method = RequestMethod.POST)
    public Order postOrder(@RequestBody OrderAndShipping orderAndShipping) throws Exception {
        return orderService.saveOrder(orderAndShipping);
    }

}
