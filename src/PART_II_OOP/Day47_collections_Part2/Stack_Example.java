package PART_II_OOP.Day47_collections_Part2;

import java.util.Stack;
import java.util.Vector;

public class Stack_Example {

	public static void main(String[] args) {
		
		Vector<Integer> numsStack=new Stack<>();
		
		//creating object
		//regular way-> class - class
		//polymorphic way-> parent/child - class
		//who decides what to access?--> reference
		
		numsStack.add(50);
		numsStack.add(70);
		numsStack.add(500);
		numsStack.add(50); //dublicates allowed
		
		System.out.println(numsStack.toString());
		
		//check value on top of stack //stack--> en son üste konulan (last in, first out)
		System.out.println(((Stack<Integer>) numsStack).peek());
		
		//read value on top of stack then remove it --> en üsttteki 50 gider
		System.out.println(((Stack<Integer>) numsStack).pop());
		System.out.println(numsStack.toString());
		System.out.println(numsStack.get(0));
		
		

	}

}
