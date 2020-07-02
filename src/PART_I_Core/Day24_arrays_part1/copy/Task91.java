package PART_I_Core.Day24_arrays_part1.copy;

import java.util.Random;

public class Task91 {

	public static void main(String[] args) {
		
		int[] array=new int[10];
		Random rd=new Random();
		
		for(int i=0;i<10;i++) {
			array[i]=rd.nextInt(100);
			System.out.println("Array["+i+"]"+array[i]);
		}

	}

}
