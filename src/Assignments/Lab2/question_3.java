package Assignments.Lab2;

import java.util.Scanner;

public class question_3 {

	public static void main(String[] args) {
		
		Scanner grup=new Scanner(System.in);
		int sum=0;
		System.out.print("Enter a positive nonzero integer: ");
		int num=grup.nextInt();
		
		for(int i=1;i<=num;i++) {
			sum=sum+i;
		}
		System.out.println("The sum of the numers from 1 to "+num+" is: "+sum);

	}

}
