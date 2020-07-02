package Assignments.Assignment_10;

import java.util.Scanner;

public class Q_28_badWord {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Text: ");
		String text=sc.nextLine();
		
		System.out.println("What you look for: ");
		String badWord=sc.nextLine();
		
		System.out.println((clean(text,badWord)));

	}

	private static String clean(String text, String badWord) {
		String newStr="";
		if(text.contains(badWord)) {
			newStr=text.replace(badWord,"");
		}
		return newStr;
	
	}

}
