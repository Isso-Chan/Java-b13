package PART_II_OOP.Day47_collections_Part2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class LoopWithIterator {

	public static void main(String[] args) {
		
		Set<Integer> nums=new HashSet<>();
		
		nums.add(50);
		nums.add(543);
		nums.add(1150);
		nums.add(550);
		nums.add(570);
		nums.add(93);
		nums.add(5000);
		nums.add(950);
		
		//create an iterator object
		Iterator<Integer> it=nums.iterator();// put the pointer to the beginning of collection. NOT: COLLECTİONLARDA OBJECT new KEYWORD OLMADAN BÖYLE OLUŞTURULUYOR.
		
		// call hasNext method
		//hasNext return true if there is still next value,
		//returns false when it reaches the end or empty
		
		System.out.println("it hasNext() : "+it.hasNext());
		System.out.println("it.next(): "+it.next());
		System.out.println("it.next(): "+it.next());
		System.out.println("it.next(): "+it.next());
		
		System.out.println("=====================");
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
//		System.out.println("it.next(): "+it.next());//Collection'da eleman kalmadığı için hata verir. Tekrar yazmasını sağlamak için iteratoru ilk elemana işaret ettirmek lazım. Onun için de yeniden object oluşturulur.
		
		Iterator<Integer> it2=nums.iterator();
		//What is the difference between for each and iterator?
		//we can remove objects while looping
		
		while(it2.hasNext()) {
			int val=it2.next();
			if(val>1000) {
				it2.remove();
			}
		}
		System.out.println(nums.toString()+" | ");
		
		List<String> cities=new ArrayList<>();
		
		cities.add("New York");
		cities.add("Boston");
		cities.add("Virginia");
		cities.add("DC");
		
		for(String city:cities) {
			if(city.equals("Boston")) {
				cities.remove(city);
			}
		}
		
		
		

	}

}
