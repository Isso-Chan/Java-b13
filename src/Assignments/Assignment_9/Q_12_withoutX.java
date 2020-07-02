package Assignments.Assignment_9;

import java.util.Scanner;

public class Q_12_withoutX {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your word");
		String word=sc.next();
		char[] charWord=word.toCharArray();
		int l=word.length();
		
		for(int i=0;i<l;i++) {
			if(i==0 && (word.charAt(i)=='x' || word.charAt(i)=='X' )) {
			continue;
			}
			if(i==l-1 && (word.charAt(i)=='x' || word.charAt(i)=='X' )) {
				break;
			}
			System.out.print(charWord[i]);
		}
		

	}

}
