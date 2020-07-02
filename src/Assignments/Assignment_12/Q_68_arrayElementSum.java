package Assignments.Assignment_12;

import java.util.Arrays;

public class Q_68_arrayElementSum {

	public static void main(String[] args) {
		
		System.out.println(Arrays.toString(addElements(new int[] {10, 40, 50, 3, 1},new int[] {11, 0, 500, 44, 1101})));
	}

	private static int[] addElements(int[] is, int[] is2) {
		int[] newArray=new int[5];
		for(int i=0;i<5;i++) {
			newArray[i]=is[i]+is2[i];
		}
		return newArray;
	}

}
