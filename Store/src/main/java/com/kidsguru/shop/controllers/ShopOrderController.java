package com.kidsguru.shop.controllers;

import com.kidsguru.shop.models.ShopOrder;
import com.kidsguru.shop.services.ShopOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping("/shopOrder")
public class ShopOrderController {
    //private Logger logger = LoggerFactory.getLogger(OrderController.class);

    @Autowired
    private ShopOrderService shopOrderService;

    @RequestMapping("/")
    public String defaultShopOrder() {
        //logger.info("You've hit the default endpoint");
        //logger.debug("This is a debugging message for the default endpoint");
        return "Default shopOrder endpoint";
    }

    @RequestMapping(method = RequestMethod.GET)
    public ShopOrder getShopOrderById(@RequestParam("id") int id) {
        return shopOrderService.getShopOrderById(id);
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<ShopOrder> getAllShopOrder() {
        return shopOrderService.getAllShopOrder();
    }


    @RequestMapping(method = RequestMethod.PUT)
    public void updateShopOrder(@RequestBody ShopOrder shopOrder) {
        shopOrderService.saveShopOrder(shopOrder);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ShopOrder createShopOrder(@RequestBody ShopOrder shopOrder) {
        return shopOrderService.saveShopOrder(shopOrder);
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public void deleteShopOrderById(@PathParam("id") int id) {
        shopOrderService.deleteShopOrderById(id);
    }
}