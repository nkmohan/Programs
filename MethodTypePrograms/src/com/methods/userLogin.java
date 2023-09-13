package com.methods;

public class userLogin {
	public static void main(String[] args) {
		login li = new login();	
	}
	public void login(String userName, String password) {
		if (userName.equals("MohanKumar")&&(password.equals("Mohan@123"))) {
			System.out.println(userName);
		System.out.println(password);
		System.out.println("User Login Successfully");
		}else {
			System.out.println("Invalid Credentials");
		}
	}
}
