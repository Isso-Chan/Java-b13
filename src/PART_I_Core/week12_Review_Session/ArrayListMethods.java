package PART_I_Core.week12_Review_Session;

import java.util.ArrayList;

public class ArrayListMethods {

	public static void main(String[] args) {
		
		ArrayList<String> cities=new ArrayList<>();
		
		cities.add("Mclean");
		cities.add("Baltimore");
		cities.add("Fairfax");
		cities.add("London");
		cities.add("Berlin");
		cities.add("Amsterdam");
		cities.add(0,"Istanbul"); // add to 0 and Mclean will be index 1,
		cities.add(1,"Reston");
		
		
		System.out.println(cities);
		cities.add(2,"Ankara");
		System.out.println(cities);
		
		// change/replace index 4 value to NewYork
		
		cities.set(4,  "NewYork");
		
		

	}

}
