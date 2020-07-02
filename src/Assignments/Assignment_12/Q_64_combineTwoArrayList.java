package Assignments.Assignment_12;

import java.util.ArrayList;

public class Q_64_combineTwoArrayList {

	public static void main(String[] args) {
		
		ArrayList<String> wordList1=new ArrayList<>();
		wordList1.add("Ali");
		wordList1.add("Veli");
		wordList1.add("Ahmet");
		wordList1.add("Mehmet");
		
		ArrayList<String> wordList2=new ArrayList<>();
		wordList2.add("Recep");
		wordList2.add("Emre");
		wordList2.add("Can");
		wordList2.add("Fatih");
		wordList2.add("Osman");

		System.out.println(combineAL(wordList1,wordList2));
	}

	private static ArrayList<String> combineAL(ArrayList<String> wordList1, ArrayList<String> wordList2) {
		ArrayList<String> newList=new ArrayList<>();
		
		newList.addAll(wordList1);
		newList.addAll(wordList1.size(), wordList2);
		
		return newList;
	}

}
