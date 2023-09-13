package ifEsleStatement;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class evenOddEnteringNumber {
	public static void main(String[] args) throws Exception {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("please the number : ");
		String str = br.readLine();
		int  a = Integer.parseInt(str);
		if(a % 2 == 0) {    // if(a%2==1)
			System.out.println("it is even number");
		}else {
			System.out.println("it is odd number");
		}
   }
	
}
