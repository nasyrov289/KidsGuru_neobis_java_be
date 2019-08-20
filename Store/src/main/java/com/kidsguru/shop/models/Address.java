package com.kidsguru.shop.models;

import com.kidsguru.shop.entities.AddressEntity;

public class Address {
    private int addressId;
    private String street;
    private String streetNo;
    private String unitNo;
    private String city;
    private String country;
    private String other;

    public Address() {
    }

    public Address(int addressId, String street, String streetNo, String unitNo, String city, String country, String other) {
        this.addressId = addressId;
        this.street = street;
        this.streetNo = streetNo;
        this.unitNo = unitNo;
        this.city = city;
        this.country = country;
        this.other = other;
    }

    public Address(AddressEntity addressEntity) {
        this.addressId = addressEntity.getAddressId();
        this.street = addressEntity.getStreet();
        this.streetNo = addressEntity.getStreetNo();
        this.unitNo = addressEntity.getUnitNo();
        this.city = addressEntity.getCity();
        this.country = addressEntity.getCountry();
        this.other = addressEntity.getOther();
    }

    public AddressEntity convertToEntity() {
        return new AddressEntity(addressId, street, streetNo, unitNo, city, country, other);
    }

    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getStreetNo() {
        return streetNo;
    }

    public void setStreetNo(String streetNo) {
        this.streetNo = streetNo;
    }

    public String getUnitNo() {
        return unitNo;
    }

    public void setUnitNo(String unitNo) {
        this.unitNo = unitNo;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getOther() {
        return other;
    }

    public void setOther(String other) {
        this.other = other;
    }

}