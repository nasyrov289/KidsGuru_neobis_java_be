package com.kidsguru.shop.services;

import com.kidsguru.shop.exception.RecordNotFoundException;
import com.kidsguru.shop.models.AddressUserAndCustomer;
import com.kidsguru.shop.models.Customer;
import com.kidsguru.shop.repositories.AddressRepository;
import com.kidsguru.shop.repositories.CustomerRepository;
import com.kidsguru.shop.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    private AddressRepository addressRepository;
    @Autowired
    private AddressService addressService;
    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private UserService userService;
    @Autowired
    private UserRepository userRepository;


    public Customer getCustomerById(int customerId) throws Exception {
        return new Customer(customerRepository.findById(customerId).orElseThrow(RecordNotFoundException::new));
    }public Customer getCustomerByUserId(int customerId){
        return new Customer(customerRepository.findByUserId(customerId));
    }

    public Customer saveCustomer(AddressUserAndCustomer addressUserAndCustomer) {

        try {
            userService.getUserById(addressUserAndCustomer.getUserId());
            addressService.getAddressById(addressUserAndCustomer.getAddressId());
        } catch (Exception e) {
            userRepository.save(addressUserAndCustomer.extractUser().convertToEntity());
            addressRepository.save(addressUserAndCustomer.extractAddress().convertToEntity());
        }

        return new Customer(customerRepository.save(addressUserAndCustomer.extractCustomer().convertToEntity()));
    }


    public void deleteCustomerById(int customerId) {
        customerRepository.deleteById(customerId);
    }

}
