package com.kidsguru.shop.services;

import com.kidsguru.shop.entities.CustomerEntity;
import com.kidsguru.shop.models.Customer;
import com.kidsguru.shop.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public Customer getCustomerById(int customerId) {
        return new Customer(customerRepository.findById(customerId).orElseThrow(RuntimeException::new));
    }


    public Customer saveCustomer(Customer customer) {
        CustomerEntity saveResult = customerRepository.save(customer.convertToEntity());
        return new Customer(saveResult);
    }

    public void deleteCustomerById(int customerId) {
        customerRepository.deleteById(customerId);
    }
}
