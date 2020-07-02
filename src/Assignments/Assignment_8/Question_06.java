package Assignments.Assignment_8;

import java.util.Scanner;

public class Question_06 {

	public static void main(String[] args) {
		
		Scanner calc=new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int num=calc.nextInt();
		next3(num);

	}

	private static void next3(int num) {
		System.out.println("next 3 are:");
		for(int num2=num+1;num2<=num+3;num2++) {
			System.out.print(num2+" ");
		}
		
	}

}
