package a_SampleInterviewQuestions;

import java.util.Scanner;

public class numberOf2s {

	public static void main(String[] args) {
		
		// Write a method to count the number of 2's between 0 and n.
		
		Scanner sc=new Scanner(System.in);
		System.out.println("n.th number: ");
		int num=sc.nextInt();
		int count=0;
		String[] array=new String[num];
		
		for(int i=0;i<num;i++) {
			array[i]=Integer.toString(i+1);
		}
		
		for(int j=0;j<num;j++) {
			for(int k=0;k<array[j].length();k++) {
				if(array[j].substring(k,k+1).equals("2")) {
					count++;
				}
			}
		}
		System.out.println(count);
		

	}

}
