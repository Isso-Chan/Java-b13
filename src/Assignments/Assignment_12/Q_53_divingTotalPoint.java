package Assignments.Assignment_12;

import java.util.Arrays;
import java.util.Scanner;

public class Q_53_divingTotalPoint {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		float[] awards=new float[7];
		float sum=0.0f, total=0.0f, difficulty=0.0f;
		for(int i=0;i<7;i++) {						// enter the awards
			System.out.println("Enter score for judge "+(i+1));
			awards[i]=sc.nextFloat();
		}
		System.out.println("Enter difficulty: ");  // enter the difficulty in range
		do {
			difficulty=sc.nextFloat();
			if(difficulty>=1.2 && difficulty<=3.8) {  
				break;
			}else
				System.out.println("Not in range!! Re-enter difficulty:");
		}while(true);
				
		Arrays.sort(awards); 	// sort the array ascending
		for(int j=1;j<6;j++) {  // except first(0) and last one(7), sum the array elements
			sum=sum+awards[j];
		}
		total=(float) (sum*difficulty*0.6);
		System.out.printf("Total:%2f",total);

	}

}
