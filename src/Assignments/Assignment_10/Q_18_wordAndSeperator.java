package Assignments.Assignment_10;

import java.util.Scanner;

public class Q_18_wordAndSeperator {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Word: ");
		String word=sc.next();
		
		System.out.println("Seperator: ");
		String seperator=sc.next();
		
		System.out.println("Occurrance time: ");
		int occurrence=sc.nextInt();
		
		for(int i=1;i<occurrence;i++) {
			System.out.print(word);
			System.out.print(seperator);
		}
		System.out.println(word);

	}

}
