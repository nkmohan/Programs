package com.collectionframeworks;

import java.util.LinkedList;
import java.util.ListIterator;

public class Listiterator {
	public static void main(String[] args) {

		LinkedList<String> a= new LinkedList<>();

		a.add("mohan");
		a.add("naveen");
		a.add("sanjay");
		a.add("justin");
		System.out.println(a);

		ListIterator<String> r=a.listIterator();
		while(r.hasPrevious()) {
			String s=(String)r.previous();
			r.previousIndex();
			while(r.hasNext()) {
				String w=(String)r.next();
				r.nextIndex();


				System.out.println(s);
			}	
		}		
	}

}
