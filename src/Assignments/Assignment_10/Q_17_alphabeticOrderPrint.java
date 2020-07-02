package Assignments.Assignment_10;

import java.util.Scanner;

public class Q_17_alphabeticOrderPrint {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Begin letter: ");
		String begin=sc.next();
		
		System.out.println("End letter: ");
		String end=sc.next();
		
		char ch1=begin.charAt(0);
		char ch2=end.charAt(0);
		
		for(char i=ch1; i<=ch2 ;i++) {
			System.out.print(i);	
		}

	}

}
