package Assignments.Assignment_11;

import java.util.Arrays;
import java.util.Scanner;

public class Q_37_firstLastLetterWriting {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 5 words: ");
		String[] str=new String[5];
		String[] strShort=new String[5];
		
		for(int i=0;i<5;i++) {
			str[i]=sc.next();
		}
		
		System.out.println(Arrays.toString(str));
		for(int i=0;i<5;i++) {
			strShort[i]=str[i].substring(0,1)+str[i].substring(str[i].length()-1);
		}
		System.out.println(Arrays.toString(strShort));
	}
}
