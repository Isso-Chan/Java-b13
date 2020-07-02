package Assignments.Assignment_8;

import java.util.Scanner;

public class question_05 {

	public static void main(String[] args) {
		
		Scanner calc=new Scanner(System.in);
		System.out.print("Enter an int number: ");
		
		int num=calc.nextInt();
				
		sign(num);
	}

	private static void sign(int num) {

		if(0-num<0) {
			System.out.println("1");
		}else if (0-num>0) {
			System.out.println("-1");
		}else {
			System.out.println("0");
		}
		
	}

}
