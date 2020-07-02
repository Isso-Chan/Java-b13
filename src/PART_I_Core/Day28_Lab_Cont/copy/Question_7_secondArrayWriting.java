package PART_I_Core.Day28_Lab_Cont.copy;

import java.util.Arrays;

public class Question_7_secondArrayWriting {

	public static void main(String[] args) {
		
		int[] x= {23,45,67,89,99};
		int[] y=new int[2];  //   şeklinde de olabilir.
		
		System.out.println(Arrays.toString(newArray(x,y)));

	}

	private static int[] newArray(int[] arr1,int[] arr2) {
		
		arr2[0]=arr1[0];
		arr2[1]=arr1[arr1.length-1];
		return arr2;
	}

}
