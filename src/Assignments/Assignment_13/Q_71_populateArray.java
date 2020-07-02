package Assignments.Assignment_13;

import java.util.Arrays;

public class Q_71_populateArray {

	public static void main(String[] args) {
		
		System.out.println(Arrays.toString(populate(new int [3])));

	}

	private static int[] populate(int[] array) {
		for(int i=0;i<array.length;i++) {
			array[i]=i+1;
		}
		return array;
		
	}

}
