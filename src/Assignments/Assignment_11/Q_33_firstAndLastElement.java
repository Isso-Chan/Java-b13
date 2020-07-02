package Assignments.Assignment_11;

public class Q_33_firstAndLastElement {

	public static void main(String[] args) {
		
		String[] words= {"hello", "why", "by", "apple" , "note"};

		for(int i=0;i<words.length;i++) {
			System.out.println(words[i].substring(0,1) + words[i].charAt(words[i].length()-1));
		}
	}

}
