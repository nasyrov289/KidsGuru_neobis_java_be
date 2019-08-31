package com.kidsguru.shop.entities;

import javax.persistence.*;

@Entity
@Table(name = "seller")
public class SellerEntity {
    private int sellerId;
    private int userId;
    private String sellerName;
    private String sellerEmail;
    private String phone;

    public SellerEntity() {
    }

    public SellerEntity(int userId, String sellerName, String sellerEmail, String phone) {
        this.userId = userId;
        this.sellerName = sellerName;
        this.sellerEmail = sellerEmail;
        this.phone = phone;
    }

    public SellerEntity(int sellerId, int userId, String sellerName, String sellerEmail, String phone) {
        this.sellerId = sellerId;
        this.userId = userId;
        this.sellerName = sellerName;
        this.sellerEmail = sellerEmail;
        this.phone = phone;
    }

    @Id
    @Column(name = "seller_id")
    public int getSellerId() {
        return sellerId;
    }

    public void setSellerId(int sellerId) {
        this.sellerId = sellerId;
    }

    @Basic
    @Column(name = "user_id")
    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "seller_name")
    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    @Basic
    @Column(name = "seller_email")
    public String getSellerEmail() {
        return sellerEmail;
    }

    public void setSellerEmail(String sellerEmail) {
        this.sellerEmail = sellerEmail;
    }

    @Basic
    @Column(name = "phone")
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SellerEntity that = (SellerEntity) o;

        if (sellerId != that.sellerId) return false;
        if (userId != that.userId) return false;
        if (!sellerName.equals(that.sellerName)) return false;
        if (!sellerEmail.equals(that.sellerEmail)) return false;
        return phone.equals(that.phone);
    }

    @Override
    public int hashCode() {
        int result = sellerId;
        result = 31 * result + userId;
        result = 31 * result + sellerName.hashCode();
        result = 31 * result + sellerEmail.hashCode();
        result = 31 * result + phone.hashCode();
        return result;
    }
}
