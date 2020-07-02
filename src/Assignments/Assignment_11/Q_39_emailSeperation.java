package Assignments.Assignment_11;

import java.util.Scanner;

public class Q_39_emailSeperation {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter an E-Mail Adress: ");
		String email=sc.next();
		int count=0;
		for(int i=0;i<email.length();i++) {
			if(email.substring(i,i+1).equals("@")) {
				count++;
			}
		}
		if(count!=1) {
			System.out.println("Invalid E-Mail!!!!");
		}else {
			String[] splitEmail=email.split("@");
			System.out.println("E-Mail id: "+ splitEmail[0]);
			System.out.println("E-Mail Domain: "+splitEmail[1]);
		}

	}

}
