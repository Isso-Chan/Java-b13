package PART_I_Core.Day29_Lab_cont.copy;

import java.util.Arrays;

public class Question_12 {

	public static void main(String[] args) {
		
		int[] x1= {1,2,3,4,5,6};
		int[] x2= {2,3,5};
		int[] x3= {1,2,1};
		int[] x4= {11,2,13,2,3};
		
		System.out.println(find23(x2,x4));


	}

	private static int find23(int[] arr1, int[] arr2) {
		
		int count=0;
		if(arr1[0]==1) {
			count++;
		}
		if(arr2[0]==1) {
			count++;
		}
		
		return count;
	}

}
