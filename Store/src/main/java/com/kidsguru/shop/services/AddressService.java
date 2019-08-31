package com.kidsguru.shop.services;

import com.kidsguru.shop.exception.RecordNotFoundException;
import com.kidsguru.shop.models.Address;
import com.kidsguru.shop.models.AddressUserAndCustomer;
import com.kidsguru.shop.repositories.AddressRepository;
import com.kidsguru.shop.repositories.CustomerRepository;
import com.kidsguru.shop.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AddressService {

    @Autowired
    private CustomerService customerService;

    @Autowired
    private UserService userService;

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private AddressRepository addressRepository;



    public Address getAddressById(int addressId) throws Exception {
        return new Address(addressRepository.findById(addressId).orElseThrow(RecordNotFoundException::new));
    }

    public Address saveAddress(AddressUserAndCustomer addressUserAndCustomer) {
        try {
            userService.getUserById(addressUserAndCustomer.getUserId());
            customerService.getCustomerById(addressUserAndCustomer.getUserId());
        } catch (Exception e) {
            userRepository.save(addressUserAndCustomer.extractUser().convertToEntity());
            customerRepository.save(addressUserAndCustomer.extractCustomer().convertToEntity());

        }
        return new Address(addressRepository.save(addressUserAndCustomer.extractAddress().convertToEntity()));
    }
    
    public void deleteAddressById(int addressId) {
        addressRepository.deleteById(addressId);
    }
}
