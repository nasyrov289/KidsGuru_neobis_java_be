package com.kidsguru.shop.services;

import com.kidsguru.shop.entities.CustomerEntity;
import com.kidsguru.shop.models.Customer;
import com.kidsguru.shop.models.User;
import com.kidsguru.shop.repositories.CustomerRepository;
import com.kidsguru.shop.exception.RecordNotFoundException;
import com.kidsguru.shop.models.Customer;
import com.kidsguru.shop.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    UserService userService;
    @Autowired
    UserRepository userRepository;


    public Customer getCustomerById(int customerId) throws Exception {
        return new Customer(customerRepository.findById(customerId).orElseThrow(RecordNotFoundException::new));
    }

    public Customer saveCustomer(Customer customer) {
        return new Customer(customerRepository.save(customer.convertToEntity()));
    }


    public void deleteCustomerById(int customerId) {
        customerRepository.deleteById(customerId);
    }

    public void deleteCustomerByAddressId(int addressId) {
        customerRepository.deleteCustomerEntitiesByAddressId(addressId);

    }
}
