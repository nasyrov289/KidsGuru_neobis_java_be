package com.kidsguru.shop.services;

import com.kidsguru.shop.entities.AddressEntity;
import com.kidsguru.shop.models.Address;
import com.kidsguru.shop.repositories.AddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AddressService {

    @Autowired
    private AddressRepository addressRepository;

    public Address getAddressById(int addressId) {
        return new Address(addressRepository.findById(addressId).orElseThrow(RuntimeException::new));
    }


    public List<Address> getAllAddress() {
        ArrayList<Address> addressList = new ArrayList<>();
        for (int i = 0; i < addressRepository.findAll().size(); i++) {
            addressList.add(new Address(addressRepository.findAll().get(i)));
        }
        return addressList;
    }

    public Address saveAddress(Address address) {
        AddressEntity saveResult = addressRepository.save(address.convertToEntity());
        return new Address(saveResult);
    }

    public void deleteAddressById(int addressId) {
        addressRepository.deleteById(addressId);
    }
}
