package com.kidsguru.shop.models;

import java.sql.Timestamp;

public class AddressUserAndCustomer {
    private int userId;
    private String userName;
    private String password;
    private Timestamp registerDate;
    private String role;

    private int customerId;
    private int addressId;
    private String customerName;
    private String customerEmail;
    private String paymentInfo;

    private String street;
    private String streetNo;
    private String unitNo;
    private String city;
    private String country;
    private String other;

   public Customer extractCustomer() { return new Customer(customerId, userId, addressId, customerName, customerEmail, paymentInfo);}

    public Address extractAddress() { return new Address(addressId, street, streetNo, unitNo, city, country, other);}

    public User extractUser() {
        return new User(userId, userName, password, registerDate, role);
    }


    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Timestamp getRegisterDate() {
        return registerDate;
    }

    public void setRegisterDate(Timestamp registerDate) {
        this.registerDate = registerDate;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
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

    public String getStreet() { return street; }

    public void setStreet(String street) { this.street = street; }

    public String getStreetNo() { return streetNo; }

    public void setStreetNo(String streetNo) {
        this.streetNo = streetNo;
    }

    public String getUnitNo() { return unitNo; }

    public void setUnitNo(String unitNo) {
        this.unitNo = unitNo;
    }

    public String getCity() { return city; }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() { return country; }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getOther() { return other; }

    public void setOther(String other) { this.other = other; }

}


