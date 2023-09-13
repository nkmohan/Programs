package com.predefinedFunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;


class Employee{
	String name;
	String location;
	String dept;
	
	Employee(String name, String location, String dept){
		this.name = name;
		this.location = location;
		this.dept = dept;
	}
}
public class PredicateInterfaceAndMethod {
	public static void main(String[] args) {
		Employee e1 = new Employee("Anil","Chennai","DeveOps");
		Employee e2 = new Employee("Rani","Pune","Network Service");
		Employee e3 = new Employee("Ashok","Hyderabad","DataBase");
		Employee e4 = new Employee("Ganesh","Hyderabad","DataBase");
		
		List<Employee> emps = Arrays.asList(e1,e2,e3,e4);
		
		Predicate<Employee> p1 = (e) -> e.location.equals("Hyderabad");
		Predicate<Employee> p2 = (e) -> e.dept.equals("DataBase");
		Predicate<Employee> p3 = (e) -> e.name.startsWith("A");
		
		//predicate joining and() method
		
		Predicate<Employee> p = p1 .and(p2) .and(p3);
		for(Employee e:emps) {
			if(p.test(e)) {
				System.out.println(e.name);
			}
		}
		
	}

}
