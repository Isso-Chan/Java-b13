package Assignments.Assignment_9;

import java.util.Scanner;

public class Q_02_LaptopPrice {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Select screen size (13.3/15/17.3): ");
		double screenSize=sc.nextDouble();
		
		System.out.print("Select CPU type (i3/i5/i7): ");
		String cpu=sc.next().toLowerCase();
		
		System.out.print("RAM size (4/8/12/16 GB): ");
		int RAM=sc.nextInt();
		sc.nextLine();
		
		System.out.print("Storage type (SSD/HDD): ");
		String storage=sc.nextLine().toUpperCase();
		
		System.out.print("Memory size (500/1000/1500) GB: ");
		int memory=sc.nextInt();
		sc.nextLine();
		
		System.out.print("Screen resolution (FULLHD / 4K): ");
		String resolution=sc.nextLine().toUpperCase();
		
		screenPrice(screenSize);
		CPUPrice(cpu);
		RAMPrice(RAM);
		storagePrice(storage, memory);
		resolutionPrice(resolution);
		
		System.out.println("Laptop price is: "+(screenPrice(screenSize)+CPUPrice(cpu)+RAMPrice(RAM)+storagePrice(storage, memory)+resolutionPrice(resolution)));

	}

	private static int resolutionPrice(String resolution) {
		int resolution$=0;
		if(resolution.equals("FULLHD")) {
			resolution$=100;
		}else if(resolution.equals("4K")) {
			resolution$=200;
		}
		return resolution$;
		
	}

	private static int storagePrice(String storage, int memory) {
		int multiplier=0, storage$=0;
		if(storage.equals("SSD")) {
			multiplier=100;
		}else if(storage.equals("HDD")) {
			multiplier=50;
		}
		
		switch (memory) {
		case 500:
			storage$=multiplier*1; break;
		case 1000:
			storage$=multiplier*2; break;
		case 1500:
			storage$=multiplier*3; break;
		}
		return storage$;
		
	}

	private static int RAMPrice(int rAM) {
		int RAM$=0;
		switch (rAM) {
		case 4:
			RAM$=50; break;
		case 8:
			RAM$=100; break;
		case 12:
			RAM$=150; break;
		case 16:
			RAM$=200; break;
		}
		return RAM$;
		
	}

	private static int CPUPrice(String cpu) {
		int CPU$=0;
		switch (cpu) {
		case "i3":
			CPU$=150; break;
		case "i5":
			CPU$=250; break;
		case "i7":
			CPU$=350; break;
		}
		return CPU$;
	}

	private static int screenPrice(double screenSize) {
		int screen$=0;
		if(screenSize==13.3) {
			screen$=200;
		}else if(screenSize==15) {
			screen$=300;
		}else if(screenSize==17) {
			screen$=400;
		}
		return screen$;
		
	}

}
