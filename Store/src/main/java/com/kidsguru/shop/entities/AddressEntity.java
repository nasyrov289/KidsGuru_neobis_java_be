package com.kidsguru.shop.entities;

import javax.persistence.*;

@Entity
@Table(name = "address", schema = "shop")
public class AddressEntity {
    private int addressId;
    private String street;
    private String streetNo;
    private String unitNo;
    private String city;
    private String country;
    private String other;

    public AddressEntity() { }

    // without addressId
    public AddressEntity(String street, String streetNo, String unitNo, String city, String country, String other) {
        this.street = street;
        this.streetNo = streetNo;
        this.unitNo = unitNo;
        this.city = city;
        this.country = country;
        this.other = other;
    }

    public AddressEntity(int addressId, String street, String streetNo, String unitNo, String city, String country, String other) {
        this.addressId = addressId;
        this.street = street;
        this.streetNo = streetNo;
        this.unitNo = unitNo;
        this.city = city;
        this.country = country;
        this.other = other;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "address_id")
    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }

    @Basic
    @Column(name = "street")
    public String getStreet() { return street; }

    public void setStreet(String street) {
        this.street = street;
    }

    @Basic
    @Column(name = "street_no")
    public String getStreetNo() { return streetNo; }

    public void setStreetNo(String streetNo) {
        this.streetNo = streetNo;
    }

    @Basic
    @Column(name = "unit_no")
    public String getUnitNo() { return unitNo; }

    public void setUnitNo(String unitNo) {
        this.unitNo = unitNo;
    }

    @Basic
    @Column(name = "city")
    public String getCity() { return city; }

    public void setCity(String city) {
        this.city = city;
    }

    @Basic
    @Column(name = "country")
    public String getCountry() { return country; }

    public void setCountry(String country) {
        this.country = country;
    }

    @Basic
    @Column(name = "other")
    public String getOther() { return other; }

    public void setOther(String other) {
        this.other = other;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AddressEntity that = (AddressEntity) o;

        if (addressId != that.addressId) return false;
        if (street != null ? !street.equals(that.street) : that.street != null) return false;
        if (streetNo != null ? !streetNo.equals(that.streetNo) : that.streetNo != null) return false;
        if (unitNo != null ? !unitNo.equals(that.unitNo) : that.unitNo != null) return false;
        if (city != null ? !city.equals(that.city) : that.city != null) return false;
        if (country != null ? !country.equals(that.country) : that.country != null) return false;
        if (other != null ? !other.equals(that.other) : that.other != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        result = addressId;
        result = 31 * result + (street != null ? street.hashCode() : 0);
        result = 31 * result + (streetNo != null ? streetNo.hashCode() : 0);
        result = 31 * result + (unitNo != null ? unitNo.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (country != null ? country.hashCode() : 0);
        result = 31 * result + (other != null ? other.hashCode() : 0);

        return result;
    }
}
