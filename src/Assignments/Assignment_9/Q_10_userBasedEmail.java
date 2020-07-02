package Assignments.Assignment_9;

import java.util.Arrays;
import java.util.Scanner;

public class Q_10_userBasedEmail {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your Email: ");
		String email=sc.next();
		
		String[] seperated2=email.split("@");
		String[] namePart=seperated2[0].split("_");
		String[] domainPart=seperated2[1].split("\\.");
		
		
		System.out.print("First name: ");
		firstUpperCaseWriting(namePart[0]);
	
		System.out.print("Last name: ");
		firstUpperCaseWriting(namePart[1]);
		
		System.out.println("Domain: "+domainPart[0]);
		System.out.println("Top-Level Domain: "+domainPart[1]);
		

	}
	public static void firstUpperCaseWriting(String str) {
		char[] chrStr=str.toCharArray();
		chrStr[0]=Character.toTitleCase(chrStr[0]);
		for(char ch:chrStr) {
			System.out.print(ch);
		}
		System.out.println();
		
	}

}
