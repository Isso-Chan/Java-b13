package Assignments.Assignment_13;

import java.util.ArrayList;
import java.util.Arrays;

public class Q_75_toFindPartOfElement {

	public static void main(String[] args) {
		
		ArrayList<String> array=new ArrayList<String>(Arrays.asList("one apple","two orange","four banana"));
		String word="four";
		
		System.out.println(search(array,word));

	}

	private static String search(ArrayList<String> array, String word) {
		String find="";
		for(String value: array) {
			if(value.contains(word)) {
				find=value;
				break;
			}
		}
		return find;
		
	}

}
