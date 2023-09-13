package com.example.FirstSpring;

public class BillCollector {
	public Payment p = new DebitCard();
	
	public void billPay(double amount) {
		String result = p.payment();
		System.out.println(result);
	}

}
