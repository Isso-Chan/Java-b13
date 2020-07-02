package PART_I_Core.week12_Review_Session;

import java.util.ArrayList;

public class ArrayListMethods2 {

	public static void main(String[] args) {
		
		//isEmty, contains, indexOf. clear
		ArrayList<String> shoppingList=new ArrayList<>();
		
		// check is List emty
		System.out.println("isEmty -" + shoppingList.isEmpty());
		System.out.println("size()- "+ (shoppingList.size()==0));
		
		if(shoppingList.isEmpty()) {
			System.out.println("List is Empty. Nothing to buy");
		}else
			System.out.println("List is not Empty");
		
		shoppingList.add("Laptop");
		shoppingList.add("Pen");
		shoppingList.add("Pencil");
		shoppingList.add("Book");
		
		// check if "Pencil" is among the items
		
		System.out.println("list.contains(Pencil) -"+ shoppingList.contains("Pencil"));
		
		System.out.println("5 in the List is -" + shoppingList.contains(5));
		
		// find the indexOf Laptop
		System.out.println("Laptop index: "+ shoppingList.indexOf("Laptop"));
		
		shoppingList.clear();
		System.out.println(shoppingList);

	}

}
