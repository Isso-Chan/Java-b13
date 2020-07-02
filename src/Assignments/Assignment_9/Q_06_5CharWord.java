package Assignments.Assignment_9;

import java.util.Scanner;

public class Q_06_5CharWord {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Input: ");
		String word=sc.next();
		
		if(word.length()==5) {
			for(int i=word.length()-1;i>=0;i--) {
				System.out.print(word.charAt(i));
			}
		}else if(word.length()<5) {
			System.out.println("Too short!");
		}else if(word.length()>5) {
			System.out.println("Too long!");
		}

	}

}
