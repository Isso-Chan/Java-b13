package PART_I_Core.Week10_review.copy2;

import java.util.Arrays;

public class ArrayIntro {

	public static void main(String[] args) {
		
		// declare integer array with size 4
		int[] nums=new int[4];
		
		// assign values to each index
		
		nums[0]=100;
		nums[1]=200;
		nums[2]=70;
		nums[3]=-5;
//		nums[4]=300;   ArrayindexOutOfBoundException hatası verir. sonuncesu 3 olur, 4 değil
		
		int i=0;
		i++;   // döngü yok ama i bir artıyor.
		System.out.println(nums[i]);
		
		// modify index 0 to 500
		nums[0]=500;
		
		System.out.println(nums); // reference oldugu için onu yazar.
		System.out.println(nums[2]); // dizinin index no=2 olan 3.elemanını yazar
		System.out.println(Arrays.toString(nums));
		
		

	}

}
