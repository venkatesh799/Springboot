package com.venkatesh.myApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


@Component
public class Dev {

    @Autowired  // Field Injection
            @Qualifier("desktop")
     Computer comp;

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
        comp.compile();
        System.out.println("Working on awesome project");
    }
}
