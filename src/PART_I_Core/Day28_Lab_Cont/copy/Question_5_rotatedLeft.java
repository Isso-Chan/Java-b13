package PART_I_Core.Day28_Lab_Cont.copy;

import java.util.Arrays;

public class Question_5_rotatedLeft {

	public static void main(String[] args) {
		
		int[] x= {1,2,3,4,5};
		
		left(x);
		System.out.println(Arrays.toString(x));

	}

	private static int[] left(int[] arr) {
		int dummy=arr[0]; //1
		for(int i=0;i<arr.length-1;i++) {
			arr[i]=arr[i+1];
		}
		
		arr[arr.length-1]=dummy;
		return arr;
				
	}

}
