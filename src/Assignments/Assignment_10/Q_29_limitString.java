package Assignments.Assignment_10;

import java.util.Scanner;

public class Q_29_limitString {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string: ");
		String str=sc.nextLine();
		
		System.out.println("Your limit: ");
		int limit=sc.nextInt();

		System.out.println(limit(str,limit));
	}

	private static String limit(String str, int limit) {
		String newStr="";
		newStr=str.substring(0,limit);
		return newStr;
		
	}

}
