package com.kidsguru.shop.entities;

import javax.persistence.*;

@Entity
@Table(name = "customer", schema = "shop")
public class CustomerEntity {
    private int customerId;
    private int addressId;
    private String customerName;
    private String customerEmail;
    private String paymentInfo;


    public CustomerEntity() {
    }

    public CustomerEntity(int addressId, String customerName, String customerEmail, String paymentInfo) {
        this.addressId = addressId;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.paymentInfo = paymentInfo;
    }
    public CustomerEntity(int customerId, int addressId, String customerName, String customerEmail, String paymentInfo) {
        this.customerId = customerId;
        this.addressId = addressId;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.paymentInfo = paymentInfo;
    }
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id")
    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    @Basic
    @Column(name = "address_id")
    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }

    @Basic
    @Column(name = "customer_name", nullable = false)
    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    @Basic
    @Column(name = "customer_email", nullable = false)
    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    @Basic
    @Column(name = "payment_info", nullable = false)
    public String getPaymentInfo() {
        return paymentInfo;
    }

    public void setPaymentInfo(String paymentInfo) {
        this.paymentInfo = paymentInfo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CustomerEntity that = (CustomerEntity) o;

        if (customerId != that.customerId) return false;
        if (addressId != that.addressId) return false;
        if (customerName != null ? !customerName.equals(that.customerName) : that.customerName != null) return false;
        if (customerEmail != null ? !customerEmail.equals(that.customerEmail) : that.customerEmail != null)
            return false;
        if (paymentInfo != null ? !paymentInfo.equals(that.paymentInfo) : that.paymentInfo != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = customerId;
        result = 31 * result + addressId;
        result = 31 * result + (customerName != null ? customerName.hashCode() : 0);
        result = 31 * result + (customerEmail != null ? customerEmail.hashCode() : 0);
        result = 31 * result + (paymentInfo != null ? paymentInfo.hashCode() : 0);
        return result;
    }
}
