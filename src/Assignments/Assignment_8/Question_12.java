package Assignments.Assignment_8;

import java.util.Scanner;

public class Question_12 {

	public static void main(String[] args) {
		
		Scanner hamlet=new Scanner(System.in);
		System.out.print("Enter true/false: ");
		boolean q1=hamlet.nextBoolean();
		
		System.out.print("Enter true/false: ");
		boolean q2=hamlet.nextBoolean();
		Boolean result=hamletQuote(q1,q2);
		
		System.out.println(result);

	}

	private static Boolean hamletQuote(boolean q1, boolean q2) {
		if(q1== false && q2==false) {
			return false;
		}else
		return true;
	}

}
