package Assignments.Assignment_12;

import java.util.Arrays;

public class Q_70_firstLastElementSwitch {

	public static void main(String[] args) {
		
		System.out.println(Arrays.toString(do_switch(new int [] {1,2,3,4})));
		System.out.println(Arrays.toString(do_switch(new int [] {7,2,3,5})));

	}

	private static int[] do_switch(int[] arr) {
		int dummy=arr[0];
		arr[0]=arr[arr.length-1];
		arr[arr.length-1]=dummy;
		return arr;
		
	}

}
