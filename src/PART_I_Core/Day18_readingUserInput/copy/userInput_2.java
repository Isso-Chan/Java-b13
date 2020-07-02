package PART_I_Core.Day18_readingUserInput.copy;

import java.util.Scanner;

public class userInput_2 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Provide a sentence I will repeat it:");
		
//		String str=sc.next(); sadece ilk kelimeyi alir.
		String str2=sc.nextLine(); // bosluk varsa (birden fazla kelime) bu kullanilir
		
		System.out.println(str2);

	}

}
