package com.kidsguru.shop.models;

import com.kidsguru.shop.entities.SellerEntity;

public class Seller {
    private int sellerId;
    private String sellerName;
    private String sellerEmail;
    private String phone;

    public Seller() {

    }

    public Seller(int sellerId, String sellerName, String sellerEmail, String phone) {
        this.sellerId = sellerId;
        this.sellerName = sellerName;
        this.sellerEmail = sellerEmail;
        this.phone = phone;
    }

    public Seller(SellerEntity sellerEntity) {
        this.sellerId = sellerEntity.getSellerId();
        this.sellerName = sellerEntity.getSellerName();
        this.sellerEmail = sellerEntity.getSellerEmail();
        this.phone = sellerEntity.getPhone();
    }

    public SellerEntity convertToEntity() {
        return new SellerEntity(sellerId, sellerName, sellerEmail, phone);
    }

    public int getSellerId() {
        return sellerId;
    }

    public void setSellerId(int sellerId) {
        this.sellerId = sellerId;
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
