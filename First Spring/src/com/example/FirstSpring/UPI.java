package com.example.FirstSpring;

public class UPI implements Payment{

	@Override
	public String payment() {
		return "payment through upi";
	}

}
