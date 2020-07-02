package a_SampleInterviewQuestions;

import java.util.Scanner;

public class trailingZeroes {

	public static void main(String[] args) {
		
		//Write an algorithm which computes the number of trailing zeros in n factorial.
		
		Scanner sc=new Scanner(System.in);
		System.out.println("n factorial: ");
		int num=sc.nextInt();
		int count=0;
		Long factorial=(long) 1.0;
		
		for(int i=1;i<=num;i++) {
			factorial=factorial*i;
		}
		System.out.println(num+" th factorial:" + factorial);
		
		String str=Long.toString(factorial);
		for(int i=str.length()-1;i>1;i--) {
			if(str.substring(i, i+1).equals("0")) {
				count++;
			}else if(!str.substring(i, i+1).equals("0")) {
				break;
			}
			
		}
		System.out.println("Number of trailing 0's: "+count);

	}

}
