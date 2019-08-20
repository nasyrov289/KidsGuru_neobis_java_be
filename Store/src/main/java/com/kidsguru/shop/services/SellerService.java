package com.kidsguru.shop.services;

import com.kidsguru.shop.entities.SellerEntity;
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

    public Seller getSellerById(int sellerId) {
        return new Seller(sellerRepository.findById(sellerId).orElseThrow(RuntimeException::new));
    }

    public List<Seller> getAllSeller() {
        ArrayList<Seller> sellerList = new ArrayList<>();
        for (int i = 0; i < sellerRepository.findAll().size(); i++) {
            sellerList.add(new Seller(sellerRepository.findAll().get(i)));
        }
        return sellerList;
    }

    public Seller saveSeller(Seller seller) {
        SellerEntity saveResult = sellerRepository.save(seller.convertToEntity());
        return new Seller(saveResult);
    }

    public void deleteSellerById(int sellerId) {
        sellerRepository.deleteById(sellerId);
    }
}
