package Assignments.Assignment_10;

import java.util.Scanner;

public class Q_24_2wordsAppearance {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Input: ");
		String str=sc.nextLine();
		int lengthStr=str.length();
		String word1="java";
		int lengthword1=word1.length();
		String word2="python";
		int lengthword2=word2.length();
		int count1=0, count2=0;
		
		for(int i=0;i<=lengthStr-lengthword1;i++) {
			if(str.substring(i,lengthword1+i).equals(word1)) {
				count1++;
			}
		}
		for(int i=0;i<=lengthStr-lengthword2;i++) {
			if(str.substring(i,lengthword2+i).equals(word2)) {
				count2++;
			}
		}
		if(count1==count2) {
			System.out.println(true);
		}else
			System.out.println(false);

	}

}
