package PART_I_Core.Day29_Lab_cont.copy;

import java.util.Arrays;

public class Question_15 {

	public static void main(String[] args) {
		
		int[] x1= {0,1,2,44,67};

		
		System.out.println(Arrays.toString(swapArrayvalue(x1)));

	}

	private static int[] swapArrayvalue(int[] arr) {
		
		int dummy=arr[0];
		arr[0]=arr[arr.length-1];
		arr[arr.length-1]=dummy;
		return arr;
	}

}
