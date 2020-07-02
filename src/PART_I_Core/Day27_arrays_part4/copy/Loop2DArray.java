package PART_I_Core.Day27_arrays_part4.copy;

import java.util.Arrays;

public class Loop2DArray {

	public static void main(String[] args) {
		
		int[][] numbers= {{1,2,3},{4,5},{7,8,9}};
		
		for(int i=0;i<numbers.length;i++) {
			for(int j=0;j<numbers[i].length;j++) {
				
				System.out.println(numbers[i][j]);
			}
		}

		String[] names= {"Can","mehmet","Salih","Batuhan"};
		for(int i=0;i<names.length;i++) {
			for(int j=0;j<names[i].length();j++) {
				System.out.println(names[i].charAt(j));
			}
			System.out.println("---");
		}
		System.out.println(Arrays.toString(names));
	}

}
