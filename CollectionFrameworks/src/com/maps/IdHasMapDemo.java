package com.maps;
import java.util.HashMap;
import java.util.IdentityHashMap;

public class IdHasMapDemo {
	public static void main(String[] args) {
		//HashMap<Integer,String> m = new HashMap<>();
		IdentityHashMap<Integer,String> m = new IdentityHashMap<>();
		
		Integer i1 = new Integer(10);
		Integer i2 = new Integer(10);
		m.put(i1, "mohan");
		m.put(i2, "kumar");
		System.out.println(m);
	}

}