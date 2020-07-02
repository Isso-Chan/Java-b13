package Assignments.Assignment_11;

import java.util.Arrays;
import java.util.Scanner;

public class Q_48_binaryNumberSystem {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a decimal <256: ");
		int decimal=sc.nextInt();
		int[] binary=new int[8];
		int count=0;
		
		if(decimal<=255) {
			
			if(decimal>=128) {
				binary[0]=1;
			}if(decimal%128>=64) {
				binary[1]=1;
			}if(decimal%128%64>=32) {
				binary[2]=1;
			}if(decimal%128%64%32>=16) {
				binary[3]=1;
			}if(decimal%128%64%32%16>=8) {
				binary[4]=1;
			}if(decimal%128%64%32%16%8>=4) {
				binary[5]=1;
			}if(decimal%128%64%32%16%8%4>=2) {
				binary[6]=1;
			}if(decimal%128%64%32%16%8%4%2==1) {
				binary[7]=1;
			}
		
		System.out.println("Decimal ->"+decimal);
		System.out.println("Binary ->"+Arrays.toString(binary));
		
		}else {
			System.out.println("Wrong decimal!");
		}
		

	}

}
