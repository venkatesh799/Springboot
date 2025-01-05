package com.venkatesh.simplewebapp.repository;

import com.venkatesh.simplewebapp.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestBody;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {

}
