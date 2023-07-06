package com.example.demo.service.Impl;

import java.util.List;

import org.springframework.stereotype.Component;

import com.example.demo.models.Product;
@Component
public interface ProductService {

    Product saveProduct(Product product);

    List<Product> getProducts();

    Product getProduct(String id);

    Product updateProduct(String id);

    void deleteProduct(String id);
}
