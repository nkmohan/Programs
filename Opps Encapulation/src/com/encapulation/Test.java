package com.encapulation;

public class Test {
	public static void main(String[] args) {
		Bank b = new Bank();
		b.setAccNum(97979);
		b.setAccName("mohan");
		int accNum = b.getAccNum();
		String accName = b.getAccName();
		System.out.println(accNum+"this account number belongs to"+accName);
	}
}
