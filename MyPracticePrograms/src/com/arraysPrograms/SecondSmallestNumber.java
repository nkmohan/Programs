package com.arraysPrograms;

import java.util.Arrays;

public class SecondSmallestNumber {
	
public static void main(String[] args) {
		
		int arr[] = {3,67,8,2,18,1,223};
		
		int temp;
		 for (int i=0; i<arr.length; i++) {
			 for(int j=i+1; j<arr.length; j++) {
				 if(arr[i]<arr[j]) {
					 temp=arr[i];
					 arr[i]=arr[j];
					 arr[j]=temp;
				 }
			 }
		 }
		 System.out.println(Arrays.toString(arr));
		 System.out.println("Second Smallest Number is : "+arr[arr.length-2]);
	}

}
