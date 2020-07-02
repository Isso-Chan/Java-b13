package Assignments.Assignment_12;

import java.util.Arrays;

public class Q_59_mergeTwoArrays {

	public static void main(String[] args) {
		
		int[] arr1= {1,2,3,66};
		int[] arr2= {4,5,6,23};
		
		int[] newArr=mergR(arr1,arr2);
		System.out.println(Arrays.toString(newArr));

	}

	private static int[] mergR(int[] arr1, int[] arr2) {
		int[] merged=new int[arr1.length+arr2.length];
		for(int i=0;i<arr1.length;i++) {
			merged[i]=arr1[i];
		}
		for(int i=0;i<arr2.length;i++) {
			merged[arr1.length+i]=arr2[i];
		}
		return merged;
	}

}
