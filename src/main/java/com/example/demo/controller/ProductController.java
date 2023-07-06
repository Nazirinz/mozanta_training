package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.facade.Impl.ProductFacade;
import com.example.demo.models.Product;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    private ProductFacade productFacade;

    @PostMapping("/save")
    public Product saveProduct(@RequestBody Product product) {
        System.out.println("hello");
        return productFacade.saveProduct(product);
    }

    @GetMapping("/allproducts")
    public List<Product> getProducts() {
        return productFacade.getProducts();
    }

    @GetMapping("/{id}")
    public Product getProduct(@PathVariable String id) {
        return productFacade.getProduct(id);
    }

    @PutMapping("/{id}")
    public Product updateProduct(@PathVariable String id, @RequestBody Product updatedProduct) {
        return productFacade.updateProduct(id, updatedProduct);
    }

}