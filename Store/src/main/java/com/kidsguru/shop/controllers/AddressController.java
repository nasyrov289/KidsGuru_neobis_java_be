package com.kidsguru.shop.controllers;

import com.kidsguru.shop.models.Address;
import com.kidsguru.shop.services.AddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping("/address")
public class AddressController {
    @Autowired
    private AddressService addressService;

    @RequestMapping("/")
    public String defaultAddress() {
        return "Default address endpoint";
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Address getAddressById(@RequestParam("id") int id) {
        return addressService.getAddressById(id);
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<Address> getAllAddress() {
        return addressService.getAllAddress();
    }


    @RequestMapping(method = RequestMethod.PUT)
    public void updateAddress(@RequestBody Address address) {
        addressService.saveAddress(address);
    }

    @RequestMapping(method = RequestMethod.POST)
    public Address createAddress(@RequestBody Address address) {
        return addressService.saveAddress(address);
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public void deleteAddressById(@PathParam("id") int id) {
        addressService.deleteAddressById(id);
    }
}