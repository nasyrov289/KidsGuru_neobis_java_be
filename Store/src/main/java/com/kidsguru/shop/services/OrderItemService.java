package com.kidsguru.shop.services;

import com.kidsguru.shop.entities.OrderItemEntity;
import com.kidsguru.shop.models.OrderItem;
import com.kidsguru.shop.repositories.OrderItemRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OrderItemService {
    private OrderItemRepository orderItemRepository;

    public OrderItem getOrderItemById(int orderId) {
        return new OrderItem(orderItemRepository.findById(orderId).orElse(new OrderItemEntity()));
    }

    public List<OrderItem> getAllOrderItem() {
        ArrayList<OrderItem> orderItemList = new ArrayList<>();
        for (int i = 0; i < orderItemRepository.findAll().size(); i++) {
            orderItemList.add(new OrderItem(orderItemRepository.findAll().get(i)));
        }
        return orderItemList;
    }

    public OrderItem saveOrderItem(OrderItem orderItem) {
        OrderItemEntity saveResult = orderItemRepository.save(orderItem.convertToEntity());
        return new OrderItem(saveResult);
    }

    public void deleteOrderItemById(int orderId) {
        orderItemRepository.deleteById(orderId);
    }
}
