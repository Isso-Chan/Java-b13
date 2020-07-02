package PART_I_Core.Day25_arrays_part2.copy;

import java.util.Arrays;
import java.util.Scanner;

public class PassArray_2 {

	public static void main(String[] args) {
		
		//create an array
		int[] numbers=new int[4];
		String sss="";
		
	
		
		//pass the array to the getValue method
		getValue(numbers);
		System.out.println("Here are the numbers that we entered");
		
		//pass the array to show the array method
		showArray(numbers);
		
		// Arrayin son halini önce String sonra da char dizisine dönüştürür. Char dizisi ilk ve son charı"[" ve "]"
		sss=Arrays.toString(numbers);
		char[] ccc=sss.toCharArray();
		
		System.out.println("Arrays.toString result: "+sss);
	
		System.out.println("Arrays.toString(numbers)'ın .toCharArray sonucu:" +(Arrays.toString(ccc)));
	

	}

	private static void getValue(int[] array) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a series of "+array.length+" numbers");
		
		for(int i=0;i<array.length;i++) {
			System.out.print("Enter number "+(i+1)+" :");
			array[i]=sc.nextInt();
		}
		System.out.println("Dongu ici:"+Arrays.toString(array));
		
	}
	private static void showArray(int[] arr) {
		System.out.println("Change done!!! ");
//		arr[3]=99; // Burada yapılan değişiklik Argument olarak buraya pass edilen Array'ı da etkiliyor!!!!!!!
		for(int value: arr) {
			System.out.println(value);
		}
		
	}

}
