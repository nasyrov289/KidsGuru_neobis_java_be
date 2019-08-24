package com.kidsguru.shop.services;

import com.kidsguru.shop.entities.ShippingEntity;
import com.kidsguru.shop.exception.RecordNotFoundException;
import com.kidsguru.shop.models.Shipping;
import com.kidsguru.shop.repositories.ShippingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ShippingService {

    @Autowired
    private ShippingRepository shippingRepository;

    public Shipping getShippingById(int shippingId) throws Exception {
        return new Shipping(shippingRepository.findById(shippingId).orElseThrow(RecordNotFoundException::new));
    }

    public Shipping saveShipping(Shipping shipping) {
        ShippingEntity saveResult = shippingRepository.save(shipping.convertToEntity());
        return new Shipping(saveResult);
    }
}
