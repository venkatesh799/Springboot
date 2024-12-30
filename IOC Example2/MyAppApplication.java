package com.venkatesh.myApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MyAppApplication {

	public static void main(String[] args) {

		// get reference of the IOC container
		ApplicationContext context = SpringApplication.run(MyAppApplication.class, args);

		// object creation in IOC
		Dev obj = context.getBean(Dev.class);
		obj.build();
	}
}
