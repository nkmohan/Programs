package com.example.FirstSpring;

public class DebitCard implements Payment{

	@Override
	public String payment() {
		return "payment through debitcard";
	}

}
