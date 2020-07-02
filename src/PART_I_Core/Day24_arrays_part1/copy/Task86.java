package PART_I_Core.Day24_arrays_part1.copy;

import java.util.Scanner;

public class Task86 {

	public static void main(String[] args) {
	
		String[] myArray= new String[12];
		
		myArray[0]="Jan";
		myArray[1]="Feb";
		myArray[2]="Mar";
		myArray[3]="Apr";
		myArray[4]="May";
		myArray[5]="Jun";
		myArray[6]="Jul";
		myArray[7]="Aug";
		myArray[8]="Sep";
		myArray[9]="Oct";
		myArray[10]="Nov";
		myArray[11]="Dec";
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("Enter you month index number: ");
		int index=sc.nextInt();
		
		System.out.println("The month is "+ myArray[index]);


	}

}
