package PART_I_Core.Day24_arrays_part1.copy;

import java.util.Random;
import java.util.Scanner;

public class Task88 {

	public static void main(String[] args) {


		String[] car=new String[7];
		car[0]="Honda";
		car[1]="Toyota";
		car[2]="Nissan";
		car[3]="BMW";
		car[4]="Mercedes";
		car[5]="Porsche";
		car[6]="Ferrari";
		
		int price=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Select your car: ");
		int indexCar=sc.nextInt();
		String selectedCar=car[indexCar];
		
		Random rn=new Random();
		
		switch (selectedCar) {
		case "Honda": case("Toyota"): case "Nissan":
			price=rn.nextInt((4000-20000)+1)+20000;
			
		case "BMW": case "Mercedes":
			price=rn.nextInt((80000-50000)+1)+50000;
			
		case "Porsche": case "Ferrari":
			price=rn.nextInt((150000-10000)+1)+100000;
			
		}
		
		System.out.println("Price for selected car is "+ price);
			
	
	}

}



