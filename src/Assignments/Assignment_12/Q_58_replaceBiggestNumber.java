package Assignments.Assignment_12;

import java.util.Arrays;

public class Q_58_replaceBiggestNumber {

	public static void main(String[] args) {
		
		int[][] arr= {{1,2,3,9},{5,33,9}};
		int biggest=0;
		for(int i=0;i<arr[0].length;i++) {		//find biggest num in 2D array
			if(arr[0][i]>biggest) {
					biggest=arr[0][i];
			}
		}
		for(int j=0;j<arr[1].length;j++) {
			if(arr[1][j]>biggest) {
				biggest=arr[1][j];
			}
		}
		
		for(int i=0;i<arr[0].length;i++) {		// assign biggest to all elements
			arr[0][i]=biggest;
		}
		for(int j=0;j<arr[1].length;j++) {
			arr[1][j]=biggest;
		}
		System.out.println(Arrays.deepToString(arr));
		
		

	}

}
