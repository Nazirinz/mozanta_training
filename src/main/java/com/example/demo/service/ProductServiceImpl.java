package com.example.demo.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.models.Product;
import com.example.demo.repository.ProductRepository;
import com.example.demo.service.Impl.ProductService;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product saveProduct(Product product) {
        product.setCreatedDate(new Date());
        product.setUpdatedDate(new Date());
        return productRepository.save(product);

    }

    @Override
    public List<Product> getProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product getProduct(String id) {

        return productRepository.findById(id).get();

    }

    @Override
    public Product updateProduct(String id) {
        return productRepository.findById(id).get();

    }
}
