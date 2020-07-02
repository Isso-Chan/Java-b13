package Assignments.Assignment_11;

import java.util.Arrays;
import java.util.Scanner;

public class Q_36_cantains5 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 5 numbers: ");
		int[] arr= new int[5];
		
		for(int i=0;i<5;i++) { // number entry
			arr[i]=sc.nextInt();
		}
		
		int count=0;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]==5 && arr[i+1]==5) {
				System.out.println(true);
				count++;
				break; 
			}
		}
		if(count==0) {
			System.out.println(false);
		}

	}

}
