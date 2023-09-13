package com.example.FirstSpring;

public class CreditCard implements Payment {

	@Override
	public String payment() {
		return "payment through creditcard";
	}

}
