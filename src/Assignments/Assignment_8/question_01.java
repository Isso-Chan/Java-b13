package Assignments.Assignment_8;

import java.util.Scanner;

public class question_01 {

	public static void main(String[] args) {
				
		plus();

	}

	private static void plus() {
		Scanner sum=new Scanner(System.in);
		System.out.print("Enter a first number: ");
		int num1=sum.nextInt();
		
		System.out.print("Enter a second number: ");
		int num2=sum.nextInt();
		
		System.out.println("Result= " +(num1+num2));
		
		
	}
	

}
