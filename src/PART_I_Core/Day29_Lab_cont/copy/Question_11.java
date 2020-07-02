package PART_I_Core.Day29_Lab_cont.copy;

import java.util.Arrays;

public class Question_11 {

	public static void main(String[] args) {
		
		int[] x1= {1,2,3,4,5,6};
		int[] x2= {2,3,5};
		int[] x3= {1,2,1};
		int[] x4= {11,2,13,2,3};
		
		System.out.println(Arrays.toString(find23(x1)));
		System.out.println(Arrays.toString(find23(x2)));
		System.out.println(Arrays.toString(find23(x3)));
		System.out.println(Arrays.toString(find23(x4)));

	}

	private static int[] find23(int[] arr) {
		
		for(int i=0;i<arr.length-1;i++) {
			
			if(arr[i]==2 && arr[i+1]==3) {
				arr[i+1]=0;
			}
		}
		
		return arr;
		
		
		
	}

}
