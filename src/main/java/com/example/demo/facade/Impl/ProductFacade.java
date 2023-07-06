package com.example.demo.facade.Impl;

import java.util.List;

import com.example.demo.models.Product;

public interface ProductFacade {

    Product saveProduct(Product product);

    List<Product> getProducts();

    Product getProduct(String id);

    Product updateProduct(String id, Product updatedProduct);

}
