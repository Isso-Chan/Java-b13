package PART_I_Core.Day29_Lab_cont.copy;

import java.util.Arrays;

public class Question_13 {

	public static void main(String[] args) {
		
		int[] x1= {3,4,5};
		int[] x2= {3,4,5,8};
		
		System.out.println(sumToArrays(x1,x2));

	}

	private static String sumToArrays(int[] arr1, int[] arr2) {
		
		int sum1=0, sum2=0;
		for(int value1: arr1) {
			sum1=sum1+value1;
		}
		for(int value2: arr2) {
			sum2=sum2+value2;
		}
		if(sum1>sum2) {
			return Arrays.toString(arr1);
		}else if (sum2>sum1) {
			return Arrays.toString(arr2);
		}else{
			return "equal";
		}
	}

}
