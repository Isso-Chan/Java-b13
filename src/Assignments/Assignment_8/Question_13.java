package Assignments.Assignment_8;

import java.util.Scanner;

public class Question_13 {

	public static void main(String[] args) {
		
		Scanner tax=new Scanner(System.in);
		System.out.print("Enter amount: ");
		double amount=tax.nextDouble();
		
		double totalTax=waterTax(amount);
		System.out.println("Total tax="+totalTax);

	}

	private static double waterTax(double units) {
		double tax=0;
		int fine=0;
		if(units<=50) {
			tax=units*0.60;
		}else if(units>=50 && units<=100) {
			tax=units*0.90;
		}else if(units>100 && units<=150) {
			tax=units*0.90;
			fine=50;
		}else {
			tax=units*0.90;
			fine=100;
		}
		return (tax+fine);
	}

}
