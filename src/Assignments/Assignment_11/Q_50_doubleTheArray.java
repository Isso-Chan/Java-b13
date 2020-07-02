package Assignments.Assignment_11;

import java.util.Arrays;

public class Q_50_doubleTheArray {

	public static void main(String[] args) {
		
		int[] array= {4,5,6};
		int[] newArr=new int[array.length*2];
		
		newArr[(newArr.length-1)]=array[array.length-1];
		System.out.println(Arrays.toString(newArr));

	}

}
