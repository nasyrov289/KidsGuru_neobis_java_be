package com.kidsguru.shop.controllers;

import com.kidsguru.shop.models.Product;
import com.kidsguru.shop.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @RequestMapping("/")
    public String defaultProduct() {
        return "Default product endpoint";
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Product getProductById(@RequestParam("id") int id) {
        return productService.getProductById(id);
    }

    @RequestMapping(value = "/all", method = RequestMethod.GET)
    public List<Product> getAllProduct() {
        return productService.getAllProduct();
    }


    @RequestMapping(method = RequestMethod.PUT)
    public void updateProduct(@RequestBody Product product) {
        productService.saveProduct(product);
    }

    @RequestMapping(method = RequestMethod.POST)
    public Product createProduct(@RequestBody Product product) {
        return productService.saveProduct(product);
    }

    @RequestMapping(method = RequestMethod.DELETE)
    public void deleteProductById(@PathParam("id") int id) {
        productService.deleteProductById(id);
    }
}