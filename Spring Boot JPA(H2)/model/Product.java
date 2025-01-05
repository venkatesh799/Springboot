package com.venkatesh.simplewebapp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.springframework.stereotype.Component;

@Component
@Entity
public class Product {

    @Id
    private int prodId;
    private String prodName;
    private int price;

    public Product() {

    }
    // Constructor
    public Product(int prodId, String prodName, int price) {
        this.prodId = prodId;
        this.prodName = prodName;
        this.price = price;
    }
    // getter for Prodid
    public int getProdId() {
        return prodId;
    }

    // setter for Prodid
    public void setProdId(int prodId) {
        this.prodId = prodId;
    }

    // getter for ProdName
    public String getProdName() {
        return prodName;
    }

    // setter for ProdName
    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    // getter for price
    public int getPrice() {
        return price;
    }

    // setter for price
    public void setPrice(int price) {
        this.price = price;
    }
}
