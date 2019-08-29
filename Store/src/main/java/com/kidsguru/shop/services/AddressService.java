package com.kidsguru.shop.services;

import com.kidsguru.shop.models.Address;
import com.kidsguru.shop.repositories.AddressRepository;
import com.kidsguru.shop.exception.RecordNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AddressService {

    @Autowired
    private AddressRepository addressRepository;

    public Address getAddressById(int addressId) throws Exception {
        return new Address(addressRepository.findById(addressId).orElseThrow(RecordNotFoundException::new));
    }

    public Address saveAddress(Address address) {
        return new Address(addressRepository.save(address.convertToEntity()));
    }
    
    public void deleteAddressById(int addressId) {
        addressRepository.deleteById(addressId);
    }
}
