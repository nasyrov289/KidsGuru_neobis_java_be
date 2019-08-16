package com.kidsguru.shop.controllers;

import com.kidsguru.shop.models.OrderItem;
import com.kidsguru.shop.services.OrderItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping("/orderItem")
public class OrderItemController {
    //private Logger logger = LoggerFactory.getLogger(OrderController.class);

    @Autowired
    private OrderItemService orderItemService;

    @RequestMapping("/")
    public String defaultOrderItem() {
        //logger.info("You've hit the default endpoint");
        //logger.debug("This is a debugging message for the default endpoint");
        return "Default orderItem endpoint";
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public OrderItem getOrderItemById(@RequestParam("id") int id) {
        return orderItemService.getOrderItemById(id);
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<OrderItem> getAllOrderItem() {
        return orderItemService.getAllOrderItem();
    }


    @RequestMapping(method = RequestMethod.PUT)
    public void updateOrderItem(@RequestBody OrderItem orderItem) {
        orderItemService.saveOrderItem(orderItem);
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