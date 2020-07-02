package PART_I_Core.week12_Review_Session;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayAsList {

	public static void main(String[] args) {
		
		ArrayList<Integer> nums=new ArrayList<>(Arrays.asList(10,40,12,5,7));

		List<Integer> nums2=Arrays.asList(10,40,2,3);// collection konusu List
		System.out.println(nums);
	}

}
