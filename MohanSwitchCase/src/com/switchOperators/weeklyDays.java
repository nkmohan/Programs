package com.switchOperators;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class weeklyDays {
	public static void main(String[] args) throws Exception{
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.print("Enter the number : ");
		String str = br.readLine();
		int num = Integer.parseInt(str);
		switch(num) {
		case 1 :
			System.out.println("Monday");
			break;
		case 2 :
			System.out.println("Tuesday");
			break;
		case 3 :
			System.out.println("Wednesday");
			break;
		case 4 :
			System.out.println("Thursday");
			break;
		case 5 :
			System.out.println("Friday");
			break;
		case 6 :
			System.out.println("Saturday");
		case 7 :
			System.out.println("Sunday");
			break;
			default :
				System.out.println("Invalid day");
		}
		
	}

}
