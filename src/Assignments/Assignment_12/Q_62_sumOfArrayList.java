package Assignments.Assignment_12;

import java.util.ArrayList;
import java.util.Arrays;

public class Q_62_sumOfArrayList {

	public static void main(String[] args) {
		
		ArrayList<Integer> ints=new ArrayList<Integer> (Arrays.asList(1,2,3,4,5));
		
		System.out.println(sum(ints));

	}

	private static Integer sum(ArrayList<Integer> ints) {
		Integer sumAll=0;
		for(Integer value : ints) {
			sumAll=sumAll+value;
		}
		return sumAll;
		
	}

}
