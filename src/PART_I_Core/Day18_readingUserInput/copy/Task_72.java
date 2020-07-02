package PART_I_Core.Day18_readingUserInput.copy;

import java.util.Scanner;

public class Task_72 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter 3 numbe:");
		int num1=sc.nextInt();
		int num2=sc.nextInt();// yeni bir ikaz mesaji yazmaya gerek yok!!!!
		int num3=sc.nextInt();
		
		int sum=num1+num2+num3;
		System.out.println("Sum of numbers:"+sum);

	}

}
