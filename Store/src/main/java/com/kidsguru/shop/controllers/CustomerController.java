package com.kidsguru.shop.controllers;

import com.kidsguru.shop.models.Customer;
import com.kidsguru.shop.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @RequestMapping("/")
    public String defaultCustomer() {
        return "Default customer endpoint";
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Customer getCustomerById(@RequestParam("id") int id) {
        return customerService.getCustomerById(id);
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<Customer> getAllCustomer() {
        return customerService.getAllCustomer();
    }


    @RequestMapping(method = RequestMethod.PUT)
    public void updateCustomer(@RequestBody Customer customer) {
        customerService.saveCustomer(customer);
    }

    @RequestMapping(method = RequestMethod.POST)
    public Customer createCustomer(@RequestBody Customer customer) {
        return customerService.saveCustomer(customer);
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public void deleteCustomerById(@PathParam("id") int id) {
        customerService.deleteCustomerById(id);
    }
}