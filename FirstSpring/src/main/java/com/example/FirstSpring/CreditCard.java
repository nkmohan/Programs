package com.example.FirstSpring;

public class CreditCard implements Payment {

	@Override
	public String pay() {
		return "payment through creditcard";
	}

}
