package com.kidsguru.shop.entities;

import javax.persistence.*;

@Entity
@Table(name = "seller", schema = "shop")
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
    @Column(name = "seller_name", nullable = false)
    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    @Basic
    @Column(name = "seller_email", nullable = false)
    public String getSellerEmail() {
        return sellerEmail;
    }

    public void setSellerEmail(String sellerEmail) {
        this.sellerEmail = sellerEmail;
    }

    @Basic
    @Column(name = "phone", nullable = false)
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
        if (sellerName != null ? !sellerName.equals(that.sellerName) : that.sellerName != null) return false;
        if (sellerEmail != null ? !sellerEmail.equals(that.sellerEmail) : that.sellerEmail != null) return false;
        if (phone != null ? !phone.equals(that.phone) : that.phone != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = sellerId;
        result = 31 * result + userId;
        result = 31 * result + (sellerName != null ? sellerName.hashCode() : 0);
        result = 31 * result + (sellerEmail != null ? sellerEmail.hashCode() : 0);
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        return result;
    }
}
