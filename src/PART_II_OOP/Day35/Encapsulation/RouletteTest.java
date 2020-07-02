package PART_II_OOP.Day35.Encapsulation;

import java.util.Scanner;

public class RouletteTest {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your pocket number: ");
		RoulettePocket rp=new RoulettePocket(sc.nextInt());
		
		while(rp.getRouletteColor().equalsIgnoreCase("invalid")) {
			System.out.println("Enter your pocket number: ");
			rp.setpocketNumber(sc.nextInt());
		}

		System.out.println(rp.toString());// bu toString() metodu CLASS içinde tanımlı olası gerekir. Yoksa yazmıyor!!!!
		System.out.println(rp.getRouletteColor());
	}

}
