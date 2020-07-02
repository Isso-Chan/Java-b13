package Assignments.Assignment_10;

import java.util.Scanner;

public class Q_27_caller {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Text: ");
		String text=sc.nextLine();
		
		System.out.println("What you look for: ");
		String word=sc.nextLine();
		
		coverString(text,word);
	
	}

	private static void coverString(String text, String word) {
		int textL=text.length();
		int wordL=word.length();
		int count=0;
		
		if(!text.contains(word)) {
			System.out.println("["+text+"]");
		}else {
			for(int i=0;i<=textL-wordL;i++) {
				if(text.substring(i,i+wordL).equals(word)) {
					System.out.print("[" + text.substring(i,i+wordL) + "]");
					count=count+wordL;
					i=i+wordL-1;
				}else {
					System.out.print(text.charAt(i));
					count++;
				}
			
			}if(count<textL) {
			System.out.print(text.substring(textL-wordL+1,textL));
			}
		}
		
	}

}
