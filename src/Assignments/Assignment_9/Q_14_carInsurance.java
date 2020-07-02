package Assignments.Assignment_9;

import java.util.Scanner;

public class Q_14_carInsurance {

	public static void main(String[] args) {
		
		int premium=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to the CountyFarm car insurance!");
		System.out.println("Enter your name: ");
		String name=sc.nextLine();
		
		System.out.println("Do you have a US driver License? (Yes/No): ");
		String driverLicense=sc.next().toUpperCase();
		if(driverLicense.contentEquals("NO")) {
			System.out.println("Invalid data!");
			System.exit(0);
		}
		
		System.out.println("Enter ZIP Code: ");
		int zipCode=sc.nextInt();
		int zipCode$=0;
				
		switch (zipCode) {
		case 20910: case 20740:
			zipCode$=60; break;
		case 22102: case 22103:
			zipCode$=30; break;
		default:
			zipCode$=50;break;
		}
		premium+=zipCode$;
		System.out.println("Is the vehicle Owned, Financed, or Leased?:");
		String ownership=sc.next().toUpperCase();
		int ownership$=0;
		
		switch (ownership) {
		case "OWNED":
			ownership$=10;break;
		case "FINANCED": case "LEASED":
			ownership$=20;break;
		}
		premium+=ownership$;
		System.out.println("How is this vehicle primarily used? (Business, pleasure, commute): ");
		String carUsage=sc.next().toUpperCase();
		int carUsage$=0;
		
		switch (carUsage) {
		case "BUSINESS":
			carUsage$=50;break;
		case "PLEASURE": 
			carUsage$=10;break;
		case "COMMUTE":
			carUsage$=20;break;
		}
		premium+=carUsage$;
		System.out.println("Days driven to Work And/Or School:");
		int drivesToWork=sc.nextInt();
		int drivesToWork$=drivesToWork*5;
		premium+=drivesToWork$;
		
		System.out.println("Miles driven to Work And/Or School:");
		int milesToWork=sc.nextInt();
		int milesToWork$=milesToWork*1;
		premium+=milesToWork$;
		
		System.out.println("How old are you?: ");
		int age=sc.nextInt();
		int age$=0;
			if(age<16) {
				System.out.println("Invalid data!");
				System.exit(0);
			}else if(age>=16 && age<18) {
				age$=premium*20;
			}else if(age>=18 && age<=21) {
				age$=premium*6;
			}else if(age>21 && age<25) {
				age$=premium*2;
			}	
		
		System.out.println("How many years driving experince do you have?: ");
		int experience=sc.nextInt();
		int experience$=0;
		if(experience>0 && (age-experience)>=16) {
			experience$=-experience*5;
			
		}else {
			System.out.println("Invalid data!");
			System.exit(0);
		}
		premium+=experience$;
		System.out.println("Have you had any accidents in the last 5 years?(Yes/No): ");
		String accident=sc.next().toUpperCase();
		double accTotal$=0.0;
		if(accident.equals("YES")) {
			System.out.println("How many?: ");
			int accTotal=sc.nextInt();
			accTotal$=premium*0.2*accTotal;
		}
		premium+=accTotal$;
		System.out.println("Have you had continuous insurance for the past 12 months?(Yes/No): ");
		String conInsurance=sc.next().toUpperCase();
		int conInsurance$=0;
			if(conInsurance.equals("NO")) {
				conInsurance$=premium*2;
			}
			premium+=conInsurance$;
			
		System.out.println("What is the highest level of education you have completed?");
		System.out.println("\t 1-Doctors");
		System.out.println("\t 2-Ph.D.");
		System.out.println("\t 3-Masters");
		System.out.println("\t 4-Bachelors");
		System.out.println("\t 5-Less than High School: ");
		int education=sc.nextInt();
		String eduStr="";
		double education$=0;
			switch (education) {
			case 1: 
				eduStr="Doctor";
				education$=-premium*0.1; break;
			case 2: 
				eduStr="Ph.D.";
				eduStr=eduStr.replace(".","");
				education$=-premium*0.05; break;
			case 3: 
				eduStr="Masters";
				education$=-premium*0.05; break;
			case 4:
				eduStr="Bachelors";
				education$=-premium*0.05; break;
			case 5:
				education$=premium*0.05; break;
			}
			premium+=education$;
			
		System.out.println("customer, here's your quote!");
		System.out.println("Start Your Policy Today For: $"+premium);
		
		String referenceNumber=(name.substring(0,2)+age+name.substring(name.length()-2,name.length())+zipCode+eduStr).toUpperCase();
		System.out.println("Reference number:"+referenceNumber);
		

	}

}
