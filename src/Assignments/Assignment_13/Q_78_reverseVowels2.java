package Assignments.Assignment_13;

import java.util.Arrays;

public class Q_78_reverseVowels2 {

	public static void main(String[] args) {
		
		String word="akeiaoasarrytrhtdtasrfatreyt";
		
		System.out.println(reverseVowels(word));

	}

	public static String reverseVowels(String word) {
		String[] newStr=new String[word.length()];
		String lastStr="";
		boolean left=false, right=false; // takes true if any vowel is found
		int index1=0; 
		int index2=0; 
		int count1=0;    // shows the element which is done from the left
		int count2=0; // count the element which is done from the right
			do {
				for(int i=count1;i<word.length()-count2;i++) { // look for vowel from left
					if(vowelCheck(word.substring(i,i+1))) {
						index1=i;
						count1++; 
						left=true;
						break;
					}else {
						newStr[i]=word.substring(i,i+1); // if not vowel, write it to the place in array
						count1++;
					}
				}
				for(int j=word.length()-1-count2;j>count1;j--) {     //look for vowel from right
					if(vowelCheck(word.substring(j,j+1))) {
						index2=j;
						count2++;
						right=true;
						break;
					}else {
						newStr[j]=word.substring(j,j+1); // if not vowel, write it to the place in aray
						count2++;
					}
				}
				
				if(left && right) {      //write 2 vowels at new indexes
					newStr[index1]=word.substring(index2,index2+1);
					newStr[index2]=word.substring(index1,index1+1);
					left=false; right=false;
					
					
				} else if(left) {     // if there is no pair(from right to change), write left one to the place
					newStr[index1]=word.substring(index1,index1+1);

				} else if(right) {     // if there is no pair (left) to change, write right one to the place
					newStr[index2]=word.substring(index2,index2+1);
				}
			}while(count1+count2<word.length());
			
		for(int i=0;i<word.length();i++) {
			lastStr=lastStr.concat(newStr[i]);							
		}
		return lastStr;
	}

	private static boolean vowelCheck(String chr) {
		switch (chr) {
		case ("a"): case ("A"):
			return true; 
		case ("e"): case ("E"):
			return true; 
		case ("i"): case ("I"):
			return true;
		case ("o"): case ("O"):
			return true;
		case ("u"): case ("U"):
			return true;
		default:
			return false;
		}
	}
}


