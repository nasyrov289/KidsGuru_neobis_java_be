package com.kidsguru.shop.models;

import com.kidsguru.shop.entities.OrderItemEntity;

public class OrderItem {
    private int productId;
    private int orderId;
    private int quantity;

    public OrderItem() {
    }

    public OrderItem(int productId, int orderId, int quantity) {
        this.productId = productId;
        this.orderId = orderId;
        this.quantity = quantity;
    }

    public OrderItem(OrderItemEntity orderItemEntity) {
        this.quantity = orderItemEntity.getQuantity();
    }

    public OrderItemEntity convertToEntity(){
        return new OrderItemEntity(quantity);
    }
    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}