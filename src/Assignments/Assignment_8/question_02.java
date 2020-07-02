package Assignments.Assignment_8;

import java.util.Scanner;

public class question_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		cube();
	}

	private static void cube() {
		
		Scanner calc=new Scanner(System.in);
		
		System.out.print("Input: ");
		int num=calc.nextInt();
		
		int result=num*num;
		System.out.println("Output: "+result);
		
	}

}
