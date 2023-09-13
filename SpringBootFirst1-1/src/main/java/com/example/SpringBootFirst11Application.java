package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan (basePackages = {"com.example", "com.metaphase"})
public class SpringBootFirst11Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringBootFirst11Application.class, args);
		
		System.out.println(context.getClass().getName());
		System.out.println(context.getBeanDefinitionCount());
	}

}
