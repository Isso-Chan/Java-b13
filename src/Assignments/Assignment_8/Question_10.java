package Assignments.Assignment_8;

import java.util.Scanner;

public class Question_10 {

	public static void main(String[] args) {
		
		Scanner cls=new Scanner(System.in);
		System.out.print("Enter a number: ");
		int num=cls.nextInt();
		
		isEven(num);
		

	}

	private static void isEven(int num) {
		if(num%2==0) {
			System.out.println(true);
		}else
			System.out.println(false);
		
	}

}
