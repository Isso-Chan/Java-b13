package Assignments.Assignment_9;

import java.util.Scanner;

public class Q_07_firstHalfOfWordTwice {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Input: ");
		String word=sc.nextLine();

		System.out.println(word.substring(0,word.length()/2)+word.substring(0,word.length()/2));
	}

}
