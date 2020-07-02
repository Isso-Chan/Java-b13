package Assignments.Assignment_11;

import java.util.Arrays;

public class Q_47_inhibitants {

	public static void main(String[] args) {
		
		int[] nums= {3,6,0,4,3,2,7,1};
		
		int count=0;
		boolean finish = true;
		
		loop:
		
			for(int k=0; ;k++) {
				System.out.println("Day "+k+" "+ Arrays.toString(nums));
				if(count==nums.length) {
					break loop;
				}
				count=0;
				for(int i=0;i<nums.length;i++) {
					nums[i]=nums[i]/2;
					if(nums[i]==0) {
						count++;
					}
				}
			
			}

	}

}
