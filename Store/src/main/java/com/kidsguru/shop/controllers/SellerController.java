package com.kidsguru.shop.controllers;

import com.kidsguru.shop.models.Seller;
import com.kidsguru.shop.services.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping("/seller")
public class SellerController {

    @Autowired
    private SellerService sellerService;

    @RequestMapping("/")
    public String defaultSeller() {
        return "Default seller endpoint";
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Seller getSellerById(@RequestParam("id") int id) {
        return sellerService.getSellerById(id);
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<Seller> getAllSeller() {
        return sellerService.getAllSeller();
    }


    @RequestMapping(method = RequestMethod.PUT)
    public void updateSeller(@RequestBody Seller seller) {
        sellerService.saveSeller(seller);
    }

    @RequestMapping(method = RequestMethod.POST)
    public Seller createSeller(@RequestBody Seller seller) {
        return sellerService.saveSeller(seller);
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public void deleteSellerById(@PathParam("id") int id) {
        sellerService.deleteSellerById(id);
    }
}