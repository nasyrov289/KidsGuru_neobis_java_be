package com.kidsguru.shop.services;

import com.kidsguru.shop.entities.SellerEntity;
import com.kidsguru.shop.exception.RecordNotFoundException;
import com.kidsguru.shop.models.Seller;
import com.kidsguru.shop.models.SellerAndUser;
import com.kidsguru.shop.repositories.SellerRepository;
import com.kidsguru.shop.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SellerService {
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private SellerRepository sellerRepository;

    public Seller getSellerById(int sellerId) throws Exception {
        return new Seller(sellerRepository.findById(sellerId).orElseThrow(RecordNotFoundException::new));
    }


    public Seller saveSeller(SellerAndUser sellerAndUser) {

        userRepository.save(sellerAndUser.extractUser().convertToEntity());

        Seller seller = sellerAndUser.extractSeller();
        seller.setUserId(sellerAndUser.getUserId());

        SellerEntity saveResult = sellerRepository.save(seller.convertToEntity());
        return new Seller(saveResult);
    }

    public void deleteSellerById(int sellerId) throws Exception {
        int temp = getSellerById(sellerId).getUserId();
        sellerRepository.deleteById(sellerId);
        userRepository.deleteById(temp);
    }
}
