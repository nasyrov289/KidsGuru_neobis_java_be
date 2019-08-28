package com.kidsguru.shop.services;

import com.kidsguru.shop.entities.OrderItemEntity;
import com.kidsguru.shop.entities.OrderItemEntityPK;
import com.kidsguru.shop.exception.RecordNotFoundException;
import com.kidsguru.shop.models.OrderItem;
import com.kidsguru.shop.repositories.OrderItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderItemService {

    @Autowired
    private OrderItemRepository orderItemRepository;

    public OrderItem getOrderItemById(OrderItemEntityPK orderId) throws Exception{
        return new OrderItem(orderItemRepository.findById(orderId).orElseThrow(RecordNotFoundException::new));
    }

    public OrderItem saveOrderItem(OrderItem orderItem) {
        OrderItemEntity saveResult = orderItemRepository.save(orderItem.convertToEntity());
        return new OrderItem(saveResult);
    }

    public void deleteOrderItemById(OrderItemEntityPK orderId) {
        orderItemRepository.deleteById(orderId);
    }
}
