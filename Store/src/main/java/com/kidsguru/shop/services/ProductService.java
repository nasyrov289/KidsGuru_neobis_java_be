package com.kidsguru.shop.services;

import com.kidsguru.shop.entities.ProductEntity;
import com.kidsguru.shop.models.Product;
import com.kidsguru.shop.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public Product getProductById(int productId) {
        return new Product(productRepository.findById(productId).orElseThrow(RuntimeException::new));
    }

    public List<Product> getAllProduct() {
        ArrayList<Product> productList = new ArrayList<>();
        for (int i = 0; i < productRepository.findAll().size(); i++) {
            productList.add(new Product(productRepository.findAll().get(i)));
        }
        return productList;
    }

    public Product saveProduct(Product product) {
        ProductEntity saveResult = productRepository.save(product.convertToEntity());
        return new Product(saveResult);
    }

    public void deleteProductById(int productId) {
        productRepository.deleteById(productId);
    }
}
