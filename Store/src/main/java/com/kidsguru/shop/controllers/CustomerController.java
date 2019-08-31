package com.kidsguru.shop.controllers;

import com.kidsguru.shop.models.AddressUserAndCustomer;
import com.kidsguru.shop.models.Customer;
import com.kidsguru.shop.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


//Done
@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @RequestMapping("/")
    public String defaultCustomer() {
        return "Default customer endpoint";
    }


    // get customer by customer id
    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    public Customer getCustomer(@PathVariable("id") int id) throws Exception {
        return customerService.getCustomerById(id);
    }

    @RequestMapping(value = "/user{id}", method = RequestMethod.GET)
    public Customer getCustomerByUserId(@PathVariable("id") int id) throws Exception {
        return customerService.getCustomerByUserId(id);
    }


    // update customer information
    @RequestMapping(method = RequestMethod.PUT)
    public void putCustomer(@RequestBody AddressUserAndCustomer addressUserAndCustomer) {
        customerService.saveCustomer(addressUserAndCustomer);
    }


    // create new customer
    @RequestMapping(method = RequestMethod.POST)
    public Customer postCustomer(@RequestBody AddressUserAndCustomer addressUserAndCustomer) {
        return customerService.saveCustomer(addressUserAndCustomer);
    }


    // delete customer
    @RequestMapping(method = RequestMethod.DELETE)
    public void deleteCustomer(@PathVariable int id) {
        customerService.deleteCustomerById(id);

    }
}
