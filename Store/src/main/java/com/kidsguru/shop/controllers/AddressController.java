package com.kidsguru.shop.controllers;

import com.kidsguru.shop.models.Address;
import com.kidsguru.shop.models.Address;
import com.kidsguru.shop.services.AddressService;
import com.kidsguru.shop.services.CustomerService;
import com.kidsguru.shop.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

//Done
@RestController
@RequestMapping("/address")
public class AddressController {

    @Autowired
    CustomerService customerService;
    @Autowired
    UserService userService;
    @Autowired
    private AddressService addressService;

    @RequestMapping("/")
    public String defaultAddress() {
        return "Default address endpoint";
    }


    // get address by address_id
    @RequestMapping(method = RequestMethod.GET)
    public Address getAddress(@RequestParam("id") int id) throws Exception {
        return addressService.getAddressById(id);
    }


    // update address
    @RequestMapping(method = RequestMethod.PUT)
    public void putAddress(@RequestBody Address address) throws Exception {
        addressService.saveAddress(address);
    }

    // create new address
    @RequestMapping(method = RequestMethod.POST)
    public Address postAddress(@RequestBody Address address) throws Exception {
        return addressService.saveAddress(address);
    }


    // delete address
    @RequestMapping(method = RequestMethod.DELETE)
    public void deleteAddress(@PathVariable int id) {
        addressService.deleteAddressById(id);
    }
}
