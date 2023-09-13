package com.example;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
@Component
public class SMT implements CommandLineRunner{

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Email sent to employee");
		
	}
	

}
