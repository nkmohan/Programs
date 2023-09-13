package com.company;

public class Work {
	public static void main(String[] args) {
		Manager m = new Manager();
		m.assign();
		HR hr = new HR();
		hr.assign();
		hr.Dicuss();
		Employee e = new Employee();
		e.assign();
		e.Dicuss();
		e.managing();
	}

}
