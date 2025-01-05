package com.venkatesh.simplewebapp.service;

import com.venkatesh.simplewebapp.model.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    List<Product> products = new ArrayList<>(Arrays.asList(
            new Product(100, "iphone", 59999),
            new Product(101, "Samsung", 49999),
            new Product(102, "Lava", 9999)

    ));
    public List<Product> getproducts() {
        return products;
    }

    public Product getProductById(int prodId) {
        return products.stream()
                .filter(p -> p.getProdId() == prodId)
                .findAny().orElse(new Product(0, "No Item", 0));
    }
    public void addProduct(Product prod) {
        products.add(prod);
    }

    public void updateProduct(Product prod) {
        int index = 0;
        for(int i=0;i<products.size();i++) {
            if(products.get(i).getProdId() == prod.getProdId()) {
                index = i;
            }
        }
        products.set(index, prod);
    }

    public void deleteproduct(int prodId) {
        int index = 0;
        for(int i=0;i<products.size();i++) {
            if(products.get(i).getProdId() == prodId) {
                index = i;
            }
        }
        products.remove(index);
    }
}
