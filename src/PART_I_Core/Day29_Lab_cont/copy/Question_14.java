package PART_I_Core.Day29_Lab_cont.copy;

import java.util.Arrays;

public class Question_14 {

	public static void main(String[] args) {
		
		int[] x1= {0,1,2,44,67};
		int[] x2= {3,4,5,8};
		
		System.out.println(Arrays.toString(combineArrays(x1,x2)));

	}

	public static int[] combineArrays(int[] arr1, int[] arr2) {
		int[] y=Arrays.copyOf(arr1, (arr1.length+arr2.length));
		
		System.out.println(Arrays.toString(y));
		
//		for(int i=0;i<arr1.length;i++) {  // 17 satirda kopyalama yapmamış olsaydık burada arr1'i yerleştirecektik
//			y[i]=arr1[i];
//		}
		for(int j=0;j<arr2.length;j++) {
			y[arr1.length+j]=arr2[j];
		}
		return y;
		
	}
}
