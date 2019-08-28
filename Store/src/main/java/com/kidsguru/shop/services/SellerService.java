package com.kidsguru.shop.services;

import com.kidsguru.shop.entities.SellerEntity;
import com.kidsguru.shop.exception.RecordNotFoundException;
import com.kidsguru.shop.models.Seller;
import com.kidsguru.shop.models.SellerAndUser;
import com.kidsguru.shop.models.User;
import com.kidsguru.shop.repositories.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SellerService {
    @Autowired
    private UserService userService;

    @Autowired
    private SellerRepository sellerRepository;

    public Seller getSellerById(int sellerId) throws Exception{
        return new Seller(sellerRepository.findById(sellerId).orElseThrow(RecordNotFoundException::new));
    }


    public Seller saveSeller(SellerAndUser sellerAndUser) throws Exception{

        User user = userService.saveUser(sellerAndUser.extractUser());

        Seller seller = sellerAndUser.extractSeller();
        seller.setUserId(user.getUserId());

        SellerEntity saveResult = sellerRepository.save(seller.convertToEntity());
        return new Seller(saveResult);
    }

    public void deleteSellerById(int sellerId) {
        sellerRepository.deleteById(sellerId);
    }
}
