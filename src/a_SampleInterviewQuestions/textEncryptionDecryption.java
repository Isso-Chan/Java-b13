package a_SampleInterviewQuestions;

import java.util.Arrays;
import java.util.Scanner;

public class textEncryptionDecryption {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String word = "";
		String encryptionAlphabet="";
		String alphabet;
		
		while (true) {
			System.out.println("1 - Text Encryption");
			System.out.println("2 - Text Decryption");
			System.out.println("3 - Cancel");
			System.out.print("Enter your choice:");
			int UserEntry = sc.nextInt();
			
			if (UserEntry == 1) {
				sc.nextLine();
				System.out.print("Enter the text to encrypt (Text must not contain <enter> signs!): " );
				word = sc.nextLine();

			} else if (UserEntry == 2) {
				sc.nextLine();
				System.out.print("Enter the text to decrypt: ");
				word = sc.nextLine();
				
			}  else if (UserEntry == 3) {
				System.out.println("You cancelled");
				break;		
			} else {
				System.out.println("Invalid entry. Please try again");
			}
		
			if(UserEntry==1) {
				encryptionAlphabet = getEncAlphabet(uniChars(word)); 
			}else if (UserEntry==2) {
				System.out.println("Do you have a private Alphabet to use (Yes/No): ");
				String answer=sc.nextLine();
				
				if(answer.equalsIgnoreCase("yes")) {
					System.out.println("Enter your encription Alphabet: ");
					encryptionAlphabet=sc.nextLine();
				}
			}
			
			alphabet =getDecAlphabet(encryptionAlphabet); 		
			int length = word.length();
			String encrypted = "";
			
			for (int i = 0; i < length; i++) {   // En/decryption part
				if (UserEntry == 1) {
					encrypted = encrypted + encryptionAlphabet.charAt(alphabet.indexOf(word.charAt(i)));
				} else if (UserEntry == 2) {
					encrypted = encrypted + alphabet.charAt(encryptionAlphabet.indexOf(word.charAt(i)));
				}
			}
			
			System.out.println();
			System.out.println("************************Your en/decrypted text ************************");
			System.out.println(encrypted);
		System.out.println("***********************************************************************");
		
		} 		
	}

	private static String getEncAlphabet(String extraChars) {  // create encryption alphabet
		int eLength=extraChars.length(); 
		String encriptionAlfhabet=extraChars; // Alphabet start with unique letters of the text
		String ch="";
		int count=0;

		do {
			ch=""+(char)((int)(Math.random()*(95))+32); // then create randomly total 223 characters from ASCI codes between 32 and 127(127-32=95).WARNING: ASCI codes more than 127 causes problem. They change anyhow by copying!!!!
			if (!encriptionAlfhabet.contains(ch)){
				encriptionAlfhabet=encriptionAlfhabet+ch;
				count++;
			}
		}while(count<(95-eLength));
		return mixAlphabet(encriptionAlfhabet);
	}
	
	
	public static String getDecAlphabet(String arr) {   // sort the encryption alphabet as decryption one
		System.out.println();
		System.out.println("Encryption Alphabet: " + arr);
		char[] tempArray=arr.toCharArray();
		Arrays.sort(tempArray);
		String DecAlphabet="";
		
		for(char c: tempArray) {
			DecAlphabet+=c;
		}
		System.out.println();
		System.out.println("Decryption Alphabet: " + DecAlphabet);
		return DecAlphabet;
	}
	
	
	public static String uniChars(String str) { // create the first part of the encryption alphabet from the unichars of text characters. (Text may contain original characters)
		String uniqueChars=str.substring(0,1);
		
		for(int i=1;i<str.length() ;i++) {
									
			if(uniqueChars.indexOf(str.charAt(i))<=-1) {
				uniqueChars=str.substring(i,i+1).concat(uniqueChars);	
			}	
		}
		return uniqueChars;
	}
	
	
	public static String mixAlphabet(String str) {
		String mixedAlphabet="";
		for(int i=0;i<str.length()/2;i++) {
			mixedAlphabet=mixedAlphabet+str.charAt(i)+str.charAt(str.length()-1-i);
		}
		if(str.length()%2==1) {
			mixedAlphabet+=str.charAt(str.length()/2);
		}
		return mixedAlphabet;
	}

}
