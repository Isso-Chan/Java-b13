package Assignments.Assignment_12;

import java.util.ArrayList;
import java.util.Arrays;

public class Q_67_multipleByTwo {

	public static void main(String[] args) {
	
		ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(14,6,3,8,24,3));
		
		timesTwo(numbers);

	}

	private static void timesTwo(ArrayList<Integer> nums) {
		for(int i=0;i<nums.size();i++) {
			nums.set(i,2*nums.get(i));
		}
		System.out.println(nums.toString());
	}

}
