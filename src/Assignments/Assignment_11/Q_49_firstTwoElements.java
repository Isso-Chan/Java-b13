package Assignments.Assignment_11;

import java.util.Arrays;

public class Q_49_firstTwoElements {

	public static void main(String[] args) {
		
		int[] array= {1,2,3,4,5,6,7,8};
		int length=0;
		if(array.length<2) {
			length=1;
		}else {
			length=2;
		}
		
		int[] newArr=new int[length];
		for(int i=0;i<length;i++) {
			newArr[i]=array[i];
		}
		
		System.out.println(Arrays.toString(newArr));
		

	}

}
