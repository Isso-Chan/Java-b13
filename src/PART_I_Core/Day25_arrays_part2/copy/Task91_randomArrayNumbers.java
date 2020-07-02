package PART_I_Core.Day25_arrays_part2.copy;

import java.util.Random;

public class Task91_randomArrayNumbers {

	public static void main(String[] args) {
		
		Random rn=new Random();
		int[] numbers=new int[10];
		
		for(int i=0;i<numbers.length;i++) {
			numbers[i]=rn.nextInt(100);
		}
		
		for(int j=0;j<numbers.length;j++) {
			System.out.println(numbers[j]);
		}
	}
	

}
