package PART_I_Core.Day28_Lab_Cont.copy;

import java.util.Arrays;

public class Question_6_greatestElement {

	public static void main(String[] args) {
		
		int[] x= {1,2,3,44,5};
		
		int[] y=greatestValue(x);
		System.out.println(Arrays.toString(y));
		

	}
	public static int[] greatestValue(int[] arr) {
		int biggest=0;
		for(int i=0;i<arr.length;i++) {    // sorting ile kücükten büyüğe sıralanıp yapılabilir de.
			if(arr[i]>biggest) {
				biggest=arr[i];
			}
		}
		for(int j=0;j<arr.length;j++) {
			arr[j]=biggest;
		}
		return arr;
	}

}
