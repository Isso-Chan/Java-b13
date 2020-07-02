package PART_II_OOP.Day46_collections_Part1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingArrayList {

	public static void main(String[] args) {
		
		List<String> list=new ArrayList<>();
		list.add("java");
		list.add("js");
		list.add("html");
		list.add("ruby");
		list.add("kotlin");
		list.add("c++");
		
		System.out.println("Before sorting");
		System.out.println(list.toString());
		
		System.out.println("After sorting");
		Collections.sort(list);
		System.out.println(list.toString());

		List<Product> prodList=new ArrayList<>();
		prodList.add(new Product("Spoon", 13.35));
		prodList.add(new Product("bag",	100.0));
		prodList.add(new Product("shoes",	159.99));
		prodList.add(new Product("computer",	2100.0));
		
		System.out.println(prodList.toString());
		Collections.sort(prodList);//* sort HATA verir, çalışmaz(eğer Product compareTo() override etmezse). 
//		Anlaşılmadı, görün yeter gibi dedi*/
		
		System.out.println("=========After sorting=======");
		System.out.println(prodList.toString());
		
	}

}
