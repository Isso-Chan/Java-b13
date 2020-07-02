package Assignments.Assignment_12;

import java.util.ArrayList;

public class Q_65_removeWord {

	public static void main(String[] args) {
		
		ArrayList<String> wordList=new ArrayList<>();
		wordList.add("Ali");
		wordList.add("Veli");
		wordList.add("Emre");
		wordList.add("Mehmet");
		wordList.add("Recep");
		wordList.add("Emre");
		wordList.add("Can");
		wordList.add("Fatih");
		wordList.add("Osman");
		wordList.add("Emre");
		
		String targetWord="Emre";
		
		System.out.println("ArrayList Elements: "+wordList.toString());
		System.out.println();
		removeAll(wordList,targetWord);

	}

	private static void removeAll(ArrayList<String> wordList, String targetWord) {
		
		for(int i=0;i<wordList.size();i++) {
			if(wordList.get(i).equals(targetWord)) {
				wordList.remove(i);
			}
		}
		System.out.println("After word "+targetWord+" removed: "+wordList);
		
	}

}
