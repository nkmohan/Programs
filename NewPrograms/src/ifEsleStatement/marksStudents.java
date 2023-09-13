// print the student result based on the grading system
// < 35 - fail
// == 35- pass
// 35 to 70 - third class
// 70 to 85 second class
// >85 first class


package ifEsleStatement;

import java.util.Scanner;

public class marksStudents{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("please the marks : ");
		int marks = scanner.nextInt();
		if(marks<35)
			System.out.println("student is fail");
		else if(marks==35)
			System.out.println("student is pass");
		else if(35<marks&&marks<=70)
			System.out.println("student is third");
		else if(70<marks&&marks<=85)
			System.out.println("student is second");
		else
			System.out.println("student is first");
		scanner.close();
   }
	
}
