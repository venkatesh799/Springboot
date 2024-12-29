package com.venkatesh.myApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class Dev {

    @Autowired  // Field Injection
     Laptop laptop;

    // Constructor injection
//    public Dev(Laptop laptop) {
//        this.laptop = laptop;
//    }

    // Setter injection
//    @Autowired
//    public void Setter(Laptop laptop) {
//        this.laptop = laptop;
//    }

    public void build() {
        laptop.compile();
        System.out.println("Working on awesome project");
    }
}
