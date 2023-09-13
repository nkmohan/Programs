package com.example.FirstSpring;

public class DebitCard implements Payment {

	@Override
	public String pay() {
		return "payment through debitcard";
	}

}
