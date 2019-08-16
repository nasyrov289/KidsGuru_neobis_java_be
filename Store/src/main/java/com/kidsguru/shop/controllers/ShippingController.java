package com.kidsguru.shop.controllers;

import com.kidsguru.shop.models.Shipping;
import com.kidsguru.shop.services.ShippingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping("/shipping")
public class ShippingController {
    //private Logger logger = LoggerFactory.getLogger(OrderController.class);

    @Autowired
    private ShippingService shippingService;

    @RequestMapping("/")
    public String defaultShipping() {
        //logger.info("You've hit the default endpoint");
        //logger.debug("This is a debugging message for the default endpoint");
        return "Default shipping endpoint";
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Shipping getShippingById(@RequestParam("id") int id) {
        return shippingService.getShippingById(id);
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<Shipping> getAllShipping() {
        return shippingService.getAllShipping();
    }


    @RequestMapping(method = RequestMethod.PUT)
    public void updateShipping(@RequestBody Shipping shipping) {
        shippingService.saveShipping(shipping);
    }

    @RequestMapping(method = RequestMethod.POST)
    public Shipping createShipping(@RequestBody Shipping shipping) {
        return shippingService.saveShipping(shipping);
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public void deleteShippingById(@PathParam("id") int id) {
        shippingService.deleteShippingById(id);
    }
}