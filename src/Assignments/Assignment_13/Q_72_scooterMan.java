package Assignments.Assignment_13;

import java.util.ArrayList;
import java.util.Arrays;

public class Q_72_scooterMan {

	public static void main(String[] args) {
		
		ArrayList<Integer> fuel1=new ArrayList<>(Arrays.asList(7,7,7));
		ArrayList<Integer> fuel2=new ArrayList<>(Arrays.asList(9,1));
		ArrayList<Integer> fuel3=new ArrayList<>(Arrays.asList(100,200,10));

		int capacity1=7;
		int capacity2=3;
		int capacity3=10;
		
		System.out.println("Number of stops for" +(fuel1)+" with capacity "+ capacity1+ ": " + refuel_times(fuel1, capacity1));
		System.out.println("Number of stops for" +(fuel2)+" with capacity "+ capacity2+ ": " + refuel_times(fuel2, capacity2));
		System.out.println("Number of stops for" +(fuel3)+" with capacity "+ capacity3+ ": " + refuel_times(fuel3, capacity3));
		
	}
	public static int refuel_times(ArrayList<Integer> arr, int num) {
		double refuelTimes=0;
		for(int i=0;i<arr.size();i++) {
			refuelTimes=refuelTimes+arr.get(i);
		}
		
		return (int) Math.ceil(refuelTimes/num);
		
	}

}
