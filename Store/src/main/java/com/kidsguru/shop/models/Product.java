package com.kidsguru.shop.models;

import com.kidsguru.shop.entities.ProductEntity;

import java.sql.Timestamp;

public class Product {
    private int productId;
    private String productName;
    private Timestamp dateModified;
    private String description;
    private int stock;
    private double unitCost;

    public Product() {
    }

    public Product(int productId, String productName, Timestamp dateModified, String description, int stock, double unitCost) {
        this.productId = productId;
        this.productName = productName;
        this.dateModified = dateModified;
        this.description = description;
        this.stock = stock;
        this.unitCost = unitCost;
    }

    public Product(ProductEntity productEntity) {
        this.productId = productEntity.getProductId();
        this.productName = productEntity.getProductName();
        this.dateModified = productEntity.getDateModified();
        this.description = productEntity.getDescription();
        this.stock = productEntity.getStock();
        this.unitCost = productEntity.getUnitCost();
    }

    public ProductEntity convertToEntity(){
        return new ProductEntity(productId, productName, dateModified, description, stock, unitCost);
    }
    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Timestamp getDateModified() {
        return dateModified;
    }

    public void setDateModified(Timestamp dateModified) {
        this.dateModified = dateModified;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public double getUnitCost() {
        return unitCost;
    }

    public void setUnitCost(double unitCost) {
        this.unitCost = unitCost;
    }
}
