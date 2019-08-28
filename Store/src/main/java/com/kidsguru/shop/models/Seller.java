package com.kidsguru.shop.models;

import com.kidsguru.shop.entities.SellerEntity;

public class Seller {
    private int sellerId;
    private int userId;
    private String sellerName;
    private String sellerEmail;
    private String phone;

    public Seller() {

    }

    public Seller(int sellerId, int userId, String sellerName, String sellerEmail, String phone) {
        this.sellerId = sellerId;
        this.userId = userId;
        this.sellerName = sellerName;
        this.sellerEmail = sellerEmail;
        this.phone = phone;
    }

    public Seller(SellerEntity sellerEntity) {
        this.sellerId = sellerEntity.getSellerId();
        this.userId = sellerEntity.getUserId();
        this.sellerName = sellerEntity.getSellerName();
        this.sellerEmail = sellerEntity.getSellerEmail();
        this.phone = sellerEntity.getPhone();
    }

    public SellerEntity convertToEntity() {
        return new SellerEntity(sellerId, userId, sellerName, sellerEmail, phone);
    }

    public int getSellerId() {
        return sellerId;
    }

    public void setSellerId(int sellerId) {
        this.sellerId = sellerId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public String getSellerEmail() {
        return sellerEmail;
    }

    public void setSellerEmail(String sellerEmail) {
        this.sellerEmail = sellerEmail;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
