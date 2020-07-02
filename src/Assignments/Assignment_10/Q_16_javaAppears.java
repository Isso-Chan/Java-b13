package Assignments.Assignment_10;

import java.util.Scanner;

public class Q_16_javaAppears {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter your word: ");
		String word=sc.nextLine();
		int index=word.indexOf("java");
		
		if(index==0 || index==1) {
			System.out.println(true);
		}else
			System.out.println(false);

	}

}
