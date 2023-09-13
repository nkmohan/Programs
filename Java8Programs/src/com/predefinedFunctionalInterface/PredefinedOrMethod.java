package com.predefinedFunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class Person{
	String name;
	String location;
	String dept;
	
	Person(String name, String location, String dept){
		this.name = name;
		this.location = location;
		this.dept = dept;
	}
}

public class PredefinedOrMethod {
	public static void main(String[] args) {
		Person e1 = new Person("Anil","Chennai","DeveOps");
		Person e2 = new Person("Rani","Pune","Network Service");
		Person e3 = new Person("Ashok","Hyderabad","DataBase");
		Person e4 = new Person("Ganesh","Hyderabad","DataBase");
		
		List<Person> emps = Arrays.asList(e1,e2,e3,e4);
		
		Predicate<Person> p1 = (e) -> e.location.equals("Hyderabad");
		Predicate<Person> p2 = (e) -> e.dept.equals("DataBase");
		Predicate<Person> p3 = (e) -> e.name.startsWith("A");
		
		//predicate joining or() method
		
		Predicate<Person> p = p1 .or(p2) .or(p3);
		for(Person e:emps) {
			if(p.test(e)) {
				System.out.println(e.name);
			}
		}
		
	}



}
