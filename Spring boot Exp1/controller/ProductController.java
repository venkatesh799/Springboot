package com.venkatesh.simplewebapp.controller;

import com.venkatesh.simplewebapp.model.Product;
import com.venkatesh.simplewebapp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService service;
    @GetMapping("/products")
    public List<Product> getProducts() {

        return service.getproducts();
    }

    @GetMapping("/products/{prodId}")
    public Product getProductById(@PathVariable int prodId) {
        return service.getProductById(prodId);
    }
    @PostMapping("/products")
    public void addProduct(@RequestBody Product prod) {
        service.addProduct(prod);
    }
    @PutMapping("/products")
    public void updateProduct(@RequestBody Product prod) {
        service.updateProduct(prod);
    }
    @DeleteMapping("/products/{prodId}")
    public void deleteProduct(@PathVariable  int prodId) {
        service.deleteproduct(prodId);
    }
}
