package Assignments.Assignment_10;

import java.util.Scanner;

public class Q_21_toFinfPrefixString {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Word: ");
		String word=sc.next();

		System.out.println("Enter a number for prefix search:");
		int preNum=sc.nextInt();
		String prefix=word.substring(0,preNum);
		int count=0;
		
		for(int i=0;i<=word.length()-preNum;i++) {
			if(word.substring(i,i+preNum).equals(prefix)){
				count++;
			}
		}
		if(count>1) {
			System.out.println(true);
		}else
			System.out.println(false);
		
		System.out.println(prefix+" appears "+count+" times");
	}

}
