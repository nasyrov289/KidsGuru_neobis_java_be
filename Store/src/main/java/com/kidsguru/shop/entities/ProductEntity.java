package com.kidsguru.shop.entities;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name = "product", schema = "shop")
public class ProductEntity {
    private int productId;
    private String productName;
    private Timestamp dateModified;
    private String description;
    private int stock;
    private double unitCost;

    public ProductEntity() {
    }

    public ProductEntity(String productName, Timestamp dateModified, String description, int stock, double unitCost) {
        this.productName = productName;
        this.dateModified = dateModified;
        this.description = description;
        this.stock = stock;
        this.unitCost = unitCost;
    }

    public ProductEntity(int productId, String productName, Timestamp dateModified, String description, int stock, double unitCost) {
        this.productId = productId;
        this.productName = productName;
        this.dateModified = dateModified;
        this.description = description;
        this.stock = stock;
        this.unitCost = unitCost;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    @Basic
    @Column(name = "product_name", nullable = false)
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    @Basic
    @Column(name = "date_modified", nullable = false)
    public Timestamp getDateModified() {
        return dateModified;
    }

    public void setDateModified(Timestamp dateModified) {
        this.dateModified = dateModified;
    }

    @Basic
    @Column(name = "description", nullable = false)
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
    @Column(name = "unit_cost", nullable = false)
    public double getUnitCost() {
        return unitCost;
    }

    public void setUnitCost(double unitCost) {
        this.unitCost = unitCost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ProductEntity that = (ProductEntity) o;

        if (productId != that.productId) return false;
        if (stock != that.stock) return false;
        if (Double.compare(that.unitCost, unitCost) != 0) return false;
        if (productName != null ? !productName.equals(that.productName) : that.productName != null) return false;
        if (dateModified != null ? !dateModified.equals(that.dateModified) : that.dateModified != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = productId;
        result = 31 * result + (productName != null ? productName.hashCode() : 0);
        result = 31 * result + (dateModified != null ? dateModified.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + stock;
        temp = Double.doubleToLongBits(unitCost);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
