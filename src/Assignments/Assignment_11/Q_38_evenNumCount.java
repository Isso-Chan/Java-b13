package Assignments.Assignment_11;

public class Q_38_evenNumCount {

	public static void main(String[] args) {
		
		int[] nums1= {2,1,2,3,4};
		int[] nums2= {2,2,0,3,5};
		int[] nums3= {1,3,5,7,9};
		
		evenNumCount(nums1);
		evenNumCount(nums2);
		evenNumCount(nums3);

	}

	private static void evenNumCount(int[] nums) {
		int count=0;
		for(int i=0;i<nums.length;i++) {
			if(nums[i]%2==0) {
				count++;
			}
		}
		System.out.println("Count: "+count);
		
	}

}
