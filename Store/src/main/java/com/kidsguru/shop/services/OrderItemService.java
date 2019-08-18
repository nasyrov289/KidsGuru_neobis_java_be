package com.kidsguru.shop.services;

import com.kidsguru.shop.entities.OrderItemEntity;
import com.kidsguru.shop.models.OrderItem;
import com.kidsguru.shop.repositories.OrderItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderItemService {
    @Autowired
    private OrderItemRepository orderItemRepository;

    public OrderItem getOrderItemById(int orderId) {
        return new OrderItem(orderItemRepository.findById(orderId).orElse(new OrderItemEntity()));
    }


    public OrderItem saveOrderItem(OrderItem orderItem) {
        OrderItemEntity saveResult = orderItemRepository.save(orderItem.convertToEntity());
        return new OrderItem(saveResult);
    }

    public void deleteOrderItemById(int orderId) {
        orderItemRepository.deleteById(orderId);
    }
}
