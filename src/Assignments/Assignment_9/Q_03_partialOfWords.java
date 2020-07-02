package Assignments.Assignment_9;

import java.util.Scanner;

public class Q_03_partialOfWords {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your word: ");
		String word=sc.next();
		int length=word.length();
		
		if(length==1) {                  //odd number - Single character, print that character 3 times
			System.out.println(word+word+word);
			
		}else if(length%2==1) {          // 3 or more characters, print middle letter
			System.out.println(word.charAt(length/2));
		}
		
		if(length>2 && length%2==0) {    // even numbers - 4 or more characters, print middle 2
			System.out.print(word.charAt(length/2-1));
			System.out.print(word.charAt(length/2));
			
		} else if(length==2) {           // 2 characters, print those 2 characters twice
			System.out.println(word+word);
		}

	}

}
