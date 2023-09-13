package com.something;

public class Identifiers {
	int a;
	int b;
	
	public Identifiers(int a, int b) {
		this.a = a;
		this.b = b;
	}

	public static void main(String[] args) {
		Employee e = new Employee(6,3);
		Student  e1 = new Student(8,6);
		if(e instanceof Employee) {
			System.out.println(" yes it is correct");
		}else {
			System.out.println(" yes it is correct");
		}
		
		
	}


}
