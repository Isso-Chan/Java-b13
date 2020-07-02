package PART_I_Core.week12_Review_Session;

import java.util.ArrayList;

public class ArrayListWriteRead {

	public static void main(String[] args) {
		
		ArrayList<Integer> nums=new ArrayList<>();
		
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(11);
		nums.add(17);
		nums.add(19);
		nums.add(10);
		nums.add(111);
		nums.add(121);
		nums.add(145);
		nums.add(167);
		
		System.out.println("Number of values: "+ nums.size());
		System.out.println(nums); // toString demek zorunda değiliz. O da aynısını verir
		System.out.println(nums.toString());
		
		System.out.println(nums.get(3));// o indextekini getirir.
		
		
		

	}

}
