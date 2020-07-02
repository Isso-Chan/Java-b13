package Assignments.Assignment_9;

import java.util.Scanner;

public class Q_05_wordMerch {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("First word1: ");
		String str1=sc.next();
		
		System.out.println();
		System.out.print("Second word1: ");
		String str2=sc.next();
		
		if(str1.length()!=str2.length()) {
			System.out.println("Cannot merge");
		} else {
			for(int i=0;i<str1.length();i++) {
				System.out.print(str1.substring(i,i+1)+str2.charAt(i));
			}
		}

	}

}
