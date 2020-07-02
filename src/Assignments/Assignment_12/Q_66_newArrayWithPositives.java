package Assignments.Assignment_12;

import java.util.ArrayList;
import java.util.Arrays;

public class Q_66_newArrayWithPositives {

	public static void main(String[] args) {
		
		ArrayList<Integer> Integers = new ArrayList<Integer>(Arrays.asList(4,-6,3,-8,0,4,3));

		System.out.println(appendPosSum(Integers).toString());
	}

	private static ArrayList<Integer> appendPosSum(ArrayList<Integer> integers) {
		ArrayList<Integer> newIntegers=new ArrayList<>();
		int sum=0;
		for(int value: integers) {
			if(value>0) {
				newIntegers.add(value);
				sum=sum+value;
			}
		}
		newIntegers.add(sum);
		return newIntegers;
	}

}
