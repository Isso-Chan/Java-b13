package Assignments.Assignment_10;

import java.util.Scanner;

public class Q_25_mergeStrings {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("First String: ");
		String s1=sc.nextLine();
		System.out.println("Second String: ");
		String s2=sc.nextLine();
		
		String merged=mergeStrings(s1,s2);
		System.out.println("Merced: "+merged);
		

	}

	private static String mergeStrings(String str1, String str2) {
		String strnew="";
		int lengthMax=0;

		if(str1.length()>=str2.length()) {
			lengthMax=str1.length();
		}else {
			lengthMax=str2.length();
		}
		
		for(int i=0;i<lengthMax;i++) {
			if(i<str1.length()) {
				strnew=strnew.concat(str1.substring(i,i+1));
			}
			
			if(i<str2.length()) {
				strnew=strnew.concat(str2.substring(i,i+1));
			}
		}
		return strnew;
	}

}
