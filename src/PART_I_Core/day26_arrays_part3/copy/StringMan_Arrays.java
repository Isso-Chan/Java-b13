package PART_I_Core.day26_arrays_part3.copy;

import java.util.Arrays;

public class StringMan_Arrays {

	public static void main(String[] args) {
		
		String[] myCars= {"Honda","Mercedes","BMW","Toyota","    Ford "};
		
		System.out.println(myCars[3].length());
		System.out.println(myCars[1].charAt(2));
		System.out.println(myCars[4].trim());
		System.out.println(myCars[2].substring(2,3));
		System.out.println(myCars[1]==(myCars[2]));
		
		System.out.println("--------------------------");
		// print the length of each element in array
		for(int i=0;i<myCars.length;i++) {
			System.out.println(myCars[i].length());
		}
		System.out.println("==================");
		String str="İt will display the array of the size";
		String[] arr=str.split(" ");
		System.out.println(arr.length);
		//System.out.println(Arrays.deepToString(arr));
		
		for(String value: arr) {
			System.out.println(arr[2]);
		}
	}
	

}
