package com.switchOperators;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class commetUnits {
	public static void main(String[] main) throws Exception {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.print("Enter the brand name : ");
		 String brand = br.readLine();

		switch(brand) {
		case ("nike"):
			System.out.println("just do it");
		break;
		case ("adidas"):
			System.out.println("Impossible is nothing");
		break;
		case ("puma"):
			System.out.println("Forever faster");
		break;
		case ("reebok"):
			System.out.println("Iam what iam");
		break;
		default:
			System.out.println("Invalid name");
		}
	}

}
