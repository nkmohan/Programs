package com.collectionframeworks;

import java.util.TreeSet;

public class ComparableDemo {
	public static void main(String[] args) {
		TreeSet<StringBuffer> t = new TreeSet<>();
		t.add(new StringBuffer("K"));
		t.add(new StringBuffer("Z"));
		t.add(new StringBuffer("A"));
		t.add(new StringBuffer("A"));
		
		System.out.println("Z".compareTo("K"));
		System.out.println("K".compareTo("K"));
		System.out.println("A".compareTo("A"));
		//System.out.println("A".compareTo(null));
	}

}
