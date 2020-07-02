package Assignments.Lab2;

import java.util.Scanner;

public class question_1 {

	public static void main(String[] args) {
		
		Scanner serie=new Scanner(System.in);
		byte num=1;
		int smallest, biggest;
		System.out.print("Enter your first number: ");
			int num1=serie.nextInt();
			System.out.print("Enter your next number:");
			int num2=serie.nextInt();
			
			if(num1<num2) {
				smallest=num1;
				biggest=num2;
			}else {
				smallest=num2;
				biggest=num1;
			}
		do {			
			System.out.print("Do you want to enter an other number: 0-No, 1-Yes ");
			num=serie.nextByte();
			if (num==1) {
				System.out.print("Enter your next number: ");
				num2=serie.nextInt();
			}else break;
			
			if(num2<smallest) {
				smallest=num2;
			}else if(num2>biggest) {
				biggest=num2;
			}
		}while(num==1);
		
		System.out.println();
		
		if(biggest!=smallest) {
			System.out.println("Smallest Number:" + smallest);
			System.out.println("Biggest Number:" + biggest);
		}else
			System.out.println("Numbers are equal and both are "+smallest);
		
		

	}

}
