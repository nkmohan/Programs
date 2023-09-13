package com.inheritence;

public class SBI implements Bank{

	@Override
	public void balance() {
		System.out.println("Check Balance");
	}

	@Override
	public void withdraw() {
		System.out.println("Check Withdraw");
	}

	@Override
	public void deposit() {
		System.out.println("Check Deposit");
	}

	@Override
	public void print() {
		System.out.println("Check Print");
	}
}	