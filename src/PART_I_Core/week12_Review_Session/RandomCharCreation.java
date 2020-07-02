package PART_I_Core.week12_Review_Session;

import java.util.Arrays;
import java.util.Scanner;

public class RandomCharCreation {

	public static void main(String[] args) {
		
		String decriptionAlfabet="";
		String [] encAlfArray=new String[95];
		String encriptionAlfhabet="";
		String ch="";
		int count=0;

		do {
			ch=""+(char)((int)(Math.random()*95)+32); // Random sayıyı önce tam sayıya, sonra ASCI kodu olan char'a çevirir.
			if (!encriptionAlfhabet.contains(ch)){
				encriptionAlfhabet=encriptionAlfhabet+ch;
				encAlfArray[count]=ch;
				count++;
//				System.out.println(encriptionAlfhabet);
			}
		}while(count<95);
		
		System.out.println(encriptionAlfhabet);
		Arrays.sort(encAlfArray);
		for(String value: encAlfArray) {
			decriptionAlfabet+=value;
		}
//		System.out.println(Arrays.toString(encAlfArray));
		System.out.println(decriptionAlfabet);
		

	}

}
