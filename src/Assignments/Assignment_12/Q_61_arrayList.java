package Assignments.Assignment_12;

import java.util.ArrayList;

public class Q_61_arrayList {

	public static void main(String[] args) {
		
		ArrayList<String> words=new ArrayList<>();

		set2Endex(words);
	}

	private static void set2Endex(ArrayList<String> words) {
		words.add("git");
		words.add(null);
		words.add(null);
		words.add(2,"gud");
		System.out.println(words);
		
	}

}
