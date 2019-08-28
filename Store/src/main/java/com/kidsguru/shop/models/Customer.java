package com.kidsguru.shop.models;

import com.kidsguru.shop.entities.CustomerEntity;

public class Customer {

    private int customerId;
    private int userId;
    private int addressId;
    private String customerName;
    private String customerEmail;
    private String paymentInfo; // could be hex encoded, later?

    public Customer() { }

    public Customer(int customerId, int userId, int addressId, String customerName, String customerEmail, String paymentInfo) {
        this.customerId = customerId;
        this.userId = userId;
        this.addressId = addressId;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.paymentInfo = paymentInfo;
    }

    public Customer(CustomerEntity customerEntity) {
        this.customerId = customerEntity.getCustomerId();
        this.userId = customerEntity.getUserId();
        this.addressId = customerEntity.getAddressId();
        this.customerName = customerEntity.getCustomerName();
        this.customerEmail = customerEntity.getCustomerEmail();
        this.paymentInfo = customerEntity.getPaymentInfo();
    }

    public CustomerEntity convertToEntity() {
        return new CustomerEntity(customerId, userId, addressId, customerName, customerEmail, paymentInfo);
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getPaymentInfo() {
        return paymentInfo;
    }

    public void setPaymentInfo(String paymentInfo) {
        this.paymentInfo = paymentInfo;
    }

}
