package Assignments.Assignment_10;

import java.util.Scanner;

public class Q_26_uniqueChars {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Word: ");
		String word=sc.nextLine();
		
		System.out.println(uniqueChars(word));
	}

	private static String uniqueChars(String str) {
		String uniqueChars=str.substring(0,1);
				
		for(int i=1;i<str.length() ;i++) {
									
			if(uniqueChars.indexOf(str.charAt(i))==-1) {
				uniqueChars=str.substring(i,i+1).concat(uniqueChars);	
			}
		}
		return uniqueChars;
		
	}

}
