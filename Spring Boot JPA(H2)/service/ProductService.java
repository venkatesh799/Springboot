package com.venkatesh.simplewebapp.service;

import com.venkatesh.simplewebapp.model.Product;
import com.venkatesh.simplewebapp.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

        @Autowired
        ProductRepo repo;
//    List<Product> products = new ArrayList<>(Arrays.asList(
//            new Product(100, "iphone", 59999),
//            new Product(101, "Samsung", 49999),
//            new Product(102, "Lava", 9999)
//
//    ));

    public List<Product> getproducts() {
        return repo.findAll();
    }

    public Product getProductById(int prodId) {
        return repo.findById(prodId).orElse(new Product());
    }
    public void addProduct(Product prod) {
        repo.save(prod);
    }

    public void updateProduct(Product prod) {
        repo.save(prod);
    }

    public void deleteproduct(int prodId) {
        repo.deleteById(prodId);
    }

}
