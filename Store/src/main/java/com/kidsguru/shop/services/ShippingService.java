package com.kidsguru.shop.services;

import com.kidsguru.shop.entities.ShippingEntity;
import com.kidsguru.shop.models.Shipping;
import com.kidsguru.shop.repositories.ShippingRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ShippingService {
    private ShippingRepository shippingRepository;

    public Shipping getShippingById(int shippingId) {
        return new Shipping(shippingRepository.findById(shippingId).orElse(new ShippingEntity()));
    }

    public List<Shipping> getAllShipping() {
        ArrayList<Shipping> shippingList = new ArrayList<>();
        for (int i = 0; i < shippingRepository.findAll().size(); i++) {
            shippingList.add(new Shipping(shippingRepository.findAll().get(i)));
        }
        return shippingList;
    }

    public Shipping saveShipping(Shipping shipping) {
        ShippingEntity saveResult = shippingRepository.save(shipping.convertToEntity());
        return new Shipping(saveResult);
    }

    public void deleteShippingById(int shippingId) {
        shippingRepository.deleteById(shippingId);
    }
}
