package Assignments.Assignment_9;

import java.util.Scanner;

public class Q_04_wordWithNumbersAndChar {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your word: ");
		String word=sc.next();
		
		int length=word.length();
		
		if(length%2==1 && length>=5) {
			System.out.print(word.charAt(length/2-1));
			System.out.print(word.charAt(length/2));
			System.out.print(word.charAt(length/2+1));
		}else
			System.out.println("Invalid");

	}

}
