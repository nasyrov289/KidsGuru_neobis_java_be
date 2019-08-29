package com.kidsguru.shop.controllers;

import com.kidsguru.shop.models.Seller;
import com.kidsguru.shop.models.SellerAndUser;
import com.kidsguru.shop.services.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

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
    public void updateSeller(@RequestBody SellerAndUser sellerAndUser) throws Exception {
        sellerService.saveSeller(sellerAndUser);
    }


    // create new seller
    @RequestMapping(method = RequestMethod.POST)
    public Seller createSeller(@RequestBody SellerAndUser sellerAndUser) throws Exception {
        return sellerService.saveSeller(sellerAndUser);
    }


    // delete seller
    @RequestMapping(method = RequestMethod.DELETE)
    public void deleteSellerById(@PathParam("id") int id) {
        sellerService.deleteSellerById(id);
    }
}

