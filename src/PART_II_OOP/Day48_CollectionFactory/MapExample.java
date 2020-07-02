package PART_II_OOP.Day48_CollectionFactory;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		
		List<Integer> items2=new ArrayList<>();
		items2.add(10);
		
		Map<String, Double> items=new HashMap<>();//String ve double bizim tercihimiz (Key, Value için)
		items.put("Apple", 3.49);
		items.put("Flowers", 10.49);
		items.put("Eggs", 4.99);
		items.put("Milk", 6.0);
		items.put("Cherries", 5.99);
		
		System.out.println(items.size());
		System.out.println(items.toString());
		
		System.out.println(items.isEmpty());//doğru-yanlış döner
		System.out.println(items.get("Apple"));//Apple Key'inin value'sini verir.
		items.remove("Apple"); //remove Apple Key'ini
		System.out.println(items.toString());
		
		System.out.println("Is Milk there? "+items.containsKey("Milk"));
		System.out.println("Is Apples there? "+items.containsKey("Apples"));
		
		items.replace("Eggs", 3.5);//items.replace("Eggs", 3.5, 9.0) --> şartlı replace: value 3.5 ise; 9.0 ile değiştir
		System.out.println("Price of Eggs: "+items.get("Eggs"));
		
		// increase price of Cherries by 2 dollars
		items.replace("Cherries", items.get("Cherries")+2.0);		
		System.out.println("Price of Cherries: "+items.get("Cherries"));
		
		
		

	}

}
