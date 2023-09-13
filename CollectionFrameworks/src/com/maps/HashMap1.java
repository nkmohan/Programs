package com.maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap1 {
	public static void main(String[] args) {

		HashMap<String,Integer>a=new HashMap<>();
		a.put("mohan",2);
		a.put("naveen",3);
		a.put("sanjay",4);
		System.out.println(a);

		Set s=a.keySet();
		System.out.println(s);

		Collection e=a.values();
		System.out.println(e);

		//combining both keys and values
		Set s1=a.entrySet();
		System.out.println(s1);
		
		//using iterator u have to pass the Map.entry to iterator
		Iterator<Map.Entry<String,Integer>> itr =s1.iterator();
		while(itr.hasNext()) {
			Map.Entry m1=(Map.Entry)itr.next();
			System.out.println(m1);

		}
	}
}
