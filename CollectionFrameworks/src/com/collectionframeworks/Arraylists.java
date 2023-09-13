package com.collectionframeworks;
import java.util.LinkedList;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.RandomAccess;
public class Arraylists {
	
	public static void main(String[] args) {
		
		ArrayList<Object> A=new ArrayList<>();
		LinkedList<Object>B=new LinkedList<>();
		
		System.out.println(A instanceof Serializable);//valid
		System.out.println(A instanceof Cloneable);   //valid
		System.out.println(A instanceof RandomAccess);//valid
	
		System.out.println(B instanceof Serializable);//valid
		System.out.println(B instanceof Cloneable);   //valid
		System.out.println(B instanceof RandomAccess);//valid
}
}