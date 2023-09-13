package com.collectionframeworks;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {
	public static void main(String[] args) {
		ArrayList<Object> a= new ArrayList<>();
		
		a.add("hai");
		a.add("hello");
		a.add("jack");
		
		System.out.println(a);
		
		Iterator<Object> s=a.iterator();
		 while(s.hasNext()) {
	      String d=(String)s.next(); 
	      System.out.print(d+" ");
		}
		 
	}
}