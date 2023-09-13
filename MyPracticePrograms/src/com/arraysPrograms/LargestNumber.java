package com.arraysPrograms;

public class LargestNumber {
	
public static void main(String[] args) {
		
		int arr[] = {3,67,8,2,18,1,223};
		
		int max=arr[0];
		 for (int i=0; i<arr.length; i++) {
			if(arr[i]>max);
			 max=arr[i];
		 }
		 System.out.println(" Largest Number is : "+max);
	}
	

}
