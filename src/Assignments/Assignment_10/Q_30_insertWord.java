package Assignments.Assignment_10;

import java.util.Scanner;

public class Q_30_insertWord {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Text: ");
		String text=sc.nextLine();
		
		System.out.println("What you want to insert: ");
		String ins=sc.nextLine();
		
		System.out.println(at3(text,ins));

	}

	private static String at3(String text, String ins) {
		text=text.substring(0,3).concat(ins).concat(text.substring(3));
		
		return text;
	}

}
