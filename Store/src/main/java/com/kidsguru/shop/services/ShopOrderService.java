package com.kidsguru.shop.services;

import com.kidsguru.shop.entities.ShopOrderEntity;
import com.kidsguru.shop.models.ShopOrder;
import com.kidsguru.shop.repositories.ShopOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ShopOrderService {
    @Autowired
    private ShopOrderRepository shopOrderRepository;

    public ShopOrder getShopOrderById(int orderId) {
        return new ShopOrder(shopOrderRepository.findById(orderId).orElse(new ShopOrderEntity()));
    }

    public List<ShopOrder> getAllShopOrder() {
        ArrayList<ShopOrder> shopOrderList = new ArrayList<>();
        for (int i = 0; i < shopOrderRepository.findAll().size(); i++) {
            shopOrderList.add(new ShopOrder(shopOrderRepository.findAll().get(i)));
        }
        return shopOrderList;
    }

    public ShopOrder saveShopOrder(ShopOrder shopOrder) {
        ShopOrderEntity saveResult = shopOrderRepository.save(shopOrder.convertToEntity());
        return new ShopOrder(saveResult);
    }

    public void deleteShopOrderById(int orderId) {
        shopOrderRepository.deleteById(orderId);
    }

    public void deleteAllShopOrder(ShopOrder shopOrder) {
        shopOrderRepository.deleteAll();
    }
}
