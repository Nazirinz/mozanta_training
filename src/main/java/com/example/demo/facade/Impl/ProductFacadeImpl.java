package com.example.demo.facade.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.models.Product;
import com.example.demo.service.Impl.ProductService;

@Component
public class ProductFacadeImpl implements ProductFacade {
    @Autowired
    private ProductService productService;

    @Override
    public Product saveProduct(Product product) {
        return productService.saveProduct(product);
    }

    @Override
    public List<Product> getProducts() {
        return productService.getProducts();
    }

    @Override
    public Product getProduct(String id) {
        return productService.getProduct(id);
    }

    @Override
    public Product updateProduct(String id, Product updatedProduct) {
       return productService.updateProduct(id);
}

    @Override
    public void deleteProduct(String id) {
      productService.deleteProduct(id);
    }
}
