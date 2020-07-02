package Assignments.Lab2;

import java.util.Scanner;

public class question_2 {

	public static void main(String[] args) {
		
		Scanner cookies=new Scanner(System.in);
		int calorie=75;
		
		System.out.print("Enter the number of cookies that you ate: ");
		byte num=cookies.nextByte();
		
		System.out.println("Total caloreis consumed= " +(calorie*num));
		

	}

}
