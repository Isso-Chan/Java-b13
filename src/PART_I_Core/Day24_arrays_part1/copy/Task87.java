package PART_I_Core.Day24_arrays_part1.copy;

import java.util.Scanner;

public class Task87 {

	public static void main(String[] args) {
		
		String[] days= new String[7];
		
		days[0]="Monday";
		days[1]="Tuesday";
		days[2]="Wednesday";
		days[3]="Thursday";
		days[4]="Friday";
		days[5]="Saturday";
		days[6]="Sunday";
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the index of day:");
		int index=sc.nextInt();
		
		System.out.println("The day is "+days[index]);

	}

}
