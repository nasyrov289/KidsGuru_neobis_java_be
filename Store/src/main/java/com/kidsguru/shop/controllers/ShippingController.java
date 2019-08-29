package com.kidsguru.shop.controllers;

import com.kidsguru.shop.models.Shipping;
import com.kidsguru.shop.services.ShippingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

//Done
@RestController
@RequestMapping("/shipping")
public class ShippingController {

    @Autowired
    private ShippingService shippingService;

    @RequestMapping("/")
    public String defaultShipping() {
        return "Default shipping endpoint";
    }


    // get shipping by shipping_id
    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Shipping getShippingById(@PathVariable("id") int id) throws Exception {
        return shippingService.getShippingById(id);
    }


    // update shipping
    @RequestMapping(method = RequestMethod.PUT)
    public void updateShipping(@RequestBody Shipping shipping) {
        shippingService.saveShipping(shipping);
    }


    // create new shipping task
    @RequestMapping(method = RequestMethod.POST)
    public Shipping createShipping(@RequestBody Shipping shipping) {
        return shippingService.saveShipping(shipping);
    }


    // delete shipping
    @RequestMapping(method = RequestMethod.DELETE)
    public void deleteShippingById(@PathParam("id") int id) {
        shippingService.deleteShippingById(id);
    }
}