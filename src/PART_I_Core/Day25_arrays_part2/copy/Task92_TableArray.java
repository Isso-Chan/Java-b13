package PART_I_Core.Day25_arrays_part2.copy;

import java.util.Arrays;

public class Task92_TableArray {

	public static void main(String[] args) {
		
		int[] numbers=new int[10];
		
		for(int i=0;i<numbers.length;i++) {
			numbers[i]=i+1;
		}
		
		for(int j=0;j<numbers.length;j++) {
			System.out.println(numbers[j]*19);
		}
		
		// to print as a full array
		
		String[] str= {"Ali", "Veli", "Mehmet"};
		
		System.out.println(Arrays.toString(numbers));

		System.out.println(Arrays.toString(str));
		
		System.out.println(Arrays.toString(str[0]. toCharArray()));
		
		System.out.println(Arrays.deepToString(str));
	}

}
