package com.kidsguru.shop.services;

import com.kidsguru.shop.entities.ProductEntity;
import com.kidsguru.shop.exception.RecordNotFoundException;
import com.kidsguru.shop.models.Product;
import com.kidsguru.shop.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public Product getProductById(int productId) throws Exception {
        return new Product(productRepository.findById(productId).orElseThrow(RecordNotFoundException::new));
    }

    public Product getProductBySellerId(int sellerId) throws Exception {
        return new Product(productRepository.findById(sellerId).orElseThrow(RecordNotFoundException::new));
    }


    public Product saveProduct(Product product) {
        ProductEntity saveResult = productRepository.save(product.convertToEntity());
        return new Product(saveResult);
    }

    public void deleteProductById(int productId) {
        productRepository.deleteById(productId);
    }
}
