package com.kidsguru.shop.controllers;

import com.kidsguru.shop.models.Seller;
import com.kidsguru.shop.models.SellerAndUser;
import com.kidsguru.shop.services.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

//Done

@RestController
@RequestMapping("/seller")
public class SellerController {

    @Autowired
    private SellerService sellerService;

    @RequestMapping("/")
    public String defaultSeller() {
        return "Default seller endpoint";
    }


    // get seller by seller_id

    @RequestMapping(method = RequestMethod.GET)
    public Seller getSellerById(@PathParam("id") int id) throws Exception {
        return sellerService.getSellerById(id);
    }


    // update seller information

    @RequestMapping(method = RequestMethod.PUT)
    public void updateSeller(@RequestBody SellerAndUser sellerAndUser){
        sellerService.saveSeller(sellerAndUser);
    }


    // create new seller

    @RequestMapping(method = RequestMethod.POST)
    public Seller createSeller(@RequestBody SellerAndUser sellerAndUser){
        return sellerService.saveSeller(sellerAndUser);
    }


    // delete seller

    @RequestMapping(method = RequestMethod.DELETE)
    public void deleteSellerById(@PathParam("id") int id) throws Exception {
        sellerService.deleteSellerById(id);
    }
}

