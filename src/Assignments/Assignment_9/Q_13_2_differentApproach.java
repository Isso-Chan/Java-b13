package Assignments.Assignment_9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Q_13_2_differentApproach {
	static Scanner sc = new Scanner(System.in);
	static String pattern = "ABCD";

	public static void main(String[] args) {

		do {
			System.out.print("Please enter start point (A-B-C-D) (-1 o quit) : ");
			String start = sc.next();
			if (start.equals("-1")) {
				System.out.println("quit...");
				return;
			}

			System.out.print("Please enter end point (A-B-C-D) (-1 o quit) : ");
			String end = sc.next();
			if (end.equals("-1")) {
				return;   
			}
			start = start.toUpperCase();
			end = end.toUpperCase();

			if (pattern.contains(start) && pattern.contains(end)) {
				navigate(start, end);
			} else {
				System.out.println("invalid input");
			}
		} while (true);
	}

	public static void navigate(String start, String end) {
		int startPoint = pattern.indexOf(start);
		int endPoint = pattern.indexOf(end);
		if (start.equals(end)) {
			System.out.println(start + " found");
			return;
		} else {
			if (startPoint > endPoint) {
				endPoint += pattern.length();
			}
			printDirection(startPoint, endPoint);
			System.out.println(" : " + end + " found");
			System.out.println();
		}
	}

	public static void printDirection(int startPoint, int endPoint) {
		for (int i = startPoint; i < endPoint; i++) {
			if ((i % 4) == 0) {
				System.out.print("right");
			}
			if ((i % 4) == 1) {
				System.out.print("down");
			}
			if ((i % 4) == 2) {
				System.out.print("left");
			}
			if ((i % 4) == 3) {
				System.out.print("up");
			}
			if (i != (endPoint - 1)) {
				System.out.print(" > ");
			}
		}
	}
}


