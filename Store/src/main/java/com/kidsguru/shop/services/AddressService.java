package com.kidsguru.shop.services;

import com.kidsguru.shop.entities.AddressEntity;
import com.kidsguru.shop.exception.RecordNotFoundException;
import com.kidsguru.shop.models.Address;
import com.kidsguru.shop.repositories.AddressRepository;
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
        AddressEntity saveResult = addressRepository.save(address.convertToEntity());
        return new Address(saveResult);
    }

    public void deleteAddressById(int addressId) {
        addressRepository.deleteById(addressId);
    }
}
