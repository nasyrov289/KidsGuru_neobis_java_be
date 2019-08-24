package com.kidsguru.shop.services;

import com.kidsguru.shop.entities.SellerEntity;
import com.kidsguru.shop.exception.RecordNotFoundException;
import com.kidsguru.shop.models.Seller;
import com.kidsguru.shop.repositories.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SellerService {
    @Autowired
    private SellerRepository sellerRepository;

    public Seller getSellerById(int sellerId) throws Exception{
        return new Seller(sellerRepository.findById(sellerId).orElseThrow(RecordNotFoundException::new));
    }


    public Seller saveSeller(Seller seller) {
        SellerEntity saveResult = sellerRepository.save(seller.convertToEntity());
        return new Seller(saveResult);
    }

    public void deleteSellerById(int sellerId) {
        sellerRepository.deleteById(sellerId);
    }
}
