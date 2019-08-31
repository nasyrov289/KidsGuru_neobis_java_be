package com.kidsguru.shop.entities;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "product")
public class ProductEntity {
    private int productId;
    private String productName;
    private Timestamp dateModified;
    private String description;
    private int stock;
    private double unitCost;
    private int sellerId;

    public ProductEntity() {
    }

    public ProductEntity(String productName, Timestamp dateModified, String description, int stock, double unitCost, int sellerId) {
        this.productName = productName;
        this.dateModified = dateModified;
        this.description = description;
        this.stock = stock;
        this.unitCost = unitCost;
        this.sellerId = sellerId;
    }

    public ProductEntity(int productId, String productName, Timestamp dateModified, String description, int stock, double unitCost, int sellerId) {
        this.productId = productId;
        this.productName = productName;
        this.dateModified = dateModified;
        this.description = description;
        this.stock = stock;
        this.unitCost = unitCost;
        this.sellerId = sellerId;
    }

    @Id
    @Column(name = "product_id")
    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    @Basic
    @Column(name = "product_name")
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Basic
    @Column(name = "date_modified")
    public Timestamp getDateModified() {
        return dateModified;
    }

    public void setDateModified(Timestamp dateModified) {
        this.dateModified = dateModified;
    }

    @Basic
    @Column(name = "description")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "stock")
    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Basic
    @Column(name = "unit_cost")
    public double getUnitCost() {
        return unitCost;
    }

    public void setUnitCost(double unitCost) {
        this.unitCost = unitCost;
    }

    @Basic
    @Column(name = "seller_id")
    public int getSellerId() {
        return sellerId;
    }

    public void setSellerId(int sellerId) {
        this.sellerId = sellerId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProductEntity that = (ProductEntity) o;

        if (productId != that.productId) return false;
        if (stock != that.stock) return false;
        if (Double.compare(that.unitCost, unitCost) != 0) return false;
        if (sellerId != that.sellerId) return false;
        if (!productName.equals(that.productName)) return false;
        if (!dateModified.equals(that.dateModified)) return false;
        return description.equals(that.description);
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = productId;
        result = 31 * result + productName.hashCode();
        result = 31 * result + dateModified.hashCode();
        result = 31 * result + description.hashCode();
        result = 31 * result + stock;
        temp = Double.doubleToLongBits(unitCost);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + sellerId;
        return result;
    }
}
