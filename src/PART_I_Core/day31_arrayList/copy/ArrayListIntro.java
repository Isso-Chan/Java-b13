package PART_I_Core.day31_arrayList.copy;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListIntro {

	public static void main(String[] args) {
		
		//Creating an ArrayList
		
		ArrayList<String> names = new ArrayList<>();
		
		ArrayList<Integer> nums = new ArrayList<>();
		
		Integer[] num2= {45,78,90};
		
		
		//Assigning values to arrayList
		
		names.add("Mike");
		names.add("Smith");
		names.add("John");
		names.add("Emmy");
		names.add("Evan");
		names.add("Mary");
		
		nums.add(99);
		nums.add(656);
		nums.add(100);
		nums.add(new Integer("100"));
		
		//Reading from arrayList
		
		System.out.println(names.get(0));
		System.out.println(names.get(1));
		System.out.println(names.get(2));
		
		System.out.println("Names count: " + names.size());
		System.out.println("Nums count: " + nums.size());
		
		System.out.println(names.toString());  // yazılışlara dikkat!! (alt satıra bak)
		System.out.println(Arrays.toString(num2)); // yazılışa dikkat!! (üst satıra bak)
		
//		System.out.println("Length of "+ 5+" th element: "+names.size(5));
		
		
		
		
		
		
		
		

	}

}