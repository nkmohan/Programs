package ifEsleStatement;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class marksStudentOf {
	public static void main(String[] args) throws Exception {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.print("Enter the marks : ");
		String str = br.readLine();
		int marks = Integer.parseInt(str);
		if (marks <35) 
			System.out.println("fail");
			else if(marks==35)
				System.out.println("student is pass");
			else if(35<marks&&marks<=70)
				System.out.println("student is third");
			else if(70<marks&&marks<=85)
				System.out.println("student is second");
			else
				System.out.println("student is first");
	}

}
