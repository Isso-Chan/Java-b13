package PART_II_OOP.Day48_CollectionFactory;

import java.util.HashSet;
import java.util.Set;

import PART_II_OOP.Day46_collections_Part1.Product;

public class HashSetOfProducts {

	public static void main(String[] args) {
		
		//create set collection and add new products 

		Set<Product> prodSet=new HashSet<>();
		
		Product p1=new Product("T-Shirt", 15);
		Product p2=new Product("Shoe", 69);
		Product p3=new Product("Jeans", 49);
				
		prodSet.add(new Product("Socks", 9.9));
		prodSet.add(new Product("book", 25.9));
		prodSet.add(p3);
		
		System.out.println(prodSet.toString());
		
		// print each product by using for each loop
		for(Product p: prodSet) {
			System.out.println("Product :"+p.getPrice());
		}
		
		//print each product by using forEach method()
		prodSet.forEach(x->System.out.println("ForEach Method :"+x.getName()));//x prodSet'ten ilk elemanı alarak başlıyor
		
		
		
		

	}

}
