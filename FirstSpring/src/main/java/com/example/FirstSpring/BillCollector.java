package com.example.FirstSpring;

public class BillCollector {
	private Payment p;

	public Payment getP() {
		return p;
	}

	public void setP(Payment p) {
		this.p = p;
	}

	public void bill() {
		String pay = p.pay();
		System.out.println(pay);
	}

}
