package Assignments.Assignment_11;

import java.util.Arrays;

public class Q_43_arrayReverse {

	public static void main(String[] args) {
		
		int[] nums1= {4, 3, 2, 44, 1, 100, 55};
		
		int[] nums2=new int[nums1.length];
		
		for(int i=0;i<nums1.length;i++) {
			nums2[nums1.length-1-i]=nums1[i];
		}
		System.out.println("Reverse of array: "+Arrays.toString(nums2));
		

	}

}
