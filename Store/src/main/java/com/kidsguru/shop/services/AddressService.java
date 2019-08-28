package com.kidsguru.shop.services;

import com.kidsguru.shop.entities.AddressEntity;
import com.kidsguru.shop.exception.RecordNotFoundException;
import com.kidsguru.shop.models.Address;
import com.kidsguru.shop.models.AddressUserAndCustomer;
import com.kidsguru.shop.models.Customer;
import com.kidsguru.shop.models.User;
import com.kidsguru.shop.repositories.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class AddressService {

    @Autowired
    private AddressService addressService;

    @Autowired
    private UserService userService;

    @Autowired
    CustomerService customerService;

    @Autowired
    private AddressRepository addressRepository;
    private Address address;

    public Address getAddressById(int addressId) throws Exception {
        return new Address(addressRepository.findById(addressId).orElseThrow(RecordNotFoundException::new));
    }

    public Address saveAddress(AddressUserAndCustomer addressUserAndCustomer) throws Exception {

        User user = userService.saveUser(addressUserAndCustomer.extractUser());

        AddressEntity saveResult = addressRepository.save(address.convertToEntity());

        Customer customer = addressUserAndCustomer.extractCustomer();
        customer.setUserId(user.getUserId());
        customer.setAddressId(address.getAddressId());
        customerService.saveCustomer(customer);

        return new Address(saveResult);
    }
    
    public void deleteAddressById(int addressId) {
        addressRepository.deleteById(addressId);
    }
}
