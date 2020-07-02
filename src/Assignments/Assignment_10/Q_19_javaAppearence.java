package Assignments.Assignment_10;

import java.util.Scanner;

public class Q_19_javaAppearence {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Word: ");
		String word=sc.next();
		
		int count=0;
		for(int i=0;i<word.length()-3;i++) {
			if(word.substring(i,i+4).equals("java")) {
				count++;
			}
		}
		System.out.println(count);

	}

}
