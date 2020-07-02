package Assignments.Assignment_10;

import java.util.Scanner;

public class Q_31_palindrome {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Text: ");
		String str=sc.nextLine();
		
		String temp=str.trim().replace(" ","").toUpperCase();
		
		boolean palindrom=true;
		for(int i=0;i<temp.length()/2;i++) {
			if(temp.charAt(i)!=temp.charAt(temp.length()-1-i)) {
				palindrom=false;
				break;
			}
		}
		if(palindrom) {
			System.out.println(true);
		}else
			System.out.println(false);

	}

}
