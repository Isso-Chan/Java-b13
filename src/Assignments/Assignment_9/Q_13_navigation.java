package Assignments.Assignment_9;

import java.util.Scanner;

public class Q_13_navigation {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Begin point (A/B/C/D): ");
		String start=sc.next().toUpperCase();
		
		System.out.println("End point (A/B/C/D): ");
		String end=sc.next().toUpperCase();
		
		boolean stop=true;
				
		if(start.equals(end)) {
			System.out.println(end+" found");
		}else {
			loop:		
			do {
				switch (start) {
				case "A":
					if(end.equals("A")) {
						System.out.print(" :A found");
						break loop;
					}else
						System.out.print("right> ");
				case "B":
					if(end.equals("B")) {
						System.out.print(" :B found");
						break loop;
					}else
						System.out.print("down> ");
				case "C":
					if(end.equals("C")) {
						System.out.print(" :C found");
						break loop;
					}else
						System.out.print("left> ");
				case "D":
					if(end.equals("D")) {
						System.out.print(" :D found");
						break loop;
					}else {
						System.out.print("up> ");
						start="A";
					}
				}
				
			}while(stop);
		
		}

	}

}
