package Assignments.Lab2;
import java.util.Scanner;

public class question_6 {

	public static void main(String[] args) {
		
		Scanner sale=new Scanner(System.in);
		
		System.out.print("Purschase Amount: ");
		double pur=sale.nextDouble();
		double taxState=pur*0.04;
		double taxCounty=pur*0.02;
		
		System.out.println();
		System.out.println("Amount of Purschase: "+pur);
		System.out.println("State tax: "+taxState);
		System.out.println("County tax: "+taxCounty);
		System.out.println("Total tax: "+(taxState+taxCounty));
		System.out.println("Total sale amount:"+ (pur+taxState+taxCounty));
	}

}
