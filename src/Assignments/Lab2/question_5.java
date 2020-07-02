package Assignments.Lab2;

import java.util.Scanner;

public class question_5 {

	public static void main(String[] args) {
		
		Scanner bill=new Scanner(System.in);
		
		System.out.print("Charge of the meal: ");
		double charge=bill.nextDouble();
		double tax=charge*0.0675;
		double tip=(charge+tax)*0.20;
		
		System.out.println();
		System.out.println("Meal Charge: "+charge);
		System.out.println(" Tax Amount: "+tax);
		System.out.println(" Tip Amount: "+tip);
		System.out.println(" Total bill: "+(charge+tax+tip));
		
	}

}
