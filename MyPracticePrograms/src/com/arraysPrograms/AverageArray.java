package com.arraysPrograms;

public class AverageArray {
	public static void main(String[] args) {

		double[] a = { 65, 786, 23, 87, 43, 892 };

		double sum = 0.0;

		double avg = 0.0;

		for (int i = 0; i < a.length; i++) {

			sum = sum + a[i];

			avg = sum / a.length;
		}
		System.out.println("sum  :" + sum);
		System.out.println("Average :" + avg);

	}

}
