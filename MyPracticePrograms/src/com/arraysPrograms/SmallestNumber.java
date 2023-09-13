package com.arraysPrograms;

public class SmallestNumber {
	
public static void main(String[] args) {
		
		int arr[] = {3,67,8,2,18,1,223};
		
		int min = arr[0];
		 for (int i=0; i<arr.length; i++) {
			 if(arr[i]>min);
			 min=arr[i];
		 }
		 System.out.println(" Largest Number is : "+min);
	}
	

}
