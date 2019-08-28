package com.kidsguru.shop.controllers;

import com.kidsguru.shop.models.Customer;
import com.kidsguru.shop.models.CustomerAndUser;
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
        //logger.info("You've hit the default endpoint");
        //logger.debug("This is a debugging message for the default endpoint");
        return "Default customer endpoint";
    }


    // get customer by customer id
    @RequestMapping(value = "{id}", method = RequestMethod.GET)
    public Customer getCustomer(@PathVariable("id") int id) throws Exception {
        return customerService.getCustomerById(id);
    }


    // update customer information
    @RequestMapping(method = RequestMethod.PUT)
    public void putCustomer(@RequestBody CustomerAndUser customerAndUser) throws Exception {
        customerService.saveCustomer(customerAndUser);
    }


    // create new customer
    @RequestMapping(method = RequestMethod.POST)
    public Customer postCustomer(@RequestBody CustomerAndUser customerAndUser) throws Exception {
        return customerService.saveCustomer(customerAndUser);
    }


    // delete customer
    @RequestMapping(method = RequestMethod.DELETE)
    public void deleteCustomer(@PathVariable int id) {
        customerService.deleteCustomerById(id);
    }
}
