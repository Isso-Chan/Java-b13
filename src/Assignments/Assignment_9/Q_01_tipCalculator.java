package Assignments.Assignment_9;

import java.util.Scanner;

public class Q_01_tipCalculator {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Split or No Split (True/false): ");
		boolean b=sc.nextBoolean();
		
		System.out.println("Number of people: ");
		int nPeople=sc.nextInt();
		
		System.out.println("Check amount: ");
		double cAmount=sc.nextDouble();
		sc.nextLine();
		
		System.out.println("Service Quality (Poor/Fair/Good/Great/Excellent): ");
		String str=sc.next();
		
		tipCalculator(b,nPeople,cAmount,str);
		
		
	}
	public static void tipCalculator(boolean isSplit, int numberPeople, double checkAmount, String serviceQuality) {
		double per=0.0;
		String str=String.valueOf(isSplit);
		switch (serviceQuality.toUpperCase()) {
		case "POOR":
			per=0.05;break;
		case "FAIR":
			per=0.10;break;
		case "GOOD":
			per=0.15;break;
		case "GREAT":
			per=0.20;break;
		case "EXCELLENT":
			per=0.25;break;
		}
		if(str.toUpperCase().equals("TRUE")) {
			System.out.println("Number of people entered: "+numberPeople);
			System.out.println("Total to pay: "+(checkAmount*(1+per)));
			System.out.println("Total tip: " + (checkAmount*per));
			System.out.println("Total per person: "+(checkAmount+checkAmount*(1+per))/numberPeople);
			System.out.println("Tip per person: "+(checkAmount*per)/numberPeople);
		}else {
			System.out.println("Total to pay: "+(checkAmount*(1+per)));
			System.out.println("Total tip: " + (checkAmount*per));
		}
		
	}


}
